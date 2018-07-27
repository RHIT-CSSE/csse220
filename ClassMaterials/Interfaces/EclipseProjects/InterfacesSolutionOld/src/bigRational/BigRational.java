package bigRational;

import java.math.BigInteger;

/**
 * This class implements arbitrary precision rational numbers (i.e., fractions).
 * 
 * @author Matt Boutell.
 */
public class BigRational implements Comparable<BigRational>,
		ArithmeticObject<BigRational> {

	private BigInteger numerator;
	private BigInteger denominator;

	/**
	 * Constructs an arbitrary precision rational number with the given
	 * numerator and denominator.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public BigRational(String numerator, String denominator) {
		this(new BigInteger(numerator), new BigInteger(denominator));
	}

	/**
	 * Constructs an arbitrary precision rational number with the given
	 * numerator and denominator.
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public BigRational(BigInteger numerator, BigInteger denominator) {
		if (denominator.equals(BigInteger.ZERO)) {
			throw new ArithmeticException("Division by zero with numerator: "
					+ numerator);
		}
		this.numerator = numerator;
		this.denominator = denominator;

		// Normalizes signs
		if (this.numerator.signum() == this.denominator.signum()) {
			this.numerator = this.numerator.abs();
		} else {
			this.numerator = this.numerator.abs().negate();
		}
		this.denominator = this.denominator.abs();

		// Reduces
		BigInteger gcd = this.numerator.gcd(this.denominator);
		this.numerator = this.numerator.divide(gcd);
		this.denominator = this.denominator.divide(gcd);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		BigRational other = (BigRational) obj;
		return this.numerator.equals(other.numerator)
				&& this.denominator.equals(other.denominator);
	}

	@Override
	public String toString() {
		if (this.numerator.equals(BigInteger.ZERO)
				|| this.denominator.equals(BigInteger.ONE)) {
			return this.numerator.toString();
		}
		return this.numerator.toString() + "/" + this.denominator.toString();
	}

	public int compareTo(BigRational o) {
		BigInteger left = this.numerator.multiply(o.denominator);
		BigInteger right = o.numerator.multiply(this.denominator);
		return left.compareTo(right);
	}

	public BigRational abs() {
		return new BigRational(this.numerator.abs(), this.denominator);
	}

	public BigRational add(BigRational other) {
		// a/b + c/d = (ad + cb)/bd
		BigInteger ad = this.numerator.multiply(other.denominator);
		BigInteger cb = other.numerator.multiply(this.denominator);
		BigInteger ad_plus_cb = ad.add(cb);
		BigInteger bd = this.denominator.multiply(other.denominator);
		return new BigRational(ad_plus_cb, bd);
	}

	public BigRational divide(BigRational other) throws ArithmeticException {
		BigRational otherInverse = new BigRational(other.denominator,
				other.numerator);
		return this.multiply(otherInverse);
	}

	public BigRational multiply(BigRational other) {
		// (a/b) * (c/d) = ac/bd
		BigInteger ac = this.numerator.multiply(other.numerator);
		BigInteger bd = this.denominator.multiply(other.denominator);
		return new BigRational(ac, bd);
	}

	public BigRational negate() {
		return new BigRational(this.numerator.negate(), this.denominator);
	}

	public BigRational subtract(BigRational other) {
		return this.add(other.negate());
	}

}
