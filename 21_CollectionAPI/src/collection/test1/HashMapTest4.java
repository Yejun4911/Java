package collection.test1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map의 자식클래스...HashMap
 * key-value를 쌍으로 연결해서 데이타를 저장하는 특징을가진다.
 * key는 중복을 허용하지 않고 value는 중복 가능
 * 순서는 없다.
 * 
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("강호동",90);
		map.put("이수근",50);
		map.put("김희철",40);
		map.put("서장훈",30);
		
		Set<String> set= map.keySet();	
		int sum=0;
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String name=it.next();
			int score = map.get(name);
			sum+=score;
		}
		System.out.println("총합:"+sum+"평균:"+sum/map.size());
		Collection<Integer> col = map.values();
		Iterator<Integer> it2=col.iterator();
		int sum2=0;
		while(it2.hasNext()) {
			int jumsu = it2.next();
			sum2+=jumsu;
		}
		System.out.println(Collections.max(col));
		System.out.println(Collections.min(col));
	}
}
