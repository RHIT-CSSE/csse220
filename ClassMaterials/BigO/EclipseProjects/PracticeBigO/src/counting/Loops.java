package counting;

import java.util.Random;

/**
 * This class provides several methods that take arrays as input. Your task is
 * to analyze the methods.
 * 
 * @author Curt Clifton 
 * Revised to remove generics by Jason Yoder
 */
public class Loops {
	private static final int LARGEST_RANDOM_INTEGER = Integer.MAX_VALUE;
	private static final int RANDOM_SEED = 220;

	/**
	 * Runs the sample code.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		int n = 10;

		int[] array = randomArray(n);

		System.out.println(methodA(array));
		System.out.println(methodB(array));
		System.out.println(methodC(array));
		System.out.println(methodD(array));
		System.out.println(methodE(array));
	}

	private static int methodA(int[] array) {
		/*
		 * TODO Part 1: Here's an example of what your comments should look
		 * like:
		 *
		 * Best case:
		 * In the best case the array is accessed n + 1 times. Once before the
		 * loop and n times in the loop. In the best case the comparison always
		 * fails (i.e., the first element is the largest) so the array access
		 * inside the "if" statement never happens.
		 *
		 * Worst case:
		 * In the worst case the array is accessed 2*n times. Once before the
		 * loop. n times in the if statement, which is called n times. In the
		 * worst case (which is when the array is sorted), the comparison
		 * succeeds every time except the first -- it must fail the first time
		 * since array[0] == array[0] -- so the array access inside
		 * the "if" statement happens n-1 times. The total is 1 + (n-1) + n =
		 * 2*n.
		 */
		int n = array.length;
		int count = 0;
		if (n == 0)
			return 0;
		Integer result = array[0];
		for (int i = 0; i < n; i++) {
			count++;
			if (result > array[i]) {
				result = array[i];
			}
		}
		return result;
	}

	private static int methodB(int[] array) {
		/*
		 * TODO Part 2: Add comments giving best and worst cases:
		 * 
		 * Best case:
		 * 
		 * 
		 * Worst case:
		 * 
		 * 
		 */
		int n = array.length;
		int count = 0;
		if (n == 0)
			return 0;
		int result = array[0];
		for (int i = 0; i < n; i++) {
			count++;
			if (result> array[i]) {
				result = array[i];
			}
		}
		return result;
	}

	private static int methodC(int[] array) {
		/*
		 * TODO Part 3: Add comments giving best and worst cases:
		 * 
		 * Best case:
		 * 
		 * 
		 * Worst case:
		 * 
		 * 
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				count++;
				if (array[j] > array[i] ) {
					sum++;
				}
			}
		}
		return sum;
	}

	private static  int methodD(int[] array) {
		/*
		 * TODO Part 4: Add comments giving best and worst cases:
		 * 
	     * Best case:
		 * 
		 * 
		 * Worst case:
		 * 
		 * 
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				count++;
				if (array[j] > array[i]) {
					sum++;
				}
			}
		}
		return sum;
	}

	private static  int methodE(int[] array) {
		/*
		 * TODO Part 5: Add comments giving best and worst cases:
		 * 
		 * Best case:
		 * 
		 * 
		 * Worst case:
		 * 
		 * 
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				count++;
				if (array[j] > array[i]) {
					sum++;
				}
			}
		}
		return sum;
	}

	/**
	 * @param n
	 * @return an array of size n filled with randomly generated numbers
	 */
	private static int[] randomArray(int n) {
		Random rand = new Random(RANDOM_SEED);
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = rand.nextInt(LARGEST_RANDOM_INTEGER);
		}
		return result;
	}

}
