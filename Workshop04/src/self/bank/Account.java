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
			System.out.println("입금액은 1천원 이상이어야 합니다!!");
			return;
		}
	}
	
	public void  withdraw(double amount) { //5,000
		if(amount<=balance) {
			balance -= amount;
		}else {
			System.out.println("출금액이 잔액을 초과합니다!!");
			return;
		}
	}

	
	
}
