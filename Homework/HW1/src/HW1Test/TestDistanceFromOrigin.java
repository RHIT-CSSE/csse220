package HW1Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW1.HW1;
import HW1.RunAllTests;

public class TestDistanceFromOrigin {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests, TestDistanceFromOrigin.class.getSimpleName());
	} // oneTimeTearDown

	@Test
	public void testDistanceFromOriginN01() {
		numberOfTests++;
		assertEquals(1, HW1.distanceFromOrigin(-1, 0), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN02() {
		numberOfTests++;
		assertEquals(108.894, HW1.distanceFromOrigin(77, 77), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN03() {
		numberOfTests++;
		assertEquals(5, HW1.distanceFromOrigin(-3, -4), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN04() {
		numberOfTests++;
		assertEquals(11.1803, HW1.distanceFromOrigin(5, -10), .001);
		testsPassed++;
	}

}
