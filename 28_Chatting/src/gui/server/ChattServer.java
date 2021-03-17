package gui.server;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChattServer {
	
	Socket s;
	ServerSocket server;
	
	
	ArrayList<Chatthread> list;
	
	public ChattServer(){
		list = new ArrayList<Chatthread>();
	}
	
	public void broadcast(ArrayList<Book> bList) {
		for(Chatthread t : list) {
			t.sendMessage(bList);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready......");
			
			while(true) { //윙윙윙....wating for...
				s=server.accept();
				Chatthread ct = new Chatthread(s,this);
				list.add(ct);
				ct.start();//.. 작업이 병렬적으로 진행되는 pocus!!
			}
		}catch(Exception e) {
			
		}finally {
			
		}
	}
	public static void main(String[] args) {
		ChattServer process = new ChattServer();
		process.net();
	}
}
//서버와 연결된 클라이언트와 메세지를 주고받는일만 전담하는 쓰레드...작업쓰레드
class Chatthread extends Thread{
	Socket s;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	

	ArrayList<Book> bList;
	ChattServer chattServer;
			
	Chatthread(Socket s, ChattServer chattServer){
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












