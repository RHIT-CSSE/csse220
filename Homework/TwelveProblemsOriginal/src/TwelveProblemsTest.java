import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TwelveProblemsTest {

	@Test
	public void testDistanceFromOrigin() {
		assertEquals(1, TwelveProblems.distanceFromOrigin(-1, 0), .001);
		assertEquals(108.894, TwelveProblems.distanceFromOrigin(77, 77), .001);
		assertEquals(5, TwelveProblems.distanceFromOrigin(-3, -4), .001);
		assertEquals(11.1803, TwelveProblems.distanceFromOrigin(5, -10), .001);
	}

	@Test
	public void testSecondDigit5() {
		assertTrue(TwelveProblems.secondDigit5(50));
		assertTrue(TwelveProblems.secondDigit5(55));
		assertTrue(TwelveProblems.secondDigit5(450));
		assertTrue(TwelveProblems.secondDigit5(11251));
		assertTrue(TwelveProblems.secondDigit5(555555));
		assertFalse(TwelveProblems.secondDigit5(555505));
		assertFalse(TwelveProblems.secondDigit5(5));
		assertFalse(TwelveProblems.secondDigit5(230));
	}

	@Test
	public void testEndsWithUpperCaseLetter() {
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("doG"));
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("dog"));
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("HELLO"));
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("hello"));
		assertFalse(TwelveProblems.endsWithUpperCaseLetter(""));

	}

	@Test
	public void testPower() {
		assertEquals(8, TwelveProblems.pow(2, 3), 0.000001);
		assertEquals(1, TwelveProblems.pow(1, 100), 0.000001);
		assertEquals(-27, TwelveProblems.pow(-3, 3), 0.000001);
		assertEquals(5 * 5 * 5 * 5, TwelveProblems.pow(5, 4), 0.000001);
		assertEquals(0.0016, TwelveProblems.pow(5, -4), 0.000001);
		assertEquals(1, TwelveProblems.pow(100, 0), 0.000001);
		assertEquals(1.0 / (9 * 9), TwelveProblems.pow(9, -2), 0.000001);
	}

	@Test
	public void testFirstDifference() {
		assertEquals(1, TwelveProblems.firstDifference("abc", "axy"));
		assertEquals(2, TwelveProblems.firstDifference("abx", "aby"));
		assertEquals(0, TwelveProblems.firstDifference("foo", "bar"));
		assertEquals(-1, TwelveProblems.firstDifference("foo", "foo"));
		assertEquals(-1, TwelveProblems.firstDifference("", ""));
	}

	@Test
	public void testMostCommonCharacter() {
		assertEquals('a', TwelveProblems.mostCommonCharacter("aaab"));
		assertEquals('a', TwelveProblems.mostCommonCharacter("bbaaa"));
		assertEquals('c', TwelveProblems.mostCommonCharacter("abcbcdc"));
		assertEquals('a', TwelveProblems.mostCommonCharacter("a"));
		assertEquals('l', TwelveProblems.mostCommonCharacter("hello"));
	}

	@Test
	public void testFirstDivisbleBy77() {
		int[] a = { 88, 24, 154, 77 };
		int[] b = { 5929, 280 };
		int[] c = { 1, 2, 3, 4 };
		int[] d = {};
		assertEquals(154, TwelveProblems.firstDivisibleBy77(a));
		assertEquals(5929, TwelveProblems.firstDivisibleBy77(b));
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(c));
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(d));
	}

	@Test
	public void testPowersOfTwo() {
		int[] a = { 1, 2, 4, 8 };
		int[] b = { 1, 2, 4, 8, 16, 32, 64, 128 };
		int[] c = { 1 };
		int[] d = {};
		assertArrayEquals(a, TwelveProblems.powersOfTwo(3));
		assertArrayEquals(b, TwelveProblems.powersOfTwo(7));
		assertArrayEquals(c, TwelveProblems.powersOfTwo(0));
		assertArrayEquals(d, TwelveProblems.powersOfTwo(-200));
	}

	@Test
	public void testMaxArray() {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 1, 6 };
		int[] d = { 7, 5, 6 };

		assertArrayEquals(b, TwelveProblems.maxArray(a, b));
		assertArrayEquals(d, TwelveProblems.maxArray(b, c));
	}

	@Test
	public void testTimesOccur() {
		int[] a = {7,1,1,7,7,1,1};
		int[] b =  {1,1};
		int[] c = {1,1,1,3};
		int[] d = {1,3,4,1,2,1};
		int[] e = {4,7,2,1,8,4,7,2,0,8,4,7,2,1,8};
		int[] f = {4,7,2};
		int[] g = {4,7,2,1};
		int[] h = {4,7,2,1,8};
		assertEquals(1, TwelveProblems.timesOccur(f, h));
		assertEquals(2, TwelveProblems.timesOccur(b, a));
		assertEquals(2, TwelveProblems.timesOccur(b, c));
		assertEquals(0, TwelveProblems.timesOccur(b, d));
		assertEquals(0, TwelveProblems.timesOccur(c, d));
		assertEquals(3, TwelveProblems.timesOccur(f, e));
		assertEquals(2, TwelveProblems.timesOccur(g, e));
		assertEquals(2, TwelveProblems.timesOccur(h, e));
		assertEquals(0, TwelveProblems.timesOccur(h, a));
	}

	private ArrayList<String> toAL(String[] array) {
		ArrayList<String> output = new ArrayList<String>();
		for (String s : array) {
			output.add(s);
		}
		return output;
	}

	@Test
	public void testDoubleDouble() {
		String[] a = { "foo", "double" };
		String[] aSolution = { "foo", "double", "double" };
		String[] b = { "double", "foo", "double", "bar" };
		String[] bSolution = { "double", "double", "foo", "double", "double", "bar" };
		String[] c = {};
		String[] d = { "foo", "bar" };
		assertEquals(toAL(aSolution), TwelveProblems.doubleDouble(toAL(a)));
		assertEquals(toAL(bSolution), TwelveProblems.doubleDouble(toAL(b)));
		assertEquals(toAL(c), TwelveProblems.doubleDouble(toAL(c)));
		assertEquals(toAL(d), TwelveProblems.doubleDouble(toAL(d)));
	}

	@Test
	public void testThreeCharacterStrings() {
		String[] a = { "hel", "ell", "llo" };
		String[] b = { "foo" };
		String[] c = {};

		assertEquals(toAL(a), TwelveProblems.threeCharacterStrings("hello"));
		assertEquals(toAL(b), TwelveProblems.threeCharacterStrings("foo"));
		assertEquals(toAL(c), TwelveProblems.threeCharacterStrings("qq"));
	}

}
