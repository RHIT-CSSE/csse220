package mapAnd2DArrayTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import mapAnd2DArray.RunAllTests;
import mapAnd2DArray.MapAnd2DArrayProblems;

public class TestBetweenTheZeros {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBetweenTheZeros.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBetweenTheZerosN01() {
		numberOfTests++;
		int[][] input = { { 1, 2, 3, 4, 5 }, { 6, 7, 0, 1, 0 }, { 8, 9, 1, 2, 3 } };

		assertEquals(1, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN01

	@Test
	public void testBetweenTheZerosN02() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 0, 5 }, { 6, 7, 8, 1, 0 }, { 8, 9, 1, 2, 3 } };
		assertEquals(27, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN0

	@Test
	public void testBetweenTheZerosN03() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 2, 3, 4, 5 }, { 6, 7, 8, 1, 2 }, { 8, 9, 1, 2, 0 } };

		assertEquals(58, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN03

	@Test
	public void testBetweenTheZerosN04() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 1, 2 }, { 8, 9, 1, 0, 0 } };

		assertEquals(0, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN04

	@Test
	public void testBetweenTheZerosN05() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 2, 3, 4, 0 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(9, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN05

	@Test
	public void testBetweenTheZerosN06() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 0, 7, 8, 9, 0 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(24, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN06

	@Test
	public void testBetweenTheZerosN07() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(44, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN07

	@Test
	public void testBetweenTheZerosN08() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 0, 12, 13, 14, 0 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(39, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN08

	@Test
	public void testBetweenTheZerosN09() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 0 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 0 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(90, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN09

	@Test
	public void testBetweenTheZerosN10() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 0 }, { 6, 7, 8, 9, 10 }, { 0, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(40, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN10

	@Test
	public void testBetweenTheZerosN11() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 0, 17, 18, 19, 0 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(54, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN11

	@Test
	public void testBetweenTheZerosN12() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 0, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 0 } };

		assertEquals(164, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN12

	@Test
	public void testBetweenTheZerosN13() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 0 } };

		assertEquals(299, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN13

	@Test
	public void testBetweenTheZerosN14() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 2, 0, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(2, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN14

	@Test
	public void testBetweenTheZerosN15() {
		numberOfTests++;

		int[][] input = new int[][] { { 1, 2, 0, 4, 0 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(4, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN15

	@Test
	public void testBetweenTheZerosN16() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 0, 24, 0 } };

		assertEquals(24, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN16

	@Test
	public void testBetweenTheZerosN17() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 0, 0 } };

		assertEquals(0, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN17

	@Test
	public void testBetweenTheZerosN18() {
		numberOfTests++;
		int[][] input = new int[][] { { 0, 0, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(0, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN18

	@Test
	public void testBetweenTheZerosN19() {
		numberOfTests++;
		int[][] input = new int[][] { { 1, 2, 3, 4, 0 }, { 0, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		assertEquals(0, MapAnd2DArrayProblems.betweenTheZeros(input));
		testsPassed++;
	} // testBetweenTheZerosN19

}
