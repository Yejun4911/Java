package looping.test;
/*
 * for문을 이용해서 1~100까지의 총합을 구하는 로직을 작성
 * 조건을 하나 더 추가한다.
 *  - 총합이 500을 넘어가면 반복을 중단하고....break
 *    그때의 총합과 i값을 출력
 * 
 */
public class LoopingBreakTest2 {

	public static void main(String[] args) {
		int sum=0;//local V.....기본값이 없기 때문에 반드시 초기화 하고 사용
		
		for(int i=1; i<=100; i++) {			
			sum += i; 
			if(sum>500) break;
		}		
		System.out.println(sum);		

	}//main

}
