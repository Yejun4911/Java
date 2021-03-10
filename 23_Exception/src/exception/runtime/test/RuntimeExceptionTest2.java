package exception.runtime.test;

public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		//객체 생성하지 않고 참조변수로 접근할때 발생하는 예외
		System.out.println("===========NullPointerException===========");
		String str = "Encore";
		String str1 = new String("Encore");
		str1 = null; //객체생성을 하지 않은것과 동일한 결과가 발생..
		try {
			System.out.println("문자열 길이를 반환합니다 "+str1.length());
			System.out.println("toString() 스트링에서는 오버라이딩 되어져 있다 "+str1.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잡았다...1");
//		}catch(NullPointerException e1) {
//			System.out.println("잡았다...2");
		}finally {// 위와 상관없이(예외가 발생하건 말건, 예외를 잡건 말건) 무조건 이 부분은 수행된다..
			System.out.println("Always print...");
			//이 부분에 들어갈 코드를 나중에 설명드릴꼐요...
		}		
	}
}
