package bank;

/**
 * A withdraw runnable makes periodic withdrawals from a bank account.
 */
public class WithdrawRunnable implements Runnable {
	
	private static final int DELAY = 1;
	private BankAccount account;
	private double amount;
	private int count;
	
	/**
	 * Constructs a withdraw runnable.
	 * 
	 * @param anAccount
	 *            the account from which to withdraw money
	 * @param anAmount
	 *            the amount to deposit in each repetition
	 * @param aCount
	 *            the number of repetitions
	 */
	public WithdrawRunnable(BankAccount anAccount, double anAmount, int aCount) {
		this.account = anAccount;
		this.amount = anAmount;
		this.count = aCount;
	}

	public void run() {
		try {
			for (int i = 1; i <= this.count; i++) {
				this.account.withdraw(this.amount);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
			// nothing to do
		}
	}
}
