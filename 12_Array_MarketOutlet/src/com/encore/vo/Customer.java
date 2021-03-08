package com.encore.vo;
/*
 * ��ǰ�� �����ϴ�
 * ���� ���� ������ ��� �ִ� vo Ŭ����
 * ---------------------------------
 * Product[]   <------   Customer
 */
public class Customer {
	//1. �ʵ� ����
	private int ssn;
	private String name;
	private String address;
	
	private Product[ ] products;

	//2. ������ ���..
	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	public void buyProducts(Product[] products) {
		this.products = products;
	}
	public Product[] getProducts() {
		return products;
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	 
	public String getDetails() {
		return name+", "+address;
	}	
}
