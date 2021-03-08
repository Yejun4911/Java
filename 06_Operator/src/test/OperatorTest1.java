package test;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5;//�ݵ�� �ʱ�ȭ �ϰ� ����ؾ� �Ѵ�. ��� �⺻���� ��� �ʱ�ȭ ���ϰ� ���� �ٷ� ��������.!!
		int j = 3;
		
		Operator o1 = new Operator();//100
		Operator o2 = new Operator();//200
		
		// ==(same)
		o1 = o2; // =(assign)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);//false,true
		
		// %...mod..������
		System.out.println("������ % :: "+ i%j);//2
		System.out.println(i==j);//false
		System.out.println(i != j);//true
		
		// ++(1�� ����) , -- (1�� ����)
		int k = 10;
		System.out.println(k++);//10...1�� ���߿� ����
		System.out.println(k); //11
		
		int m = 10;
		System.out.println(++m);//11...1�� ���� ����
		System.out.println(m); //11
		
		// �� ������
		System.out.println(o1.test1() | o1.test2()); //true
		System.out.println("#####################################");
		System.out.println(o1.test2() & o1.test1()); //false
		
		System.out.println("========================================");
		
		// Short Circuit
		System.out.println(o1.test1() || o1.test2()); //true
		System.out.println("#####################################");
		System.out.println(o1.test2() && o1.test1()); //false
	}//main
}//class

class Operator{
	public boolean test1() {
		System.out.println("test1() Calling....");
		return true;
	}
	
	public boolean test2() {
		System.out.println("test2() Calling....");
		return false;
	}
}

class Operator1{
	public boolean test1() {
		System.out.println("test1() Calling....");
		return true;
	}
	
	public boolean test2() {
		System.out.println("test2() Calling....");
		return false;
	}
}























