package com.encore.test;

import com.encore.service.OutletStoreService;
import com.encore.service.ProductStoreService;
import com.encore.vo.Customer;
import com.encore.vo.Product;
//OutletStoreService�� Hasing�Ǵ� Test Class....
public class ProductArrayTest4 {

	public static void main(String[] args) {
		//service��ü ����...service Ŭ���� ��ɵ��� �޸� �ø���.
		OutletStoreService service = new OutletStoreService();
		
		Product[ ] pros1 = {
				new Product("���Ӹ���Ǫ", 23000, 2,"LG"),
				new Product("��ټ�����", 2000, 7,"HP"),
				new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
				new Product("��Ÿ��", 340000, 1,"LG")
		};
		
		Product[ ] pros2= {
				new Product("�׿�ġ��", 5600, 2,"CJ"),
				new Product("�����", 2000, 2,"���"),
				new Product("�Ŷ��", 2300, 10,"���")
		};
		
		Customer[ ] customers = new Customer[2];
		customers[0] = new Customer(111, "�̳���", "��赿");
		customers[1] = new Customer(222, "����", "��赿");		
		
		customers[0].buyProducts(pros1);
		customers[1].buyProducts(pros2);
		service.getCustomerSearch(customers,"�̳���");
		service.getHighPrice(customers[0]);
		////////// �Ʒ������ʹ� Service�� ����� ȣ���� ���Դϴ�. /////////////
	}
}






































