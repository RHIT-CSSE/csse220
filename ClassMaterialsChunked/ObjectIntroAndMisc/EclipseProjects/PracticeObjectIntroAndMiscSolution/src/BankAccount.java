
public class BankAccount {

	private String name;
	private double balance = 0;
	
	public BankAccount() {
		name = "unknown user";
	}

	public BankAccount(String string, double i) {
		name = string;
		balance = i;
	}

	public void deposit(double i) {
		balance += i;
		
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String string) {
		name = string;
	}

	public String getName() {
		return name;
	}

}
