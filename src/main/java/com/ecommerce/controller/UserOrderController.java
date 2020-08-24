package com.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.PaymentDto;
import com.ecommerce.service.UserOrderService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class UserOrderController {

    @Autowired
    UserOrderService userOrderService;

    /**
     * this method allows User to place food order
     * 
     * @param orderRequestDto provide order details to place order
     * @return ResponseEntity order status
     * 
     */
    @ApiResponses(value = { @ApiResponse(code = 200, message = "payment successfully completed"),
	    @ApiResponse(code = 4111, message = "You are not authorized to view the resource"),
	    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    @PostMapping("/payment/{userId}")
    public ResponseEntity<String> makePayment(@Valid @RequestBody PaymentDto paymentDto, @PathVariable Integer userId) {
	String message = userOrderService.payForOrder(paymentDto, userId);

	return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
