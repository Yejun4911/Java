package thread.step2.test;
/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ������.
 * Thread�� 2�� ����
 * GoThread,ComeThread
 */
class GoThread implements Runnable{


	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//���� �������� �������� �̸��� �����ϴ� ���....Thread 
			System.out.println(Thread.currentThread().getName());
			System.out.println("Go...."+i);
			i++;
			if(i==20)break;
		}
	}
	
	
}
class ComeThread implements Runnable{
	// run ������ ���� , �����尡 �۵��ϴ� �κ� run() ����ȿ��� �ش� �����尡 �����ϴ� ���� Ȯ���Ҽ� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000); 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("come...."+i);
			i++;
			if(i==20)break;
		}
	}
}
public class GoComeThread {

	public static void main(String[] args) {
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		Thread t1 = new Thread(go,"CoThread"); //�۾� ������
		Thread t2 = new Thread(come,"ComeThread");
		
		t1.start();
		t2.start();
	}

}
