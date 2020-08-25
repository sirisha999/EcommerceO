package com.ecommerce.exception;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String name) {

	super(name);
    }
}
