package com.encore.service;

public class NoteBook {
	public int serialNum;
	public String brand;
	public int price;
	
	public NoteBook(int serialNum, String brand, int price) {
		this.serialNum = serialNum;
		this.brand = brand;
		this.price = price;
	}
	
	public String getNoteBookInfo() {
		return serialNum+","+ brand+","+ price;
	}	
}
