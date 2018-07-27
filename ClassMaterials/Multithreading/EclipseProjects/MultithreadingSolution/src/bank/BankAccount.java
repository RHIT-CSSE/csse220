package bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
	private double balance;
	// FIXME: add lock
	private Lock balanceChangeLock;
	// FIXME: add condition
	private Condition sufficientFundsCondition;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		this.balance = 0;
		// FIXME: add lock
		this.balanceChangeLock = new ReentrantLock();
		// FIXME: add condition
		this.sufficientFundsCondition = this.balanceChangeLock.newCondition();
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		// FIXME: version 1
		// System.out.print("Depositing " + amount);
		// double newBalance = this.balance + amount;
		// System.out.println(", new balance is " + newBalance);
		// this.balance = newBalance;

		// FIXME: version 2
		this.balanceChangeLock.lock();
		try {
			System.out.print("Depositing " + amount);
			double newBalance = this.balance + amount;
			System.out.println(", new balance is " + newBalance);
			this.balance = newBalance;
			// FIXME: add for version 3
			this.sufficientFundsCondition.signalAll();
		} finally {
			this.balanceChangeLock.unlock();
		}
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 * @throws InterruptedException
	 *             if the withdrawing thread is interrupted while waiting for
	 *             sufficient funds to withdraw
	 */
	public void withdraw(double amount) throws InterruptedException {
		// FIXME: version 1
		// System.out.print("Withdrawing " + amount);
		// double newBalance = this.balance - amount;
		// System.out.println(", new balance is " + newBalance);
		// this.balance = newBalance;

		// FIXME: version 2
		this.balanceChangeLock.lock();
		try {
			// FIXME: add for version 3
			while (this.balance < amount)
				this.sufficientFundsCondition.await();
			System.out.print("Withdrawing " + amount);
			double newBalance = this.balance - amount;
			System.out.println(", new balance is " + newBalance);
			this.balance = newBalance;
		} finally {
			this.balanceChangeLock.unlock();
		}
	}

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return this.balance;
	}

}
