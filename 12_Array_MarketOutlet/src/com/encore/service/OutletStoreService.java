package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 * 상품을 구입하는 고객,
 * 상점에 입점된 상품정보를 다루는 기능을 
 * 모아놓은 서비스 클래스..
 */
public class OutletStoreService {
	//1. 특정 고객이 구입한 상품정보를 리턴하는 기능
	//2. 특정 고객이 구입한 상품의 maker들만 리턴하는 기능
	//3. Outlet에 있는 모든 고객을 리틴하는 기능
	//4. 모든 고객중에 특정 고객을 검색(찾아내는)하는 기능 
	//5. 특정 고객이 구입한 물건중 최고가에 해당하는 물건의 가격을 리턴하는 기능
	//6. 모든 고객이 구입한 물건중 특정가격 이상되는 제품을 리턴하는 기능
	//7. 동일한 동네에 살고있는 고객들만 리턴하는 기능
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
