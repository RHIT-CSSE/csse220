package TwelveProblemsTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

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
		String className = TestSecondDigit5.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	

	@Test
	public void testSecondDigit5N01() {
		numberOfTests++;
		assertTrue(TwelveProblems.secondDigit5(50));
		testsPassed++;
	} // testSecondDigit5N0
	
	@Test
	public void testSecondDigit5N02() {
		numberOfTests++;
		assertTrue(TwelveProblems.secondDigit5(55));
		testsPassed++;
	} // testSecondDigit5N02
	
	@Test
	public void testSecondDigit5N03() {
		numberOfTests++;
		assertTrue(TwelveProblems.secondDigit5(450));
		testsPassed++;
	} // testSecondDigit5N03
	
	@Test
	public void testSecondDigit5N04() {
		numberOfTests++;
		assertTrue(TwelveProblems.secondDigit5(11251));
		testsPassed++;
	} // testSecondDigit5N04
	
	@Test
	public void testSecondDigit5N05() {
		numberOfTests++;
		assertTrue(TwelveProblems.secondDigit5(555555));
		testsPassed++;
	} // testSecondDigit5N05
	
	@Test
	public void testSecondDigit5N06() {
		numberOfTests++;
		assertFalse(TwelveProblems.secondDigit5(555505));
		testsPassed++;
	} // testSecondDigit5N06
	
	@Test
	public void testSecondDigit5N07() {
		numberOfTests++;
		assertFalse(TwelveProblems.secondDigit5(5));
		testsPassed++;
	} // testSecondDigit5N07
	
	@Test
	public void testSecondDigit5N08() {
		numberOfTests++;
		assertFalse(TwelveProblems.secondDigit5(230));
		testsPassed++;
	} // testSecondDigit5N08
}
