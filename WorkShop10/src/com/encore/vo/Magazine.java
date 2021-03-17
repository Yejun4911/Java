package com.encore.vo;

public class Magazine extends Book{
	private int month;
	
	public Magazine(int isbn, String title, int price, int quantity,int month) {
		super(isbn, title, price, quantity);
		this.month=month;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Magzine [ toString()="+ super.toString()+ ",month=" + month + "]";
	}
	
}
