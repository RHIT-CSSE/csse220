import java.util.ArrayList;

public class BankAccount {
	
	//just some notes for how I do the bank account example
	//TODO 1: Create the bank account class & instantiate the objects in another main
	//TODO 2: Create name and balance fields for the bank account class and use them
	// in the other main
	//TODO 3: Talk about encapsulation and add deposit & withdraw methods, make balance private
	//TODO 4: Talk about constructors add constructor that takes name as a parameter
	//TODO 5: Add a constructor that takes a new and and initial balance

	//Stouder: Below is what I did in class. I started with duplicating everything in 
	//both constructors, then showed them how to call one constructor from another
	//to reduce code duplication. 
	
	
	private String name;
	private double balance;
	private ArrayList<String> transactionLog;
	
	public BankAccount(String name) {
		this(name, 0);
	}
	
	public BankAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
		this.transactionLog = new ArrayList<String>();
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		this.transactionLog.add("Deposit of $" + amount);
	}
	
	public boolean withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("Insufficient funds: Cannot withdraw $" + amount
					+ " with a balance of $" + this.balance);
			return false;
		}
		this.balance -= amount;
		this.transactionLog.add("Withdraw of $" + amount);
		return true;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getTransactionLog() {
		String[] toReturn = new String[this.transactionLog.size()];
		for (int i=0;i<toReturn.length;i++) {
			toReturn[i] = this.transactionLog.get(i);
		}
		return toReturn;
	}
	
	
	public String toString() {
		return "Name: " + this.name + ", Balance: " + this.balance;
	}
	
	
	
	
	
	
	
	
	
}
