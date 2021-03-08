package com.encore.cons;

import com.encore.util.MyDate;

//개발자 정보를 담고 있는 클래스..
public class Programmer {
	
	//1. 필드 선언...
	public String name;
	public MyDate birthday;
	public float salary;
	public int bonus;
	
	//2. 주입
	/*
	 * public void setProgrammer(String name,MyDate birthday, float salary, int
	 * bonus) { this.name = name; this.birthday = birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	// 추가...생성자
	public Programmer() {	}//기본생성자....필드초기화 안한다
		
	public Programmer(String name, MyDate birthday, float salary, int bonus) { //명시적 생성자....필드초기화
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}
	//추가...개발자의 연봉(월급 * 12)을 리턴하는 기능을 정의
	public float getAnnualSalary() {
		return salary * 12 + bonus;
	}
	
	//3. 필드 값 받아오기
	public String getProgrammer() {
		return name+","+birthday.getDate()+", "+salary+", "+bonus;
	}
	
	//기능 추가
	public String getName() {
		return name;
	}	
}







































