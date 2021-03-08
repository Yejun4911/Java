package poly.test;

import poly.service.impl.EmployeeServiceImpl;
import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		Employee e = new Employee("e123", "aaa", "���ϵ�", 450);
		Manager m = new Manager("m667", "bbb", "õȣ��", 320, "���ߺ�");
		Engineer eg = new Engineer("eg334", "ccc", "�ϻ�", 100, "JAVA", 500);
		Engineer eg1 = new Engineer("eg155", "ddd", "�ϻ�", 400, "JQuery", 50);
		
//		EmployeeService service = new EmployeeService();
		
		System.out.println("***** 0.printInfo calling *******");
		EmployeeServiceImpl.getInstance().printInfo(e);
		EmployeeServiceImpl.getInstance().printInfo(m);
		
		System.out.println("\n*****1. printAllInfo calling *******");
		Employee[ ] arr = {e,m,eg,eg1};
		EmployeeServiceImpl.getInstance().printAllInfo(arr);
		
		
		System.out.println("\n*****2. findByEmpId calling *******");
		Employee emp=EmployeeServiceImpl.getInstance().findByEmpId(arr, "e123");
		System.out.println(emp); 
		
		
		System.out.println("\n*****3. findByAddress calling *******");
		Employee[ ] empArr=EmployeeServiceImpl.getInstance().findByAddress(arr, "�ϻ�");
		
		for(int i=0; i<empArr.length; i++){
			if(empArr[i]==null)
				
				continue; 
			System.out.println(empArr[i].getAddr()+" "+empArr[i].getName());
		}
		
		
		System.out.println("\n*****4. getAnnualSalary calling *******");
		System.out.println("Anuual Salary :: "+EmployeeServiceImpl.getInstance().getAnnualSalary(e));
		System.out.println("Anuual Salary :: "+EmployeeServiceImpl.getInstance().getAnnualSalary(eg1));
		
		
		System.out.println("\n*****5. getTotalCost calling *******");
		System.out.println("[��� ����ε��� ���� �� �ΰǺ�� ::]"
									+EmployeeServiceImpl.getInstance().getTotalCost(arr));
		
	}
}






















