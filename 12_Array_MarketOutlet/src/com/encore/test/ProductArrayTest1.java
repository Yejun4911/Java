package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("���Ӹ���Ǫ", 23000, 2,"LG"),
				new Product("��ټ�����", 2000, 7,"HP"),
				new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
				new Product("��Ÿ��", 340000, 1,"LG")
		};
		
		for(Product p : pros)
			System.out.println(p.getDetail());
	}
}
