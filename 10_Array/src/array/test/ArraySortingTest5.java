package array.test;

import java.util.Arrays;
import java.util.Random;

public class ArraySortingTest5 {
	public static void main(String[] args) {
		Random r = new Random();
//		int a=r.nextInt();
		
		int[ ] arr = new int[10];
		for(int i=0; i<arr.length;i++) 
			arr[i] = r.nextInt(10); //0~9������ ������ ������
		
		System.out.println("====Array�� �ʱ�ȭ �Ϸ� =====\n");
		for(int i : arr) System.out.print(i+" ");
		
		//~Test4���� ����for���� ����ؼ� Bubble Sorting�ϴ� ������ ������ ���������� �����̵� �Լ��� �ٷ� ���
		Arrays.sort(arr);
		
		System.out.println("\n=============���ĿϷ�===========\n");
		for(int i : arr) System.out.print(i+" ");
	}
}











