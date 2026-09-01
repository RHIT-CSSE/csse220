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
	@Override
	public boolean equals(Object obj) {
		/* First, check type of other object using either 
		 * instanceof or isAssignableFrom
		 */
//		if (!(obj instanceof SafeDepositBox)) {
//			return false;
//		}
		if (!getClass().isAssignableFrom(obj.getClass())) {
			return false;
		}
		// Next, cast the other object so we can get at the fields
		SafeDepositBox otherBox = (SafeDepositBox) obj;
		// Finally, compare all the fields using == for primitives and equals
		// method for any objects.
		return this.boxNumber == otherBox.boxNumber;
	}
}
