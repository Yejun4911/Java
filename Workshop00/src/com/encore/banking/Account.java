package com.encore.banking;
//���忡 ���� ������ ������ �ִ� Ŭ����..
/*
 * 1. �ʵ弱��
 * 2. ���� ������ ��ηθ� ��� : 1) SETTER  2)������
 * 3. �ʵ� ���� �޾ƿ´�
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
	
	//�Ա�
	/* ��� ���
	 * amount �ݾ��� 1õ�� �̻��϶��� �Ա��ϰ�
	 * �׷��� ������ ����!!...�޼���...
	 */
	public void  deposit(double amount) { //5,000
		if(amount>=1000) {
			balance += amount;
		}else {
			System.out.println("�Աݾ��� 1õ�� �̻��̾�� �մϴ�!!");
			return;
		}
	}
	
	//���
	/* ��� ���
	 * amount...�ܾ��� 1����...2����
	 * �׷��� ������ ����!!...�޼���...
	 * ������ �޾ƺ�����
	 */
	public void  withdraw(double amount) { //5,000
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("��ݾ��� �ܾ��� �ʰ��մϴ�!!");
			return;
		}
	}
}






