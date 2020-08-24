package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderDetailsId;
    @NotNull(message = "please provide item id")
    private Integer itemId;
    @NotNull(message = "please provide quantity")
    private Integer quantity;

    public Integer getOrderDetailsId() {
	return orderDetailsId;
    }

    public void setOrderDetailsId(Integer orderDetailsId) {
	this.orderDetailsId = orderDetailsId;
    }

    public Integer getItemId() {
	return itemId;
    }

    public void setItemId(Integer itemId) {
	this.itemId = itemId;
    }

    public Integer getQuantity() {
	return quantity;
    }

    public void setQuantity(Integer quantity) {
	this.quantity = quantity;
    }

}
