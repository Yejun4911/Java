package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;

public class EmployeeListServiceImpl implements EmployeeListService{
	private ArrayList<Employee> emp;
	
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	private EmployeeListServiceImpl() {
		emp=new ArrayList<Employee>();
	}
	public static EmployeeListServiceImpl getInstnace() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) {
		boolean find =false;
		for(Employee e1 : emp) {
			if(e1.getEmpId().equals(e.getEmpId())) {
				find=true;
				System.out.println(e.getName()+"���� �̹� ȸ����ܿ� ���ԵǾ� �ֽ��ϴ�..");
				return;
			}
		}
		if(find==false) {
			emp.add(e);
		}
	}

	@Override
	public void deleteEmployee(String empId) {		
		boolean find =false;
		for(Employee e1 : emp) {
			if(e1.getEmpId().equals(empId)) {
				find=true;
				System.out.println(e1.getName()+"���� �̹� ȸ����ܿ��� �����մϴ�..");
				emp.remove(e1);
				break;
			}
		}
		if(find==false)System.out.println("ȸ��X");
	}

	@Override
	public void updateEmployee(Employee e) {
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getEmpId().equals(e.getEmpId())) {
				emp.set(i, e);
			}else {
				System.out.println("No Id");
				return;
			}
		}
	}

	@Override
	public ArrayList<Employee> findEmployees(String add) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getAddr().equals(add)) list.add(emp.get(i));
		}
		return list;
	}

	@Override
	public void findEmployees() {
		System.out.println(emp);
	}


}
