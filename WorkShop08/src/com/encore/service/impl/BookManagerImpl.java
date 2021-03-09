package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magzine;


public class BookManagerImpl implements BookManager {
	private ArrayList<Book> book;
	static final BookManagerImpl service = new BookManagerImpl();
	
	private BookManagerImpl() {
		book=new ArrayList<Book>();
		
	}
	public static BookManagerImpl getInstance() {
		return service;
	}
	

	@Override
	public void addBook(Book bk) {
		boolean find = false;
		for(Book i : book) {
			if(i.getIsbn().equals(bk.getIsbn())) {
				find=true;
			}
		}
		if(find==false) {
			System.out.println(bk.getTitle()+"책이 등록되었습니다");
			book.add(bk);
		}
	}

	@Override
	public ArrayList<Book> getAllBook() {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			temp.add(i);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i.getTitle().equals(title)) {
				temp.add(i);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i instanceof Book) {
				temp.add(i);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagzin() {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i instanceof Magzine) {
				temp.add(i);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearlnfo(int Year) {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i.getYear()==Year) {
				temp.add(i);
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i.getPulisher().equals(publisher)) {
				temp.add(i);
			}
		}
		return temp;
	}
	@Override
	public Book searchBookBylsbn(String isbn) {
		for(Book i : book) {
			if(i.getIsbn().equals(isbn)) {
				return i;
			}
		}
		return null;
	}
	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> temp=new ArrayList<Book>();
		for(Book i : book) {
			if(i.getPrice()==price) {
				temp.add(i);
			}
		}
		return temp;
	}
	@Override
	public int getNumberOfBooks() {
		return book.size();
	}
	
	@Override
	public int getSumpriceOfBooks() {
		int total=0;
		for(Book i : book) {
			total+=i.getPrice();
		}
		return total;
	}
	@Override
	public int getAveragePriceOfBooks() {
		return getSumpriceOfBooks()/book.size();
	}
}
