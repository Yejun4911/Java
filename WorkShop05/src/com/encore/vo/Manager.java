package com.encore.vo;

import com.encore.util.MyDate;

public class Manager {
	private String name;
	private MyDate brithDay;
	private double salary;
	private String dept;
	private int deptno;
	public Manager(String name, MyDate brithDay, double salary, String dept, int deptno) {
		this.name = name;
		this.brithDay = brithDay;
		this.salary = salary;
		this.dept = dept;
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBrithDay() {
		return brithDay;
	}
	public void setBrithDay(MyDate brithDay) {
		this.brithDay = brithDay;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", brithDay=" + brithDay + ", salary=" + salary + ", dept=" + dept
				+ ", deptno=" + deptno + "]";
	}
	
	
	
}
