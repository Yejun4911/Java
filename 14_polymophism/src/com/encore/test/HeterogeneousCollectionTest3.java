package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class HeterogeneousCollectionTest3 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("James", new MyDate(1982,3,2), 23000.0),
				new Manager("Robert", new MyDate(1981,4,2), 33000.0, "IT"),
				new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "Java",2000),
				new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert")
		};
		for(Employee e : emps) {
			if(e instanceof Manager)((Manager) e).ChangeDept("Marketing");
			else if(e instanceof Engineer) ((Engineer) e).changeTech("Python");
			else if(e instanceof Secretary) ((Secretary) e).changeBossOfName("Gosling");
			System.out.println(e.getDetails());
		}
				
				
		

	}

}
