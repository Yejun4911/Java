package test;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5;//반드시 초기화 하고 사용해야 한다. 얘는 기본값이 없어서 초기화 안하고 쓰면 바로 에러난다.!!
		int j = 3;
		
		Operator o1 = new Operator();//100
		Operator o2 = new Operator();//200
		
		// ==(same)
		o1 = o2; // =(assign)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);//false,true
		
		// %...mod..나머지
		System.out.println("연산자 % :: "+ i%j);//2
		System.out.println(i==j);//false
		System.out.println(i != j);//true
		
		// ++(1씩 증가) , -- (1씩 감소)
		int k = 10;
		System.out.println(k++);//10...1이 나중에 증가
		System.out.println(k); //11
		
		int m = 10;
		System.out.println(++m);//11...1이 먼저 증가
		System.out.println(m); //11
		
		// 논리 연산자
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























