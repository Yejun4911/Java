package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * �۾������带 ���
 * 
 * �ζǹ�ȣ �Է��۾��� ���ÿ�
 * ī���� �۾��� ����ǵ��� ������ �ۼ�
 * 
 * 
 * ��� 
 * ::
 * �۾������带 �ϳ� �߰��Ѵ�.
 * 
 */
class CountingThread implements Runnable{
	public void run() {
		for(int i=10; i>=1; i--) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
	}
}
public class InputThreadTest2 {

	public static void main(String[] args) {
		CountingThread ct = new CountingThread();
		Thread t= new Thread(ct);
		t.start();
		
		
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���...");
		System.out.println("�Է��� ���ڴ�"+input+"�Դϴ�.");
		
	}

}
