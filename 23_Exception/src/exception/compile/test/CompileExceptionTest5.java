package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\encore_hsh\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader ��ü�� ����...");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader�� ����� �̿��ؼ� ������ ������ �о���Դϴ�.");
			fr.read();			
			
		}finally {			
			fr.close();//�� �ڵ尡 ����� �߿��ϴ�.				
		}
	}
}




