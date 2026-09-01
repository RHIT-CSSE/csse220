package banking;

import java.util.ArrayList;

/**
 * An example showing printing of objects and toString().
 * 
 * @author Curt Clifton. Created Oct 12, 2008.
 */
public class PrintingExampleMain {

	private static final int MAX_INIT_BALANCE = 1000;
	private static final int COUNT = 10;

	/**
	 * Starts the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = createRandomAccounts();
		for (BankAccount bankAccount : accounts) {
			System.out.println(bankAccount.toString());
		}
		System.out.println(accounts);
	}

	private static ArrayList<BankAccount> createRandomAccounts() {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

		for (int i = 0; i < COUNT; i++) {
			double initbalance = Math.random() * MAX_INIT_BALANCE;
			double accountKind = Math.random();
			if (accountKind < 0.5) {
				accounts.add(new CheckingAccount(initbalance));
			} else {
				double rate = Math.random();
				accounts.add(new SavingsAccount(initbalance, rate));
			}
		}
		return accounts;
	}

}
