package chatting.step1.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Socket ��ſ��� ������ ������ ��� �ִ� ���μ��� 
 * Ŭ���̾�Ʈ�� ������ �޾Ƶ��̱� ���ؼ�
 * 1. ServerSocket�� ����
 * 2. accept()�� ���ؼ� ������ �����ؿ��� Ŭ���̾�Ʈ�� �޾Ƽ� Ŭ���̾�Ʈ ������ �����Ѵ�.
 * ::
 * Ŭ���̾�Ʈ�� ���� �޽��� �о
 * ���� �ڽ��� �ܼ�â�� �޼����� ����ϴ� ������ �ۼ�
 * �Է� ��Ʈ�� - - - - - �������κ��� �޾Ƽ� �����
 */
public class ChattServer {
	ServerSocket server;
	Socket s;
	BufferedReader br;
	
	public void net() {
		try {
			server = new ServerSocket(5500);
			System.out.println("Server Ready....");
			
			s=server.accept();
			System.out.println("Client's Socket....Returned...");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Stream Creating ...Using Socket");
			
			String line = null;
			while((line=br.readLine())!=null) System.out.println("Client�� ���� �޼���"+line);
			
		} catch (IOException e) {
			System.out.println("�������� ������ ���������ϴ�...");
		}
	}
	public static void main(String[] args) {
		ChattServer chattServer = new ChattServer();
		chattServer.net();
	}

}
