package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest4 {
	public static void main(String[] args){
		String path = "C:\\encore_hsh\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader ��ü�� ����...");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader�� ����� �̿��ؼ� ������ ������ �о���Դϴ�.");
			fr.read();			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();//�� �ڵ尡 ����� �߿��ϴ�.
			}catch(IOException e) {
				
			}		
		}
	}
}




