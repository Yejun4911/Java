package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * ���ξ����常 �����Ǵ� ������ �ۼ�
 * �����۾�(�������� �۾�)ó���� �ȵȴ�.
 * 
 * �ζ� ��ȣ�� �Է¹޴� �۾�
 * +
 * ī������ �ϴ��۾�
 * ---> 10�� �ȿ� ���������� �ζǹ�ȣ�� �Է�!!
 */
public class InputThreadTest1 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���...");
		System.out.println("�Է��� ���ڴ�"+input+"�Դϴ�.");
		
		
		for(int i=10; i>=1; i--) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
		
	}

}
