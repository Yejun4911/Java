package com.encore.cons.test;

import com.encore.cons.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		
		Shirt longT = new Shirt("����Ű",120.0, true);
		Shirt halfT = new Shirt("�Ƶ�ٽ�",125.0, true);
		
		System.out.println(longT.getDeatils());
		System.out.println(halfT.getDeatils());

	}
}
