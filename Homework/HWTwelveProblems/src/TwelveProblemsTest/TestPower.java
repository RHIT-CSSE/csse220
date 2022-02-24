package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestPower {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestPower.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	

	@Test
	public void testPowerN01() {
		numberOfTests++;
		assertEquals(8, TwelveProblems.pow(2, 3), 0.000001);
		testsPassed++;
	} // testPowerN0
	
	@Test
	public void testPowerN02() {
		numberOfTests++;
		assertEquals(1, TwelveProblems.pow(1, 100), 0.000001);
		testsPassed++;
	} // testPowerN02
	
	@Test
	public void testPowerN03() {
		numberOfTests++;
		assertEquals(-27, TwelveProblems.pow(-3, 3), 0.000001);
		testsPassed++;
	} // testPowerN03
	
	@Test
	public void testPowerN04() {
		numberOfTests++;
		assertEquals(5 * 5 * 5 * 5, TwelveProblems.pow(5, 4), 0.000001);
		testsPassed++;
	} // testPowerN04
	
	@Test
	public void testPowerN05() {
		numberOfTests++;
		assertEquals(0.0016, TwelveProblems.pow(5, -4), 0.000001);
		testsPassed++;
	} // testPowerN05
	
	@Test
	public void testPowerN06() {
		numberOfTests++;
		assertEquals(1, TwelveProblems.pow(100, 0), 0.000001);
		testsPassed++;
	} // testPowerN06
	
	@Test
	public void testPowerN07() {
		numberOfTests++;
		assertEquals(1.0 / (9 * 9), TwelveProblems.pow(9, -2), 0.000001);
		testsPassed++;
	} // testPowerN07

}
