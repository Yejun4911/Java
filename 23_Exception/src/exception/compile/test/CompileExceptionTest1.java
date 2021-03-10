package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String filename) {
		try {
			FileReader fr = new FileReader(filename);
			System.out.println("1.....new FileReader()..filename..");
		}catch(FileNotFoundException e) {
			//System.out.println("Nice Catch");
			//1. 비워두거나
			//2. printStackTrace(), getMessage()
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		System.out.println("2. FileReader Creating....");
	}
}
public class CompileExceptionTest1 {
	public static void main(String[] args) {
		FileReading f = new FileReading();
		String path = "C:\\encore_hsh\\util\\poem.txt";
		f.readFile(path);
		System.out.println("3. 파일을 잘 읽어들였습니다..");
	}

}
