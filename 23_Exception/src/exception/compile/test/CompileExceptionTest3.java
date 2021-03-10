package exception.compile.test;
// 1. try~catch   2. throws 3.main...
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading3{	
	public void readFile(String filename) throws FileNotFoundException{
		
			FileReader fr = new FileReader(filename);
			System.out.println("1.....new FileReader()..filename..");

		System.out.println("2. FileReader Creating....");
	}
}
public class CompileExceptionTest3 {
	public static void main(String[] args) throws FileNotFoundException{
		FileReading3 f = new FileReading3();
		String path = "C:\\encore_hsh\\util\\poem.txt";
		
			f.readFile(path);
	
		System.out.println("3. 파일을 잘 읽어들였습니다..");
	}
}
