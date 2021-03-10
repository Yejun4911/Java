package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

public interface EmployeeMapService {
	void addEmployee(Employee e);
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	ArrayList<Employee> findEmployees(String add);
	ArrayList<Employee> findEmployees();
}
