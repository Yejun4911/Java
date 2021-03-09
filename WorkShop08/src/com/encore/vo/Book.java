package com.encore.vo;

public class Book {
	
	private String isbn; //Book 기본 필드 
	private String title;
	private String author;
	private String pulisher;
	private int price;
	private String desc;
	private int year;
	private int month;
	public Book(String isbn, String title, String author, String pulisher, int price, String desc) { // Book 공통 생성자
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pulisher = pulisher;
		this.price = price;
		this.desc = desc;
	}
	
	
	public String getIsbn() {
		return isbn;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getPulisher() {
		return pulisher;
	}


	public int getPrice() {
		return price;
	}


	public String getDesc() {
		return desc;
	}


	public int getYear() {
		return year;
	}


	public int getMonth() {
		return month;
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", pulisher=" + pulisher + ", price="
				+ price + ", desc=" + desc + "]";
	}
	


	
	
}
