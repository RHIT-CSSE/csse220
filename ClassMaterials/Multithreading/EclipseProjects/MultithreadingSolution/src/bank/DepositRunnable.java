package bank;

/**
 * A deposit runnable makes periodic deposits to a bank account.
 */
public class DepositRunnable implements Runnable {
	
	private static final int DELAY = 1;
	private BankAccount account;
	private double amount;
	private int count;	
	/**
	 * Constructs a deposit runnable.
	 * 
	 * @param anAccount
	 *            the account into which to deposit money
	 * @param anAmount
	 *            the amount to deposit in each repetition
	 * @param aCount
	 *            the number of repetitions
	 */
	public DepositRunnable(BankAccount anAccount, double anAmount, int aCount) {
		this.account = anAccount;
		this.amount = anAmount;
		this.count = aCount;
	}

	public void run() {
		try {
			for (int i = 1; i <= this.count; i++) {
				this.account.deposit(this.amount);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
			// nothing to do
		}
	}
}
