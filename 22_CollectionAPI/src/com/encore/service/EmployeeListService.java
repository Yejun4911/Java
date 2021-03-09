package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

public interface EmployeeListService {
	void addEmployee(Employee e);
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	ArrayList<Employee> findEmployees(String add);
	void findEmployees();
}
