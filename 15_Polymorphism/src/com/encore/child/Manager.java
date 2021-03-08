package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.Mydate;

/*
 * 부모 클래스 Employee로부터 모든것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식클래스
 */
public class Manager extends Employee{

	//자식만의 멤버를 추가
	private String dept;
	
	//생성자는 override 어노테이션을 쓸수는 없다.
	public Manager(String name, Mydate birthDay, double salary, String dept) {
		//부모 생성자가 호출된다.
		super(name, birthDay, salary);
		this.dept = dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	

	//Method Overriding
	/*
	 * 상속관계에서만 일어난다
	 * 1step : 부모가 가진 기능을 물려받는다 -> 호출한다.
	 * 2step : 그걸 자신에 맞게 고쳐쓴다
	 * 
	 * Overriding의 Rule
	 * 1. 메서드 선언부는 모두 일치
	 * 2. 구현부는 반드시 달라야 한다
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + dept;
	}
	
}
