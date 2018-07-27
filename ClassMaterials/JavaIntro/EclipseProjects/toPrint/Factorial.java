/**
 * A sample class to calculate factorials
 * 
 * @author Claude Anderson. Nov 19, 2007.
 */
public class Factorial {

	/**
	 * The largest number for which to calculate the factorial.
	 */
	public static final int MAX = 17;

	/**
	 * @param n
	 * @return the factorial of n
	 */
	public static int factorial(int n) {
		int product = 1;
		int i;
		for (i = 2; i <= n; i++) {
			product = product * i;
		}
		return product;
	}

	/**
	 * Starts the program.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= MAX; i++) {
			System.out.print(i);
			System.out.print("! = ");
			System.out.println(factorial(i));
		}
	}
}