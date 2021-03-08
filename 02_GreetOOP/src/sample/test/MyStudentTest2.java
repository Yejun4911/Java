package sample.test;

import sample.MyStudent2;

/*
	MyStudentTest.java의 문제점
	::
	학생수가 늘어날때마다
	일일이 필드에 해당하는 값을 직접 넣어줘야 하는 번거로움이 있다.
	
	프로그램은 작성시 실제값이 하드코딩 되어지면 그래서 안된다.
	::
	해결책?
	1) 필드에 값을 직접 넣으면 안된다.
	2) 값이 필드에 입력되는 기능을 새롭게 하나 정의
 */
public class MyStudentTest2 {
	public static void main(String[] args) {
		MyStudent2 m1 = new MyStudent2();
		MyStudent2 m2 = new MyStudent2();
		
		m1.setField("AAA", 27, "Texas");
		m2.setField("BBB", 29, "LA");
		
		m1.printInfo();
		m2.printInfo();
		
	}
}



         





























