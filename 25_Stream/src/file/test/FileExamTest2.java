package file.test;

import java.io.File;
import java.io.IOException;

public class FileExamTest2 {

	public static void main(String[] args) throws IOException{
		
		String dirname= "c:"+File.separator+"dir2"+File.separator+"mydir";
		File file1 = new File(dirname);
		
		file1.mkdirs();
		
		File file2 = new File(dirname,"fileTest.dat");
		if(file2.createNewFile()) System.out.println("filetest Creating Ok!!");
		System.out.println(file2.getName());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getParent());
		//4. 해당 프로그램이 종료될때 디렉토리 안에 있는 파일이 삭제되는 기능을 찾아서 적용!!!...api보고 적용.
	}

}
