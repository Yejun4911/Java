package com.encore.vo;

public class Magzine extends Book{
	private int year;
	private int month;
	
	

	public Magzine(String isbn, String title, String author, String pulisher, int price, String desc, int year, int month) {
		super(isbn, title, author, pulisher, price, desc);
		this.year=year;
		this.month=month;
		// TODO Auto-generated constructor stub
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	@Override
	public String toString() {
		return "Magzine [year=" + year + ", month=" + month + ", toString()=" + super.toString() + "]";
	}
	
}
