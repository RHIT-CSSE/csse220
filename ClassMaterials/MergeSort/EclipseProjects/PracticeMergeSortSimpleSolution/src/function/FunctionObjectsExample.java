package function;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This class demonstrates the use of function objects for sorting.
 * 
 * @author Curt Clifton, Delvin Defoe updated on Sep 30, 2012.
 */
public class FunctionObjectsExample {
	private static final String[] csseFaculty = new String[] { "Laxer",
			"Stouder", "Boutell", "Rupakheti", "Chenoweth", "Wollowski",
			"Mellor", "Defoe", "Bohner", "Anderson", "Mutchler", "Mohan",
			"Taylor", "Hewner", "Wilkin", "Hays", "Stamm"};

	/**
	 * Uses Comparator function objects to perform a variety of sorts.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Prints CSSE faculty in alphabetical order
		Arrays.sort(csseFaculty);
		printArray("Alphabetical", csseFaculty);

		// TODO Complete the implementation of ReverseAlphabeticalComparator
		// to print faculty in reverse alphabetical order
		final Comparator<String> byReverseAlphabetical = new ReverseAlphabeticalComparator();
		Arrays.sort(csseFaculty, byReverseAlphabetical);
		printArray("Reverse alphabetical", csseFaculty);

		// TODO Complete the implementation of StringLengthComparator to
		// print faculty ordered by length of name, shortest name first
		final Comparator<String> byLength = new StringLengthComparator();
		Arrays.sort(csseFaculty, byLength);
		printArray("By name length", csseFaculty);

		// TODO Complete the implementation of MostVowelsComparator to print
		// faculty ordered by most vowels in name. You do this one from scratch using 
		// the previous ones as an example.

		final Comparator<String> byVowels = new MostVowelsComparator();
		Arrays.sort(csseFaculty, byVowels);
		printArray("By most vowels", csseFaculty);

		/*
		 * TODO Challenge problem: Can you complete the definition of the
		 * "Reverser" class so that it takes another comparator as an argument
		 * and can be used to reverse the order of a sort, like this:
		 * 
		 * Arrays.sort(csseFaculty, new Reverser(byLength));
		 */
		Arrays.sort(csseFaculty, new Reverser(byLength));
		printArray("By name length reverser", csseFaculty);
	}

	/**
	 * Prints the given array.
	 * 
	 * @param label
	 * @param array
	 */
	private static void printArray(String label, String[] array) {
		System.out.print(label);
		System.out.print(": ");
		String result = Arrays.toString(array);
		System.out.println(result);
	}
}
