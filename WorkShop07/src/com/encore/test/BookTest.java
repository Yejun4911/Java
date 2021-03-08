package com.encore.test;

import com.encore.service.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magzine;
import com.encore.vo.novel;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookManagerImpl.getInstance().insertBook(new novel("1","�ι̿��� �ٸ���","���ͽ��Ǿ�","�ֿ���",15000.0,"A"));
		BookManagerImpl.getInstance().insertBook(new Magzine("2","�ܸ�","���ͽ��Ǿ�","�ֿ���",35000.0,"B"));
		
		System.out.println(BookManagerImpl.getInstance().getNumberOfBooks());//���� å ����
		
		Book[] bk = BookManagerImpl.getInstance().getAllBook(); // ���� å����
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search lsbn"); //
		System.out.println(BookManagerImpl.getInstance().searchBookBylsbn("1"));
		
		System.out.println("Search Title");
		bk = BookManagerImpl.getInstance().searchBookByTitle("�ܸ�");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Publisher");
		bk = BookManagerImpl.getInstance().searchBookByPublisher("�ֿ���");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Price");
		bk = BookManagerImpl.getInstance().searchBookByPrice(15000.0);
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println(BookManagerImpl.getInstance().getSumpriceOfBooks());
		System.out.println(BookManagerImpl.getInstance().getAveragePriceOfBooks());

		System.out.println("###novel####");
		BookManagerImpl.getInstance().novelInfo();
		System.out.println("###Magzine####");
		BookManagerImpl.getInstance().magzineInfo();
	}

}
