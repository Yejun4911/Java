package com.encore.datatype;

/*
 * 1. 필드
 *    int 사이즈, char 컬러, float 가격, String 제조회사, String 재질
 *    스크래치 여부를 알수 있는 필드를 추가
 * 
 * 2. 메소드
 *    2개 정의
 *    - 값을 Test 클래스에서 받아서 필드에 입력하는 기능
 *    - 필드에 입력된, 저장된 값을 콘솔창으로 출력하는 기능
 *    
 *    -------------------------------------------
 *    1. 
 *    변수(Variable은 사용되는 위치에 따라서 Field와 Local V로 구분된다)
 *    필드 --> 클래스 선언 바로 밑, 메소드 블락 바깥
 *    Local V(지역) --> 메소드 안
 *    
 *    2. 
 *    로컬변수의 이름도 필드와 동일하게 직관적으로 작성한다.
 *    이름을 구분할때는 필드 앞에 this를 붙이면 된다.
 */
public class WhiteBoard {
	// field
	public int size;
	public char color;
	public float price;//double
	public String madeCompany;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String madeCompany, String material, boolean scratch) { //local V
		//필드와 로컬변수의 이름이 같을때, 구분하기 위해서 필드앞에 this붙인다.
		// this는 해당클래스 자기자식...쯤으로 일단 해석..
		this.size = size;
		this.color = color;
		this.price = price;
		this.madeCompany = madeCompany;
		this.material = material;
		this.scratch = scratch;
	}	
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+madeCompany+"\t"+material+"\t"+scratch);
	}	
}








