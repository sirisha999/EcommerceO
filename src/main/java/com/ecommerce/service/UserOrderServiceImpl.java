/*
 * package com.ecommerce.service;
 * 
 * import java.time.LocalDate; import java.util.ArrayList; import
 * java.util.List; import java.util.Optional; import
 * java.util.stream.Collectors;
 * 
 * import javax.persistence.criteria.Order;
 * 
 * import org.springframework.beans.BeanUtils; import
 * org.springframework.beans.factory.annotation.Autowired;
 * 
 * import com.ecommerce.dto.ItemDto; import com.ecommerce.dto.OrderDetailsDto;
 * import com.ecommerce.dto.OrderDetailsReqDto; import
 * com.ecommerce.dto.OrderRequestDto; import com.ecommerce.dto.OrdersDto; import
 * com.ecommerce.dto.ResponseMessageDto; import
 * com.ecommerce.exception.ItemNotFoundException; import
 * com.ecommerce.exception.UserNotFoundException; import
 * com.ecommerce.model.Item; import com.ecommerce.model.OrderDetails; import
 * com.ecommerce.model.User; import com.ecommerce.model.UserOrder; import
 * com.ecommerce.repository.ItemRepository; import
 * com.ecommerce.repository.UserOrderRepository; import
 * com.ecommerce.repository.UserRepository;
 * 
 * public class UserOrderServiceImpl implements UserOrderService{
 * 
 * @Autowired UserRepository userRepository;
 * 
 * @Autowired UserOrderRepository userOrderRepository;
 * 
 * @Autowired ItemRepository itemRepository;
 * 
 * @Override public Double orderFood(OrderRequestDto orderRequestDto) {
 * 
 * if (!userRepository.findById(orderRequestDto.getUserId()).isPresent()) {
 * //logger.info(ApplicationContants.EXCEPTION); throw new
 * UserNotFoundException(orderRequestDto.getUserId()); }
 * List<OrderDetailsReqDto> dto = orderRequestDto.getOrderDetailsReqDto();
 * System.out.println(dto.get(0).getItemId()); //List<OrderDetails> details =
 * dto.stream().map(UserOrderServiceImpl::getDtoFromEntity)
 * .collect(Collectors.toList());
 * System.out.println(details.get(0).getItemId()); List<Double> price = new
 * ArrayList<>(); for (OrderDetails detail : details) {
 * price.add(calulatePrice(detail)); } UserOrder orders = new UserOrder();
 * Double totalPrice = price.parallelStream().reduce(0.0, Double::sum);
 * orders.setTotalPrice(totalPrice);
 * orders.setUserId(orderRequestDto.getUserId());
 * orders.setOrderDetails(details); orders.setOrderTime(LocalDate.now());
 * orders.setStatus("pending"); userOrderRepository.save(orders); return
 * totalPrice;
 * 
 * } private static OrdersDto getDtoFromEntity(UserOrder userorders) { OrdersDto
 * ordersDto = new OrdersDto(); BeanUtils.copyProperties(userorders, ordersDto);
 * List<OrderDetailsDto> dtos =
 * userorders.getOrderDetails().stream().map(UserOrderServiceImpl::
 * getDtoFromEntity) .collect(Collectors.toList());
 * ordersDto.setOrderDetailsDto(dtos); return ordersDto; } private static
 * OrderDetailsDto getDtoFromEntity(OrderDetails orderDetails) { OrderDetailsDto
 * orderDetailsDto = new OrderDetailsDto();
 * BeanUtils.copyProperties(orderDetails, orderDetailsDto); return
 * orderDetailsDto; } private Double calulatePrice(OrderDetails orderDetails) {
 * Integer id = orderDetails.getItemId(); Optional<Item> item =
 * itemRepository.findById(id); if (item.isPresent()) { return
 * item.get().getPricePerUnit() * orderDetails.getQuantity(); } else { //
 * logger.info(ApplicationContants.EXCEPTION); throw new
 * ItemNotFoundException(orderDetails.getItemId()); }
 * 
 * } }
 * 
 * 
 * 
 * @Override public ResponseMessageDto placeOrder(Integer userId,
 * OrderDetailsDto orderDetailsDto) { User
 * user=userRepository.findById(userId).orElseThrow(()-> new
 * ItemNotFoundException("user Not Found")); Item
 * item=itemRepository.findById(orderDetailsDto.getItemId()).orElseThrow(()->new
 * ItemNotFoundException("item Not Found")); UserOrder userOrder =new
 * UserOrder(); if(item.getQuanity()==orderDetailsDto.getQuantity() ) {
 * userOrder.set
 * 
 * 
 * } else return null; }
 * 
 * 
 * 
 * 
 * 
 */