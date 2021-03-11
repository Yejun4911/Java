package thread.step1.test;
/*
 * Thread 클래스를 상속받아서 Thread를 만들어본다.
 * Thread는 2개 생성
 * GoThread,ComeThread
 */
class GoThread extends Thread{
	// run 무조건 만듬 , 쓰레드가 작동하는 부분 run() 블락안에서 해당 쓰레드가 전담하는 일을 확인할수 있다.
	
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Go...."+i);
			i++;
			if(i==20)break;
		}
	}
}class ComeThread extends Thread{
	// run 무조건 만듬 , 쓰레드가 작동하는 부분 run() 블락안에서 해당 쓰레드가 전담하는 일을 확인할수 있다.
	
	
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
