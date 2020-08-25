package com.ecommerce.dto;

import java.util.List;

public class OrderRequestDto {

    private Integer userId;

    private Long phone;

    private List<OrderDetailsReqDto> orderDetailsReqDto;

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    public Long getPhone() {
	return phone;
    }

    public void setPhone(Long phone) {
	this.phone = phone;
    }

    public List<OrderDetailsReqDto> getOrderDetailsReqDto() {
	return orderDetailsReqDto;
    }

    public void setOrderDetailsReqDto(List<OrderDetailsReqDto> orderDetailsReqDto) {
	this.orderDetailsReqDto = orderDetailsReqDto;
    }
}