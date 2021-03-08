package com.encore.vo;
/*
 * 상품을 구입하는
 * 고객에 대한 정보를 담고 있는 vo 클래스
 * ---------------------------------
 * Product[]   <------   Customer
 */
public class Customer {
	//1. 필드 선언
	private int ssn;
	private String name;
	private String address;
	
	private Product[ ] products;

	//2. 주입의 통로..
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
