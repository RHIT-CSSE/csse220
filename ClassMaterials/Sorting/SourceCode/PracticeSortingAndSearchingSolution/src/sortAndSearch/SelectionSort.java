package sortAndSearch;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * This class demonstrates the selection sort algorithm.
 * 
 * @author Curt Clifton
 */
public class SelectionSort {

	private static final int LARGEST_RANDOM_INTEGER = 1000; //Integer.MAX_VALUE;

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing selection sort:");
		int n = 10;

		Integer[] array = randomArray(n);
		StopWatch timer = new StopWatch();

		timer.start();
		selectionSort(array);
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
	public static <E extends Comparable<E>> void selectionSort(E[] array) {
		final int n = array.length;
		for (int firstUnsortedIndex = 0; firstUnsortedIndex < n - 1; firstUnsortedIndex++) {
			/*
			 * assert: elements from array[0] through array[firstUnsortedIndex -
			 * 1] are sorted and all are smaller than any of the remaining
			 * elements
			 */

			// finds the smallest element in the rest of the array
			int indexOfSmallestRemaining = firstUnsortedIndex;
			E smallestRemaining = array[indexOfSmallestRemaining];
			for (int i = firstUnsortedIndex + 1; i < n; i++) {
				if (array[i].compareTo(smallestRemaining) < 0) {
					indexOfSmallestRemaining = i;
					smallestRemaining = array[i];
				}
			}

			// swaps the smallest remaining element into
			// array[firstUnsortedIndex]
			array[indexOfSmallestRemaining] = array[firstUnsortedIndex];
			array[firstUnsortedIndex] = smallestRemaining;

			/*
			 * assert: elements from array[0] through array[firstUnsortedIndex]
			 * are sorted and all are smaller than any of the remaining elements
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
