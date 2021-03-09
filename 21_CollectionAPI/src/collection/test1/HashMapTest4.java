package collection.test1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�� �ڽ�Ŭ����...HashMap
 * key-value�� ������ �����ؼ� ����Ÿ�� �����ϴ� Ư¡��������.
 * key�� �ߺ��� ������� �ʰ� value�� �ߺ� ����
 * ������ ����.
 * 
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("��ȣ��",90);
		map.put("�̼���",50);
		map.put("����ö",40);
		map.put("������",30);
		
		Set<String> set= map.keySet();	
		int sum=0;
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String name=it.next();
			int score = map.get(name);
			sum+=score;
		}
		System.out.println("����:"+sum+"���:"+sum/map.size());
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
