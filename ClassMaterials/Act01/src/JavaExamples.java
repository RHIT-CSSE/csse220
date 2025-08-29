/**
 * Examples of small methods (a.k.a. functions) in Java. 
 * 
 * Adapted from Michael Hewner's ConditionalExamples.java. 
 * 
 * @author Ian Ludden
 */

public class JavaExamples {
    
    public static void main(String[] args) {
        /*
         * Note: The messages in double-quotation marks, 
         * such as "Average of 3 4 5 is ", are String objects. 
         * We'll discuss Strings and other Java objects soon. 
         */
		System.out.println("Average of 3 4 5 is " + computeAverage(3, 4, 5));
		System.out.println("Average of 3 4 6 is " + computeAverage(3, 4, 6));
		
        printCubed(4); // note: here, and in the rest, we print in the function
        printCubed(7);

		printDivisibleBy3(12); 
		printDivisibleBy3(13);
		
		guessCubeRoot(27,2.5);
        guessCubeRoot(27, 3.3);
        guessCubeRoot(27, 3);
	}
	
	/**
	 * 
	 * Computes the average of the three input numbers
	 */
	public static double computeAverage(double a, double b, double c) {
		return (a + b + c)/3;
	}
	
	/**
	 * 
	 * Computes a number cubed.
	 * 
	 * NOTE: in Java, there is no exponent operator (e.g. ^)
	 * There is a function called pow in the Math library, but
	 * if we're talking about integers often the easier way is to
	 * just multiply several times
	 */
	public static void printCubed(double numberToCube) {
		double cube = numberToCube * numberToCube * numberToCube;
        System.out.println(cube);
	}

	/**
	 * 
	 * If the input number is divisible by 3, prints "divisible by 3!"
	 * Otherwise prints "NOT divisible by 3"
	 */
	public static void printDivisibleBy3(int number) {
		if(number % 3 == 0) {
			System.out.println(number + " is divisible by 3");
		} else {
			System.out.println(number + " is NOT divisible by 3");
		}
	}
	
	/**
	 * 
	 * Takes a number and a guess for what it's cube root ought to be.
	 * If the guess is too high, print "Lower"
	 * if the guess is too low, print "Higher"
	 * If the guess is just right, print "Perfect"
	 * 
	 * So guessCubeRoot(27,2.5) would print "Higher"
	 *    guessCubeRoot(27,3.3) would print "Lower"
	 *    guessCubeRoot(27,3) would print "Perfect"
	 * 
	 * NOTE: we could use functions in Math to compute the cube root directly, 
	 * but this is not needed!  
	 * Instead, we compute the cube of the guess and then
	 * see how that compares to the real value. 
	 */
	public static void guessCubeRoot(double number, double guess) {
        double guessCubed = guess * guess * guess;
        if (guessCubed > number) {
            System.out.println("Lower");
        } else if (guessCubed < number) {
            System.out.println("Higher");
        } else {
            System.out.println("Perfect");
        }
	}
	
}
