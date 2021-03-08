package pizza.parent;
/*
 * �߻� Ŭ������ �뵵
 * 1. ���������� ���ڸ� ������ ���� �������� �۾�(�ʵ�, �޼ҵ�)�� �״�� �ڽĵ鿡�� �����ְ�
 * 2. �ݸ鿡 ���������� ���ڰ� ������� �� �ִ� �������� �κ��� �߻�޼ҵ�� �����صд�...
 * 
 * �Ϻ��� �߻� --> �������̽� ---> ����ڿ� �ۼ��ڰ��� Contract
 * �κ����� �߻� --> �߻�Ŭ���� --> ���������� �ٸ� �κ��� �̿����� �����ش�
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
	//������� ����Ǿ�� �ϱ� ������ 
	//��� �߰�
	public void makePizza() {
		dough();
		bake();
		cutting();
		boxing();
		topping();
	}
	public void dough() {
		System.out.println("���� ���װ� �Բ� ���츦 �� ������ݴϴ�..");		
	}
	public void bake() {
		System.out.println("180�� �µ����� 10�а� ��������.");
	}
	public void boxing() {
		System.out.println("�߷��� ���ڸ� ����");
	}
	public void cutting() {
		System.out.println("��");
	}
	public abstract void topping();

	@Override
	public String toString() {
		return "�����̸� ,"+storeName+" ���� ,"+price;
	}
	
}//class
