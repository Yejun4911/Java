package exam.test;

//static initialization block
//�ʱ�ȭ
public class StaticExamTest3 {
	static int i = 0;
	
	public static void main(String[] args) {
		//���������� �� �κ��� ���� ���� �����. ���Կ��ٰ� �ʱ�ȭ �˰��� �ִ´�
		//��ü����..();.. ������ ȣ��..�ʵ��ʱ�ȭ
		
		System.out.println("1. main method static block..."+i);
	}
	
	static {
		i = 300;
		System.out.println("2. static initialization block..."+i);
	}

}
