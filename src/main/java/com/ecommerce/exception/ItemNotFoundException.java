package com.ecommerce.exception;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String string) {

	super(String.format("item with id %s   not found in menu",string));
    }
    public ItemNotFoundException(Integer id) {

    	super(String.format("item with id %d   not found in menu", id));
        }
    }
