package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.Mydate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Employee emp = new Employee("james", new Mydate(1982,3,2), 23000.0);
		Manager m = new Manager("robert", new Mydate(1981,4,21), 33000.0, "IT");
		Engineer eg = new Engineer("gosling", new Mydate(1982,4,2), 46000.0, "Java", 200);
		Secretary ss = new Secretary("peter", new Mydate(1988,1,5), 43000.0, "Robert");
		
		//로버트가 부서 바꾼다
		m.changeDept("Marketing");
		
		System.out.println(emp);
		System.out.println(emp.toString());

		System.out.println(emp);
		System.out.println(m);
		System.out.println(eg);
		System.out.println(ss);
		
		/////////////////////////////// polymorphism ///////////////////////////////////////////
		// 부모타입으로 자식을 생성한다.
		System.out.println("\n===============================Polymorphism==================================\n");
		Employee e1 = new Manager("robert", new Mydate(1981,4,21), 33000.0, "IT");
		Employee e2 = new Engineer("gosling", new Mydate(1982,4,2), 46000.0, "Java", 200);
		Employee e3 = new Secretary("peter", new Mydate(1988,1,5), 43000.0, "Robert");
		
//		Manager m1 = (Manager) e1;
//		m1.changeDept("Marketing");
		
		((Manager) e1).changeDept("Marketing");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
	
}
