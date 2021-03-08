package com.encore.test1;

import java.util.Scanner;

/*
 * 제어문을 사용한 알고리즘을 간단하게 다뤄보자..30분에 다시 봅시다!!
 */
public class CatchAMouseTest {	
	private static String algoSolv(int cata, int catb, int mouse) {
		//if, else if, else 구문과 Math.abs()를 이용해서 알고리즘을 구현하세요!!
		if(Math.abs(cata-mouse)>Math.abs(catb-mouse)) return "CatB Catch!!";
		else if(Math.abs(cata-mouse)<Math.abs(catb-mouse)) return "CatA Catch!!";
		else return "Mouse Escape!!";		
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//순서대로 3개의 값을 입력받는다..
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result=algoSolv(cata,catb, mouse);
		System.out.println("Result :: "+result);
	}
}
