package array.test;

import java.util.Random;

/*
 * Sorting - - - ����
 * ::
 * �迭�� ���� �ڷᱸ���� �־�� 3,5,7,3,11,2,
 * ���Ŀ� ���� �䱸������ ����ϰ� �Ͼ��.
 * �����̶�?
 * ������{3,6,1,2,8,9} --> �������� ������{1,2,3,6,8,9} --> �������� ������{9,8,7,3,2,1}
 * ���� | ����
 * ������ ���� �Էµ� ������ ���Ѵ�.
 * a,bb,a,c,zz
 * 
 * ::
 * Bubble Sorting  - - - ��������
 * ������ �����ϱ� ���� �˰��� �߿��� ���� ��ǥ���� �˰����� �������
 * 
 * ���
 * ������ �� ���� ���ؼ� ū���� �ڷ� ������ ���
 * 2,5 �μ��� �� --> 2,5�� �����Ѵ�.
 * 5,3 �μ��� �� --> 
 * 					1)temp��� �ӽú����� �ϳ� �����.
 *                    �� �ȿ� 5�� ��� ����
 *                  2) 3�� 5�� �ڸ��� ���ٳ��´�.
 *                  3) 3�� �ڸ����� temp�ȿ� �ִ� 5�� �ٽ� �����ͼ� ���ٳ��´�
 *                     --> �̷��� �� ���� �ڸ���  temp������ �̿��ؼ� �ٲٴ� ����� swap�̶� �Ѵ�.
 *                    
 *           
               
 */

public class ArraySortingTest4 {
	public static void main(String[] args) {
		Random r = new Random();
//		int a=r.nextInt();
		
		int[ ] arr = new int[10];
		for(int i=0; i<arr.length;i++) 
			arr[i] = r.nextInt(10); //0~9������ ������ ������
		
		System.out.println("====Array�� �ʱ�ȭ �Ϸ� =====\n");
		for(int i : arr) System.out.print(i+" ");
		
		int temp = 0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) { //���� ���� ���� ������ �� ũ�ٸ�
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}//if				
			}//for
		}//outer for
		
		System.out.println("\n=============���ĿϷ�===========\n");
		for(int i : arr) System.out.print(i+" ");
	}
}











