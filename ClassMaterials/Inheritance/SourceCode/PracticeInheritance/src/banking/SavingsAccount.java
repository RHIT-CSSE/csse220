package banking;

/**
 * An account that earns interest at a fixed rate.
 * 
 * @author Cay Horstmann, revised to CSSE220 coding standards by Curt Clifton.
 */
public class SavingsAccount extends BankAccount {
	private double interestRate;

	/**
	 * Constructs a new savings account with a zero balance that earns interest
	 * at the given rate.
	 * 
	 * @param rate in percent (i.e., use 5.5 for 5.5%, not 0.055)
	 */
	public SavingsAccount(double rate) {
		this.interestRate = rate;
	}
	
	/**
	 * Adds the earned interest to the account balance.
	 */
	public void addInterest() {
		double interest = this.getBalance() * this.interestRate / 100;
		this.deposit(interest);
	}
}
