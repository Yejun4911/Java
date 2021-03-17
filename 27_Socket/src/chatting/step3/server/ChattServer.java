package chatting.step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattServer {
	//Process�� �ʵ带 ����
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
			
			
			while(true) { //������ �������� ������ wating...for...
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
//������ ����� Ŭ���̾�Ʈ�� �޼����� �ְ�޴��ϸ� �����ϴ� ������..�۾�������..
class Chatthread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattserver;
	Chatthread(Socket s,ChattServer chattserver){
		this.s = s;
		this.chattserver = chattserver;
		
		
		System.out.println(s.getInetAddress()+"���� �����ϼ̽��ϴ�");
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	public void run() {
		//������ �����尡 �۾��ϴ� ����...
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			while(true) {
				String line = br.readLine();
				chattserver.broadcast(line);
			}
		}catch(IOException e) {
			System.out.println(s.getInetAddress()+"���� ������ �����̽��ϴ�");
			chattserver.list.remove(this);
		}
	}
}