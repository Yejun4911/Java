package thread.step1.test;
/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ������.
 * Thread�� 2�� ����
 * GoThread,ComeThread
 */
class GoThread extends Thread{
	// run ������ ���� , �����尡 �۵��ϴ� �κ� run() ����ȿ��� �ش� �����尡 �����ϴ� ���� Ȯ���Ҽ� �ִ�.
	
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Go...."+i);
			i++;
			if(i==20)break;
		}
	}
}class ComeThread extends Thread{
	// run ������ ���� , �����尡 �۵��ϴ� �κ� run() ����ȿ��� �ش� �����尡 �����ϴ� ���� Ȯ���Ҽ� �ִ�.
	
	
	public void come() {
		int i=0;
		while(true) {
			System.out.println("Go...."+i);
			i++;
			if(i==20)break;
		}
	}
}
public class GoComeThread {

	public static void main(String[] args) {
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start();
		t2.start();
	}

}
