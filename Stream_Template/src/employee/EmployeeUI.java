 package employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeUI implements UI {
	Scanner scanner;
	Manager manager;
	
	public EmployeeUI() throws IOException {
		 scanner = new Scanner(System.in);
		 manager = EmployeeManagerImpl.getInstnace();
		 
		 String select= null;
		 
		 while(true) {
			printMainMenu();
			select = scanner.nextLine();
			
			switch(select) {
			case "1" : // 직원 등록
				insertEmployee();
				break;
			case "2" : 
				findEmployee();
				break;
			case "3" : 
				updateEmployee();
				break;
			case "4" : 
				deletEmployee();
				break;
			case "5" : 
				manager.showAll();
				break;
			case "9" : 
				System.out.println("프로그램을 종료합니다.");
				System.out.println("새롭게 갱신된 사원 정보가 파일에 저장되었습니다.");
				manager.saveFile();
				System.exit(0);
			}
		 }
	}
	/** 직원 등록
	 * 
	 */
	@Override
	public void insertEmployee() {
		 
		System.out.println("===================================");
		System.out.println("         [ ENCORE 직원 등록  ]");
		System.out.println("===================================");
		System.out.println(" 1. 사원 번호 : " + ( Employee.serial + 1 ));	
		

		System.out.print(" 2. 사원 이름 : ");
		String name = scanner.next();
		
		System.out.print(" 3. 급여 : ");	
		int salary = scanner.nextInt();
		scanner.nextLine();
		
		List<String> license = new ArrayList<>();

		while(true) {
			System.out.print("** 자격증 : ");
			String temp = scanner.nextLine();
			if(temp.equals(0)) break;
			if(temp.trim().length() == 0) break;
			license.add(temp);
		}
		
		Employee employee = new Employee(name, salary, license);
		manager.insertEmployee(employee);

	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletEmployee() {
		System.out.print(" > 삭제하려는 사원의 사원번호 : ");
		String eid = scanner.nextLine();
		Employee e = manager.findEmployee(eid);
		
		if(e == null) {
			System.out.println(" [ 경고 ] 해당하는 사원 정보는 없습니다.");
			return;
		}
		
		System.out.println("** " + e);
		System.out.println("이 사원을 삭제하시겠습니까? (y/n) ");
		String answer = scanner.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			manager.deleteEmployee(eid);
			System.out.println("삭제 완료!");
			return;
		}
		
		System.out.println("삭제 작업 취소!");
	}

	@Override
	public void findEmployee() {
		System.out.print(" > 검색하려는 사원의 사원번호 : ");
		String eid = scanner.nextLine();
		Employee e = manager.findEmployee(eid);
		
		if(e == null) {
			System.out.println(" [ 경고 ] 해당하는 사원 정보는 없습니다.");
			return;
		}		
		System.out.println(e);
	}

	@Override
	public void printMainMenu() {
		System.out.println("===================================");
		System.out.println("      [ ENCORE 자격증 관리 프로그램 ]");
		System.out.println("===================================");
		System.out.println(" 1.사원 등록");	
		System.out.println(" 2.사원 검색");	
		System.out.println(" 3.사원 정보 수정");	
		System.out.println(" 4.퇴사 처리");	
		System.out.println(" 5.전체 출력");	
		System.out.println(" 9.종료");
		System.out.println("===================================");
		System.out.print  ("** 메뉴 번호선택 : ");	
	}

}
