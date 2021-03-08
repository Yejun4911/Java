package looping.test;
/*
 * 반복문 중에서 가장 많이 사용되는 
 * for문이 어떻게 동작하는지 정확하게 이해한다.
 * 
 * for(초기식; 조건식; 증감식)
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



















