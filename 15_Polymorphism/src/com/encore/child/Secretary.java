package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.Mydate;

public class Secretary extends Employee{
	
	private String bossOfName;

	public Secretary(String name, Mydate birthDay, double salary, String bossOfName) {
		super(name, birthDay, salary);
		this.bossOfName = bossOfName;
		
	}

	@Override
	public String toString() {
		return super.toString() + ", " + bossOfName;
	}

	public void changeBossOfName(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	
	
	
	

	
	
	

}
