package thread.step2.test;
/*
 * Thread 클래스를 상속받아서 Thread를 만들어본다.
 * Thread는 2개 생성
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
			//현재 실행중인 쓰레드의 이름을 리턴하는 기능....Thread 
			System.out.println(Thread.currentThread().getName());
			System.out.println("Go...."+i);
			i++;
			if(i==20)break;
		}
	}
	
	
}
class ComeThread implements Runnable{
	// run 무조건 만듬 , 쓰레드가 작동하는 부분 run() 블락안에서 해당 쓰레드가 전담하는 일을 확인할수 있다.
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
		Thread t1 = new Thread(go,"CoThread"); //작업 스레드
		Thread t2 = new Thread(come,"ComeThread");
		
		t1.start();
		t2.start();
	}

}
