package looping.test;
/*
 * 1~100���� ���� �߿��� Ȧ���� ���� ���...�ϴ� ������ �ۼ�
 * 	1) ���� 1~100���� ���� ���
 *  2) 1) �� �߿��� Ȧ���� ���� ���س�����....continue ���
 */
public class LoopingContinueTest3 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) continue;
			sum += i;
			
		}
		System.out.println("1���� 100������ Ȧ������ ��"+sum);

	}

}
