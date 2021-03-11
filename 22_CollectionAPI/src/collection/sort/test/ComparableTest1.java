package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Arrays.sort(Xxx[ ]) sort()�� comparable�� ���ؼ� ���ĵ� ���̴�.
 * Arrays.sort(arrayList) �� �ȵ��ư���.
 * �̹� ���������� comparable�� ����ؼ� ArrayList�ȿ� ����ִ� ��ü���� Ư���� ���� ���ؼ� ���� 
 * Comparable�� ���� ��ӹ޾Ƽ� �����ϴ� ���.. compareTo�� �����ϰ��� �ʵ忡 ���缭 ����
 * 
 *
 *
 */
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public int compareTo(Person p) {// �̸��� ����
		return -name.compareTo(p.getName());
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("������",23));
		list.add(new Person("�̼���",43));
		list.add(new Person("��ȣ��",53));
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
