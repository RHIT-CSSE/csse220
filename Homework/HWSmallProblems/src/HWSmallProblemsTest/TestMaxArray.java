package HWSmallProblemsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.HWSmallProblems;
import HWSmallProblems.RunAllTests;

public class TestMaxArray {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests, TestMaxArray.class.getSimpleName());
	} // oneTimeTearDown

	@Test
	public void testMaxArrayN01() {
		numberOfTests++;
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		assertArrayEquals(b, HWSmallProblems.maxArray(a, b));
		testsPassed++;
	}
	
	@Test
	public void testMaxArrayN02() {
		numberOfTests++;
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 1, 6 };
		int[] d = { 7, 5, 6 };
		assertArrayEquals(d, HWSmallProblems.maxArray(b, c));
		testsPassed++;
	}

}
