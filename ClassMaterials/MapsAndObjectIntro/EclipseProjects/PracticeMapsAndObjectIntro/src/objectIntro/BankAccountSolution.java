package objectIntro;

public class BankAccountSolution {

	private String name;
	private double balance = 0;
	
	public BankAccountSolution() {
		name = "unknown user";
	}

	public BankAccountSolution(String string, double i) {
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
