package array.test;
/*
 * �迭 ����, ����, �ʱ�ȭ ������ �ۼ�
 * for���� ����ؼ� �迭 �ȿ� ����ִ� ������ �ܼ�â���� ���
 */
public class ArrayBasicTest1 {
	public static void main(String[] args) {
		//1. �迭 ���� + ����
		int[ ] arr = new int[3];
		System.out.println("�迭�� �ּҰ� :: "+arr);
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]); //0  0  0
		
		//2.�ʱ�ȭ
		arr[0] = 11; arr[0] = 22; arr[0] = 33;
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]); //11  22  33
		
	}
}
