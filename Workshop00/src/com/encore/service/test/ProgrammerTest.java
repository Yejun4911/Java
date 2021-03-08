package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		//1. Programmer ��ü�� ����
		//2. Programmer�� NoteBook�� ����
		//3. ������ ������ ��Ʈ�� ������ ���
		//4. �� �ʿ��� ����� �ִٸ� ���� �˾Ƽ� �߰��ؼ� ������ �ۼ�...
		Programmer pro = new Programmer("James", new MyDate(1988,1,1), "Java", "Encore");
		pro.buyNoteBook(new NoteBook(111, "HP", 230));
		
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("James�� ������ ��Ʈ���� �����Դϴ�..\n");
		System.out.println(myNoteBook.getNoteBookInfo());
		
		System.out.println("\nJames�� �����Դϴ�.");
		System.out.println(pro.getProgrammerInfo());				
	}
}
