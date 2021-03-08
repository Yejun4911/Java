package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세여...월,일순 >>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		System.out.println(md);
		
		md.setMonth(month);//calling...13....0
		md.setDay(day);//calling...33....0
		
//		if(md.getMonth()!=0 && md.getDay() !=0) 
		System.out.println("오늘은 "+md.getMonth()+"월 "+md.getDay()+"일 입니다.");
		
	}
}
