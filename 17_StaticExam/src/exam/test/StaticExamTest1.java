package exam.test;

class Member{
	//ÇÊµå ·¹º§¿¡ static º¯¼ö¸¦ ¼±¾ð(local level·Î´Â »ç¿ëÇÒ ¼ö ¾ø´Ù)
	static String name = "È«±æµ¿";
	static int age = 22;
	//ÇÊµå
	int count = 1;
	
	public static void getMember() {//static block
		System.out.println("¿ìÀ¯ºû±ò " + name);//static variable
		//System.out.println("¿ìÀ¯ºû±ò " + count);
	}
	
	//non static block
	public void getMember2() {//static block
		System.out.println("¿ìÀ¯ºû±ò " + name);//static variable
		System.out.println("¿ìÀ¯ºû±ò " + count);
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {

		Member.getMember();
	}
	
}
