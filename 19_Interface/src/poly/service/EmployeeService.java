package poly.service;

import poly.vo.Employee;

public interface EmployeeService {
	//총 6개의 Template Method를 선언했다..
	
	void printInfo(Employee e);//앞에 자동적으로 public abstract가 붙어있다....
	void printAllInfo(Employee[ ] ea);
	Employee findByEmpId(Employee[ ] ea, String empId);
	Employee[ ] findByAddress(Employee[ ] ea, String addr);
	int getAnnualSalary(Employee e);
	int getTotalCost(Employee[ ] ea);	
	
}
