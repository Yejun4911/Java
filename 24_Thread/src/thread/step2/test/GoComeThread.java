package thread.step2.test;
/*
 * Runnable �������̽��� �����ؼ� Thread�� ������.
 * Thread�� 2���� �����Ѵ�.
 * GoThread, ComeThread
 */
class GoThread implements Runnable{	
	
	//�����尡 �۵��ϴ� �κ�...run() ����ȿ��� �ش羲���尡 �����ϴ� ���� Ȯ���Ҽ� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//���� �������� �������� �̸��� �����ϴ� ���...Thread
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name :: "+tname+","+i);
			i++;
			if(i==20) break;
		}
	}
}
class ComeThread implements Runnable{
	
	//�����尡 �۵��ϴ� �κ�...run() ����ȿ��� �ش羲���尡 �����ϴ� ���� Ȯ���Ҽ� �ִ�.
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name :: "+tname+","+i);
			i++;
			if(i==20) break;
		}
	}
}
public class GoComeThread {
	public static void main(String[] args) {
		//GoComeThread ��� ���μ��� �ȿ��� 2���� �����带 ���۽��Ѻ����� ����
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		
		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");
		
		t1.start();
		t2.start();
		
	}
}




































