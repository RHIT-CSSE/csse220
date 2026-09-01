package sortAndSearch;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * This class demonstrates the binary search algorithm.
 * 
 * @author Curt Clifton
 */
public class BinarySearch {

	private static final int LARGEST_RANDOM_INTEGER = 1000; //Integer.MAX_VALUE;

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing binary search:");
		int n = 10;

		Integer[] array = randomArray(n);
		Arrays.sort(array);
		StopWatch timer = new StopWatch();

		Integer value = getRandomInteger();
		timer.start();
		int result = binarySearch(array, value);
		timer.stop();

		if (n < 30) {
			System.out.println(Arrays.toString(array));
		}
		System.out.println(MessageFormat.format(
				"{0} belongs at index {1}.", value, result));
		System.out.println(MessageFormat.format(
				"Searched {0} elements in {1} ms.", n, timer.getElapsedTime()));
	}

	/**
	 * Searches the given sorted array for the given value.
	 * 
	 * @param <E>
	 *            the type of elements in the array, which must be comparable to
	 *            elements of the same type
	 * @param array
	 *            the array to search, must be in sorted order
	 * @param value
	 *            the value to search for
	 * @return the index of value in array, or the index at which value should
	 *         be inserted if it doesn't appear in the array
	 */
	public static <E extends Comparable<E>> int binarySearch(E[] array, E value) {
		final int n = array.length;

		return bsHelper(array, value, 0, n);
	}

	/**
	 * Searches the given sorted array in the range [low, high) for the given
	 * value.
	 * 
	 * @param <E>
	 * @param array
	 *            the type of elements in the array, which must be comparable to
	 *            elements of the same type
	 * @param value
	 * @param low
	 * @param high
	 * @return the index of value in array, or the index at which value should
	 *         be inserted if it doesn't appear in the array
	 */
	private static <E extends Comparable<E>> int bsHelper(E[] array, E value,
			int low, int high) {
		if (low >= high) {
			return low;
		}
		int halfSize = (high - low) / 2;
		E middle = array[low + halfSize];
		final int compareResult = value.compareTo(middle);
		if (compareResult == 0) {
			return low + halfSize;
		} else if (compareResult < 0) {
			// search lower half
			return bsHelper(array, value, low, low + halfSize);
		} else {
			// search upper half
			return bsHelper(array, value, low + halfSize + 1, high);
		}
	}

	/**
	 * @param n
	 * @return an array of size n filled with randomly generated numbers
	 */
	private static Integer[] randomArray(int n) {
		Integer[] result = new Integer[n];
		for (int i = 0; i < n; i++) {
			result[i] = getRandomInteger();
		}
		return result;
	}

	private static Integer getRandomInteger() {
		return Integer.valueOf((int) (Math.random() * LARGEST_RANDOM_INTEGER));
	}

}
