package collection.test1;

import java.util.ArrayList;
import java.util.List;

/*
 * List
 * 순서를 가지면서 객체를 저장하는방식
 * 중복은 허용한다.
 * 
 */
public class ArrayList3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("강호동");
		list.add("이수근");
		list.add("강호동");
		list.add("서장훈");
		list.add("김희철");
		System.out.println(list);
		//3번째 객체를 삭제
		//삭제된 데이타를 출력
		//첫번째 데이터를 아이유로 수정
		list.remove(2);
		list.set(0,"아이유");
		System.out.println(list);
		int cnt=0;
//		for(String str: list) {
//			if(str.equals("서장훈")) System.out.println(list.get(cnt));
//			cnt++;
//		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("서장훈"))System.out.println(list.get(i));
		}
	}
}
