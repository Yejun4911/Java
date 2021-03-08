package com.encore.banking;
//통장에 관한 정보를 가지고 있는 클래스..
/*
 * 1. 필드선언
 * 2. 값을 주입할 통로로를 고민 : 1) SETTER  2)생성자
 * 3. 필드 값을 받아온다
 */
public class Account {
	
	public double balance; //10000 --> 15000

	public Account(double balance) {
		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	//입금
	/* 제어문 사용
	 * amount 금액이 1천원 이상일때만 입금하고
	 * 그렇지 않으면 에러!!...메세지...
	 */
	public void  deposit(double amount) { //5,000
		if(amount>=1000) {
			balance += amount;
		}else {
			System.out.println("입금액은 1천원 이상이어야 합니다!!");
			return;
		}
	}
	
	//출금
	/* 제어문 사용
	 * amount...잔액이 1만원...2만원
	 * 그렇지 않으면 에러!!...메세지...
	 * 조건을 달아보세요
	 */
	public void  withdraw(double amount) { //5,000
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("출금액이 잔액을 초과합니다!!");
			return;
		}
	}
}






