package HWSmallProblemsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.HWSmallProblems;
import HWSmallProblems.RunAllTests;

public class TestPowersOfTwo {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests, TestPowersOfTwo.class.getSimpleName());
	} // oneTimeTearDown

	@Test
	public void testPowersOfTwoN01() {
		numberOfTests++;
		int[] a = { 1, 2, 4, 8 };
		assertArrayEquals(a, HWSmallProblems.powersOfTwo(3));
		testsPassed++;
	}

	@Test
	public void testPowersOfTwoN02() {
		numberOfTests++;
		int[] b = { 1, 2, 4, 8, 16, 32, 64, 128 };
		assertArrayEquals(b, HWSmallProblems.powersOfTwo(7));
		testsPassed++;
	}

	@Test
	public void testPowersOfTwoN03() {
		numberOfTests++;
		int[] c = { 1 };
		assertArrayEquals(c, HWSmallProblems.powersOfTwo(0));
		testsPassed++;
	}

	@Test
	public void testPowersOfTwoN04() {
		numberOfTests++;
		int[] d = {};
		assertArrayEquals(d, HWSmallProblems.powersOfTwo(-200));
		testsPassed++;
	}
}
