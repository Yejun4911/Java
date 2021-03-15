package stream.object.step1.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * =============== Serialization(����ȭ)::Data UnPack=============
 * Person��ü�� ������(�ʵ尪) �ٸ���(Sink::Person.obj)���� ������ ������ �ۼ�
 * 1.Stream ��ü�� ���� - - - ObjectOutputStream | FileOutputStream 
 * 2. ������...�Ѹ���...����Ѵ� - - - ObjectOutputStream�� ����� ��� (writeObject(object))
 * 
 */
public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws IOException {
		File f = new File("src"+File.separator+"objfile"+File.separator+"person.obj"); // src\\objfile\\person.obj
		
		f.getParentFile().mkdirs();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		
		Person p = new Person("�迬��",30,"3333","���ǵ�");
		
		oos.writeObject(p);
		
		System.out.println("Person.obj ������ ����... Ȯ��...");
		System.out.println("������ ��Ȯ�ϰ� ��µǾ�������.");
	}

}
