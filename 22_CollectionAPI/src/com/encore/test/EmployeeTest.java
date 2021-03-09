package com.encore.test;

import com.encore.service.impl.EmployeeListServiceImpl;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
	EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstnace();
		
	//2. method를 각각 호출..
	System.out.println("======================== 1. add ================================== ");
	Manager m1 = new Manager("111","강호동","방배동",500,"개발부");
	Manager m2 =new Manager("222","이수근","논현동",200,"오락부");
	Manager m3 =new Manager("333","서장훈","여의도",400,"개발부");
	
	Engineer eg1 = new Engineer("444","서장훈","봉천동",450,"python",200);
	Engineer eg2 =new Engineer("555","김희철","신림동",150,"java",100);
	
	service.addEmployee(m1);
	service.addEmployee(m2);
	
	service.addEmployee(eg1);
	service.addEmployee(eg2);
	service.addEmployee(m3);
	
	service.findEmployees();
	
	System.out.println("======================== 2. delete ================================== ");
	service.deleteEmployee("111");
	
	System.out.println("========================");
	System.out.println(service.findEmployees("방배동"));
	
	}

}
