package com.encore.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.service.BookManager;
import com.encore.vo.Book;



public class BookMgrImpl implements BookManager {
	BufferedReader br;
	BufferedWriter bw;
	FileReader fr;
	FileWriter fw;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileOutputStream fos;
	FileInputStream fis;
	File file;
	
	
	ArrayList<Book> bList = new ArrayList<Book>();
	
	private BookMgrImpl() {
		file = new File("book.txt");
		if (file.exists()) {
			open();
		} else {
			try {
				if(file.createNewFile())
					System.out.println("颇老 积己 己傍...");
			} catch (IOException e) {
				System.out.println("颇老 积己 角菩...");
			}
		}
	}
	
	static final BookMgrImpl service = new BookMgrImpl();
	
	public static BookMgrImpl getInstance() {
		return service;
	}
	
	@Override
	public void add(Book book) {
		bList.add(book);
	}

	@Override
	public ArrayList<Book> search() {
		ArrayList<Book> list =new ArrayList<Book>();
		for(Book i : bList) list.add(i);
		return list;
	}

	@Override
	public void sell(int isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		for(Book i : bList) {
			if(i.getIsbn()==isbn) {
				i.setQuantity(i.getQuantity()-quantity);
			}
		}
	}

	@Override
	public void buy(int isbn, int quantity) throws ISBNNotFoundException {
		for(Book i : bList) {
			if(i.getIsbn()==isbn) {
				i.setQuantity(i.getQuantity()+quantity);
			}
		}
	}

	@Override
	public int getTotalAmount() {
		int sum=0;
		for(Book i : bList) {
			sum+=i.getPrice();
		}
		return sum;
	}

	@Override
	public void open() {
		if(file.exists()) {
				try {
					ois = new ObjectInputStream(new FileInputStream(file));
					bList = (ArrayList<Book>)ois.readObject();
				} catch (IOException e) {
					e.printStackTrace();
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}finally {
					try {
						if (br != null)
							br.close();
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
	}

	@Override
	public void close() {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(bList);
			
		} catch (IOException e) {
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	
}
