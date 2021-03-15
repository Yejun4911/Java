package employee;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{
	public static int serial=0;
	private String eid;		// 사원번호
	private String name;	// 사원이름
	private int salary;
	private List<String> license;
	
	public Employee() {
	}

	public Employee(String name, int salary, List<String> license) {
		super();
		serial++;
		this.eid = serial+"";
		this.name = name;
		this.salary = salary;
		this.license = license;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getLicense() {
		return license;
	}

	public void setLicense(List<String> license) {
		this.license = license;
	}

	@Override
	public String toString() {
		String temp = "";
		for(String s : license) {
			temp += "," + s;
		}
		return eid + "," + name + "," + salary + temp;
	}
	
}	
