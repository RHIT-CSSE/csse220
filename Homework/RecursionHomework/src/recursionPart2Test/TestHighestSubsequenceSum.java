package recursionPart2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart2.RunAllTests;
import recursionPart2.Part2Problems;

public class TestHighestSubsequenceSum {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestHighestSubsequenceSum.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// **************************************************************
	// Test: highestSubsequenceSum
	// **************************************************************

	@Test
	public void testHighestSubsequenceSum01() {
		// edge cases
		int[] testInput = new int[] { -1, -2, 3, 4, 6, -2, -2 };
		numberOfTests++;
		assertEquals(13, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum01

	@Test
	public void testHighestSubsequenceSum02() {
		int[] testInput = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		numberOfTests++;
		assertEquals(10, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum02

	@Test
	public void testHighestSubsequenceSum03() {
		int[] testInput = new int[] { 1 };
		numberOfTests++;
		assertEquals(1, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum03

	@Test
	public void testHighestSubsequenceSum04() {
		int[] testInput = new int[] { -1, -2, 2, 5, 6, -1, 7, -3 };
		numberOfTests++;
		assertEquals(19, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum04

	@Test
	public void testHighestSubsequenceSum05() {
		int[] testInput = new int[] { -1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3 };
		numberOfTests++;
		assertEquals(15, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum05

	@Test
	public void testHighestSubsequenceSum06() {
		int[] testInput = new int[] { -1, -2, -3, -4, -10, 5, 6, -3, -7, -20, -2, -3 };
		numberOfTests++;
		assertEquals(11, Part2Problems.highestSubsequenceSum(testInput));
		testsPassed++;
	} // testHighestSubsequenceSum06

} // end TestHighestSubsequenceSum
