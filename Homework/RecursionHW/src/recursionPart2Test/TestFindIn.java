package recursionPart2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart2.Part2Problems;
import recursionPart2.RunAllTestsPart2;

public class TestFindIn {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFindIn.class.getSimpleName();
		RunAllTestsPart2.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// Test: findIn Part A
	// --------------------------------------------

	@Test
	public void testFindInA01() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 1, 2, 3 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA01

	@Test
	public void testFindInA02() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 2, 3, 4 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA02

	@Test
	public void testFindInA03() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 3, 4, 5 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA03

	@Test
	public void testFindInA04() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 5, 6, 7 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA04

	@Test
	public void testFindInA05() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 6, 7, 8 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA05

	@Test
	public void testFindInA06() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 7, 8, 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA06

	@Test
	public void testFindInA07() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 7, 8, 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInA07

	// --------------------------------------------
	// Test: findIn Part b
	// --------------------------------------------

	@Test
	public void testFindInB01() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 1, 3, 5 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInB01

	@Test
	public void testFindInB02() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 1, 5, 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInB02

	@Test
	public void testFindInB03() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 7, 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInB03

	@Test
	public void testFindInB04() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 5, 7, 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInB04

	// --------------------------------------------
	// Test: findIn Part C
	// --------------------------------------------

	@Test
	public void testFindInC01() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 10, 20, 30 };
		numberOfTests++;
		assertFalse(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInC01

	@Test
	public void testFindInC02() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 9, 5, 1 };
		numberOfTests++;
		assertFalse(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInC02

	@Test
	public void testFindInC03() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 8, 9, 10 };
		numberOfTests++;
		assertFalse(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInC03

	// --------------------------------------------
	// Test: findIn Part D
	// --------------------------------------------

	@Test
	public void testFindInD01() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 1 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInD01

	@Test
	public void testFindInD02() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 6 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInD02

	@Test
	public void testFindInD03() {
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] toFind = new int[] { 9 };
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInD03

	// --------------------------------------------
	// Test: findIn Part E
	// --------------------------------------------

	@Test
	public void testFindInE01() {
		final int maxSize = 100;
		int[] input = new int[maxSize];
		int[] toFind = new int[maxSize];

		for (int i = 0; i < maxSize; i++) {
			input[i] = i;
			toFind[i] = i;
		} // end for
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInE01

	// --------------------------------------------
	// Test: findIn Part F
	// --------------------------------------------

	@Test
	public void testFindInF01() {
		final int inputMaxSize = 100;
		final int toFindMaxSize = 5;
		int[] input = new int[inputMaxSize];
		int[] toFind = new int[toFindMaxSize];

		for (int i = 0; i < inputMaxSize; i++) {
			input[i] = i;
		} // end for

		for (int i = 0, index = 0; i < 100; i++) {
			if ((i % 9) == 0)
				toFind[index++] = i;
			if (index >= toFindMaxSize)
				break;
		} // end for
		numberOfTests++;
		assertTrue(Part2Problems.findIn(input, toFind));
		testsPassed++;
	} // testFindInF01

	// --------------------------------------------
	// Test: findIn Part G
	// --------------------------------------------

	@Test
	public void testFindInG01() {
		final int inputMaxSize = 100;
		final int toFindMaxSize = 5;
		final int tempMaxSize = 6;

		int[] input = new int[inputMaxSize];
		int[] toFind = new int[toFindMaxSize];
		int[] temp = new int[tempMaxSize];

		for (int i = 0; i < inputMaxSize; i++) {
			input[i] = i;
		} // end for

		for (int i = 0, index = 0; i < inputMaxSize; i++) {
			if ((i % 9) == 0)
				toFind[index++] = i;
			if (index >= 5)
				break;
		} // end for

		for (int i = 0; i < toFindMaxSize; i++) {
			temp[i] = toFind[i];
		} // end for
		temp[(tempMaxSize - 1)] = 10000;
		numberOfTests++;
		assertFalse(Part2Problems.findIn(input, temp));
		testsPassed++;
	} // testFindInG01

} // end TestFindIn
