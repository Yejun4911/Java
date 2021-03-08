package com.encore.child;
/*
 * 부모 클래스 Employee 로부터 모든것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식클래스...
 * 
 * 생성자 호출 ---> 객체 생성
 */

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Engineer extends Employee{

	private String tech;
	
	public Engineer(String name, MyDate birthDay, double salary, String tech) {//자식이 생성되려할때...
		super(name, birthDay,salary);
		this.tech = tech;
	}	

	public String getDetails() {
		return super.getDetails()+","+tech;
	}		
}























































