package HWSmallProblemsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.HWSmallProblems;
import HWSmallProblems.RunAllTests;

public class TestSecondDigit5 {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests, TestSecondDigit5.class.getSimpleName());
	} // oneTimeTearDown

	@Test
	public void testSecondDigit5N01() {
		numberOfTests++;
		assertTrue(HWSmallProblems.secondDigit5(50));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N02() {
		numberOfTests++;
		assertTrue(HWSmallProblems.secondDigit5(55));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N03() {
		numberOfTests++;
		assertTrue(HWSmallProblems.secondDigit5(450));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N04() {
		numberOfTests++;
		assertTrue(HWSmallProblems.secondDigit5(11251));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N05() {
		numberOfTests++;
		assertTrue(HWSmallProblems.secondDigit5(555555));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N06() {
		numberOfTests++;
		assertFalse(HWSmallProblems.secondDigit5(555505));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N07() {
		numberOfTests++;
		assertFalse(HWSmallProblems.secondDigit5(5));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N08() {
		numberOfTests++;
		assertFalse(HWSmallProblems.secondDigit5(230));
		testsPassed++;
	}
}
