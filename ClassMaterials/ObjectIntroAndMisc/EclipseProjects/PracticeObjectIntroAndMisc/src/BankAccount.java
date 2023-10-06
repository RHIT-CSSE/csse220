/**
 * 
 * BankAccount represents the idea of a bank account 
 * for a particular person. It should be able to track
 * the name of the person and their balance.
 * It should be possible to get the balance, deposit money,
 * and set the name of the owner. 
 * 
 * @author yoder1
 *
 */
public class BankAccount {
	// 1.  instance variables (fields) - properties/attributes
	private String name;
	private double balance;
	
	// 2. constructors - how to initialize the object
	public BankAccount() {
		this.name = "Default Name";
		this.balance = 0;
	}
	
	public BankAccount(String name, double money) {
		this.balance = money;
		this.name = name;
	}

	
	// 3. methods - what functions can we call on an object
	public void deposit(double money) {
		this.balance += money;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return name;
	}
	
	
	
	

}
