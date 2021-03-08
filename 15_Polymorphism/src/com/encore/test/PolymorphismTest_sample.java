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
import com.encore.service.EmployeeService;
import com.encore.util.Mydate;

public class PolymorphismTest_sample {

	public static void main(String[] args) {
		
		
		//1. �θ�Ÿ������ �ڽĻ���
		Employee e1 = new Employee("james", new Mydate(1982,3,2), 23000.0);
		Employee e2 = new Manager("robert", new Mydate(1981,4,21), 33000.0, "IT");
		Employee e3 = new Engineer("gosling", new Mydate(1982,4,2), 46000.0, "Java", 288);
		Employee e4 = new Secretary("Peter", new Mydate(1988,1,5), 43000.0, "Robert");
		
		//2. �θ�Ÿ���� �迭�� �ʱ�ȭ
		Employee[] emps = {e1,e2,e3,e4};
		
		//3. ���� Ŭ���� ����
		EmployeeService service = new EmployeeService();
		
		service.manageEmployee(e4);
		service.manageEmployee(e3);
		
		
	}
}
