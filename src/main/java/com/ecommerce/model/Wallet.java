package com.ecommerce.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer walletId;
    private double amount;
    private LocalDate validityDate;

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

}
