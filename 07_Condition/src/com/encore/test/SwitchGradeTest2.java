package com.encore.test;

import java.util.Scanner;

public class SwitchGradeTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���輺���� �Է��ϼ���>>>");
		
		int score = sc.nextInt();
		
		switch(score) {
			case 90:
			case 95:
			case 100:
				System.out.println("A..");
			//break;
			
			case 80:
			case 85:
				System.out.println("B..");
				break;
				
			case 70:
			case 75:
				System.out.println("C..");
				break;
				
			default:
				System.out.println("Try Again...");
				break;
		}//switch
		System.out.println("Switch���� �������ɴϴ�...");
	}//main
}//class






