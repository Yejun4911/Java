package com.encore.banking;
//���� ���� ������ ������ �ִ� Ŭ����
//��������� ���� ��....Account�� Hasing�ؾ��Ѵ�.
public class Customer {
	public String name;
	public int ssn;
	
	//1. 
	public Account account;	
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	//2. 
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//3. ���� ������ ������ �޾Ƽ� ����ϴ� ���..
	public Account getAccount() {
		return account;
	}

	public String getCustomerInfo() {
		return name+","+ssn;
	}	
}
