package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

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
		int[] a = { 88, 24, 154, 77 };

		numberOfTests++;
		assertEquals(154, TwelveProblems.firstDivisibleBy77(a));
		testsPassed++;
	} // testFirstDivisibleBy77N01
	
	@Test
	public void testFirstDivisibleBy77N02() {
		int[] b = { 5929, 280 };

		numberOfTests++;
		assertEquals(5929, TwelveProblems.firstDivisibleBy77(b));
		testsPassed++;
	} // testFirstDivisibleBy77N02
	
	@Test
	public void testFirstDivisibleBy77N03() {
		int[] c = { 1, 2, 3, 4 };

		numberOfTests++;
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(c));
		testsPassed++;
	} // testFirstDivisibleBy77N03
	
	@Test
	public void testFirstDivisibleBy77N04() {
		int[] d = {};

		numberOfTests++;
		assertEquals(-1, TwelveProblems.firstDivisibleBy77(d));
		testsPassed++;
	} // testFirstDivisibleBy77N04

}
