package bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		this.balance = 0;
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		System.out.print("Depositing " + amount);
		double newBalance = this.balance + amount;
		System.out.println(", new balance is " + newBalance);
		this.balance = newBalance;
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
		System.out.print("Withdrawing " + amount);
		double newBalance = this.balance - amount;
		System.out.println(", new balance is " + newBalance);
		this.balance = newBalance;
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
