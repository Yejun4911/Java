package sample.test;

import sample.MyStudent;

/*
 * 1. MyStudent ��ü ����...ms
 * 2. MyStudent�� �޼ҵ��� ����
 */
public class MyStudentTest {
	public static void main(String[] args) {
		MyStudent ms1 = new MyStudent(); //1
		MyStudent ms2 = new MyStudent();
		MyStudent ms3 = new MyStudent();
		
		//2.
		ms1.name = "������";
		ms1.age = 25;
		ms1.address = "���ʵ�";
		
		ms1.printInfo();
		/////////////////////////////
		
		ms2.name = "�Ӽ�ȫ";
		ms2.age = 27;
		ms2.address = "�Ż絿";
		
		ms2.printInfo();
		//////////////////////////////
		
		ms3.name = "������";
		ms3.age = 77;
		ms3.address = "���ʵ�2";
		
		ms3.printInfo();
	}
}
