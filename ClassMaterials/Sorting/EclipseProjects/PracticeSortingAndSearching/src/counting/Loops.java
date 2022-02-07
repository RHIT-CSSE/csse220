package counting;

/**
 * This class provides several methods that take arrays as input. Your task is
 * to analyze the methods.
 * 
 * @author Curt Clifton
 */
public class Loops {
	private static final int LARGEST_RANDOM_INTEGER = Integer.MAX_VALUE;

	/**
	 * Runs the sample code.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		int n = 10;

		Integer[] array = randomArray(n);

		System.out.println(methodA(array));
		System.out.println(methodB(array));
		System.out.println(methodC(array));
		System.out.println(methodD(array));
		System.out.println(methodE(array));
	}

	private static <E extends Comparable<E>> E methodA(E[] array) {
		/*
		 * TODO Part 3.b.i: Here's an example of what your comments should look
		 * like:
		 */
		/*
		 * In the best case the array is accessed n + 1 times. Once before the
		 * loop and n times in the loop. In the best case the comparison always
		 * fails (i.e., the first element is the largest) so the array access
		 * inside the "if" statement never happens.
		 */
		/*
		 * In the worst case the array is accessed 2*n times. Once before the
		 * loop. n times in the if statement, which is called n times. In the
		 * worst case (which is when the array is sorted), the comparison
		 * succeeds every time except the first -- it must fail the first time
		 * since array[0].compareTo(array[0]) == 0 -- so the array access inside
		 * the "if" statement happens n-1 times. The total is 1 + (n-1) + n =
		 * 2*n.
		 */
		int n = array.length;
		int count = 0;
		if (n == 0)
			return null;
		E result = array[0];
		for (int i = 0; i < n; i++) {
			count++;
			if (result.compareTo(array[i]) < 0) {
				result = array[i];
			}
		}
		return result;
	}

	private static <E extends Comparable<E>> E methodB(E[] array) {
		/*
		 * TODO Part 3.b.ii: Add comments giving best and worst cases:
		 */
		int n = array.length;
		int count = 0;
		if (n == 0)
			return null;
		E result = array[0];
		for (int i = 0; i < n; i++) {
			count++;
			if (result.compareTo(array[i]) >= 0) {
				result = array[i];
			}
		}
		return result;
	}

	private static <E extends Comparable<E>> int methodC(E[] array) {
		/*
		 * TODO Part 3.b.iii: Add comments giving best and worst cases:
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				count++;
				if (array[j].compareTo(array[i]) > 0) {
					sum++;
				}
			}
		}
		return sum;
	}

	private static <E extends Comparable<E>> int methodD(E[] array) {
		/*
		 * TODO Part 3.b.iv: Add comments giving best and worst cases:
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				count++;
				if (array[j].compareTo(array[i]) > 0) {
					sum++;
				}
			}
		}
		return sum;
	}

	private static <E extends Comparable<E>> int methodE(E[] array) {
		/*
		 * TODO Part 3.b.v: Add comments giving best and worst cases:
		 */
		int n = array.length;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				count++;
				if (array[j].compareTo(array[i]) > 0) {
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
	private static Integer[] randomArray(int n) {
		Integer[] result = new Integer[n];
		for (int i = 0; i < n; i++) {
			result[i] = Integer
					.valueOf((int) (Math.random() * LARGEST_RANDOM_INTEGER));
		}
		return result;
	}

}
