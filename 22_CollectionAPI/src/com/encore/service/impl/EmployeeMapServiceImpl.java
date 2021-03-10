package com.encore.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.encore.service.EmployeeListService;
import com.encore.service.EmployeeMapService;
import com.encore.vo.Employee;

public class EmployeeMapServiceImpl implements EmployeeMapService{
	private HashMap<String, Employee> emp;
	
	private static EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();
	private EmployeeMapServiceImpl() {
		emp=new HashMap<String, Employee>();
	}
	public static EmployeeMapServiceImpl getInstnace() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) {
		if(emp.containsKey(e.getEmpId())) {
			System.out.println(e.getName()+"이미 등록되어있습니다");
			return;
		}else {//그런 사람이 존재하지 않는다면
			emp.put(e.getEmpId(),e);
			System.out.println(e.getName()+"님은 등록되셨습니다.");
		}
	}

	@Override
	public void deleteEmployee(String empId) {
		Employee a = emp.remove(empId);
		if(a==null) {
			System.out.println("삭제할 대상이 없습니다.");
			return;
		}else {
			System.out.println("삭제 되셨습니다");
		}
		
	}

	@Override
	public void updateEmployee(Employee e) {
		if(emp.containsKey(e.getEmpId())) {
			emp.put(e.getEmpId(), e);
			System.out.println(e.getName()+"님의 정보가 수정되셨습니다");
		}else {
			System.out.println("정보가 없습니다");
			return;
		}
	}

	@Override
	public ArrayList<Employee> findEmployees(String add) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Set<String> set =emp.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Employee e = emp.get(name);
			if(e.getAddr().equals(add)) {
				list.add(e);
			}
		}
		return list;
	}

	@Override
	public ArrayList<Employee> findEmployees() {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Set<String> set =emp.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Employee e = emp.get(name);
			list.add(e);
		}
		return list;
	}

}
