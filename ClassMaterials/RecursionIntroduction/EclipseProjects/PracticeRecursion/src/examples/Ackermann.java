package examples;

import java.math.BigInteger;
import java.text.MessageFormat;

/**
 * This class demonstrates a recursive implementation of the Ackermann function.
 * It's really slow!
 * 
 * @author Curt Clifton
 */
public class Ackermann {
	private static final BigInteger REPORT_INTERVAL = new BigInteger("1000000");

	private static BigInteger recursionCount = BigInteger.ZERO;

	/**
	 * Main entry point of example
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		BigInteger m = new BigInteger("3");
		BigInteger n = new BigInteger("2");

		System.out.println(ackermann(m, n));
		System.out.println(MessageFormat.format("Calculated in {0} steps",
				recursionCount));
	}

	/**
	 * Computes the Ackermann function of m and n.
	 * 
	 * @param m
	 * @param n
	 * @return A(m,n)
	 */
	private static BigInteger ackermann(BigInteger m, BigInteger n) {
		/*
		 * Just a little something to keep track of progress since this takes so
		 * bloody long to compute.
		 */
		recursionCount = recursionCount.add(BigInteger.ONE);
		if (recursionCount.mod(REPORT_INTERVAL).equals(BigInteger.ZERO)) {
			System.out.println(MessageFormat.format(
					"Working on ackermann({0}, {1}), through {2} steps", m, n,
					recursionCount));
		}

		// The actual calculation:
		if (m.equals(BigInteger.ZERO)) {
			return n.add(BigInteger.ONE);
		}
		// Assuming m and n are non-negative, then m must be greater than 0
		if (n.equals(BigInteger.ZERO)) {
			return ackermann(m.subtract(BigInteger.ONE), BigInteger.ONE);
		}
		// m and n must both be greater than 0
		return ackermann(m.subtract(BigInteger.ONE), ackermann(m, n
				.subtract(BigInteger.ONE)));
	}

}
