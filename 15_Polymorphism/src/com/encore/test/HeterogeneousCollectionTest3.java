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
import com.encore.util.Mydate;

public class HeterogeneousCollectionTest3 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("james", new Mydate(1982,3,2), 23000.0),
				new Manager("robert", new Mydate(1981,4,21), 33000.0, "IT"),
				new Engineer("gosling", new Mydate(1982,4,2), 46000.0, "Java", 288),
				new Secretary("peter", new Mydate(1988,1,5), 43000.0, "Robert")
		};
		
		//for문과 instanceof키워드를 사용해서
		//Robert 부서를 IT -> Marketing
		//Gosling의 tech를 Java -> Python
		//Peter의 bossOfName Robert -> Gosling 변경하자
		
		for(Employee e : emps) {
			if(e instanceof Manager) {
				((Manager) e).changeDept("Marketing");
			}
			if(e instanceof Engineer) {
				((Engineer) e).changeTech("Python");
			}
			if(e instanceof Secretary) {
				((Secretary) e).changeBossOfName("Robert");
			}
			System.out.println(e);
		}
		
	}
}
