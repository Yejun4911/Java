package chatting.step3.client;
/*
 * 키보드로 데이타를 읽어들여서
 * 서버로 보낸다.
 * ---------------------------
 * 다시 서버가 보낸 메세지를 읽어서
 * 클라이언트 자신의 콘솔창에 메세지를 출력
 * ::
 * 입력  - -- 
 * 출력ㄹ  - - -
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	//필드 선언
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
				String line = br.readLine();//키보드로 입력받은 데이타 읽어서
				pw.println(line);//서버로 보낸다
			}
		}catch(Exception e) {
			System.out.println("서버와의 연결이 끊어졌습니다..");
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
				System.out.println("서버 메세지 >"+str);
			}
		}catch(IOException e) {
			
		}
	}
}
