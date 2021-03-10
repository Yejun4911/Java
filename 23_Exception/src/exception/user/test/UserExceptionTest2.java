package exception.user.test;

import exception.user.vo.ZeroDivide;

class User2{
	public void go() throws ZeroDivide{
		//스캐너로 i, j 에 해당하는 값을 받아들인다고 가정...
		int i=10; int j = 0;
		
		System.out.println("1. Scanner로 입력받는 j값이 0이면 안되는데....");
		//j값이 0이면 예외를 고의적으로 발생시켜서 더이상 진행되지 않도록 처리..예외객체를 생성.
		if(j==0) throw new ZeroDivide("분모가 0이되면 안됩니다^^;;;");
		
		// 아랫부분 어딘가에서 i/j j가 분모가 되는 연산이 진행된다고 가정...
	}
}
public class UserExceptionTest2 {

	public static void main(String[] args) {
		User2 user = new User2();	
		try {
			user.go();
			System.out.println("2. 폭탄이 이곳으로 날라왔습니다..");
		}catch(ZeroDivide e) {
			System.out.println(e.getMessage());
		}		
		System.out.println("4. 프로그램은 정상 종료 됩니다..");
	}
}
