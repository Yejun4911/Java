package thread.step4.test;

import javax.swing.JOptionPane;
/*
 * �۾������带 ���
 * 
 * �ζǹ�ȣ �Է��۾��� ���ÿ�
 * ī���� �۾��� ����ǵ��� ������ �ۼ�
 * 
 * ���
 * ::
 * �۾������带 �ϳ� �߰��Ѵ�.
 * CountingThread�� ���Ӱ� �ϳ� ����
 * --> �ζǹ�ȣ �Է°� Counting�۾��� ���������� ó���ǵ��� ������ �ϼ�..
 */
class CountingThread implements Runnable{
	public void run() {
		//2. ������ ī���� �۾�...10,9,8,7,6,...1
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
		Thread t = new Thread(ct);
		
		 t.start();
		
		//1. ����Ÿ �Է�...�۾�..GUI
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���..");
		System.out.println("�Է��� ���ڴ� "+input+" �Դϴ�.");
		
		
	}
}


