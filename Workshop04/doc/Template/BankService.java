package self.bank;

public class BankService {
	
	public static final int MAX_CUSTOMERS = 100;
	public Customer[] customers;
	public int numberOfCustomers;
	
	public BankService() {
		customers =new Customer[MAX_CUSTOMERS];
		numberOfCustomers = 0;
	}
	
	public void addCustomer(Customer cust) {
		//구현..배열에 cust를 추가한다.
	}
	
	public Customer getCustomer(int ssn) {
		//구현
		return null;
	}
	
	public void showAll() {
		if(numberOfCustomers == 0) {
			System.out.println("회원이 아무도 없습니다.");
			return;
		}
		//구현
		//여기서 출력되도록 합니다...return type이 void^^
	}
}
