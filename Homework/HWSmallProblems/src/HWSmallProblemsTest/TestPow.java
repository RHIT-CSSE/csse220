package HWSmallProblemsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HWSmallProblems.HWSmallProblems;
import HWSmallProblems.RunAllTests;

public class TestPow {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		RunAllTests.outputResults(testsPassed, numberOfTests, TestPow.class.getSimpleName());
	} // oneTimeTearDown

	@Test
	public void testPowerN01() {
		numberOfTests++;
		assertEquals(8, HWSmallProblems.pow(2, 3), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN02() {
		numberOfTests++;
		assertEquals(1, HWSmallProblems.pow(1, 100), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN03() {
		numberOfTests++;
		assertEquals(-27, HWSmallProblems.pow(-3, 3), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN04() {
		numberOfTests++;
		assertEquals(5 * 5 * 5 * 5, HWSmallProblems.pow(5, 4), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN05() {
		numberOfTests++;
		assertEquals(0.0016, HWSmallProblems.pow(5, -4), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN06() {
		numberOfTests++;
		assertEquals(1, HWSmallProblems.pow(100, 0), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN07() {
		numberOfTests++;
		assertEquals(1.0 / (9 * 9), HWSmallProblems.pow(9, -2), 0.000001);
		testsPassed++;
	}

}
