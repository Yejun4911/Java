package com.encore.child;
/*
 * 부모 클래스 Employee 로부터 모든것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식클래스...
 * 
 * 생성자 호출 ---> 객체 생성
 */

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee{

	private String bossOfName;
	
	public Secretary(String name, MyDate birthDay, double salary, String bossOfName) {//자식이 생성되려할때...
		super(name, birthDay,salary);
		this.bossOfName = bossOfName;
	}	

	public String getDetails() {
		return super.getDetails()+","+bossOfName;
	}		
}























































