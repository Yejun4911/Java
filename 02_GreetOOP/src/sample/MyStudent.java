package sample;

/*
 * 1) 필드
 *    이름, 나이, 주소에 해당하는 값이 들어갈수 있도록 
 *    필드 3개를 선언
 * 
 * 2) 메소드
 *    3개의 필드 정보들이 콘솔창에 출력될수 있도록 기능을 정의
 */
public class MyStudent {
	//필드 선언 3
	public String name;
	public int age;
	public String address;
	
	public void printInfo() { //1
		System.out.println(name+", "+age+", "+address);
	}	
}
