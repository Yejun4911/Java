package com.encore.test;

import com.encore.service.ProductStoreService;
import com.encore.vo.Product;
//��ɵ��� �߰��� ���ڽ��ϴ�..
public class ProductArrayTest3 {

	public static void main(String[] args) {
		//service��ü ����...service Ŭ���� ��ɵ��� �޸� �ø���.
		ProductStoreService service = new ProductStoreService();
		
		Product[ ] pros = {
				new Product("���Ӹ���Ǫ", 23000, 2,"LG"),
				new Product("��ټ�����", 2000, 7,"HP"),
				new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
				new Product("��Ÿ��", 340000, 1,"LG")
		};
		
		System.out.println("=========1. ��� ��ǰ�� ����Ŀ�� ����մϴ�.==============");
		service.printAllProductMaker(pros);
		
		System.out.println("=========2. ��� ��ǰ�� �� ���Ծ��� �޾ƿɴϴ�.==============");
		//int total=service.getTotalPrice(pros);
		System.out.println(service.getTotalPrice(pros)+"��");
		
		System.out.println("=========3. 1���� �̻��� ��ǰ���� �޾ƿɴϴ�.==============");
		Product[ ] returnPros = service.getMorePrice(pros, 10000);
		for(Product p : returnPros) {
			if(p==null)continue;
			System.out.println(p.getDetail());
		}
		
		System.out.println("=========4. ������ ȸ�� ��ǰ���Դϴ�.==============");
		Product[ ] returnPros1 = service.getCertainCompany(pros, "LG");
		for(Product p : returnPros1) {
			if(p==null)continue;
			System.out.println(p.getDetail());
		}
		
		System.out.println("=========5. ��ǰ���� ��հ� �Դϴ�.==============");
		System.out.println(service.getAvgPrice(pros)+"�� �Դϴ�.");
	}
}






































