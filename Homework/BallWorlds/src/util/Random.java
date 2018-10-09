package util;

/**
 * This utility class provides some useful functions for generating random
 * numbers.
 * 
 * @author Curt Clifton. Created Jan 23, 2011.
 */
public abstract class Random {

	/**
	 * Returns a random integer in the range [min, max)
	 * 
	 * @param min
	 *            result will be at least this large
	 * @param max
	 *            result will be smaller than this
	 * @return random integer
	 */
	public static int randRange(int min, int max) {
		return (int) randInterval(min, max);
	}

	/**
	 * Returns a random double in the range [min, max)
	 * 
	 * @param min
	 *            result will be at least this large
	 * @param max
	 *            result will be smaller than this
	 * @return random double
	 */
	public static double randInterval(double min, double max) {
		return Math.random() * (max - min) + min;
	}

}
