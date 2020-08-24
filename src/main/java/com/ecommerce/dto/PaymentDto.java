package com.ecommerce.dto;

public class PaymentDto {

    private Integer walletId;
    private Integer orderId;

    public Integer getWalletId() {
	return walletId;
    }

    public void setWalletId(Integer walletId) {
	this.walletId = walletId;
    }

    public Integer getOrderId() {
	return orderId;
    }

    public void setOrderId(Integer orderId) {
	this.orderId = orderId;
    }
}
