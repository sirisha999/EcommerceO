package com.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ordersId;
    private Integer userId;
    private double totalPrice;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate orderTime;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ordersIdFk", referencedColumnName = "ordersId")
    private List<OrderDetails> orderDetails;
    private String status;

    public Integer getOrdersId() {
	return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
	this.ordersId = ordersId;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    public double getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    public List<OrderDetails> getOrderDetails() {
	return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
	this.orderDetails = orderDetails;
    }

    /*
     * public void setOrderTime(Timestamp orderTime) { this.orderTime = orderTime; }
     */

    public LocalDate getOrderTime() {
	return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
	this.orderTime = orderTime;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }
}
