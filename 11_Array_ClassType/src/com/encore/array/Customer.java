package com.encore.array;
/*
 * 통장 여러개를 가지고 있는 고객의 정보를 담고 있는 클래스
 */
public class Customer {
	//1. 필드 선언
	private String name;
	private int ssn;
	
	///////////// Has a Relation /////////////////
	
	//필드 추가... 여러개의 통장을 가지는 고객이 되도록
	private Account[ ] accounts;
	
	//기능 추가... 추가한 필드를 setter로 주입...
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	//기능 추가...추가한 필드를 받아오는 기능...	
	public Account[] getAccounts() {
		return accounts;
	}
	////////////////////////////////////////////////
	
	
	//2. 주입의 통로...생성자 주입
	public Customer(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	//3. 필드 정보를 받아옴
	public String getCustomerInfo() {
		return name+","+ssn;
	}		
}
