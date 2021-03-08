package com.encore.datatype;

/*
 * 1. �ʵ�
 *    int ������, char �÷�, float ����, String ����ȸ��, String ����
 *    ��ũ��ġ ���θ� �˼� �ִ� �ʵ带 �߰�
 * 
 * 2. �޼ҵ�
 *    2�� ����
 *    - ���� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 *    - �ʵ忡 �Էµ�, ����� ���� �ܼ�â���� ����ϴ� ���
 *    
 *    -------------------------------------------
 *    1. 
 *    ����(Variable�� ���Ǵ� ��ġ�� ���� Field�� Local V�� ���еȴ�)
 *    �ʵ� --> Ŭ���� ���� �ٷ� ��, �޼ҵ� ��� �ٱ�
 *    Local V(����) --> �޼ҵ� ��
 *    
 *    2. 
 *    ���ú����� �̸��� �ʵ�� �����ϰ� ���������� �ۼ��Ѵ�.
 *    �̸��� �����Ҷ��� �ʵ� �տ� this�� ���̸� �ȴ�.
 */
public class WhiteBoard {
	// field
	public int size;
	public char color;
	public float price;//double
	public String madeCompany;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String madeCompany, String material, boolean scratch) { //local V
		//�ʵ�� ���ú����� �̸��� ������, �����ϱ� ���ؼ� �ʵ�տ� this���δ�.
		// this�� �ش�Ŭ���� �ڱ��ڽ�...������ �ϴ� �ؼ�..
		this.size = size;
		this.color = color;
		this.price = price;
		this.madeCompany = madeCompany;
		this.material = material;
		this.scratch = scratch;
	}	
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+madeCompany+"\t"+material+"\t"+scratch);
	}	
}








