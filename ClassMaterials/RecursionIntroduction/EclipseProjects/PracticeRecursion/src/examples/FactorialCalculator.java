package examples;

/**
 * This class demonstrates a recursive and an iterative implementation of
 * factorial.
 * 
 * @author Curt Clifton
 */
public class FactorialCalculator {
	/**
	 * Main entry point of example
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		int n = 3;

		FactorialCalculator f = new FactorialCalculator();
		
		System.out.println(f.factorialIteratively(n));
		System.out.println(f.factorialRecursively(n));
	}

	/**
	 * Uses an iterative implementation to find factorial of n.
	 * 
	 * @param n
	 * @return n!
	 */
	public int factorialIteratively(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	/**
	 * Uses a recursive implementation to find factorial of n.
	 * 
	 * @param n
	 * @return n!
	 */
	public int factorialRecursively(int n) {
		if (n <= 1) {
			return 1;
		}
		// Simple recursive implementation:
		int factNMinusOne = this.factorialRecursively(n - 1);
		return n * factNMinusOne;
	}
}
