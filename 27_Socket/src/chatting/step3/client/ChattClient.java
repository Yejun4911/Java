package chatting.step3.client;
/*
 * Ű����� ����Ÿ�� �о�鿩��
 * ������ ������.
 * ---------------------------
 * �ٽ� ������ ���� �޼����� �о
 * Ŭ���̾�Ʈ �ڽ��� �ܼ�â�� �޼����� ���
 * ::
 * �Է�  - -- 
 * ��¤�  - - -
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	//�ʵ� ����
	Socket s;
	BufferedReader br,br1;
	PrintWriter pw; 
	//Stream...
	public void net() {
		try {
			s = new Socket("127.0.0.1",60000);
			System.out.println("Socket Creating...");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			ClientThread ct = new ClientThread(s);
			ct.start();
			
			System.out.println("Client Stream Creating...");
			while(true) {
				String line = br.readLine();//Ű����� �Է¹��� ����Ÿ �о
				pw.println(line);//������ ������
			}
		}catch(Exception e) {
			System.out.println("�������� ������ ���������ϴ�..");
		}finally {
			try {
				br.close();
				pw.close();
				br.close();
			}catch(IOException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		ChattClient cc = new ChattClient();
		cc.net();

	}
}
class ClientThread extends Thread{
	Socket s;
	BufferedReader br1;
	ClientThread(Socket s){
		this.s = s;
	}
	
	public void run() {
		try {
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true) {
				String str = br1.readLine();
				System.out.println("���� �޼��� >"+str);
			}
		}catch(IOException e) {
			
		}
	}
}
