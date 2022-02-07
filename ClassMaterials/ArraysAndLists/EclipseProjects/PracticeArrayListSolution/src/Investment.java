/**
 * A class to monitor the growth of an investment that accumulates interest at a
 * fixed annual rate.
 * 
 * @author Cay Horstmann.
 */
public class Investment {
	private int years;
	private double balance;
	private double rate;

	/**
	 * Constructs an Investment object from the given starting balance and
	 * interest rate.
	 * 
	 * @param balance
	 * @param rate
	 */
	public Investment(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
		this.years = 0;
	}

	/**
	 * Keeps accumulating interest until the given target balance has been
	 * reached.
	 * 
	 * @param targetBalance
	 */
	public void waitForBalance(double targetBalance) {
		// DONE Implement this method so that it works as described.
		// Live code in class with students.
		while (this.balance < targetBalance) {
			this.years++;
			double interest = this.balance * this.rate / 100;
			this.balance += interest;
		}
	}
	
	/**
	 * @return the current investment balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * @return the number of years since the start of the investment
	 */
	public int getYears() {
		return this.years;
	}
}
