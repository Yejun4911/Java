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
		//4. �ش� ���α׷��� ����ɶ� ���丮 �ȿ� �ִ� ������ �����Ǵ� ����� ã�Ƽ� ����!!!...api���� ����.
	}

}
