package collection.test1;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System���� ž��� vM���� ȯ�溯���� ���� �ַܼ� ����ϴ� ������ �ۼ�
 *  <key,value> (String,String)
 *  
 */

public class PropertiesTest1 { 

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = p.getProperty(name);
			System.out.println(name+"-"+value);
		}
	}
}
