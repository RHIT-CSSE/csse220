/**
 * This class provides some buggy methods that you can use to practice with the
 * debugger.
 * 
 * @author Curt Clifton, comments augmented by David Mutchler. Created September
 *         21, 2008. Modified December 15, 2009.
 */
public class WhackABug {

	/**
	 * Runs the buggy methods.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here.
	 */
	public static void main(String[] args) {
		// TODO: uncomment call to a buggy method, use debugger to find the
		// bug, repeat
		// hasABug1();
		// hasABug2();
		// hasABug3();
		// hasABug4();
	}

	/*
	 * Prints powers of 2 from 2^0 up to 2^9.
	 */
	private static void hasABug1() {
		// TODO: find the bug, add comment saying what it was, fix the bug
		System.out.println("Powers of two:");
		int base = 2;
		int exp = 0;
		int numberToPrint = 10;
		while (numberToPrint > 0) {
			int power = (int) Math.pow(base, exp);
			System.out.printf("%d ^ %d = %3d%n", base, exp, power);
			exp++;
			numberToPrint++;
		}
	}

	/*
	 * Prints cosines: cos(0), cos(30), cos(60), ... cos(360).
	 */
	private static void hasABug2() {
		// TODO: find the bug, add comment saying what it was, fix the bug
		final double STEP_SIZE_DEG = 30.0;
		final double STEP_SIZE = Math.toRadians(STEP_SIZE_DEG);
		System.out.printf("Values of cosine, every %.2f*pi radians:%n",
				STEP_SIZE / Math.PI);
		double angle = 0.0;
		while (angle <= Math.PI * 2.0) {
			double coef = angle / Math.PI;
			double value = Math.cos(angle);
			System.out.printf("cos(%4.2f*pi) = %4.2f%n", coef, value);
		}
	}

	/*
	 * Prints rounded and actual values of 0.0, 0.1, 0.2, 0.3, ... 1.0.
	 */
	private static void hasABug3() {
		System.out.println("Rounding errors when counting by tenths:");
		for (double d = 0.0; d != 1.0; d += 0.1) {
			System.out.printf("%1.1f is actually %s%n", d, Double.toString(d));
		}
	}

	/*
	 * Prints the characters, one per line, in the String "Rose".
	 */
	private static void hasABug4() {
		String msg = "Rose";
		for (int i = 0; i <= msg.length(); i++) {
			System.out.printf("Character %d: %c%n", i, msg.charAt(i));
		}
	}
}
