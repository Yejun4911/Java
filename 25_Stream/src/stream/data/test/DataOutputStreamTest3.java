package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;


public class DataOutputStreamTest3 {

	public static void main(String[] args){
		DataInputStream dis=null;
		try {
			dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
			int data = 0;
		
			while((data = dis.readInt())!=-1) {
				System.out.println(data);
			}
				
		}catch(EOFException e){ //More Exception !! 큰거 부터예외처리
		}catch(IOException e) {
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
			}
		}
	//1. 스트림 생성
	
	//2. while문 안에서 읽어들이고
		
	//3. 콘솔로 출력한다
		
	}

}
