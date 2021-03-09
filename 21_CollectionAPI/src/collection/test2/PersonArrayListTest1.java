package collection.test2;

import java.util.ArrayList;

import collection.vo.Person;

/*
 * List안에 여려명의 사람을 추가하는 로직을 작성
 * 추가된 사라므이 정보를 핸들링 하는 방법도 로직으로작성
 */
public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("강호동","서초동",45));
		list.add(new Person("이수근","논현동",25));
		list.add(new Person("김희철","관악구",15));
		list.add(new Person("강호동","강남구",35));
		System.out.println(list);
		//몇명인지 리스트안에
		System.out.println(list.size());
		//평균
		int total=0;
		
		for(Person p : list) {
			total+=p.getAge();
		}
		System.out.println(total/list.size());
		//저장된 사람들중에서 서초동 사는사람
		for(Person p : list) {
			if(p.equals("서초동")) System.out.println(p);
		}
		
	}

}
