package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("´ó±â¸Ó¸®¼¤Çª", 23000, 2,"LG"),
				new Product("»ï´Ù¼ö»ý¼ö", 2000, 7,"HP"),
				new Product("ÄÅ¶ó¸é", 1200, 10,"SAMSUNG"),
				new Product("ÄÏÅ¸¿ö", 340000, 1,"LG")
		};
		
		for(Product p : pros)
			System.out.println(p.getDetail());
	}
}
