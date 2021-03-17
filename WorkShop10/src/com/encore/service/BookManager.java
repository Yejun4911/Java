package com.encore.service;

import java.util.ArrayList;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.vo.Book;

public interface BookManager {
	
	void add(Book book);
	ArrayList<Book> search();
	void sell(int isbn, int quantity) throws QuantityException, ISBNNotFoundException;
	void buy(int isbn, int quantity) throws ISBNNotFoundException;
	int getTotalAmount();
	void open();
	void close();
	
}
