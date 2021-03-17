package chatting.step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattServer {
	//Process의 필드를 지정
	ServerSocket server;
	Socket s;
	ArrayList<Chatthread> list;
	ChattServer(){
		list = new ArrayList<Chatthread>();
	}
	public void broadcast(String message) {
		for(Chatthread t : list) {
			t.sendMessage(message);
		}
	}
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server..Ready....");
			
			
			while(true) { //서버가 돌때까지 무한정 wating...for...
				s=server.accept();
				Chatthread ct = new Chatthread(s,this);
				
				list.add(ct);
				ct.start();
			}
		}catch(Exception e) {
			
		}finally{
			
		}
	}
	public static void main(String[] args) {
		ChattServer process = new ChattServer();
		process.net();
	}

}
//서버와 연결된 클라이언트와 메세지를 주고받는일만 전담하는 쓰레드..작업쓰레드..
class Chatthread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattserver;
	Chatthread(Socket s,ChattServer chattserver){
		this.s = s;
		this.chattserver = chattserver;
		
		
		System.out.println(s.getInetAddress()+"님이 접속하셨습니다");
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	public void run() {
		//실제로 쓰레드가 작업하는 내용...
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			while(true) {
				String line = br.readLine();
				chattserver.broadcast(line);
			}
		}catch(IOException e) {
			System.out.println(s.getInetAddress()+"님이 연결이 끊으셨습니다");
			chattserver.list.remove(this);
		}
	}
}