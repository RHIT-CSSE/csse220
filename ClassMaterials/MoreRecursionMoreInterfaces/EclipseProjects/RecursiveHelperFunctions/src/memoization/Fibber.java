package memoization;

/**
 * Would you believe that this calculates Fibonacci numbers? Really.
 * 
 * @author Curt Clifton.
 */
public class Fibber {
	private static final int MAX = 40;
	private static final String msg = "fib(%d) = %d%n";
	private long[] fibStorage = new long[MAX + 1];

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {

		Fibber fibber = new Fibber();
		
		long startTime = System.currentTimeMillis();

		long f = fibber.fib(MAX);
		System.out.printf(msg, MAX, f);
		
		long endTime = System.currentTimeMillis();
		System.out.printf("Calculated %d Fibonacci numbers in %.3f seconds.%n",
				MAX, (endTime - startTime) / 1000.0);
		
		
		startTime = System.currentTimeMillis();
		f = fibber.fibWithMemo(MAX);
		System.out.printf(msg, MAX, f);
		
		endTime = System.currentTimeMillis();
		System.out.printf("Calculated %d Fibonacci numbers WITH MEMOIZATION in %.3f seconds.",
				MAX, (endTime - startTime) / 1000.0);

	}

	/**
	 * Recursively calculates the nth Fibonacci number.
	 * 
	 * @param n
	 * @return the nth Fibonacci number
	 */
	private long fib(int n) {
		// TODO: Convert this to use memoization.
		long f;
		if (n <= 2) {
			f = 1;
		} else {
			long fNMOne = fib(n - 1);
			long fNMTwo = fib(n - 2);
			f = fNMOne + fNMTwo;
		}
		return f;
	}
	
	/**
	 * Recursively calculates the nth Fibonacci number.
	 * USING Memoization
	 *  
	 * @param n
	 * @return the nth Fibonacci number
	 */
	private long fibWithMemo(int n) {
		long f;
		// Checks to see if we already know the answer
		if (fibStorage[n] != 0) {
			return fibStorage[n];
		}

		if (n <= 2) {
			f = 1;
		} else {
			final long fNMOne = fibWithMemo(n - 1);
			final long fNMTwo = fibWithMemo(n - 2);
			f = fNMOne + fNMTwo;
		}
		// Stores the answer for later
		fibStorage[n] = f;
		return f;
	}
}
