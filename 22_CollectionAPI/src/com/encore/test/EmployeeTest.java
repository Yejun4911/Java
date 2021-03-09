package com.encore.test;

import com.encore.service.impl.EmployeeListServiceImpl;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
	EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstnace();
		
	//2. method�� ���� ȣ��..
	System.out.println("======================== 1. add ================================== ");
	Manager m1 = new Manager("111","��ȣ��","��赿",500,"���ߺ�");
	Manager m2 =new Manager("222","�̼���","������",200,"������");
	Manager m3 =new Manager("333","������","���ǵ�",400,"���ߺ�");
	
	Engineer eg1 = new Engineer("444","������","��õ��",450,"python",200);
	Engineer eg2 =new Engineer("555","����ö","�Ÿ���",150,"java",100);
	
	service.addEmployee(m1);
	service.addEmployee(m2);
	
	service.addEmployee(eg1);
	service.addEmployee(eg2);
	service.addEmployee(m3);
	
	service.findEmployees();
	
	System.out.println("======================== 2. delete ================================== ");
	service.deleteEmployee("111");
	
	System.out.println("========================");
	System.out.println(service.findEmployees("��赿"));
	
	}

}
