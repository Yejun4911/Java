package com.encore.util;

public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getDate() {
		return year+"-"+month+"-"+day;
	}	
}
