package stream.file.test;
/*
 * hope.txt파일의 문자데이터를 읽어서 ---FIleReader Character계열 사용
 * 다른경로의 result.txt 파일로 문자 데이타를 출력 -- FileWriter Character계열 사용
 * ::
 * 스트림 코드 작성패턴
 * 1. 입력, 출력 스트림을 한꺼번에 생성
 * 
 * 2. 반복문안에서 Data를 전부다 읽어서
 * 
 * 3. 반복문안에서 읽어들인 데이터를 sink방향으로 전부다 출력
 * 	---> 문자 데이터를 출력할때는 읽어들이는 족족 출력하지 않고
 * 		 일정량만큼 모아두었다가 한꺼번에 출력하는 패턴을 보인다.
 * 		 1) auto flush기능 -- flush()
 * 		 2) 자원을 닫을때 그 안에 있는 데이터를 한꺼번에 출력 -- close()
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class FileReadWriterReview{
	
	FileReadWriterReview() throws IOException{
		BufferedReader br=null;
		PrintWriter pw = null;
		try{
			br = new BufferedReader(new FileReader("src\\hope.txt"));
			pw = new PrintWriter("src\\result.txt"); // 디렉토리가 존재해야하지만 출력스트림이 생성.. 그 안에 출력파일도 만들어진다
			System.out.println("1. Stream Creating...");
			String line =null;
			System.out.println("2. FileReading..and Printing...");
			while((line=br.readLine())!=null) {
				pw.println(line);
			}
		}finally {
			br.close();
			pw.close();
			
		}	
	}
}
public class FileReadWriterReviewTest4 {
	public static void main(String[] args) throws IOException{
		
		new FileReadWriterReview();
		
	}
}
