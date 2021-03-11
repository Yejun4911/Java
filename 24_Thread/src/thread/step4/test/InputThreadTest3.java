package thread.step4.test;



import javax.swing.JOptionPane;

/*
 * ī�����۾� - CountThread
 * �����Է��۾� - LottoInputThread
 * ::
 * �ΰ��� �����尡 Process�ȿ��� ���� ���ҽ��� �����ϸ鼭 ���� ��Ȳ�� �������� �ۼ�
 * ī���õǴ� ��Ȳ�� ���� ����.
 * 1. ī��Ʈ�� �� �������� �����Է��� �ȵǸ� - �ش����α׷� ����
 * 2. ī��Ʈ ���൵�߿� ���ڰ� �ԷµǸ� - ���̻� ī������ �������� �ʵ��� �Ѵ�
 * -> �� 2���� �䱸������ �����ǵ��� ������ ����
 *  
 */
class CountThread extends Thread{
	InputThreadTest3 process;
	
	public CountThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}

	public void run() {
			for(int i = 10; i>1; i--) {
				if(process.inputCheck) break;
				System.out.println(i);
				try {
					Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
			if(!process.inputCheck) {
				System.out.println("10�ʰ� �������ϴ�.");
				System.exit(0);
			}
	}
}
class LottoInputThread extends Thread{
	InputThreadTest3 process;
	
	public LottoInputThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}
	public void run() {
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���...");
		System.out.println("�Է��� ���ڴ�"+input+"�Դϴ�.");
		
		process.inputCheck=true;

	}
}
public class InputThreadTest3 {
	boolean inputCheck = false;
	
	public static void main(String[] args) {
		InputThreadTest3 process = new InputThreadTest3();
		CountThread ct = new CountThread(process);
		LottoInputThread lt = new LottoInputThread(process);
			
		ct.start();
		lt.start();
		
		
		
		
	}

}
