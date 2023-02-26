package recursionPart2Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import recursionPart2.Part2Problems;

@RunWith(RunAllTestsTestRunnerPart2.class)

public class TestHighestSubsequenceSum {
	
	@Test
	public void testHighestSubsequenceSum01() {
		// edge cases
		int[] testInput = new int[] { -1, -2, 3, 4, 6, -2, -2 };
		assertEquals(13, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum01

	@Test
	public void testHighestSubsequenceSum02() {
		int[] testInput = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		assertEquals(10, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum02

	@Test
	public void testHighestSubsequenceSum03() {
		int[] testInput = new int[] { 1 };
		assertEquals(1, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum03

	@Test
	public void testHighestSubsequenceSum04() {
		int[] testInput = new int[] { -1, -2, 2, 5, 6, -1, 7, -3 };
		assertEquals(19, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum04

	@Test
	public void testHighestSubsequenceSum05() {
		int[] testInput = new int[] { -1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3 };
		assertEquals(15, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum05

	@Test
	public void testHighestSubsequenceSum06() {
		int[] testInput = new int[] { -1, -2, -3, -4, -10, 5, 6, -3, -7, -20, -2, -3 };
		assertEquals(11, Part2Problems.highestSubsequenceSum(testInput));
	} // testHighestSubsequenceSum06
	
//	@Test
//	public void testSum() {
//		int[] testInput = new int[] { -1, -2, -3, -4, -10, 5, 6, -3, -7, -20, -2, -3 };
//		int[] test = new int[] {1,2,3,4,5};
//		int[] test2 = new int[] {2,3,4};
//		int[] test3 = new int[] {2,3,0};
//
//		assertEquals(15, Part2Problems.sum(0,4, test));
//		assertEquals(9, Part2Problems.sum(0,test2.length-1,test2));
//		assertEquals(5, Part2Problems.sum(0,test3.length-1,test3));
//
//	} // testHighestSubsequenceSum06
		
	

} // end TestHighestSubsequenceSum
