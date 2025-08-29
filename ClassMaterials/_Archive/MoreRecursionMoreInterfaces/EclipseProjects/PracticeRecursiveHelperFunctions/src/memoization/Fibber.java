package memoization;

/**
 * Would you believe that this calculates Fibonacci numbers? Really.
 * 
 * This class provides a recursive function to calculate Fibonacci numbers.
 * It also provides the time taken to do the calculation.
 * 
 * @author Curt Clifton with revisions by Jason Yoder
 */
public class Fibber {
	private static final int MAX = 40;
	private static final String msg = "fib(%d) = %d%n";

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {

		Fibber fibber = new Fibber();
		StopWatch timer = new StopWatch();
		
		timer.start();
		int f = fibber.fib(MAX);
		timer.stop();
		
		System.out.printf(msg, MAX, f);
		
		double time = timer.getTimeTakenInSeconds();
		System.out.println("Calculated " + MAX +
				" Fibonacci numbers in " + time + " seconds.");	

	}

	/**
	 * Recursively calculates the nth Fibonacci number.
	 * 
	 * @param n
	 * @return the nth Fibonacci number
	 */
	public int fib(int n) {
		int f;
		if (n <= 2) {
			f = 1;
		} else {
			int fNMOne = fib(n - 1);
			int fNMTwo = fib(n - 2);
			f = fNMOne + fNMTwo;
		}
		return f;
	}
	
}
