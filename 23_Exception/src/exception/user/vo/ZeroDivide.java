package exception.user.vo;
//��������� Exception���� ������...
public class ZeroDivide extends Exception{
	public ZeroDivide(){
		this("This is UserException .....ZeroBoomException..");
	}
	
	public ZeroDivide(String message){
		super(message);
	}
}
