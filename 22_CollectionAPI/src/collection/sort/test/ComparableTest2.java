package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest2 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("������",23));
		list.add(new Person("�̼���",43));
		list.add(new Person("��ȣ��",53));
		//
		Collections.sort(list, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge()-p2.getAge();
			}
		});
		
		for(Person p : list) System.out.println(p);
		
	}

}
