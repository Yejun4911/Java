package chatting.step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * socket ��ſ��� Ŭ���̾�Ʈ�� ������ ��� �ִ� ���μ���
 * ���� �����ؼ� ��û�� �ϰ����ϴ� ���������� ������ �õ�
 * �̶� �������� ������ �ִ� ��Ʈ�� ������ ��Ʈ�� �̿��ؾ� ������ �� �� �ִ�.
 * ::
 * ��Ʈ�� �ڵ�
 * Ű���带 �о���� ����Ÿ��
 * ������ ������ ������ �ۼ�
 * 
 */
public class ChattClient {
	BufferedReader br;
	PrintWriter pw;
	
	Socket s;
	public void net() {
		try {
			s= new Socket("127.0.0.1",5500);
			System.out.println("Socket Creating...");
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);
			System.out.println("Stream Creating...");
			String line ="";
			while((line=br.readLine())!=null) pw.println(line);
					
		} catch (IOException e) {
			System.out.println("������ ������ ���� �Ͽ����ϴ�.");
		}
	}
	public static void main(String[] args) {
		ChattClient chattClient = new ChattClient();
		chattClient.net();
	}

}
