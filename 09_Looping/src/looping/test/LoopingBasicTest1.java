package looping.test;
/*
 * �ݺ��� �߿��� ���� ���� ���Ǵ� 
 * for���� ��� �����ϴ��� ��Ȯ�ϰ� �����Ѵ�.
 * 
 * for(�ʱ��; ���ǽ�; ������)
 */
public class LoopingBasicTest1 {

	public static void main(String[] args) {
		System.out.println("=======for=========\n");
		
		for(int i=0, j=0; i<10 & j<10; i++) {			
			System.out.println("Hello Looping..."+i);
		}//for
		
		
		System.out.println("\n=======while=========\n");
		
		
		int i = 10;
		
		while(i>0) {
			System.out.println("Hello while Looping...."+i);
			i--;
		}//while
		
		
		System.out.println("\n=======do while=========\n");
		
		int j=10;
		do {
			System.out.println(j+"...Always Print...");
			j++;
		}while(j<10);
		
	}
}



















