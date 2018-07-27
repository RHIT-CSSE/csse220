package bigRational;

import java.math.BigInteger;

/**
 * This class implements arbitrary precision rational numbers (i.e., fractions).
 * 
 * @author TODO 1: YOUR-NAME-HERE.
 */
public class BigRational {
	// TODO 2: Make this class implement Comparable<BigRational>
	// TODO 3: Make this class implement ArithmeticObject<BigRational>

	// TODO 8: Implement the ArithmeticObject methods in this order: abs,
	// negate, add, subtract, multiply, divide.
	// TODO 9: Implement compareTo.

	/**
	 * Constructs an arbitrary precision rational number with the given
	 * numerator and denominator.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public BigRational(String numerator, String denominator) {
		// TODO 4: replace this constructor stub by working code.
	}

	/**
	 * Constructs an arbitrary precision rational number with the given
	 * numerator and denominator.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public BigRational(BigInteger numerator, BigInteger denominator) {
		// TODO 5: replace this constructor stub by working code and test it
		// with the supplied JUnit tests.
	}

	/**
	 * Returns a String that represents this BigRational, as follows: If the
	 * BigRational is a whole number, the String is just that whole number.
	 * Otherwise, the String is "numerator/denominator" with the BigRational's
	 * numerator and denominator, in lowest terms. No spaces. If the BigRational
	 * is negative, the minus sign is displayed with the numerator (not the
	 * denominator).
	 */
	@Override
	public String toString() {
		// TODO 6: replace this method stub by working code and test it
		// with the supplied JUnit tests.
		return null;
	}

	/**
	 * Returns true if the given object is a BigRational that equals this
	 * BigRational. Throws a ClassCastException if the given object is not a
	 * BigRational.
	 */
	@Override
	public boolean equals(Object object) {
		// equals is typically written with the following few lines of 
		// code at the beginning of it. 
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		BigRational other = (BigRational)object;
		// TODO 7: Compare this and other’s fields to complete your 
		// working code and test it with the supplied JUnit tests. 
		return false;
	}
}
