package file.test;

import java.io.File;

/*
 * ���� = ���丮 ���� + �����̸�
 * �ش� Ŭ����������
 * ������ �پ��� ������� ����
 * getParentFile() | mkdir(), mkdirs() �Լ��� ����� �ڼ��� �˾ƺ��� ������ �ۼ�
 * 	|
 * mkdir(),mkdirs()
 * �Լ��� ����� �ڼ��� �˾ƺ��� ������ �ۼ�
 * 
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("src\\filetest");
		File dir2 = new File("src\\filetest1\\step1");
		System.out.println("������ ���� �Ǿ�����?");
		
		dir.mkdir();
		dir2.mkdirs();
	}

}
