package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		//1. Programmer 객체를 생성
		//2. Programmer가 NoteBook을 가짐
		//3. 개발자 정보와 노트북 정보를 출력
		//4. 더 필요한 기능이 있다면 각자 알아서 추가해서 로직을 작성...
		Programmer pro = new Programmer("James", new MyDate(1988,1,1), "Java", "Encore");
		pro.buyNoteBook(new NoteBook(111, "HP", 230));
		
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("James가 구매한 노트북의 정보입니다..\n");
		System.out.println(myNoteBook.getNoteBookInfo());
		
		System.out.println("\nJames의 정보입니다.");
		System.out.println(pro.getProgrammerInfo());				
	}
}
