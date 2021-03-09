package collection.test1;

import java.util.HashSet;
import java.util.Set;

/*
 * set의 자식 클래스 -> HashSet
 * 1. 중복 허용 X
 * 2. 순서 가지지 않는다.
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("강호동");
		set.add("이수근");
		set.add("김희철");
		set.add("서장훈");
		set.add("강호동");
		System.out.println(set.size());
		//Collection API는 toString Override 되어있음
		System.out.println(set);
		boolean flag=set.contains("이상민");
		System.out.println(flag);
		System.out.println(set.isEmpty());
		
		set.remove("서장훈");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		System.out.println(set.isEmpty());
		
	}

}
