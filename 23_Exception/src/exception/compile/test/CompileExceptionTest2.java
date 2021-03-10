package exception.compile.test;
// 1. try~catch   2. throws
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading2{	
	public void readFile(String filename) throws FileNotFoundException{
		
			FileReader fr = new FileReader(filename);
			System.out.println("1.....new FileReader()..filename..");

		System.out.println("2. FileReader Creating....");
	}
}
public class CompileExceptionTest2 {
	public static void main(String[] args) {
		FileReading2 f = new FileReading2();
		String path = "C:\\encore_hsh\\util\\poem.txt";
		try {
			f.readFile(path);
		}catch(FileNotFoundException e) {
			
		}
		System.out.println("3. 파일을 잘 읽어들였습니다..");
	}
}
