package com.encore.test;

import java.util.ArrayList;

import com.encore.service.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magzine;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookManagerImpl.getInstance().addBook(new Book("1","�ι̿��� �ٸ���","���ͽ��Ǿ�","�ֿ���",15000,"A"));
		BookManagerImpl.getInstance().addBook(new Book("2","�ܸ�","���ͽ��Ǿ�","�ֿ���",35000,"B"));
		BookManagerImpl.getInstance().addBook(new Magzine("3","����","�ֿ���","����",15000,"B",2020,1));
		
		//////////������ ��ü�˻� ���
		System.out.println("#########������ ��ü�˻� ���########");
		ArrayList<Book> bk = BookManagerImpl.getInstance().getAllBook(); // ���� å����
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println("##########Search lsbn############"); //
		System.out.println(BookManagerImpl.getInstance().searchBookBylsbn("1"));
		
		System.out.println("############Search Title############");
		bk = BookManagerImpl.getInstance().searchBookByTitle("�ܸ�");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println("############Search Book############");
		bk=BookManagerImpl.getInstance().onlySearchBook();
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println("############Search Magzine############");
		bk=BookManagerImpl.getInstance().onlySearchMagzin();
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println("############Search Magzine Year############");
		bk=BookManagerImpl.getInstance().magazineOfThisYearlnfo(2020);
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		
		System.out.println("##########Search Publisher############");
		bk = BookManagerImpl.getInstance().searchBookByPublisher("�ֿ���");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("############ Search Price ############");
		bk = BookManagerImpl.getInstance().searchBookByPrice(15000);
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println(BookManagerImpl.getInstance().getSumpriceOfBooks());
		System.out.println(BookManagerImpl.getInstance().getAveragePriceOfBooks());

		
	}

}
