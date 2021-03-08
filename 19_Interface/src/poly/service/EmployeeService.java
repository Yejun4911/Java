package poly.service;

import poly.vo.Employee;

public interface EmployeeService {
	//�� 6���� Template Method�� �����ߴ�..
	
	void printInfo(Employee e);//�տ� �ڵ������� public abstract�� �پ��ִ�....
	void printAllInfo(Employee[ ] ea);
	Employee findByEmpId(Employee[ ] ea, String empId);
	Employee[ ] findByAddress(Employee[ ] ea, String addr);
	int getAnnualSalary(Employee e);
	int getTotalCost(Employee[ ] ea);	
	
}
