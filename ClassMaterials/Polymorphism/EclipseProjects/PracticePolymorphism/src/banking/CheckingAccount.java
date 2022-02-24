package banking;

/**
 * A checking account that charges transaction fees.
 * 
 * @author Cay Horstmann, revised to CSSE220 coding standards by Curt Clifton.
 */
public class CheckingAccount extends BankAccount {
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 1.50;
	private int transactionCount;

	/**
	 * Constructs a new checking account with the given initial balance.
	 * 
	 * @param initialBalance
	 */
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		this.transactionCount = 0;
	}

	@Override
	public void deposit(double amount) {
		this.transactionCount++;
		super.deposit(amount);
	}

	@Override
	public void withdraw(double amount) {
		this.transactionCount++;
		super.withdraw(amount);
	}

	/**
	 * Deducts any accumulated transaction fees and resets the transaction
	 * count.
	 */
	public void deductFees() {
		if (this.transactionCount > FREE_TRANSACTIONS) {
			double fees = TRANSACTION_FEE
					* (this.transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fees);
		}
		this.transactionCount = 0;
	}

	@Override
	public BankAccount getCopy() {
		final CheckingAccount result = new CheckingAccount(this.getBalance());
		result.transactionCount = this.transactionCount;
		return result;
	}
}
