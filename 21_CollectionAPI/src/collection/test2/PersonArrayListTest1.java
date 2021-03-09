package collection.test2;

import java.util.ArrayList;

import collection.vo.Person;

/*
 * List�ȿ� �������� ����� �߰��ϴ� ������ �ۼ�
 * �߰��� ������ ������ �ڵ鸵 �ϴ� ����� ���������ۼ�
 */
public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ȣ��","���ʵ�",45));
		list.add(new Person("�̼���","������",25));
		list.add(new Person("����ö","���Ǳ�",15));
		list.add(new Person("��ȣ��","������",35));
		System.out.println(list);
		//������� ����Ʈ�ȿ�
		System.out.println(list.size());
		//���
		int total=0;
		
		for(Person p : list) {
			total+=p.getAge();
		}
		System.out.println(total/list.size());
		//����� ������߿��� ���ʵ� ��»��
		for(Person p : list) {
			if(p.equals("���ʵ�")) System.out.println(p);
		}
		
	}

}
