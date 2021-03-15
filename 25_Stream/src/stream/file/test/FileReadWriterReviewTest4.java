package stream.file.test;
/*
 * hope.txt������ ���ڵ����͸� �о ---FIleReader Character�迭 ���
 * �ٸ������ result.txt ���Ϸ� ���� ����Ÿ�� ��� -- FileWriter Character�迭 ���
 * ::
 * ��Ʈ�� �ڵ� �ۼ�����
 * 1. �Է�, ��� ��Ʈ���� �Ѳ����� ����
 * 
 * 2. �ݺ����ȿ��� Data�� ���δ� �о
 * 
 * 3. �ݺ����ȿ��� �о���� �����͸� sink�������� ���δ� ���
 * 	---> ���� �����͸� ����Ҷ��� �о���̴� ���� ������� �ʰ�
 * 		 ��������ŭ ��Ƶξ��ٰ� �Ѳ����� ����ϴ� ������ ���δ�.
 * 		 1) auto flush��� -- flush()
 * 		 2) �ڿ��� ������ �� �ȿ� �ִ� �����͸� �Ѳ����� ��� -- close()
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
			pw = new PrintWriter("src\\result.txt"); // ���丮�� �����ؾ������� ��½�Ʈ���� ����.. �� �ȿ� ������ϵ� ���������
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
