package gui.client;
/*
 * TextField�� �Է¹��� ������ TextArea�� ���̴� ������ �ۼ�
 * TextField�� �Է��� ������ �ٽ� �ʱ�ȭ..
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	
	ChattingService service;
	String msg; //����..
	
	EventHandler(ChattingService service){
		this.service=  service;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		//
		msg=service.tf.getText();
		service.tf.requestFocus();
		//�߰�..
		service.pw.println("["+service.nickName+"]"+msg);
		service.tf.setText("");
		
		service.threadGo();//
	}
}




















