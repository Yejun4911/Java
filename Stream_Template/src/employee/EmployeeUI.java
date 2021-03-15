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
			case "1" : // ���� ���
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
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("���Ӱ� ���ŵ� ��� ������ ���Ͽ� ����Ǿ����ϴ�.");
				manager.saveFile();
				System.exit(0);
			}
		 }
	}
	/** ���� ���
	 * 
	 */
	@Override
	public void insertEmployee() {
		 
		System.out.println("===================================");
		System.out.println("         [ ENCORE ���� ���  ]");
		System.out.println("===================================");
		System.out.println(" 1. ��� ��ȣ : " + ( Employee.serial + 1 ));	
		

		System.out.print(" 2. ��� �̸� : ");
		String name = scanner.next();
		
		System.out.print(" 3. �޿� : ");	
		int salary = scanner.nextInt();
		scanner.nextLine();
		
		List<String> license = new ArrayList<>();

		while(true) {
			System.out.print("** �ڰ��� : ");
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
		System.out.print(" > �����Ϸ��� ����� �����ȣ : ");
		String eid = scanner.nextLine();
		Employee e = manager.findEmployee(eid);
		
		if(e == null) {
			System.out.println(" [ ��� ] �ش��ϴ� ��� ������ �����ϴ�.");
			return;
		}
		
		System.out.println("** " + e);
		System.out.println("�� ����� �����Ͻðڽ��ϱ�? (y/n) ");
		String answer = scanner.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			manager.deleteEmployee(eid);
			System.out.println("���� �Ϸ�!");
			return;
		}
		
		System.out.println("���� �۾� ���!");
	}

	@Override
	public void findEmployee() {
		System.out.print(" > �˻��Ϸ��� ����� �����ȣ : ");
		String eid = scanner.nextLine();
		Employee e = manager.findEmployee(eid);
		
		if(e == null) {
			System.out.println(" [ ��� ] �ش��ϴ� ��� ������ �����ϴ�.");
			return;
		}		
		System.out.println(e);
	}

	@Override
	public void printMainMenu() {
		System.out.println("===================================");
		System.out.println("      [ ENCORE �ڰ��� ���� ���α׷� ]");
		System.out.println("===================================");
		System.out.println(" 1.��� ���");	
		System.out.println(" 2.��� �˻�");	
		System.out.println(" 3.��� ���� ����");	
		System.out.println(" 4.��� ó��");	
		System.out.println(" 5.��ü ���");	
		System.out.println(" 9.����");
		System.out.println("===================================");
		System.out.print  ("** �޴� ��ȣ���� : ");	
	}

}
