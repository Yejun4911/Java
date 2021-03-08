package com.encore.child;

import com.encore.parent.Person;

public class Teacher extends Person{
	private String subject;

	public Teacher(String name, int age, String address, String subject) {
		super(name, age, address);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Teacher [subject=" + subject + "]";
	}
}
