package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 * ��ǰ�� �����ϴ� ��,
 * ������ ������ ��ǰ������ �ٷ�� ����� 
 * ��Ƴ��� ���� Ŭ����..
 */
public class OutletStoreService {
	//1. Ư�� ���� ������ ��ǰ������ �����ϴ� ���
	//2. Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	//3. Outlet�� �ִ� ��� ���� ��ƾ�ϴ� ���
	//4. ��� ���߿� Ư�� ���� �˻�(ã�Ƴ���)�ϴ� ��� 
	//5. Ư�� ���� ������ ������ �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	//6. ��� ���� ������ ������ Ư������ �̻�Ǵ� ��ǰ�� �����ϴ� ���
	//7. ������ ���׿� ����ִ� ���鸸 �����ϴ� ���
	public void getProductInfo(Customer cs) {
		Product[] temp=cs.getProducts();
		for(Product i : temp) System.out.println(i.getDetail());
	}
	
	public void getMakerInfo(Customer cs) {
		Product[] temp=cs.getProducts();
		for(Product i : temp) System.out.println(i.getMaker());	
	}
	public void getCustomerList(Customer[] cs) {
		for(Customer i : cs)System.out.println(i.getDetails());
	}
	public void getCustomerSearch(Customer[] cs,String name) {
		for(Customer i : cs) {
			if(i.getName().equals(name)) System.out.println(i.getDetails());
		}
	}
	public void getHighPrice(Customer cs) {
		Product[] temp=cs.getProducts();
		int max = 0;
		for(Product i:temp) {
			if(i.getPrice()>max) max=i.getPrice();
		}
		System.out.println(max);
	}
	public void getAllListPrice(Customer[] cs, int price) {
		for(Customer i : cs) {
			Product[] temp=i.getProducts();
			for(Product j : temp) {
				if(j.getPrice()>=price) System.out.println(j.getDetail());
			}
		}
	}
	public void getSameCity(Customer[] cs,String adderss) {
		for(Customer i : cs) {
			if(i.getAddress().equals(adderss)) System.out.println(i.getDetails());
		}
	}
	
	
}
