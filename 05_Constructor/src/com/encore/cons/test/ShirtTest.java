package com.encore.cons.test;

import com.encore.cons.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		
		Shirt longT = new Shirt("나이키",120.0, true);
		Shirt halfT = new Shirt("아디다스",125.0, true);
		
		System.out.println(longT.getDeatils());
		System.out.println(halfT.getDeatils());

	}
}
