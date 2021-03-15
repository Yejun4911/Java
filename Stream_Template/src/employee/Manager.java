package employee;

public interface Manager {
	public void getFile(); 
	public void saveFile();
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(String eid); 
	public Employee findEmployee(String eid) ;
	public void showAll(); 
}
