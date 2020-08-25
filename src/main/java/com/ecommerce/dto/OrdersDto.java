package com.ecommerce.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class OrdersDto {
    private double totalPrice;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate orderTime;
    private List<OrderDetailsDto> orderDetailsDto;

    public double getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    public List<OrderDetailsDto> getOrderDetailsDto() {
	return orderDetailsDto;
    }

    public void setOrderDetailsDto(List<OrderDetailsDto> orderDetailsDto) {
	this.orderDetailsDto = orderDetailsDto;
    }

    public LocalDate getOrderTime() {
	return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
	this.orderTime = orderTime;
    }

}
