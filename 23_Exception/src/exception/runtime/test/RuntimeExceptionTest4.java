package exception.runtime.test;
/*
 * ���ܸ� ó���ϴ� ��� 2��°...throws����غ���.
 */
class Throws{
	//go() �����ϴ��� ���ܰ� �߻�...�װ� ������ ...go()�� ȣ���� ������ ����ó���� ���� �ϼ���
	public void go() throws ArithmeticException{
		int i = 10;
		int j = 0;
		
		System.out.println("2. 0�� �и�� �ϸ� �ȵ˴ϴ�...");
		if(i/j==0)
			System.out.println("ArithmeticException....Boom.....");
	}
}
public class RuntimeExceptionTest4 {
	public static void main(String[] args) {
		
		Throws t = new Throws();
		System.out.println("1. go() calling....");
		try {
			t.go();
		}catch(ArithmeticException e) {
			System.out.println("3. ȣ���� �������� ���ܸ� ��ҽ��ϴ�.");
		}
	}
}
