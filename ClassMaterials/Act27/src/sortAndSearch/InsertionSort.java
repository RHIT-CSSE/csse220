package sortAndSearch;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * This class demonstrates the insertion sort algorithm.
 * 
 * @author Curt Clifton
 */
public class InsertionSort {

	private static final int LARGEST_RANDOM_INTEGER = 1000; //Integer.MAX_VALUE;

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing insertion sort:");
		int n = 10;

		Integer[] array = randomArray(n);
		StopWatch timer = new StopWatch();

		timer.start();
		insertionSort(array);
		timer.stop();

		if (n < 30) {
			System.out.println(Arrays.toString(array));
		}
		System.out.println(MessageFormat.format(
				"Sorted {0} elements in {1} ms.", n, timer.getElapsedTime()));
	}

	/**
	 * Sorts the given array in place.
	 * 
	 * @param <E>
	 *            the type of elements in the array, which must be comparable to
	 *            elements of the same type
	 * @param array
	 *            the array to be sorted
	 */
	public static <E extends Comparable<E>> void insertionSort(E[] array) {
		final int n = array.length;
		for (int nextIndex = 1; nextIndex < n; nextIndex++) {
			/*
			 * assert: elements from array[0] through array[nextIndex - 1] are
			 * sorted
			 */

			E next = array[nextIndex];

			/*
			 * Finds the location in the sorted part of the array at which to
			 * insert 'next'. Moves values up to make room as it searches.
			 */
			int insertIndex = nextIndex;
			while (insertIndex > 0
					&& array[insertIndex - 1].compareTo(next) > 0) {
				array[insertIndex] = array[insertIndex - 1];
				insertIndex--;
			}
			array[insertIndex] = next;

			/*
			 * assert: elements from array[0] through array[firstUnsortedIndex]
			 * are sorted
			 */
		}
	}

	/**
	 * @param n
	 * @return an array of size n filled with randomly generated numbers
	 */
	private static Integer[] randomArray(int n) {
		Integer[] result = new Integer[n];
		for (int i = 0; i < n; i++) {
			result[i] = Integer
					.valueOf((int) (Math.random() * LARGEST_RANDOM_INTEGER));
		}
		return result;
	}

}
