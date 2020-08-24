package com.ecommerce.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.dto.PaymentDto;
import com.ecommerce.exception.InsufficientQuantityAvailableException;
import com.ecommerce.exception.WalletNotPresentException;
import com.ecommerce.model.Item;
import com.ecommerce.model.OrderDetails;
import com.ecommerce.model.UserOrder;
import com.ecommerce.model.Wallet;
import com.ecommerce.repository.ItemRepository;
import com.ecommerce.repository.UserOrderRepository;
import com.ecommerce.repository.WalletRepository;
import com.ecommerce.service.UserOrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService {
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    UserOrderRepository userOrderRepository;
    @Autowired
    ItemRepository itemRepository;

    @Override
    @Transactional
    public String payForOrder(PaymentDto paymentDto, Integer userId) {

	Optional<UserOrder> Oorder = userOrderRepository.findById(paymentDto.getOrderId());
	double amount = 0.0;
	UserOrder userOrder = null;
	List<OrderDetails> details = new ArrayList();
	if (Oorder.isPresent()) {
	    userOrder = Oorder.get();
	    if (userId != userOrder.getUserId())
		throw new WalletNotPresentException("user have not purchased this order");
	    amount = userOrder.getTotalPrice();
	    details = userOrder.getOrderDetails();
	} else {
	    throw new WalletNotPresentException("user have not purchased this order");
	}
	List<Integer> ids = details.stream().map(a -> a.getItemId()).collect(Collectors.toList());
	List<Item> aItems = itemRepository.findByItemIdIn(ids);
	aItems.forEach(a -> {

	});
	details.forEach(a -> {
	    Item item = itemRepository.findByItemId(a.getItemId());
	    if (item.getQuantity() < a.getQuantity())
		throw new InsufficientQuantityAvailableException("requested quantity not available");
	    itemRepository.save(item);
	});
	Optional<Wallet> oWallet = walletRepository.findById(paymentDto.getWalletId());
	if (oWallet.isPresent()) {
	    Wallet wallet = oWallet.get();
	    if (wallet.getValidityDate().isBefore(LocalDate.now()))
		throw new WalletNotPresentException("wallet expired");
	    double remainingAmount = wallet.getAmount() - amount;
	    if (remainingAmount < 0) {
		throw new WalletNotPresentException("Insufficient Balence in wallet");
	    }
	    wallet.setAmount(remainingAmount);
	    walletRepository.save(wallet);
	} else {
	    throw new WalletNotPresentException("Invalid Wallet selected");
	}
	userOrder.setStatus("confirmed");
	return "payment successful for order id" + paymentDto.getOrderId();

    }
}
