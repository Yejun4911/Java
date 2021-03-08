package com.encore.parent;

import com.encore.util.MyDate;

/*
 * �ڽĵ��� �������� ������
 * �Ϲ����� ������ ������ �ִ� �θ� Ŭ����..
 */
public class Employee {
	//����� ����
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDay;
	private double salary;
	
	public Employee() {}//�⺻ ������
	
	public Employee(String name, MyDate birthDay) {
		this(name, birthDay, BASIC_SALARY);
	}
	
	public Employee(String name, MyDate birthDay, double salary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	
	public String getDetails() {
		return name+", "+birthDay+", "+salary;
	}	
}

























