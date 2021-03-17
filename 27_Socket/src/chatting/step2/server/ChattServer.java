package chatting.step2.server;
/*
 * Ŭ���̾�Ʈ�� ���� �޽��� �޾Ƽ�
 * �ٽ� �� �޽����� Ŭ���̾�Ʈ���� ������.
 * ::
 * �Է� -- ---
 * ��� --- --
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * Ŭ���̾�Ʈ�� �����޼��� �޾Ƽ�
 * 
 */
public class ChattServer {
	//�ʵ� ����
	ServerSocket server;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	//Stream...
	public void net() {
		try {
			server = new ServerSocket(5500);
			System.out.println("Server Ready....");
			
			s=server.accept();//client�� socket�� ��ȯ�ȴ�...
			System.out.println(s.getInetAddress()+"���� �����Ͽ����ϴ�");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			System.out.println("Stream Creating....");
			String line = "";
			while((line=br.readLine())!=null) pw.println(line); 
			}catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ ���������ϴ�.");
		}finally {
			try {
				br.close();
				pw.close();
			}catch(IOException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		ChattServer chattServer = new ChattServer();
		chattServer.net();
	}

}
