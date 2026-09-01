package sortAndSearch;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * This class demonstrates the merge sort algorithm.
 * 
 * @author Curt Clifton
 */
public class MergeSort {

	private static final int LARGEST_RANDOM_INTEGER = 1000; // Integer.MAX_VALUE;

	/**
	 * Starts the example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		System.out.println("Testing merge sort:");
		int n = 80000;

		Integer[] array = randomArray(n);
		StopWatch timer = new StopWatch();

		timer.start();
		mergeSort(array);
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
	public static <E extends Comparable<E>> void mergeSort(E[] array) {
		final int n = array.length;
		if (n <= 1)
			return;

		// Splits array
		E[] lower = createComparableArray(n / 2);
		E[] upper = createComparableArray(n - (n / 2));
		int arrayIndex = 0;
		for (int i = 0; i < lower.length; i++) {
			lower[i] = array[arrayIndex];
			arrayIndex++;
		}
		for (int i = 0; i < upper.length; i++) {
			upper[i] = array[arrayIndex];
			arrayIndex++;
		}

		// Recursively sorts two halves
		mergeSort(lower);
		mergeSort(upper);

		/*
		 * Combines halves but taking smallest value remaining in the splits and
		 * adding it to the result.
		 */
		int lowerIndex = 0;
		int upperIndex = 0;
		arrayIndex = 0;
		while (lowerIndex < lower.length && upperIndex < upper.length) {
			if (lower[lowerIndex].compareTo(upper[upperIndex]) <= 0) {
				array[arrayIndex] = lower[lowerIndex];
				arrayIndex++;
				lowerIndex++;
			} else {
				array[arrayIndex] = upper[upperIndex];
				arrayIndex++;
				upperIndex++;
			}
		}
		/*
		 * Either lower or upper must have some values remaining, so move those
		 * to the result also. Can just use for-loops since they won't execute
		 * if the remainder is empty.
		 */
		for (int i = lowerIndex; i < lower.length; i++) {
			array[arrayIndex] = lower[i];
			arrayIndex++;
		}
		for (int i = upperIndex; i < upper.length; i++) {
			array[arrayIndex] = upper[i];
			arrayIndex++;
		}
	}

	/**
	 * This helper method creates a new array of comparable elements of type E.
	 * 
	 * Java uses something called "type erasure"--basically forgetting about
	 * generic type parameters like E at runtime to save space. Because of this,
	 * the cast in this method causes a warning. By burying this warning in a
	 * helper method we can use the SuppressWarnings annotation to hide it
	 * without worrying about hiding any other warnings.
	 * 
	 * @param <E>
	 *            the type of elements in the arrays, which must be comparable
	 *            to each other
	 * 
	 * @param len
	 * @return a new array of the given length
	 */
	@SuppressWarnings("unchecked")
	private static <E extends Comparable<E>> E[] createComparableArray(int len) {
		return (E[]) new Comparable[len];
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

// Question on runtime:
// What is the best and worst case running time of this algorithm? Provide
// formulae for the number of times compareTo() gets called and perform the
// big-Oh analysis of the running times.
//
// compareTo() is only called when two sorted halves are being merged.
// The worst case occurs when the largest two elements are each in a different
// half of the array. This is (n-1) times.
// When merging to obtain two arrays of size n/2, it takes 2*(n/2 - 1) or n-2
// comparisons.
// Merging 4 arrays of size n/4 takes 4*(n/4 - 1) = n - 4 comparisons.
// Merging 2^i arrays of size n / 2^i takes n - 2^i comparisons.
// This continues for m = log(n) rounds, since the number of times that you can
// divide n by 2 until you reach 1 is the solution to n/(2^m) = 1, or m =
// log_2(n).
// So the sum (i = 1, i < m, n - 2^i) ~ nlogn - n = O(nlogn)
//
// The best case is when all the array elements in one half are less than all
// the elements in the other half. Then it only executes n/2 comparisons.

// Merging to find two arrays of size n/2 takes 2*(n/4) = n/2.
// Merging 4 arrays of size n/4 takes 4*(n/8) = n/2.
// The depth of the recursion is still log n, so the total runtime is 
// n/2 * log n = 0.5 nlogn = O(nlogn)
