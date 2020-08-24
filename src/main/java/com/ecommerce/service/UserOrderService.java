package com.ecommerce.service;

import com.ecommerce.dto.PaymentDto;

public interface UserOrderService {
    public String payForOrder(PaymentDto paymentDto, Integer userId);
}
