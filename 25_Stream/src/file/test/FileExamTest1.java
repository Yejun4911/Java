package file.test;

import java.io.File;

/*
 * 파일 = 디렉토리 정보 + 파일이름
 * 해당 클래스에서는
 * 파일을 다양한 방법으로 생성
 * getParentFile() | mkdir(), mkdirs() 함수의 기능을 자세히 알아보는 로직을 작성
 * 	|
 * mkdir(),mkdirs()
 * 함수의 기능을 자세히 알아보는 로직을 작성
 * 
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("src\\filetest");
		File dir2 = new File("src\\filetest1\\step1");
		System.out.println("파일이 생성 되었나요?");
		
		dir.mkdir();
		dir2.mkdirs();
	}

}
