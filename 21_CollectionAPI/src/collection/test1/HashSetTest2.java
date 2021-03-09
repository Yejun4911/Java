package collection.test1;

import java.util.HashSet;
import java.util.Set;

/*
 * set�� �ڽ� Ŭ���� -> HashSet
 * 1. �ߺ� ��� X
 * 2. ���� ������ �ʴ´�.
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("��ȣ��");
		set.add("�̼���");
		set.add("����ö");
		set.add("������");
		set.add("��ȣ��");
		System.out.println(set.size());
		//Collection API�� toString Override �Ǿ�����
		System.out.println(set);
		boolean flag=set.contains("�̻��");
		System.out.println(flag);
		System.out.println(set.isEmpty());
		
		set.remove("������");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		System.out.println(set.isEmpty());
		
	}

}
