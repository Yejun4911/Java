package com.encore.test;

public class SwitchNoBreakTest3 {

	public static void main(String[] args) {//����...
		/*
		 * 1. ��ü����...�ı��� �޸𸮿� �ø���.
		 * 2. �׸��� �ı��� ȣ���Ѵ� / �޼ҵ� ȣ��...
		 * ��������� �޸��� �ȿö󰣳��� ����Ҽ� ����.
		 * ����ҷ��� �޸� �÷��� �Ѵ�. ==

			���� ��ü �������� �ʰ� �ٷ� ����Ҽ� �ִ� �͵��� �ִ�.
			�̹� �޸𸮿� �ö� �ִ�...static�� ������ �͵��� �̸� �ö� �ִ�.
		 */
		int time=(int)(Math.random()*4)+8;//8~11
		System.out.println("[����ð� : "+time +" ��]");
		
		switch(time) {
			case 8:
				System.out.println("����� �غ��մϴ�..");
			case 9:
				System.out.println("ȸ�� ����, ����ȸ�� �մϴ�..");
			case 10:
				System.out.println("���� ������ ���ϴ�.");
			case 11:
				System.out.println("�ܱٳ����ϴ�.");
		}

	}

}








