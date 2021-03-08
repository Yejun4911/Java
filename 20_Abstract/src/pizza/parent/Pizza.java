package pizza.parent;
/*
 * 추상 클래스의 용도
 * 1. 여러종류의 피자를 만들어내기 위한 공통적인 작업(필드, 메소드)은 그대로 자식들에게 물려주고
 * 2. 반면에 여러종류의 피자가 만들어질 수 있는 결정적인 부분은 추상메소드로 선언해둔다...
 * 
 * 완벽한 추상성 --> 인터페이스 ---> 사용자와 작성자간의 Contract
 * 부분적인 추상성 --> 추상클래스 --> 결정적으로 다른 부분을 미완으로 돌려준다
 * 
 */

public abstract class Pizza {
	protected int price;
	protected String storeName;
	
	public Pizza(int price, String storeName) {
		this.price=price;
		this.storeName=storeName;
	}
	
	public Pizza() {
		this(15000,"PizzaSchool");
	}
	//순서대로 진행되어야 하기 때문에 
	//기능 추가
	public void makePizza() {
		dough();
		bake();
		cutting();
		boxing();
		topping();
	}
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어줍니다..");		
	}
	public void bake() {
		System.out.println("180도 온도에서 10분간 구워낸다.");
	}
	public void boxing() {
		System.out.println("잘려진 피자를 포장");
	}
	public void cutting() {
		System.out.println("컷");
	}
	public abstract void topping();

	@Override
	public String toString() {
		return "상점이름 ,"+storeName+" 가격 ,"+price;
	}
	
}//class
