package com.encore.server;

import java.awt.print.Book;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class BookServer {
	
	Socket s;
	ServerSocket server;
	
	
	ArrayList<Bookthread> list;
	
	public BookServer(){
		list = new ArrayList<Bookthread>();
	}
	
	public void broadcast(ArrayList<Book> bList) {
		for(Bookthread t : list) {
			t.sendMessage(bList);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready......");
			
			while(true) { //윙윙윙....wating for...
				s=server.accept();
				Bookthread ct = new Bookthread(s,this);
				
				list.add(ct);
				ct.start();//.. 작업이 병렬적으로 진행되는 pocus!!
			}
		}catch(Exception e) {
			
		}finally {
			
		}
	}
	public static void main(String[] args) {
		BookServer process = new BookServer();
		process.net();
	}
}
//서버와 연결된 클라이언트와 메세지를 주고받는일만 전담하는 쓰레드...작업쓰레드
class Bookthread extends Thread{
	Socket s;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	

	ArrayList<Book> bList;
	BookServer chattServer;
			
	Bookthread(Socket s, BookServer chattServer){
		this.s = s;
		this.chattServer = chattServer;
		
		System.out.println(s.getInetAddress()+"님이 접속하셨습니다.");	
	}
	
	public void sendMessage(ArrayList<Book> bList2) {
		try {
			oos.writeObject(bList);
		} catch (IOException e) {
		}
	}
	public void run() {
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			
			bList = (ArrayList<Book>)ois.readObject();
			chattServer.broadcast(bList);
			
		}catch(IOException e) {
			System.out.println(s.getInetAddress()+"님이 접속을 끊으셨습니다.");	
			chattServer.list.remove(this);			
		} catch (ClassNotFoundException e) {
		}
	}
}












