package com.encore.vo;

public class Magzine extends Book{

	public Magzine(String isbn, String title, String author, String pulisher, double price, String desc) {
		super(isbn, title, author, pulisher, price, desc);
	}

	@Override
	public String setKind() {
		return "Magzine";
	}

	
	
	
}
