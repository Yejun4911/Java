package com.encore.util;
//Programmer의 생년월일의 정보를 담고 있는 클래스
public class MyDate {
	//1. 필드 선언...
	public int year;
	public int month;
	public int day;
	
	//2. 값을 필드에 어떻게 주입할지를 결정....setXxx()
	/*
	 * public void setDate(int year, int month, int day) { //필드 초기화!!!!! 
	 * this.year =year; 
	 * this.month = month; 
	 * this.day = day; 
	 * }
	 */

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}	
	
	//3. 필드값 받아오기..
	public String getDate() {
		return year+"-"+month+"-"+day; //Non String + String = String으로 Convert
	}

	
//	public int getDate() {
//		return year+month+day; //Non String + String = String으로 Convert
//	}
	
	
}
