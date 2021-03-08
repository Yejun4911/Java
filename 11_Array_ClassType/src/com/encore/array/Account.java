package com.encore.array;
//���忡 ���� ������ ������ �ִ� AccountŬ����..
public class Account {
	//1. �ʵ� ����
	private double balance;
	private String bankName;
	
	//2. ������ ���...������/setter
	public Account(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}
	
	//3. �ʵ� ������ �޾ƿ�
	public String getDetail() {
		return balance+","+bankName;
	}
	
	//4.������ ���
	public void withdraw(double amt) {
		if(balance>=amt) balance -= amt;
		else return;
	}
	
	public void deposit(double amt) {
		if(amt>=1000)balance += amt;
		else return;
	}
	
	//��� �߰�
	public double getBalance() {
		return balance;
	}

	public String getBankName() {
		return bankName;
	}
}//class





