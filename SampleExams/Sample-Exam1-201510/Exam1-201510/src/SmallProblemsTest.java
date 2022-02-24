import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * Tests the {@link SmallProblems} class.
 *
 * @author Aaron Wilkin.
 *         Created Sep 22, 2014.
 */
public class SmallProblemsTest {

	/**
	 * Tests the {@link SmallProblems#countNumberOfThreesInPrimeFactorization(int)} method.
	 *
	 */
	@Test
	public void testCountNumberOfThreesInPrimeFactorization() {
		assertEquals(1, SmallProblems.countNumberOfThreesInPrimeFactorization(6));
		assertEquals(2, SmallProblems.countNumberOfThreesInPrimeFactorization(9));
		assertEquals(2, SmallProblems.countNumberOfThreesInPrimeFactorization(36));
		assertEquals(4, SmallProblems.countNumberOfThreesInPrimeFactorization(3*3*3*3*5*22));
		assertEquals(0, SmallProblems.countNumberOfThreesInPrimeFactorization(13));
		assertEquals(0, SmallProblems.countNumberOfThreesInPrimeFactorization(0));
		assertEquals(0, SmallProblems.countNumberOfThreesInPrimeFactorization(1));
		
	}

	
	/**
	 * Tests the {@link SmallProblems#numberOfYs(String)} method.
	 *
	 */
	@Test
	public void testNumberOfYs() {
		assertEquals(0, SmallProblems.numberOfYs("abc"));
		assertEquals(0, SmallProblems.numberOfYs(""));
		assertEquals(3, SmallProblems.numberOfYs("YYY"));
		assertEquals(2, SmallProblems.numberOfYs("yy"));
		assertEquals(2, SmallProblems.numberOfYs("Y is the letter to look for...but why"));
		assertEquals(20,SmallProblems.numberOfYs("YyYyYYyyYYyyYYYYyyyy"));
	}


	/**
	 * Tests the {@link SmallProblems#swapExtremes(int[], int[])} method.
	 *
	 */
	@Test
	public void testSwapExtremes() {
		int[] a = {1,2,3};
		int[] b = {-1,-2,-3};
		int[] ab = {-1,1};
		int[] c = {11,20,30,35};
		int[] d = {40,30,20,10};
		int[] cd = {11,40};
		int[] e = {0,0,0};
		int[] f = {0,0,0};
		int[] ef = {0,0};
		int[] g = {0};
		int[] h = {1};
		int[] gh = {0,1};
		int[] i = {8,6,9,7};
		int[] j = {3,4,5,2};
		int[] ij = {5,6};
		
		
		assertArrayEquals(ab, SmallProblems.swapExtremes(a, b));
		assertArrayEquals(new int[] {-1,2,3}, a);
		assertArrayEquals(new int[] {1,-2,-3}, b);
		
		assertArrayEquals(cd, SmallProblems.swapExtremes(c, d));
		assertArrayEquals(new int[] {40,20,30,35}, c);
		assertArrayEquals(new int[] {11,30,20,10}, d);
		
		assertArrayEquals(ef, SmallProblems.swapExtremes(e, f));
		assertArrayEquals(new int[] {0,0,0}, e);
		assertArrayEquals(new int[] {0,0,0}, f);
		
		assertArrayEquals(gh, SmallProblems.swapExtremes(g, h));
		assertArrayEquals(new int[] {1}, g);
		assertArrayEquals(new int[] {0}, h);
		
		assertArrayEquals(gh, SmallProblems.swapExtremes(g, h));
		assertArrayEquals(new int[] {0}, g);
		assertArrayEquals(new int[] {1}, h);
		
		assertArrayEquals(ij, SmallProblems.swapExtremes(i, j));
		assertArrayEquals(new int[] {8,5,9,7}, i);
		assertArrayEquals(new int[] {3,4,6,2}, j);
	}

	/**
	 * Tests the {@link SmallProblems#repeatX(ArrayList)} method.
	 *
	 */
	@Test
	public void testrepeatX() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1); test.add(2);
		assertEquals("[1, 2, 2]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		test.add(1); test.add(2);test.add(3); test.add(5);
		assertEquals("[1, 2, 2, 3, 3, 3, 5, 5, 5, 5, 5]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		test.add(1); test.add(0); test.add(1); test.add(0);
		assertEquals("[1, 1]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		assertEquals("[]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		test.add(0); test.add(0); test.add(0); test.add(0);
		assertEquals("[]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		test.add(4); test.add(0); test.add(0); test.add(9);
		assertEquals("[4, 4, 4, 4, 9, 9, 9, 9, 9, 9, 9, 9, 9]", SmallProblems.repeatX(test).toString());
		test = new ArrayList<Integer>();
		test.add(11); test.add(0); test.add(1); test.add(0);
		assertEquals("[11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 1]", SmallProblems.repeatX(test).toString());
	}


	/**
	 * Tests the {@link SmallProblems#wordCountMost(String)} method.
	 *
	 */
	@Test
	public void testWordCountMost() {
		String test1 = "Hello";
		String test2 = "Hello there you person";
		String test3 = "Hi hello HeLlO hElLo there there there HELLO";
		String test4 = "Can there exist such a word that that word becomes the word to count";
		String test5 = "";
		assertEquals("hello", SmallProblems.wordCountMost(test1.split(" ")));
		assertEquals("hello", SmallProblems.wordCountMost(test2.split(" ")));
		assertEquals("hello", SmallProblems.wordCountMost(test3.split(" ")));
		assertEquals("word", SmallProblems.wordCountMost(test4.split(" ")));
		assertEquals("", SmallProblems.wordCountMost(test5.split(" ")));
	}

}
