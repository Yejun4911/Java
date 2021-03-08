package com.encore.vo;

import com.encore.util.MyDate;

public class Engineer {
	private String name;
	private MyDate birthDate;
	private double salary;
	private String tech;
	private double bonus;
	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		this.tech = tech;
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getDetails() {
		return name+","+birthDate.toString()+","+salary+","+tech+","+bonus;
	}
	@Override
	public String toString() {
		return "Engineer [name=" + name + ", birthDate=" + birthDate + ", salary=" + salary + ", tech=" + tech
				+ ", bonus=" + bonus + "]";
	}
	
}
