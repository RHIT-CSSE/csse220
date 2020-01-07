/**
 * BankAccount is a class that keeps track of a person's name
 * and their balance in the bank. You should be able to set the name
 * and deposit money in the account. Also, you can request the balance
 * and request the name of the person.
 * 
 * @author yoder1
 *
 */
public class BankAccount {
	//instance variables
	private String name;
	private double balance;
	
	//constructors
	// PRESENT SECRETLY   
	public BankAccount() {	
		this.name = "Unknown";
		this.balance = 0;
	}
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}

}
