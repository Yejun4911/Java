package com.encore.exception;

public class QuantityException extends Exception {
	public QuantityException(){
		this("This is UserException .....QuantityException..");
	}
	
	public QuantityException(String message){
		super(message);
	}
}
