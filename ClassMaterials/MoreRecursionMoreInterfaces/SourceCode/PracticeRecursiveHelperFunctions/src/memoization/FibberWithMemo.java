package memoization;

/**
 * Demonstration of using Memoization in order to rapidly
 * speed up the calculation of Fibonacci numbers
 * 
 * 
 * @author Curt Clifton with revisions by Jason Yoder
 */
public class FibberWithMemo {
	private static final int MAX = 40;
	
	// You can also do this with an external variable 
	// instead of passing it in as a helper parameter
	// It is important that ALL calls are referring 
	// to a single instance of the array
	// private int[] fibStorage = new int[MAX + 1];

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {

		FibberWithMemo memoFibber = new FibberWithMemo();
		StopWatch timer = new StopWatch();
		
		timer.start();
		int f = memoFibber.fibWithMemo(MAX);
		timer.stop();
		System.out.println("f("+MAX+")= "+f);
		
		double time = timer.getTimeTakenInSeconds();
		System.out.println("Calculated " + MAX +
				" Fibonacci numbers WITH MEMOIZATION in " + time + " seconds.");		
		
		// Original NON-memoized version
		Fibber fibber = new Fibber();
		
		timer.start();
		f = fibber.fib(MAX);
		timer.stop();
		System.out.println("f("+MAX+")= "+f);
		
		time = timer.getTimeTakenInSeconds();
		System.out.println("Calculated " + MAX +
				" Fibonacci numbers in " + time + " seconds.");	

	}

	
	/**
	 * Recursively calculates the nth Fibonacci number.
	 * USING Memoization
	 *  
	 * @param n
	 * @return the nth Fibonacci number
	 */
	private int fibWithMemo(int n) {
		//create an array to hold values as we look them up 
		// (starts out with all values = 0 by default)
		int[] fibStorage = new int[MAX + 1];
		
		return fibWithMemoHelper(n, fibStorage);
	}
	
	
	
	/**
	 * Helper method which keeps track of the results so far
	 * in a int[] called fibStorage
	 *
	 * @param n, fibStorage
	 * @return the nth Fibonacci number
	 */
	private int fibWithMemoHelper(int n, int[] fibStorage) {
		int f;
		// Checks to see if we already know the answer
		if (fibStorage[n] != 0) {
			return fibStorage[n];
		}

		if (n <= 2) {
			f = 1;
		} else {
			int fNMOne = fibWithMemoHelper(n - 1, fibStorage);
			int fNMTwo = fibWithMemoHelper(n - 2, fibStorage);
			f = fNMOne + fNMTwo;
		}
		// Stores the answer for later
		fibStorage[n] = f;
		return f;
	}
}
