package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Account;
import com.encore.banking.Customer;

public class BankingTest {

	public static void main(String[] args) {
		//1. Customer ��ü�� ����..�̶� �� ������ Scanner��ü�� ���ؼ� �Է�...�̸�, ssn��
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �ֹι�ȣ�� �Է��ϼ���>>>");
		
		String name = sc.nextLine();
		int ssn = sc.nextInt();
		
		Customer custom = new Customer(name, ssn);
		
		//2. ���� ������ �����Ѵ�....�̋� Has a Relation�� ����ȴ�.
		custom.setAccount(new Account(10000.0));//1����
		
		//3. ���� ������ ������ ��ȯ...
		Account myAccount = custom.getAccount();
		
		//4. ������ ���...1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 7õ�� ���
		myAccount.deposit(10000.0);//2����
		myAccount.deposit(300);// 2����
		myAccount.withdraw(10000); //1����
		myAccount.withdraw(20000); //1����
		
		//5. �������� �ܾ��� �ַܼ� ����غ���...1���� + balance		
		System.out.println("�ܾ��� "+myAccount.getBalance()+" ���Դϴ�.!!");
	}
}
