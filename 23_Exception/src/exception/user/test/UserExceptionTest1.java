package exception.user.test;

class User{
	public void go() throws ArithmeticException{
		//스캐너로 i, j 에 해당하는 값을 받아들인다고 가정...
		int i=10; int j = 0;
		
		System.out.println("1. Scanner로 입력받는 j값이 0이면 안되는데....");
		//j값이 0이면 예외를 고의적으로 발생시켜서 더이상 진행되지 않도록 처리..예외객체를 생성.
		if(j==0) throw new ArithmeticException();
		
		// 아랫부분 어딘가에서 i/j j가 분모가 되는 연산이 진행된다고 가정...
	}
}
public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();	
		try {
			user.go();
			System.out.println("2. 폭탄이 이곳으로 날라왔습니다..");
		}catch(ArithmeticException e) {
			System.out.println("3. 폭탄 처리 성공 ^^");
		}
		
		System.out.println("4. 프로그램은 정상 종료 됩니다..");

	}
}
