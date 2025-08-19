package HW3Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW3.HW3;
import HW3.RunAllTests;

public class TestTimesOccur {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestTimesOccur.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	@Test
	public void testTimesOccurN01() {
		numberOfTests++;
		int[] f = { 4, 7, 2 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(1, HW3.timesOccur(f, h));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN02() {
		numberOfTests++;
		int[] a = { 7, 1, 1, 7, 7, 1, 1 };
		int[] b = { 1, 1 };
		assertEquals(2, HW3.timesOccur(b, a));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN03() {
		numberOfTests++;
		int[] b = { 1, 1 };
		int[] c = { 1, 1, 1, 3 };
		assertEquals(2, HW3.timesOccur(b, c));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN04() {
		numberOfTests++;
		int[] b = { 1, 1 };
		int[] d = { 1, 3, 4, 1, 2, 1 };
		assertEquals(0, HW3.timesOccur(b, d));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN05() {
		numberOfTests++;
		int[] c = { 1, 1, 1, 3 };
		int[] d = { 1, 3, 4, 1, 2, 1 };
		assertEquals(0, HW3.timesOccur(c, d));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN06() {
		numberOfTests++;
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] f = { 4, 7, 2 };
		assertEquals(3, HW3.timesOccur(f, e));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN07() {
		numberOfTests++;
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] g = { 4, 7, 2, 1 };
		assertEquals(2, HW3.timesOccur(g, e));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN08() {
		numberOfTests++;
		int[] e = { 4, 7, 2, 1, 8, 4, 7, 2, 0, 8, 4, 7, 2, 1, 8 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(2, HW3.timesOccur(h, e));
		testsPassed++;
	}

	@Test
	public void testTimesOccurN09() {
		numberOfTests++;
		int[] a = { 7, 1, 1, 7, 7, 1, 1 };
		int[] h = { 4, 7, 2, 1, 8 };
		assertEquals(0, HW3.timesOccur(h, a));
		testsPassed++;
	}
}
