package gui.client;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/*
 * 채팅 로직...입력받은 TextArea의 내용을 특정한 디렉토리의 파일로 출력하는 로직
 * 저장 버튼을 클릭하면 탐색창 뜨고 특정한 디렉토리에 출력파일을 지정할수 있다.
 * --> FileDialog 클래스 이용!!
 * ::
 * GUI + EventHandler + FileStream
 */
public class ChattingService {
	//1.gui작성
	Frame f;
	Panel p;
	TextField tf;
	TextArea ta;
	Button save;
	String nickName;
	
	//소켓 통신 추가...
	Socket s;
	BufferedReader br1;
	PrintWriter pw;
	
	ChattingService(String nickName){ //객체 생성시 닉네임 넣어준다.
		this.nickName = nickName;
		f = new Frame("Chatting Room");
		tf = new TextField(30);
		ta = new TextArea();
		save = new Button("저장");
		p = new Panel();		
	}
	
	public void launchFrame() throws Exception{
		f.setSize(300, 200);
		p.add(tf);
		p.add(save);
		f.add(ta,"Center");
		f.add(p,"South");
		
//		f.setResizable(false);
		ta.setEditable(false);		
		ta.setText("["+nickName+"] 님이 입장하셨습니다\n");		
		f.setVisible(true);
		
		tf.requestFocus(); //반드시 f.setVisible() 밑에 적용시켜야 한다.
		
		//소켓통신 로직...소켓 생성
		s = new Socket("127.0.0.1", 60000);
		System.out.println("Client Socket Creating...");
		
		//스트림 생성
		br1 = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(),true);
		
		//2.Listener 부착
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		tf.addActionListener(new EventHandler(this));
		save.addActionListener(new ButtonHandler(this));		
	}
	//추가..
	public void threadGo() {
		ClientThread ct = new ClientThread(s,this);
		ct.start();
	}

	public static void main(String[] args)throws Exception {
		ChattingService service = new ChattingService("하바리");
		System.out.println("Client Process Ready.....");
		service.launchFrame();
	}
}


class ClientThread extends Thread{
	Socket s;
	BufferedReader br2;
	ChattingService service;
	
	ClientThread(Socket s, ChattingService service){
		this.s = s;
		this.service = service;
	}
	
	public void run() {
		try {
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true) {
				String str = br2.readLine();
				//System.out.println("서버 메세지 "+str);
				service.ta.append(str+"\n");
			}
		}catch(IOException e) {
			
		}
	}
}

























