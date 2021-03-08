package com.encore.array;
/*
 * ���� �������� ������ �ִ� ���� ������ ��� �ִ� Ŭ����
 */
public class Customer {
	//1. �ʵ� ����
	private String name;
	private int ssn;
	
	///////////// Has a Relation /////////////////
	
	//�ʵ� �߰�... �������� ������ ������ ���� �ǵ���
	private Account[ ] accounts;
	
	//��� �߰�... �߰��� �ʵ带 setter�� ����...
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	//��� �߰�...�߰��� �ʵ带 �޾ƿ��� ���...	
	public Account[] getAccounts() {
		return accounts;
	}
	////////////////////////////////////////////////
	
	
	//2. ������ ���...������ ����
	public Customer(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	//3. �ʵ� ������ �޾ƿ�
	public String getCustomerInfo() {
		return name+","+ssn;
	}		
}
