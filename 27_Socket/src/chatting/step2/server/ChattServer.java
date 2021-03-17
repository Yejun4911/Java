package chatting.step2.server;
/*
 * 클라이언트가 보낸 메시지 받아서
 * 다시 그 메시지를 클라이언트에게 보낸당.
 * ::
 * 입력 -- ---
 * 출력 --- --
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 클라이언트가 보낸메세지 받아서
 * 
 */
public class ChattServer {
	//필드 선언
	ServerSocket server;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	//Stream...
	public void net() {
		try {
			server = new ServerSocket(5500);
			System.out.println("Server Ready....");
			
			s=server.accept();//client의 socket이 반환된다...
			System.out.println(s.getInetAddress()+"님이 접속하였습니다");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			System.out.println("Stream Creating....");
			String line = "";
			while((line=br.readLine())!=null) pw.println(line); 
			}catch(Exception e) {
			System.out.println("클라이언트와 연결이 끊어졌습니다.");
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
