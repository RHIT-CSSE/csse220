package javadocExample;
/**
 * Class: BankAccount
 * @author CSSE Faculty
 * <br>Purpose: Used to hold account information (account name, balance)
 * <br>Restrictions: Cannot be used for checking accounts
 * <br>For example: 
 * <pre>
 *    BankAccount collegeSavings = new BankAccount("college", 500.00);
 * </pre>
 */
public class BankAccount {

	private String name;
	private double balance = 0;
	
	/**
	 * ensures: initializes the account name to "unknown user" and balance to 0
	 */
	public BankAccount() {
		name = "unknown user";
		balance = 0.0;
	} // BankAccount

	/**
	 * ensures: initializes the account name to accountName and balance to initialBalance
	 * @param accountName used to initialize the account's name
	 * <br>requires: accountName &ne; ""
	 * @param initialBalance used to initialize the account's balance
	 * <br>requires: initialBalance &ge; 0.0
	 */
	public BankAccount(String accountName, double initialBalance) {
		name = accountName;
		balance = initialBalance;
	} // BankAccount

	/**
	 * ensures: it adds the depositAmount to the account's balance
	 * @param depositAmount the amount to be added to the account's balance
	 * <br>requires: depositAmount &gt; 0.0
	 */
	public void deposit(double depositAmount) {
		balance += depositAmount;		
	} // deposit

	/**
	 * ensures: that the current account balance is returned
	 * @return the account's balance
	 */
	public double getBalance() {
		return balance;
	} // getBalance

	/**
	 * ensures: sets the account's name to newName
	 * @param newName the account's new name
	 * <br>requires: newName &ne; ""
	 */
	public void setName(String newName) {
		name = newName;
	} // setName

	/**
	 * ensures: that the current account name is returned
	 * @return account's name
	 */
	public String getName() {
		return name;
	} // getName
} // end BankAccount
	