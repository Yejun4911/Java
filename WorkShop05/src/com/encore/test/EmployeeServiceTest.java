package com.encore.test;

import com.encore.service.EmpolyeeService;
import com.encore.util.MyDate;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		EmpolyeeService service = new EmpolyeeService();
		System.out.println("#########등록########");
		service.addEngineer(new Engineer("Yejun",new MyDate(1996,11,04),15000.0,"java",1000.0));
		service.addEngineer(new Engineer("Yujin",new MyDate(1996,01,02),19000.0,"python",2000.0));	

		service.addManager(new Manager("James",new MyDate(1995,11,02),12000.0,"computer",2));
		service.addManager(new Manager("joy",new MyDate(1992,9,02),22000.0,"computer",1));
		System.out.println("#########조회########");
		service.printEngineers();
		service.printManagers();
		
		System.out.println("###########수정###########");
		service.updateEngineer(new Engineer("Yujun",new MyDate(1996,01,02),12000.0,"django",300.0));
		service.updateManager(13300.0,"James","computer", 0);
		service.printEngineers();
		service.printManagers();
		
		
		System.out.println("#########삭제########");
		service.deleteManager("James");
		service.deleteEngineer("Yejun");
		
		System.out.println("#########검색########");
		
		Manager[] mg = service.findManager(0);
		for(Manager i : mg) {
			if(i!=null) System.out.println(i);
		}

		System.out.println(service.findEngineer("Yejun"));
		System.out.println("############################");
		service.printManagers();		
		service.printEngineers();
	}

}
