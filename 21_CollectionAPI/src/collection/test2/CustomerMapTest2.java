package collection.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String,Customer>();

		map.put("111", new Customer("Kang","��ȣ��",48));

		map.put("222", new Customer("Seo","������",48));

		map.put("333", new Customer("Lee","�̼���",42));

		map.put("444", new Customer("Kim","����ö",38));
		
		//1. key���� 222�� ��� ���
		//2. id LEE
		//3. Map�� ����� �������� ��� key������ ���
		//4. map�� ����� ������� ������ ���հ� ����� ���
		
	
		////1
		System.out.println(map.get("111"));
		////2
		Collection<Customer> col = map.values();
		Iterator<Customer> it1 = col.iterator();
		while(it1.hasNext()) {
			Customer c = it1.next();
			if(c.getId().equals("Lee")) System.out.println(c);
		}
		///3
		Set<String> set = map.keySet();
		System.out.println(set);
		///4
		Iterator<String> it2 = set.iterator();
		int total=0;
		while(it2.hasNext()) {
			String key = it2.next();
			Customer c = map.get(key);
			total+=c.getAge();
		}
		System.out.println("����:" +total+ "���:" +total/map.size());
		
	}

}
