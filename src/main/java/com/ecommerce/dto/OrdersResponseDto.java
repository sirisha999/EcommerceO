package com.ecommerce.dto;

import java.util.List;

public class OrdersResponseDto {
    private String message;

    private Integer statusCode;

    private Integer userId;

    private List<OrdersDto> ordersDto;

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public Integer getStatusCode() {
	return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
	this.statusCode = statusCode;
    }

    public List<OrdersDto> getOrdersDto() {
	return ordersDto;
    }

    public void setOrdersDto(List<OrdersDto> ordersDto) {
	this.ordersDto = ordersDto;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

}
