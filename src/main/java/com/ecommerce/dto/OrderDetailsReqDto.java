package com.ecommerce.dto;

public class OrderDetailsReqDto {
    private Integer itemId;
    private Integer quantity;

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
