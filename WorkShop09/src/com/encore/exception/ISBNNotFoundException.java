package com.encore.exception;

public class ISBNNotFoundException extends Exception {
	public ISBNNotFoundException(){
		this("This is UserException .....ISBNNotFoundException..");
	}
	
	public ISBNNotFoundException(String message){
		super(message);
	}
}
