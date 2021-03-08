package com.encore.test;
/*
 * Collection
 * 1. homogeneous - 동종간의 집합체
 * 2. heterogeneous - 이기종과의 집합체
 */

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.service.EmployeeService;
import com.encore.util.Mydate;

public class PolymorphismTest_sample {

	public static void main(String[] args) {
		
		
		//1. 부모타입으로 자식생성
		Employee e1 = new Employee("james", new Mydate(1982,3,2), 23000.0);
		Employee e2 = new Manager("robert", new Mydate(1981,4,21), 33000.0, "IT");
		Employee e3 = new Engineer("gosling", new Mydate(1982,4,2), 46000.0, "Java", 288);
		Employee e4 = new Secretary("Peter", new Mydate(1988,1,5), 43000.0, "Robert");
		
		//2. 부모타입의 배열에 초기화
		Employee[] emps = {e1,e2,e3,e4};
		
		//3. 서비스 클래스 생성
		EmployeeService service = new EmployeeService();
		
		service.manageEmployee(e4);
		service.manageEmployee(e3);
		
		
	}
}
