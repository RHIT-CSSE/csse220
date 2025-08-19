package HW1Test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW1.HW1;
import HW1.RunAllTests;

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
		assertEquals(8, HW1.pow(2, 3), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN02() {
		numberOfTests++;
		assertEquals(1, HW1.pow(1, 100), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN03() {
		numberOfTests++;
		assertEquals(-27, HW1.pow(-3, 3), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN04() {
		numberOfTests++;
		assertEquals(5 * 5 * 5 * 5, HW1.pow(5, 4), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN05() {
		numberOfTests++;
		assertEquals(0.0016, HW1.pow(5, -4), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN06() {
		numberOfTests++;
		assertEquals(1, HW1.pow(100, 0), 0.000001);
		testsPassed++;
	}
	
	@Test
	public void testPowerN07() {
		numberOfTests++;
		assertEquals(1.0 / (9 * 9), HW1.pow(9, -2), 0.000001);
		testsPassed++;
	}

}
