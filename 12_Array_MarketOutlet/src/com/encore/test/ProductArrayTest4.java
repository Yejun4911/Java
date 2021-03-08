package com.encore.test;

import com.encore.service.OutletStoreService;
import com.encore.service.ProductStoreService;
import com.encore.vo.Customer;
import com.encore.vo.Product;
//OutletStoreService와 Hasing되는 Test Class....
public class ProductArrayTest4 {

	public static void main(String[] args) {
		//service객체 생성...service 클래스 기능들을 메모리 올린다.
		OutletStoreService service = new OutletStoreService();
		
		Product[ ] pros1 = {
				new Product("댕기머리샴푸", 23000, 2,"LG"),
				new Product("삼다수생수", 2000, 7,"HP"),
				new Product("컵라면", 1200, 10,"SAMSUNG"),
				new Product("켓타워", 340000, 1,"LG")
		};
		
		Product[ ] pros2= {
				new Product("죽염치약", 5600, 2,"CJ"),
				new Product("새우깡", 2000, 2,"농심"),
				new Product("신라면", 2300, 10,"농심")
		};
		
		Customer[ ] customers = new Customer[2];
		customers[0] = new Customer(111, "이나영", "방배동");
		customers[1] = new Customer(222, "원빈", "방배동");		
		
		customers[0].buyProducts(pros1);
		customers[1].buyProducts(pros2);
		service.getCustomerSearch(customers,"이나영");
		service.getHighPrice(customers[0]);
		////////// 아래서부터는 Service의 기능을 호출할 것입니다. /////////////
	}
}






































