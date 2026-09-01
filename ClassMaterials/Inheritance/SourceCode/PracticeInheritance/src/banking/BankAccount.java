package banking;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 * @author Cay Horstmann, revised to CSSE220 coding standards by Curt Clifton.
 */
public class BankAccount {
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
		this.withdraw(amount);
		other.deposit(amount);
	}
}
