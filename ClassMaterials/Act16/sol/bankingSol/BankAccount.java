package bankingSol;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 * @author Cay Horstmann, revised to CSSE220 coding standards by Curt Clifton.
 */
public abstract class BankAccount {
	private double balance;

	/**
	 * Constructs a new bank account with a zero balance.
	 */
	public BankAccount() {
		this(0);
	}

	/**
	 * Constructs a bank account with the given balance.
	 * 
	 * @param initialBalance
	 */
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	/**
	 * Deposits the given amount into this account.
	 * 
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}

	/**
	 * Withdraws the given amount from this account.
	 * 
	 * @param amount
	 */
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	/**
	 * @return the current balance of this account
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Transfers the given amount from this account to the other given account.
	 * Mutates other.
	 * 
	 * @param amount
	 * @param other
	 *            the receiving account (mutated)
	 */
	public void transfer(double amount, BankAccount other) {
		withdraw(amount);
		other.deposit(amount);
	}

	// TODO 1: add toString() method, examine output of PrintingExampleMain
	// TODO 2: make sure toString() works appropriately for CheckingAccount
	@Override
	public String toString() {
		// return String.format("BankAccount: balance=%.2f", this.balance);
		String className = this.getClass().getSimpleName();
		return String.format("%s: balance=%.2f", className, this.balance);
	}

	/**
	 * @return a deep copy of this account 
	 */
	public abstract BankAccount getCopy();
}
