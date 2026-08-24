package HWSmallProblemsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.HWSmallProblems;
import HWSmallProblems.RunAllTests;

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
		assertEquals(1, HWSmallProblems.distanceFromOrigin(-1, 0), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN02() {
		numberOfTests++;
		assertEquals(108.894, HWSmallProblems.distanceFromOrigin(77, 77), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN03() {
		numberOfTests++;
		assertEquals(5, HWSmallProblems.distanceFromOrigin(-3, -4), .001);
		testsPassed++;
	}

	@Test
	public void testDistanceFromOriginN04() {
		numberOfTests++;
		assertEquals(11.1803, HWSmallProblems.distanceFromOrigin(5, -10), .001);
		testsPassed++;
	}

}
