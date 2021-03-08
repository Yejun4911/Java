package array.test;
/*
 * int타입의 배열을 만든다...랜덤한 값의 정수를 집어 넣는다.
 * 여러숫자들 중에서 가장 큰 수와 가장 작은수를 찾아내는 알고리즘을 작성..
 */
public class ArrayMaxAndMinTest3 {
	public static void main(String[] args) {
		
		int[ ] scores = {79, 88, 91, 44, 99, 55, 96};
		
		int min = scores[0];//배열의 첫번째 값으로 기본값을 초기화한다....79
		int max = scores[0];//....79
		
		
//		  for(int i=1; i<scores.length; i++) {//0~6 
//			  if(scores[i]<min) min = scores[i];
//			  if(scores[i]>max) max = scores[i]; 
//		  }
		 
		
		//Advanced For | ForEach...."뭐가 어디에서 도는가?"
		int count = 0;
		for( int score : scores) {
			if(score<min) min = score;
			if(score>max) max = score;
		}
		
		
		System.out.println("최소값 "+min);//44
		System.out.println("최대값 "+max);//99
	}//main
}







