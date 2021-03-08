package sample.test;

import sample.MyStudent;

/*
 * 1. MyStudent 객체 생성...ms
 * 2. MyStudent의 메소드의 동작
 */
public class MyStudentTest {
	public static void main(String[] args) {
		MyStudent ms1 = new MyStudent(); //1
		MyStudent ms2 = new MyStudent();
		MyStudent ms3 = new MyStudent();
		
		//2.
		ms1.name = "나예지";
		ms1.age = 25;
		ms1.address = "서초동";
		
		ms1.printInfo();
		/////////////////////////////
		
		ms2.name = "임세홍";
		ms2.age = 27;
		ms2.address = "신사동";
		
		ms2.printInfo();
		//////////////////////////////
		
		ms3.name = "나도향";
		ms3.age = 77;
		ms3.address = "서초동2";
		
		ms3.printInfo();
	}
}
