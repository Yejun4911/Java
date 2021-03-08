package com.encore.util;

public class Mydate {

	private int year;
	private int month;
	private int day;
	
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getDetail() {
		return year +"³â " +month+"¿ù " + day + "ÀÏ";
	}
	
	
}
