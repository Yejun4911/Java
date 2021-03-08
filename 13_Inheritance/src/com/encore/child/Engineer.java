package com.encore.child;
/*
 * �θ� Ŭ���� Employee �κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����...
 * 
 * ������ ȣ�� ---> ��ü ����
 */

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Engineer extends Employee{

	private String tech;
	
	public Engineer(String name, MyDate birthDay, double salary, String tech) {//�ڽ��� �����Ƿ��Ҷ�...
		super(name, birthDay,salary);
		this.tech = tech;
	}	

	public String getDetails() {
		return super.getDetails()+","+tech;
	}		
}























































