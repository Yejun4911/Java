package stream.object.step1.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * =============== Serialization(직렬화)::Data UnPack=============
 * Person객체의 정보를(필드값) 다른곳(Sink::Person.obj)으로 날리는 로직을 작성
 * 1.Stream 객체를 생성 - - - ObjectOutputStream | FileOutputStream 
 * 2. 날린다...뿌린다...출력한다 - - - ObjectOutputStream의 기능을 사용 (writeObject(object))
 * 
 */
public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("src"+File.separator+"objfile"+File.separator+"person.obj"); // src\\objfile\\person.obj
		
		f.getParentFile().mkdirs();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		
		Person p = new Person("김연아",30,"3333","여의도");
		
		oos.writeObject(p);
		
		System.out.println("Person.obj 파일이 생성... 확인...");
		System.out.println("정보가 정확하게 출력되었는지는.");
	}

}
