package exception.user.test;

class User{
	public void go() throws ArithmeticException{
		//��ĳ�ʷ� i, j �� �ش��ϴ� ���� �޾Ƶ��δٰ� ����...
		int i=10; int j = 0;
		
		System.out.println("1. Scanner�� �Է¹޴� j���� 0�̸� �ȵǴµ�....");
		//j���� 0�̸� ���ܸ� ���������� �߻����Ѽ� ���̻� ������� �ʵ��� ó��..���ܰ�ü�� ����.
		if(j==0) throw new ArithmeticException();
		
		// �Ʒ��κ� ��򰡿��� i/j j�� �и� �Ǵ� ������ ����ȴٰ� ����...
	}
}
public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();	
		try {
			user.go();
			System.out.println("2. ��ź�� �̰����� ����Խ��ϴ�..");
		}catch(ArithmeticException e) {
			System.out.println("3. ��ź ó�� ���� ^^");
		}
		
		System.out.println("4. ���α׷��� ���� ���� �˴ϴ�..");

	}
}
