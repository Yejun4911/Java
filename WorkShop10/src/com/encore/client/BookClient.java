package com.encore.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.encore.vo.Book;


public class BookClient {
	Socket s;
	ObjectOutputStream oos;
	ArrayList<Book> bList;
	
	public BookClient(ArrayList<Book> bList){
		this.bList=bList;
	}
	
	public void net() {
		try {
			s = new Socket("127.0.0.1",60000);
			System.out.println("Socket Creating...");
			
			oos = new ObjectOutputStream(s.getOutputStream());
			
			BookThread bookthread = new BookThread(s);
			bookthread.start();
			
			
			oos.writeObject(bList);
			System.out.println(bList.size()+"개 전송 ##");
			
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} 
		
	}
}

class BookThread extends Thread{
	Socket s;
	ObjectInputStream ois;
	ArrayList<Book> bList;
	
	BookThread(Socket s){
		this.s=s;
		bList = new ArrayList<Book>();
	}
	public void run() {
		try {
			ois = new ObjectInputStream(s.getInputStream());
			bList = (ArrayList<Book>)ois.readObject();
			System.out.println(bList.size()+"개 전송받음");
			for(Book b : bList) System.out.println(b);
		}catch(Exception e) {
			
		}
	}
}

