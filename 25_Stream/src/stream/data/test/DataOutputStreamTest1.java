package stream.data.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 간단한 성적들을 파일로 출력하는 코드를 작성
 * 만약에 score.dat 파일 형식이 지원되지 않아서 출력되는 에러메시지 무서..
 * 바이트 계열 스트림은 출력되는 데이터 형식이 문자기반이 아닌, Binary Data(이진 데이타) 이기에
 * 문서편집기로 보아도 알 수 없는 형식으로 열린다
 * 그래서 결국 이를 확인하기 위해서는
 * score.dat파일에 출력된 Binary Data를 다시 DataInputStream을 통해서 자바 기본형(int)으로 자동변환 시켜서 읽어 들인다
 * 
 * 
 */
public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException{
		int[] scores = {100,90,80,69,93}; //문자 기반이 아니다.. 바이트 계열 출력 스트림 사용
		String outFile = "src\\scores.dat";
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
		
		System.out.println("score.dat파일이 생성");
		//2. 배열안에 들어있는 점수를 생성된 파일로 출력..writeInt()
		for(int score : scores) {
			dos.writeInt(score);
		}
		
	}

}
