package com.ecommerce.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Integer id) {

	super(String.format("user with id %d User  not registered", id));
    }
}
