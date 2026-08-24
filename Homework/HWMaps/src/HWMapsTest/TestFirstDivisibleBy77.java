package HWMapsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWMaps.HWMaps;
import HWMaps.RunAllTests;

public class TestFirstDivisibleBy77 {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFirstDivisibleBy77.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testFirstDivisibleBy77N01() {
		numberOfTests++;
		int[] a = { 88, 24, 154, 77 };
		assertEquals(154, HWMaps.firstDivisibleBy77(a));
		testsPassed++;
	}

	@Test
	public void testFirstDivisibleBy77N02() {
		numberOfTests++;
		int[] b = { 5929, 280 };
		assertEquals(5929, HWMaps.firstDivisibleBy77(b));
		testsPassed++;
	}

	@Test
	public void testFirstDivisibleBy77N03() {
		numberOfTests++;
		int[] c = { 1, 2, 3, 4 };
		assertEquals(-1, HWMaps.firstDivisibleBy77(c));
		testsPassed++;
	}

	@Test
	public void testFirstDivisibleBy77N04() {
		numberOfTests++;
		int[] d = {};
		assertEquals(-1, HWMaps.firstDivisibleBy77(d));
		testsPassed++;
	}

}
