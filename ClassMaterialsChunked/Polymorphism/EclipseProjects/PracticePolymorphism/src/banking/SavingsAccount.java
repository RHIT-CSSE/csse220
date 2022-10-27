package banking;

/**
 * An account that earns interest at a fixed rate.
 * 
 * @author Cay Horstmann, revised to CSSE220 coding standards by Curt Clifton.
 */
public class SavingsAccount extends BankAccount {
	private double interestRate;

	/**
	 * Constructs a new savings account with the given balance that earns
	 * interest at the given rate.
	 * 
	 * @param initialBalance
	 * @param rate
	 *            in percent (i.e., use 5.5 for 5.5%, not 0.055)
	 */
	public SavingsAccount(double initialBalance, double rate) {
		super(initialBalance);
		this.interestRate = rate;
	}

	/**
	 * Constructs a new savings account with a zero balance that earns interest
	 * at the given rate.
	 * 
	 * @param rate
	 *            in percent (i.e., use 5.5 for 5.5%, not 0.055)
	 */
	public SavingsAccount(double rate) {
		this(0.0, rate);
	}

	/**
	 * Adds the earned interest to the account balance.
	 */
	public void addInterest() {
		double interest = getBalance() * this.interestRate / 100;
		deposit(interest);
	}

	@Override
	public BankAccount getCopy() {
		return new SavingsAccount(this.getBalance(), this.interestRate);
	}

	// TODO 3: override toString() method to include rate
}
