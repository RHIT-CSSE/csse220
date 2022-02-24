package banking;

/**
 * This class represents a safe-deposit box at the bank
 * 
 * @author Curt Clifton. Created Oct 12, 2008.
 */
public class SafeDepositBox {
	private int boxNumber;

	/**
	 * Creates a new object representing the safe-deposit box with the given
	 * number.
	 * 
	 * @param boxNumber
	 */
	public SafeDepositBox(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	@Override
	public String toString() {
		return String.format("SafeDepositBox %d", this.boxNumber);
	}

	// TODO 4: implement equals()
}
