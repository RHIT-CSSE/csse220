package smallProblems;

import java.util.ArrayList;

public class SmallProblems {
	
	/**
	 * For this problem, you are given an ArrayList of integers. In this list,
	 * you should remove all the numbers that are even.  There is nothing to return
	 * if you remove all the correct values from list.
	 * 
	 * If the list does not contain any even integers, do nothing.
	 * 
	 * HINT: Don't use an enhanced for loop for this one and be careful with several
	 * even numbers in a row...
	 * 
	 * HINT: Remember that when you remove an item from a list, the item that comes
	 * after takes it's place at that index.  With an array [2, 3], if you remove
	 * the 2 at index 0, the number 3 is now at index 0.
	 * 
	 * BIG HINT: This will definitely work simpler if you iterate through the list
	 * backwards, starting at the last element and work your way to the first... that
	 * solves a LOT of problems the other two hints above are alluding to!
	 * 
	 * Example:
	 * input = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 * when method finishes, input should be [1, 3, 5, 7, 9]
	 * 
	 * @param list the list of integers from which to remove all the even values
	 */
	public static void removeEvens(ArrayList<Integer> list) {
		return;
	}

	/**
	 * For this problem, you are given two strings named "first and "second".
	 * You are to return the first character that is in first that is NOT in
	 * second.  If there is nothing in first that is not in second, return
	 * the number 0 as a character, as in - return '0';
	 * 
	 * The Strings are NOT guaranteed to be the same length, but they will both
	 * have at least one character.
	 * 
	 * HINT:  You MAY or may not need this, but if you have a character named
	 * currentChar and need a String instead, you can say - "" + currentChar
	 * 
	 * Examples:
	 * 1)
	 * first = "abcd"
	 * second = "abcf"
	 * return 'd'
	 * 
	 * 2)
	 * first = "hello"
	 * second = "help"
	 * return 'o'
	 * 
	 * 3)
	 * first = "bcd"
	 * second = "abcd"
	 * return '0'
	 * 
	 * 4)
	 * first = "abcd"
	 * second = "efgh"
	 * return 'a'
	 * 
	 * 5)
	 * first = "hello"
	 * second = "hello"
	 * return '0'
	 * 
	 * 6)
	 * first = "abcdef"
	 * second = "abc"
	 * return 'd'
	 * 
	 * 
	 * @param first - The first String
	 * @param second - The second String
	 * @return the first character in first that is NOT in second
	 */
	public static char firstDiff(String first, String second) {
		return '0';
	}
	
	
	/**
	 * For this problem you are given an array of integers called input.  You are 
	 * to return an ArrayList of all the integers that appear in the array 3 or
	 * more times.  Regardless of how many times the value appears, you should 
	 * only include each value once in the ArrayList you return.  If you place the
	 * same value in the ArrayLost more than once, it will fail the tests.
	 * 
	 * If no values in the array appear 3 or more times, return an empty ArrayList.
	 * 
	 * HINT: The ArrayList method from the API called "contains" may help greatly
	 * in this problem...
	 * 
	 * Examples:
	 * 1) input = [1, 2, 3, 4, 1, 2, 3, 1, 2, 3]
	 * return [1, 2, 3]
	 * 
	 * 2) input = [1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3]
	 * return [1, 2]
	 * 
	 * 3) input = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
	 * return [1]
	 * 
	 * 4) input = [1, 2, 3, 4]
	 * return []
	 * 
	 * 5) input = [1, 1, 2, 2, 3, 3, 4, 4, 1, 4]
	 * return [1,4]
	 * 
	 * @param input - The array of integers
	 * @return an ArrayList containing the values that appear 3 or more times
	 */
	public static ArrayList<Integer> listOfMoreThanThree(int[] input) {
		return new ArrayList<Integer>();
	}
}
