package exception.compile.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1. 
 * ���ܶ�� ���� �ſ� �پ��� ��Ȳ���� �߻��Ҽ� �ִ�.
 * �̷��� ��� ���ܸ� Exception ����Ŭ������ ���ױ׷��� �ϳ��� ó���ϴ� ���� �״��� ���� ����� �ƴϴ�.
 * --> ������� ����ȭ �ϴ� ���� ����
 * --> �������� ī�װ��� ���ܴ� �Ѱ����� �����ִ� �͵� ����
 */
public class CompileExceptionTest6 {
	public static void main(String[] args){
		try {
			Class.forName("exception.compile.test.CompileExceptionTest6");
			new FileInputStream("Hello");	
			DriverManager.getConnection("aaa");
		}catch (ClassNotFoundException e) {
			System.out.printf("�ش� Ŭ������ ã������ �����ϴ�...: %s%n",e.getMessage());
		}catch(FileNotFoundException | SQLException e) {
			System.out.printf("�ش��ϴ� ���ҽ��� �����ϴ�: %s%n",e.getMessage());
		}			
		System.out.println("���α׷� ��������");
	}
}




