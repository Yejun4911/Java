package com.encore.service;

import com.encore.vo.Book;

public class BookManager {
	private int idx;
	private Book[] bk;
	
	public BookManager() {
		idx=0;
		bk = new Book[100];
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
}
