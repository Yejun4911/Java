package com.encore.cons;
/*
 * 1. ������
 * ��ü�� �����ɶ����� ����(ȣ��)�Ǵ� ��.
 * 
 * 
 * 2. �⺻ ������
 * ::
 * ���ڰ� ����
 * {}�ȿ��� �ƹ��� ���۵� ���� �ʴ� ������.
 */
public class Shirt {
	//1. �ʵ� ����
	public String brandName;
	public double price;
	public boolean longSleeved;
	
	public Shirt() {}
	public Shirt(String brandName, double price, boolean longSleeved) {
		//�ʵ� �ʱ�ȭ
		this.brandName = brandName;
		this.price = price;
		this.longSleeved = longSleeved;
	}	
	
	public String getDeatils() {
		return brandName+", "+price+", "+longSleeved;
	}
}
