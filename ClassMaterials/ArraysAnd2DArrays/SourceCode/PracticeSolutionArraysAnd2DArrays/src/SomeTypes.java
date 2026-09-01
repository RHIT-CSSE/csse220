/**
 * This class is for an exercise on various number types in Java.
 * 
 * @author Curt Clifton, modified by David Mutchler. Created September 7, 2008,
 *         updated December 4, 2009.
 */
public class SomeTypes {
	/**
	 * Largest value to find the factorial of, in this program.
	 */
	public static final int MAX = 18;

	/**
	 * Starting point for the exercise.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here
	 */
	public static void main(String[] args) {
		/*
		 * DONE in class: change the types below and in factorial() to avoid integer
		 * overflow
		 */
		System.out.println("Factorial");
		for (int i = 1; i < SomeTypes.MAX; i++) {
			long fact = SomeTypes.factorial(i);
			System.out.printf("%3d %16d\n", i, fact);
		}

		/* DONE in class: change the types below to actual reciprocals. */
		System.out.println("\n\nReciprocal");
		for (int i = 1; i < SomeTypes.MAX; i++) {
			double recip = 1.0 / i;
			System.out.printf("%3d %7f\n", i, recip);
		}
	}

	/**
	 * Returns the factorial of the given value, n.
	 * 
	 * @param n
	 * @return the factorial of the given value, n.
	 */
	private static long factorial(int n) {
		long product = 1;

		for (int j = 2; j <= n; j++) {
			product = product * j;
		}

		return product;
	}
}
