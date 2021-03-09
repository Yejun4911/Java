package collection.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String,Customer>();

		map.put("111", new Customer("Kang","강호동",48));

		map.put("222", new Customer("Seo","서장훈",48));

		map.put("333", new Customer("Lee","이수근",42));

		map.put("444", new Customer("Kim","김희철",38));
		
		//1. key값이 222인 사람 출력
		//2. id LEE
		//3. Map에 저장된 데이터의 모든 key값들을 출력
		//4. map에 저장된 사람들의 나이의 총합과 평균을 출력
		
	
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
		System.out.println("총합:" +total+ "평균:" +total/map.size());
		
	}

}
