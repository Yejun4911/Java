package com.encore.service;

import com.encore.vo.Book;

public interface BookManager {
	int getNumberOfBooks();
	void insertBook(Book book);
	Book[] getAllBook();
	Book searchBookBylsbn(String isbn);
	Book[] searchBookByTitle(String title);
	Book[] searchBookByPublisher(String publisher);
	Book[] searchBookByPrice(double price);
	double getSumpriceOfBooks();
	double getAveragePriceOfBooks();
	
}
