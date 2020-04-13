package memoization;

/**
 * Would you believe that this calculates Fibonacci numbers? Really.
 * 
 * @author Curt Clifton with revisions by Jason Yoder
 */
public class Fibber {
	private static final int MAX = 40;
	private static final String msg = "fib(%d) = %d%n";
	
	// You can also do this with an external variable instead of passing it along as a helper parameter
	// It is important that ALL calls are referring to a single instance of the array
	//private long[] fibStorage = new long[MAX + 1];

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
		//create an array to hold values as we look them up 
		// (starts out with all values = 0 by default)
		long[] fibStorage = new long[MAX + 1];
		
		return fibWithMemoHelper(n, fibStorage);
	}
	
	
	
	/**
	 * Helper method which keeps track of the results so far
	 * in a long[] called fibStorage
	 *
	 * @param n, fibStorage
	 * @return the nth Fibonacci number
	 */
	private long fibWithMemoHelper(int n, long[] fibStorage) {
		long f;
		// Checks to see if we already know the answer
		if (fibStorage[n] != 0) {
			return fibStorage[n];
		}

		if (n <= 2) {
			f = 1;
		} else {
			long fNMOne = fibWithMemoHelper(n - 1, fibStorage);
			long fNMTwo = fibWithMemoHelper(n - 2, fibStorage);
			f = fNMOne + fNMTwo;
		}
		// Stores the answer for later
		fibStorage[n] = f;
		return f;
	}
}
