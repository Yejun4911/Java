package employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class EmployeeManagerImpl implements Manager {
	BufferedReader br;
	BufferedWriter bw;
	FileReader fr;
	FileWriter fw;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileOutputStream fos;
	FileInputStream fis;
	List<Employee> eList = new ArrayList<>();
	File file;
	
	/////////////////////////////////////////////////
	////////// 싱글톤으로 변경하세요 ///////////
	///////////////////////////////////////////////
	
	private static EmployeeManagerImpl singletone = new EmployeeManagerImpl();
	public static EmployeeManagerImpl getInstnace() {
		return singletone;
	}
	private EmployeeManagerImpl(){
		file = new File("employee.txt");
		if (file.exists()) {
			getFile();
		} else {
			try {
				if(file.createNewFile())
					System.out.println("파일 생성 성공...");
			} catch (IOException e) {
				System.out.println("파일 생성 실패...");
			}
			// 1. 파일이 존재하지 않는다면...파일을 생성부터 한다.
			//
		}
	}

	public void getFile(){
		if(file.exists()) {
		// 2. 파일이 존재한다면....
		/*
		 * ObjectInputStream을 생성 .... new ObjectInputStream()
		 * 파일에 있는 내용을 읽어와서 Employee를 생성하고 생성된 Employee들을 List에 저장한다....readObject()
		 */
			try {
				ois = new ObjectInputStream(new FileInputStream(file));
				eList = (ArrayList<Employee>)ois.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					if (br != null)
						br.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

	@Override
	public void saveFile() {
		
		/*
		 * 3. 프로그램 종료시 동작하는 기능.
		 *    프로그램 종료 직전에 ArrayList에 저장된 모든 사원에 대한 정보를 파일에 출력한다.
		 *    new ObjectOutputStream() 생성...writeObject()사용해서 직렬화
		 */
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(eList);
			//
			//
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		return eList.add(employee);
	}

	@Override
	public boolean deleteEmployee(String eid) {
		for(Employee e : eList) {
			if(e.getEid().equals(eid)) {
				eList.remove(e);
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee findEmployee(String eid) {
		for(Employee e : eList) {
			if(e.getEid().equals(eid)) return e;
		}
		return null;
	}

	@Override
	public void showAll() {
		for(Employee e : eList) System.out.println(e);
	}
}
