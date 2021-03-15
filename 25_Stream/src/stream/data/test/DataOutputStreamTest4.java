package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;


public class DataOutputStreamTest4 {

	public static void main(String[] args){
	int sum=0;
	int score=0;
	DataInputStream dis = null;
	try {
		dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
		System.out.println("Stream Creating....");
		
		while(true) {
			score = dis.readInt();
			System.out.println(score);
			sum+=score;
		}
	}catch(EOFException e) {
		System.out.println(sum);
	}catch(IOException e) {
	}finally {
		try {
			dis.close();
		}catch (IOException e) {
		}
	}
	
	}

}
