package com.encore.service;

import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmpolyeeService {
	private int midx;
	private int egidx;
	private Manager[] manager;
	private Engineer[] engineer;
	public EmpolyeeService() {		
		manager=new Manager[100];	
		engineer=new Engineer[100];
		midx=0;
		egidx=0;
	}
	
	public void addManager(Manager ma){
		manager[midx++]=ma;	
	}
	public void addEngineer(Engineer en){
		engineer[egidx++]=en;
	}
	
	public void deleteManager(String name){
		for(int i=0; i<manager.length; i++) {
			if(manager[i]!=null) {
				if(manager[i].getName().equals(name)) {
					manager[i]=null;//
				}
			}	
		}
	}
	
	public void deleteEngineer(String name) {
		for(int i=0; i<engineer.length; i++) {
			if(engineer[i]!=null) {
				if(engineer[i].getName().equals(name)) {
					engineer[i]=null;
				}
			}	
		}
	}
	
	public void updateManager(double salary, String name , String dept, int deptno) {
		for(Manager i : manager) {
			if(i!=null) {
				if(i.getName().equals(name)) {
					i.setSalary(salary);
					i.setDept(dept);
					i.setDeptno(deptno);
				}
			}
		}
	}
	public void updateEngineer(Engineer engineer) {
		for(Engineer i : this.engineer) {
			if(i!=null) {
				if(i.getName().equals(engineer.getName())) {
					i.setSalary(engineer.getSalary());
					i.setBirthDate(engineer.getBirthDate());
					i.setTech(engineer.getTech());
					i.setBonus(engineer.getBonus());
				}	
			}
			
		}
	}
	
	public Manager findManager(String name) {
		for(Manager i : manager) {
			if(i!=null) {
				if(i.getName().equals(name)) return i;
			}
		}
		return null;
	}
	public Manager[] findManager(int deptno) {
		Manager[] temp = new Manager[100];
		int k=0;
		for(Manager i : manager) {
			if(i!=null) {
				if(i.getDeptno()==deptno) temp[k++]=i;
			}	
		}
		return temp;
	}
	
	public Engineer findEngineer(String name) {
		for(Engineer i : engineer) {
			if(i!=null) {
				if(i.getName().equals(name)) return i;
			}
		}
		return null;
	}

	public void printManagers() {
		for(Manager i : manager) {
			if(i!=null)System.out.println(i.toString());		
		}
	}
	public void printEngineers() {
		
		for(Engineer i: engineer) {
			if(i!=null)	System.out.println(i.getDetails());
		}
	}
}
