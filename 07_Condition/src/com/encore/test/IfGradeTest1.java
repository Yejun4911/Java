package com.encore.test;

import java.util.Scanner;

/*
 * 제어문
 * :
 * 조건을 만족할때만 문장을 수행하도록 제어하는 문장.
 * 1)if / if~else / else
 *   int i=3;
 *   if(i==1){
 *      // code block1
 *   }else if(i==1){
 *    	// code block2
 *   }else if(i==2){
 *    	// code block2
 *   }else{
 *   	// code block3
 *   }
 *   
 *   
 *   
 * 2)switch
 * : 해당하는 Case의 문장을 실행하도록 제어한다.
 *   switch(grade){
 *   	case 90:
 *      case 95:
 *         System.out.println("A grade...");
 *      break;
 *      
 *      case 80:
 *      case 85:
 *         System.out.println(B grade...");
 *      break;
 *      
 *      default:
 *      	System.out.println("Try");
 *      
 *      break;
 *   }//
 *   
 * 
 */
public class IfGradeTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험성적을 입력하세요>>>");
		
		int score = sc.nextInt();
		
		if(score<100 && score>=90) 	System.out.println("A grade...");
		else if(score<90 && score>=80) 	System.out.println("B grade...");
		else if(score<80 && score>=70) 	System.out.println("C grade...");
		else if(score<70 && score>=60) 	System.out.println("D grade...");
		else System.out.println("Try Again...!!!");
		

	}

}





















