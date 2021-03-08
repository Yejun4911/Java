package com.encore.test;
/*
 * Collection
 * 1. homogeneous - �������� ����ü
 * 2. heterogeneous - �̱������� ����ü
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
		
		//for���� instanceofŰ���带 ����ؼ�
		//Robert �μ��� IT -> Marketing
		//Gosling�� tech�� Java -> Python
		//Peter�� bossOfName Robert -> Gosling ��������
		
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
