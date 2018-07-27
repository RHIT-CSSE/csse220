/**
 * A sample class to calculate series sums.
 * 
 * @author Curt Clifton, based on work by Claude Anderson. Sep 8, 2008
 */
public class SeriesSum {

	/**
	 * The maximum value to loop to.
	 */
	public static final int MAX = 65536;
	// The sum exhibits integer overflow at MAX == 65536 

	/**
	 * @param n
	 * @return the series sum from 0 to n
	 */
	public static int seriesSum(int n) {
		int sum = 1;
		int i;
		for (i = 2; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * Starts the program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= MAX; i++) {
			// That first character is a capital sigma on my machine. Is it on
			// yours?
			System.out.print("·i,i=1..");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(seriesSum(i));
		}
	}
}