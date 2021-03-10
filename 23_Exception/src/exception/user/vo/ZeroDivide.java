package exception.user.vo;
//사용자정의 Exception으로 만들어보자...
public class ZeroDivide extends Exception{
	public ZeroDivide(){
		this("This is UserException .....ZeroBoomException..");
	}
	
	public ZeroDivide(String message){
		super(message);
	}
}
