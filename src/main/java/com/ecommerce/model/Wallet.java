package com.ecommerce.model;

import java.time.LocalDate;

public class Wallet {
    private Integer walletId;
    private double amount;
    private LocalDate validityDate;
    private Integer userId;

    public Integer getWalletId() {
	return walletId;
    }

    public void setWalletId(Integer walletId) {
	this.walletId = walletId;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public LocalDate getValidityDate() {
	return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
	this.validityDate = validityDate;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

}
