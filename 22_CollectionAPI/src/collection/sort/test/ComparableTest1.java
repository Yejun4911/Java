package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Arrays.sort(Xxx[ ]) sort()는 comparable에 의해서 정렬된 것이다.
 * Arrays.sort(arrayList) 는 안돌아간다.
 * 이번 예제에서는 comparable를 사용해서 ArrayList안에 들어있는 객체들을 특정한 값에 의해서 정렬 
 * Comparable를 직접 상속받아서 구현하는 방법.. compareTo를 정렬하고픈 필드에 맞춰서 구현
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
	public int compareTo(Person p) {// 이름순 정렬
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
		list.add(new Person("서장훈",23));
		list.add(new Person("이수군",43));
		list.add(new Person("강호동",53));
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
