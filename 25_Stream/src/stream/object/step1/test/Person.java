package stream.object.step1.test;

import java.io.Serializable;

/*
 * Person Ŭ���� Ÿ���� ��ü��
 * ObjectInputStream, OjbectOutputStream�� ���ؼ� ����(class�� �ʵ�)�� 
 * �Է�, ��µǴ� ��ü�̴�.
 * �� Ŭ���� Ÿ���� ��ü�� ��Ʈ���� ����ҷ��� �ݵ�� Serializable�̶�� �������̽��� ��ӹ޾Ƽ� ���� �Ǿ�߸� �Ѵ�.
 * ���� �� �ڼ��� ����ϸ�,
 * Seraializable �������̽��� ������ Ŭ������ �ʵ�� ��ü��Ʈ���� ����Ҽ� �ִ�.
 *  
 */
public class Person implements Serializable{ //����ȭ �Ǿ ��Ʈ�� ��� OK
	private String name;
	private int age;
	private String password;
	private String address;
	
	public Person() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int age, String password, String address) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}
	
	

}
