package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Book;

public interface BookManager {
	int getNumberOfBooks();
	void addBook(Book book);
	ArrayList<Book> getAllBook();

	Book searchBookBylsbn(String isbn);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagzin();
	ArrayList<Book> magazineOfThisYearlnfo(int Year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getSumpriceOfBooks();
	int getAveragePriceOfBooks();
	
}
