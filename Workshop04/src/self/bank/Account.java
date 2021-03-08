package self.bank;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	public void  deposit(double amount) { //5,000
		if(amount>=1000) {
			balance += amount;
		}else {
			System.out.println("�Աݾ��� 1õ�� �̻��̾�� �մϴ�!!");
			return;
		}
	}
	
	public void  withdraw(double amount) { //5,000
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("��ݾ��� �ܾ��� �ʰ��մϴ�!!");
			return;
		}
	}

	
	
}
