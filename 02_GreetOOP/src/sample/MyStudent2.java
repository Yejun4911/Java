package sample;

/*
 * 필드에 값을 입력하는 기능을 추가...
 * 
 * simple   | detail (0)
 * setInfo()
 * inputField()
 * 
 * 
 */
public class MyStudent2 {
	//필드 선언 3
	public String name;
	public int age;
	public String address;
	
	public void setField(String n, int a, String add) {
		name = n;
		age = a;
		address = add;
	}
	public void printInfo() { //1
		System.out.println(name+", "+age+", "+address);
	}	
}


