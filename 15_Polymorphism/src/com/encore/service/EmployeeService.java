package com.encore.service;

import com.encore.child.Engineer;
import com.encore.parent.Employee;

/*
 * ��Ӱ��迡 �ִ� �پ��� subclass���� �ڵ鸵�ϴ� ��ɸ����� �̷���� ���� Ŭ����.
 */
public class EmployeeService {
	/*
	 * 1step
	 * ::
	 * public void managerManager(Manager m) {}
	 * public void managerEngineer(Engineer m) {}
	 * public void managerSecretary(Secretary m) {}
	 * 
	 * 2step - overloading
	 * �޼��� �̸��� ���� ó���ϴ� �����͸� �޸��ϴ� ���
	 * <<Rule>>
	 * 0. �ϳ��� Ŭ���������� ����Ǵ� ���.
	 * 1. �޼��� �̸��� ���ƾ� �Ѵ�.
	 * 2. ���ڰ��� �ݵ�� �޶�� �Ѵ�.
	 * 3. �޼��� ����Ÿ���� "�������".
	 * ::
	 * public void manageEmployee(Manager m) {}
	 * public void manageEmployee(Engineer m) {}
	 * public void manageEmployee(Secretary m) {}
	 * 
	 * 3step - polymorphism
	 * ::
	 * public void manageEmployee(Employee e) {
	 * 	
	 * }
	 * 
	 */
	public void manageEmployee(Employee e) {
		if (e.getName().equals("Peter")) {
			System.out.println(e.toString());
		}
		if (e instanceof Engineer) {
			System.out.println("���� : " + e.getSalary()*12 + ((Engineer) e).getBonus());
		}
	}
	
	public void printAllEmployee(Employee[] emps) {
		for(Employee e : emps) {
			System.out.println(e);
		}
	}

}
