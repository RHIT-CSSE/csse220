package banking;

/**
 * This class represents a customer of the bank.
 * 
 * @author Curt Clifton, based on concept by Cay Horstmann Created Oct 12, 2008.
 */
public class Customer {
	private String name;
	private BankAccount account;

	/**
	 * Constructs a new customer object for the given data.
	 * 
	 * @param name
	 * @param account
	 */
	public Customer(String name, BankAccount account) {
		this.name = name;
		this.account = account.getCopy();
	}

	/**
	 * Constructs a deep copy of the given customer object.
	 * 
	 * @param toBeCopied
	 */
	public Customer(Customer toBeCopied) {
		this.name = toBeCopied.name;
		this.account = toBeCopied.account.getCopy();
	}

	/**
	 * @return the name of this customer
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return a copy of this customer's account
	 */
	public BankAccount getAccount() {
		return this.account.getCopy();
	}
}
