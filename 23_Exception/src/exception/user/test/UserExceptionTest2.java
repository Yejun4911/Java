package exception.user.test;

import exception.user.vo.ZeroDivide;

class User2{
	public void go() throws ZeroDivide{
		//��ĳ�ʷ� i, j �� �ش��ϴ� ���� �޾Ƶ��δٰ� ����...
		int i=10; int j = 0;
		
		System.out.println("1. Scanner�� �Է¹޴� j���� 0�̸� �ȵǴµ�....");
		//j���� 0�̸� ���ܸ� ���������� �߻����Ѽ� ���̻� ������� �ʵ��� ó��..���ܰ�ü�� ����.
		if(j==0) throw new ZeroDivide("�и� 0�̵Ǹ� �ȵ˴ϴ�^^;;;");
		
		// �Ʒ��κ� ��򰡿��� i/j j�� �и� �Ǵ� ������ ����ȴٰ� ����...
	}
}
public class UserExceptionTest2 {

	public static void main(String[] args) {
		User2 user = new User2();	
		try {
			user.go();
			System.out.println("2. ��ź�� �̰����� ����Խ��ϴ�..");
		}catch(ZeroDivide e) {
			System.out.println(e.getMessage());
		}		
		System.out.println("4. ���α׷��� ���� ���� �˴ϴ�..");
	}
}
