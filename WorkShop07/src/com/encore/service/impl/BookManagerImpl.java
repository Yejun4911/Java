package com.encore.service.impl;

import com.encore.service.BookManager;
import com.encore.vo.Book;


public class BookManagerImpl implements BookManager {
	private int idx;
	private Book[] bk;
	
	static final BookManagerImpl service = new BookManagerImpl();
	private BookManagerImpl() {
		idx=0;
		bk = new Book[100];
	}
	
	public static BookManagerImpl getInstance() {
		return service;
	}
	
	
	public int getNumberOfBooks() { //책이 몇개 있는지?
		return idx;
	}
	
	
	public void insertBook(Book book) {//
		bk[idx++]=book;
	}
	
	
	public Book[] getAllBook() {
		return bk;
	}
	
	
	public Book searchBookBylsbn(String isbn) {
		for(Book i : bk) {
			if(i!=null) {
				if(i.getIsbn().equals(isbn)) {
					return i;
				}
						
			}
		}
		return null;
	}
	
	
	public Book[] searchBookByTitle(String title) {
		Book[] temp=new Book[bk.length];
		int a=0;
		for(Book i : bk) {
			if(i!=null) {
				if(i.getTitle().equals(title)) {
					temp[a++]=i;
				}
						
			}
		}
		return temp;
	}

	public Book[] searchBookByPublisher(String publisher) {
		Book[] temp=new Book[bk.length];
		int a=0;
		for(Book i : bk) {
			if(i!=null) {
				if(i.getPulisher().equals(publisher)) {
					temp[a++]=i;
				}
						
			}
		}
		return temp;
	}
	public Book[] searchBookByPrice(double price) {
		Book[] temp=new Book[bk.length];
		int a=0;
		for(Book i : bk) {
			if(i!=null) {
				if(i.getPrice()==price) {
					temp[a++]=i;
				}
						
			}
		}
		return temp;
	}
	public double getSumpriceOfBooks() {
		double sum=0;
		for(Book i : bk) {
			if(i!=null) {
				sum+=i.getPrice();
			}
		}
		return sum;
	}
	public double getAveragePriceOfBooks() {
		double sum=0;
		for(Book i : bk) {
			if(i!=null) {
				sum+=i.getPrice();
			}
		}
		return sum/idx;
	}
	public void novelInfo() {
		for(Book i : bk) {
			if(i!=null && i.setKind().equals("novel")) System.out.println(i.toString());
		}
	}
	public void magzineInfo() {
		for(Book i : bk) {
			if(i!=null && i.setKind().equals("Magzine")) System.out.println(i.toString());
		}
	}
}
