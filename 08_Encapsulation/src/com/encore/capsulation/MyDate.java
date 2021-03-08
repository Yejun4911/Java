package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ�������� ���������� �����Ҽ� ������ 
 *    �ʵ�տ� ---> private �����Ѵ�.
 * 2. Ŭ������ �ʵ忡 ������ setter() / getter() �Ѵ�
 *    �׸��� ��׵��� �ٸ� Ŭ���������� ���� ������ �� �ֵ��� public
 *    public void setXxx(o)
 *    public int getXxx(x)
 * 3. 
 *    setXxx(){
 *     // ù���ο���(�ʵ� �ʱ�ȭ �Ǳ� ����!!!!) �� Ÿ���� ���� ������ �ֵ��� ������ �����Ѵ�
 *     
 *     setDay()
 *     ::
 *     1,3,5,7,8,10,12�� ---> 1 <= day <=31
 *     2�� ---> 1<= day <=28
 *     4,6,9,11�� ----> 1<= day  <=30
 *     switch, if
 *     
 *     
 *     ::
 *     0�� 22���Դϴ�
 *     2�� 0�� �Դϴ�.
 *     
 *     3��
 */
public class MyDate {
	//private  �����ϸ� ���� Ŭ���������� ������ ����Ѵ�.
	private int month;//1~12
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;
		}else { //1~12������ ���� �ƴѰ��� ...
			System.out.println("Invalid Month Value!!");
			//return;
			//���α׷��� �ٷ� �������´�.
			System.exit(0);
		}
		
	}//
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//���� ���� day�� �޶�����...
		switch(month) {
			case 2:
				if(day>=1 && day<=28) {
					this.day = day;
				}else {
					System.out.println("Invalid Day Value!!");
					System.exit(0);
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>=1 && day<=30) {
					this.day = day;
				}else {
					System.out.println("Invalid Day Value!!");
					System.exit(0);
				}
			break;
			default:
				if(day>=1 && day<=31) {
					this.day = day;
				}else {
					System.out.println("Invalid Day Value!!");
					System.exit(0);
				}
		}//switch		
	}//setDay
}//class
















