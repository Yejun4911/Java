package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		//1. Accout Type�� �迭�� ����...������� 3
		Account[ ] account = new Account[3];
		for(int i=0; i<account.length; i++) System.out.println(account[i]);
		System.out.println("�ּҰ� "+account);
		
		//2. ������ ĭ�� ����, ����, �츮���� ������ ����
		account[0] = new Account(1000.0, "��������");
		account[1] = new Account(30000.0, "��������");
		account[2] = new Account(40000.0, "�츮����");
		
		//3. FOR���� ����ؼ� ������ Account������ �ַܼ� ����Ѵ�.
		for(int i=0; i<account.length; i++) {
			System.out.println(account[i]);//�ּҰ�
			System.out.println(account[i].getDetail());
		}
	}
}
