package com.ecommerce.exception;

public class WalletNotPresentException extends RuntimeException {

    public WalletNotPresentException(String message) {
	super(message);
    }

}
