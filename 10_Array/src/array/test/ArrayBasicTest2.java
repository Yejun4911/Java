package array.test;
/*
 * �迭�� ���� + ���� + �ʱ�ȭ 
 * --> �� ����� �� ���� ����մϴ�.
 * ::
 * �迭�� Ư¡
 * 1.�迭�� ReSizing �Ҽ� ����
 *   ó�� ���� ����� �����ϰ� �Ǹ�
 *   ���ο� �迭�� �ϳ� �����ȴ�.
 *   
 * 2. �迭�� ��ü��
 *    newŰ���带 ���ؼ� ����..Heap�� �ö󰣴�
 *    ������ Class Type�� �������� �ʴ´�.
 *    length��� �ʵ带 �ݵ�� �������
 *    �迭���� ����Ÿ�� ������ �����ϴ� �ʵ忡 �ش��Ѵ�.
 *    
 * 3. �迭�� ReSizing�� �ȵ�����
 *    ����� �ٸ� �迭�� ����Ÿ�� ������ �ͼ� ����Ҽ��� �ִ�.
 *    System.arraycopy()�� ����Ѵ�.
 */
public class ArrayBasicTest2 {
	public static void main(String[] args) {
	
		int[ ] arr = {11,22,33};
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" "); //11,22,33
		
		//44,55���� �ڴʰ� ���ܼ� �߰��ؾ� �Ѵ�.
		arr = new int[5];
		arr[3] = 44;
		arr[4] = 55;
		System.out.println("\n===================================");
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" "); //11,22,33,44,55	
		
		
		System.out.println("\n==============arraycopy()=====================");
		int[ ] target = {1,2,3,4,5,6};
		int[ ] source = {10,9,8,7,6,5,4,3,2,1};
		
		System.arraycopy(source,3, target, 0, 4);
		for(int i=0; i<target.length; i++) System.out.print(target[i]+" ");
	}
}











