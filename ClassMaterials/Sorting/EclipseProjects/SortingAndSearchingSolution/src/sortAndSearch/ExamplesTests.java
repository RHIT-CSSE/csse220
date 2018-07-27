package sortAndSearch;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This tests all the sorting and searching methods in the package.
 * 
 * @author Curt Clifton.
 */
public class ExamplesTests {
	private Integer[] empty = new Integer[0];
	private Integer[] one = new Integer[1];
	private Integer[] two = new Integer[2];
	private Integer[] ten = new Integer[10];
	private Integer[] tenReversed = new Integer[10];
	private Integer[] tenSorted = new Integer[10];

	/**
	 * Sets up some sample arrays for testing.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.one[0] = 0;

		this.two[0] = 3;
		this.two[1] = 1;

		int[] ten = { 62, 31, 13, 27, 29, 41, 52, 54, 25, 86 };
		for (int i = 0; i < ten.length; i++) {
			this.ten[i] = ten[i];
		}

		Arrays.sort(ten);
		for (int i = 0; i < ten.length; i++) {
			this.tenSorted[i] = ten[i];
			this.tenReversed[ten.length - i - 1] = ten[i];
		}
	}

	/**
	 * Tests selection sort.
	 */
	@Test
	public void testSelectionSort() {
		SelectionSort.selectionSort(this.empty);
		assertIsSorted(this.empty);

		SelectionSort.selectionSort(this.one);
		assertIsSorted(this.one);

		SelectionSort.selectionSort(this.two);
		assertIsSorted(this.two);

		SelectionSort.selectionSort(this.ten);
		assertIsSorted(this.ten);

		SelectionSort.selectionSort(this.tenReversed);
		assertIsSorted(this.tenReversed);

		SelectionSort.selectionSort(this.tenSorted);
		assertIsSorted(this.tenSorted);
	}

	/**
	 * Tests insertion sort.
	 */
	@Test
	public void testInsertSort() {
		InsertionSort.insertionSort(this.empty);
		assertIsSorted(this.empty);

		InsertionSort.insertionSort(this.one);
		assertIsSorted(this.one);

		InsertionSort.insertionSort(this.two);
		assertIsSorted(this.two);

		InsertionSort.insertionSort(this.ten);
		assertIsSorted(this.ten);

		InsertionSort.insertionSort(this.tenReversed);
		assertIsSorted(this.tenReversed);

		InsertionSort.insertionSort(this.tenSorted);
		assertIsSorted(this.tenSorted);
	}

	/**
	 * Tests merge sort.
	 */
	@Test
	public void testMergeSort() {
		MergeSort.mergeSort(this.empty);
		assertIsSorted(this.empty);

		MergeSort.mergeSort(this.one);
		assertIsSorted(this.one);

		MergeSort.mergeSort(this.two);
		assertIsSorted(this.two);

		MergeSort.mergeSort(this.ten);
		assertIsSorted(this.ten);

		MergeSort.mergeSort(this.tenReversed);
		assertIsSorted(this.tenReversed);

		MergeSort.mergeSort(this.tenSorted);
		assertIsSorted(this.tenSorted);
	}

	/**
	 * Tests quicksort.
	 */
	@Test
	public void testQuicksort() {
		Quicksort.quicksort(this.empty);
		assertIsSorted(this.empty);

		Quicksort.quicksort(this.one);
		assertIsSorted(this.one);

		Quicksort.quicksort(this.two);
		assertIsSorted(this.two);

		Quicksort.quicksort(this.ten);
		assertIsSorted(this.ten);

		Quicksort.quicksort(this.tenReversed);
		assertIsSorted(this.tenReversed);

		Quicksort.quicksort(this.tenSorted);
		assertIsSorted(this.tenSorted);
	}

	/**
	 * Tests binary search.
	 */
	@Test
	public void testBinarySearch() {
		assertEquals(0, BinarySearch.binarySearch(this.empty, 1));

		assertEquals(0, BinarySearch.binarySearch(this.one, 0));
		assertEquals(1, BinarySearch.binarySearch(this.one, 1));
		assertEquals(0, BinarySearch.binarySearch(this.one, -1));

		Arrays.sort(this.two);
		assertEquals(0, BinarySearch.binarySearch(this.two, 1));
		assertEquals(1, BinarySearch.binarySearch(this.two, 2));
		assertEquals(1, BinarySearch.binarySearch(this.two, 3));

		assertEquals(1, BinarySearch.binarySearch(this.tenSorted, 25));
		assertEquals(2, BinarySearch.binarySearch(this.tenSorted, 26));
		assertEquals(9, BinarySearch.binarySearch(this.tenSorted, 86));
		assertEquals(10, BinarySearch.binarySearch(this.tenSorted, 100));
	}

	/**
	 * Tests whether the given array is sorted.
	 * 
	 * @param <E>
	 *            the type of elements in the array
	 * @param array
	 */
	static <E extends Comparable<E>> void assertIsSorted(E[] array) {
		if (array.length == 0)
			return;
		E previous = array[0];
		for (int i = 1; i < array.length; i++) {
			E next = array[i];
			if (previous.compareTo(next) > 0) {
				throw new AssertionError("Unsorted array");
			}
			previous = next;
		}
		// No out-of-order items, so we're good.
		return;
	}
}
