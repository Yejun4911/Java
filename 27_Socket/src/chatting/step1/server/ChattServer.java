package chatting.step1.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Socket 통신에서 서버측 로직을 담고 있는 프로세스 
 * 클라이언트의 접속을 받아들이기 위해서
 * 1. ServerSocket을 생성
 * 2. accept()를 통해서 서버로 접속해오는 클라이언트를 받아서 클라이언트 소켓을 리턴한다.
 * ::
 * 클라이언트가 보낸 메시지 읽어서
 * 서버 자신의 콘솔창에 메세지를 출력하는 로직을 작성
 * 입력 스트름 - - - - - 소켓으로부터 받아서 만든다
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
			while((line=br.readLine())!=null) System.out.println("Client가 보낸 메세지"+line);
			
		} catch (IOException e) {
			System.out.println("서버와의 연결이 끊어졌습니다...");
		}
	}
	public static void main(String[] args) {
		ChattServer chattServer = new ChattServer();
		chattServer.net();
	}

}
