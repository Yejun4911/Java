package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//step1
		/*
		 * Programmer pro = new Programmer(); Programmer pro1 = new Programmer();
		 * 
		 * MyDate md = new MyDate(); md.setDate(1980, 1, 1);
		 * 
		 * pro.setProgrammer("James", md, 300000.0F, 10000);//필드에 값을 주입
		 * pro1.setProgrammer("Peter", md, 400000.0F, 20000);//필드에 값을 주입
		 * 
		 * pro = pro1;
		 * 
		 * System.out.println(pro.getProgrammer());//주입된 값을 받아옴
		 * System.out.println(pro1.getProgrammer());
		 */
		 
		//step2
		//MyDate md =  new MyDate(1980, 1, 1);
		Programmer pro1 = new Programmer("James", new MyDate(1980, 1, 1), 300000.0F, 10000);
		Programmer pro2 = new Programmer("Peter", new MyDate(1980, 1, 1), 400000.0F, 20000);	
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer());
		
		System.out.println("\n============================================================\n");
		System.out.println(pro2.getName()+"님의 연봉은 "+pro2.getAnnualSalary()+"달러입니다!!!");
		
	}
}









