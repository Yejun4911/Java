package collection.test1;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System위에 탑재된 vM관련 환경변수들 값을 콘솔로 출력하는 로직을 작성
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
