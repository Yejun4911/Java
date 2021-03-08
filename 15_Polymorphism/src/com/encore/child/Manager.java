package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.Mydate;

/*
 * �θ� Ŭ���� Employee�κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����
 */
public class Manager extends Employee{

	//�ڽĸ��� ����� �߰�
	private String dept;
	
	//�����ڴ� override ������̼��� ������ ����.
	public Manager(String name, Mydate birthDay, double salary, String dept) {
		//�θ� �����ڰ� ȣ��ȴ�.
		super(name, birthDay, salary);
		this.dept = dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	

	//Method Overriding
	/*
	 * ��Ӱ��迡���� �Ͼ��
	 * 1step : �θ� ���� ����� �����޴´� -> ȣ���Ѵ�.
	 * 2step : �װ� �ڽſ� �°� ���ľ���
	 * 
	 * Overriding�� Rule
	 * 1. �޼��� ����δ� ��� ��ġ
	 * 2. �����δ� �ݵ�� �޶�� �Ѵ�
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + dept;
	}
	
}
