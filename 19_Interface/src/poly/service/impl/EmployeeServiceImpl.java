package poly.service.impl;

import poly.service.EmployeeService;
import poly.vo.Employee;
import poly.vo.Engineer;

public class EmployeeServiceImpl implements EmployeeService{
	
	static private EmployeeServiceImpl service = new EmployeeServiceImpl();//1
	private EmployeeServiceImpl() {}//2
	public static EmployeeServiceImpl getInstance() { //3
		return service;
	}
	
	
	//0.
	public void printInfo(Employee e){
		System.out.println(e);
	}
	
	//1. ��� Employee[ ]�ȿ� ����ִ� ��ü �������� ���
	public void printAllInfo(Employee[ ] ea){
		for(int i=0; i<ea.length; i++){
			System.out.println(ea[i]);
		}
	}
	
	//2.�׽�Ʈ Ŭ�������� �Ѱܹ��� empId�� ���� ��ġ�ϴ� ��ü�� �����ϴ� ���
	public Employee findByEmpId(Employee[ ] ea, String empId){
		Employee emp = null;
		
		for(int i=0; i<ea.length; i++){
			if(ea[i].getEmpId().equals(empId)){
				emp=ea[i];
				break;
			}
		}
		return emp;
	}
	
	//3. �׽�Ʈ Ŭ�������� �Ѱܹ���  addr���� ��ġ�ϴ� Employee Ÿ���� ��ü�� ���Ϲ���
	//���� �ּҸ� ���� ����� count�� �Բ� �˾Ƴ���.
	/*public Employee[ ] findByAddress(Employee[ ] ea, String addr){
		Employee[ ] emp = new Employee[ea.length];
		int count = 0;
		
		for(int i=0; i<ea.length;i++){
			if(ea[i].getAddr().equals(addr)){ //2,3
				emp[ count ] = ea[i];
				count++;
			}
		}		
		return emp;
	}*/
	//test���� continue�� ����ϴ� ���....count��� ���� �ʰ�
	public Employee[ ] findByAddress(Employee[ ] ea, String addr){
		Employee[ ] emp = new Employee[ea.length];
		for(int i=0; i<emp.length; i++){
			if(ea[i].getAddr().equals(addr)){
				emp[i] = ea[i];
			}
		}
		return emp;
	}
	
	//4. Ư���� Employee�� ������ �����ϴ� ���...Engineer�϶��� ���ʽ� ���� ����
	public int getAnnualSalary(Employee e){
		int annualSalary = 0;
		
		annualSalary = e.getSalary()*12;
		
		if(e instanceof Engineer){
			Engineer eg = (Engineer)e;
			annualSalary =eg.getSalary()*12+eg.getBonus();
		}
		return annualSalary;
	}
	
	//5. ���� �� �ΰǺ��� �Ѿ��� �����ϴ� ���
	public int getTotalCost(Employee[ ] ea){
		int totalCost = 0;
		for(int i=0; i<ea.length; i++){
			totalCost += getAnnualSalary(ea[i]);
		}
		return totalCost;
		
	}
	
}





































