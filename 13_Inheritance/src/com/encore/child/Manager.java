package com.encore.child;
/*
 * 부모 클래스 Employee 로부터 모든것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식클래스...
 * 
 * 생성자 호출 ---> 객체 생성
 */

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Manager extends Employee{
	//
	// 자식만의 멤버를 추가
	private String dept;
	
	/*
	 * 자식생성자....객체 생성알고리즘
	 * 자식 생성자 { 첫라인에서 무조건 부모기본 생성자 호출이 일어난다
	 */
	public Manager(String name, MyDate birthDay, double salary, String dept) {//자식이 생성되려할때...
		//부모기본생성자호출....super();
		super(name, birthDay,salary);
		this.dept = dept;
	}	
	//Method Overriding
	/*
	 * 상속관계에서만 일어난다.
	 * 1step : 부모가 가진 기능을 물려받는다....호출한다
	 * 2step : 그걸 자신에 맞게 고쳐쓴다.
	 * 
	 * 
	 */
	public String getDetails() {
		return super.getDetails()+","+dept;
	}		
}























































