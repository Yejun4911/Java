package exam.test;

class Member{
	//�ʵ� ������ static ������ ����(local level�δ� ����� �� ����)
	static String name = "ȫ�浿";
	static int age = 22;
	//�ʵ�
	int count = 1;
	
	public static void getMember() {//static block
		System.out.println("�������� " + name);//static variable
		//System.out.println("�������� " + count);
	}
	
	//non static block
	public void getMember2() {//static block
		System.out.println("�������� " + name);//static variable
		System.out.println("�������� " + count);
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {

		Member.getMember();
	}
	
}
