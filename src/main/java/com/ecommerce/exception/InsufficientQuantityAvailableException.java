package com.ecommerce.exception;

public class InsufficientQuantityAvailableException extends RuntimeException {

    public InsufficientQuantityAvailableException(String message) {
	super(message);
    }

}
