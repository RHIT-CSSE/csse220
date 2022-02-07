/**
 * A class filled with interesting functions for learning.
 * 
 * @author Michael Hewner
 *
 */
public class ConditionalExamples {

	public static void main(String[] args) {
		System.out.println("Average of 4,5,5 is " + ConditionalExamples.computeAverage(4, 5, 5));
		ConditionalExamples.printCubed(3);
		System.out.println("Equation at 3 is " + ConditionalExamples.doEquation(3));
		ConditionalExamples.printDivisibleBy3(6);
		ConditionalExamples.guessCubeRoot(27, 2.9);
		if(ConditionalExamples.isWayBigger(100, 3)) {
			System.out.println("WAY bigger");
		}
		if(ConditionalExamples.isGreaterThan3(1, 44, 1)) {
			System.out.println("one is greater than 3");
		}
	}
	
	/**
	 * 
	 * Computes the average of the three input numbers
	 * 
	 * We'll solve this one together
	 */
	public static double computeAverage(int one, int two, int three) {
		return (one+two+three)/3.0;
	}
	
	/**
	 * 
	 * Given a number, prints that number cubed (e.g. to the third power)
	 * The output should look like "3 cubed is 27!!!"
	 *
	 * Solve this one yourself
	 */
	public static void printCubed(double numberToCube) {
		double numCubed = numberToCube*numberToCube*numberToCube;
		System.out.println(numberToCube + " cubed is " + numCubed + "!!!");
	}
	
	/**
	 * 
	 * Computes the function 0.5*x^2 + 3x + 99
	 * 
	 * For example, doEquation(3) returns 112.5 (0.5*3^2 + 3*3 + 99)
	 * 
	 * Solve this one yourself
	 */
	public static double doEquation(double x) {
		return 0.5*x*x + 3*x + 99;
	}
	
	/**
	 * 
	 * If the input number is divisible by 3, prints "divisible by 3!"
	 * Otherwise prints "NOT divisible by 3"
	 * 
	 * We'll solve this one as a group
	 */
	public static void printDivisibleBy3(int number) {
		if(number % 3 == 0) {
			System.out.println("divisible by 3");
		} else {
			System.out.println("NOT divisible by 3");
		}
	}
	
	/**
	 * Takes a number and a guess for what it's cube root ought to be.
	 * If the guess is too high, print "Lower"
	 * if the guess is too low, print "Higher"
	 * If the guess is just right, print "Perfect"
	 * 
	 * So guessCubeRoot(27,2.5) would print "Higher"
	 *    guessCubeRoot(27,3.3) would print "Lower"
	 *    guessCubeRoot(27,3) would print "Perfect"
	 * 
	 * You'll solve this one yourself.  Use > < and ==
	 * 
	 */
	public static void guessCubeRoot(double number, double guess) {
		double guessCubed = guess*guess*guess;
		if(guessCubed > number) {
			System.out.println("Lower");
			return;
		}
		if(guessCubed < number) {
			System.out.println("Higher");
			return;
		}
		System.out.println("Perfect");
	}
	
	/**
	 * Returns true if the first number is much larger (at least 100x larger)
	 * than the second.  You can assume the first number is larger than the 
	 * second.
	 * 
	 * We'll solve this one together
	 */
	public static boolean isWayBigger (int bigger, int smaller) {
		boolean result = bigger >= 100*smaller;
		return result;
	}
	
	/**
	 * Returns true if at least 1 one of the 3 input values is greater than 3
	 * 
	 * hint: you can do a logical OR with the || operator
	 * 
	 * Solve this one yourself
	 */
	public static boolean isGreaterThan3 (int one, int two, int three) {
		return one > 3 || two > 3 || three > 3;
	}
	
	
}
