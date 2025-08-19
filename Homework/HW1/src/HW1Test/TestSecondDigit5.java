package HW1Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW1.HW1;
import HW1.RunAllTests;

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
		assertTrue(HW1.secondDigit5(50));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N02() {
		numberOfTests++;
		assertTrue(HW1.secondDigit5(55));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N03() {
		numberOfTests++;
		assertTrue(HW1.secondDigit5(450));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N04() {
		numberOfTests++;
		assertTrue(HW1.secondDigit5(11251));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N05() {
		numberOfTests++;
		assertTrue(HW1.secondDigit5(555555));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N06() {
		numberOfTests++;
		assertFalse(HW1.secondDigit5(555505));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N07() {
		numberOfTests++;
		assertFalse(HW1.secondDigit5(5));
		testsPassed++;
	}

	@Test
	public void testSecondDigit5N08() {
		numberOfTests++;
		assertFalse(HW1.secondDigit5(230));
		testsPassed++;
	}
}
