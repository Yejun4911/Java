package com.encore.child;
/*
 * �θ� Ŭ���� Employee �κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����...
 * 
 * ������ ȣ�� ---> ��ü ����
 */

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee{

	private String bossOfName;
	
	public Secretary(String name, MyDate birthDay, double salary, String bossOfName) {//�ڽ��� �����Ƿ��Ҷ�...
		super(name, birthDay,salary);
		this.bossOfName = bossOfName;
	}	

	public String getDetails() {
		return super.getDetails()+","+bossOfName;
	}		
}























































