package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplePalindromeTest {

	@Test
	public void testIsPalindromeString() {
		assertTrue(SimplePalindrome.isPalindrome("aba"));
		assertTrue(SimplePalindrome.isPalindrome("xyyx"));
		assertTrue(SimplePalindrome.isPalindrome(""));
		assertTrue(SimplePalindrome.isPalindrome("a"));
		assertFalse(SimplePalindrome.isPalindrome("ab"));
		assertFalse(SimplePalindrome.isPalindrome("abbbbz"));
		assertFalse(SimplePalindrome.isPalindrome("abbQbbz"));
	}

	@Test
	public void testIsPalindromeIntArray() {
		int[] test1 = {1,2,1};
		int[] test2 = {1,2,3};
		int[] test3 = {1,2,2,1};
		int[] test4 = {1,2,1,2};
		assertTrue(SimplePalindrome.isPalindromeIntArray(test1));
		assertTrue(SimplePalindrome.isPalindromeIntArray(test3));
		assertFalse(SimplePalindrome.isPalindromeIntArray(test2));
		assertFalse(SimplePalindrome.isPalindromeIntArray(test4));
		
	}

}
