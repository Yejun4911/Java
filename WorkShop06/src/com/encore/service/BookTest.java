package com.encore.service;

import com.encore.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager service = new BookManager();
		
		service.insertBook(new Book("1","�ι̿��� �ٸ���","���ͽ��Ǿ�","�ֿ���",15000.0,"A"));
		service.insertBook(new Book("2","�ܸ�","���ͽ��Ǿ�","�ֿ���",35000.0,"B"));
		
		System.out.println(service.getNumberOfBooks());//���� å ����
		
		Book[] bk = service.getAllBook(); // ���� å����
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search lsbn"); //
		System.out.println(service.searchBookBylsbn("1"));
		
		System.out.println("Search Title");
		bk = service.searchBookByTitle("�ܸ�");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Publisher");
		bk = service.searchBookByPublisher("�ֿ���");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Price");
		bk = service.searchBookByPrice(15000.0);
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println(service.getSumpriceOfBooks());
		System.out.println(service.getAveragePriceOfBooks());
		
	}

}
