package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestFirstDifference {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFirstDifference.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testFirstDifferenceN01() {
		numberOfTests++;
		assertEquals(1, TwelveProblems.firstDifference("abc", "axy"));
		testsPassed++;
	} // testFirstDifferenceN01
	
	@Test
	public void testFirstDifferenceN02() {
		numberOfTests++;
		assertEquals(2, TwelveProblems.firstDifference("abx", "aby"));
		testsPassed++;
	} // testFirstDifferenceN02
	
	@Test
	public void testFirstDifferenceN03() {
		numberOfTests++;
		assertEquals(0, TwelveProblems.firstDifference("foo", "bar"));
		testsPassed++;
	} // testFirstDifferenceN03
	
	@Test
	public void testFirstDifferenceN04() {
		numberOfTests++;
		assertEquals(-1, TwelveProblems.firstDifference("foo", "foo"));
		testsPassed++;
	} // testFirstDifferenceN04
	
	@Test
	public void testFirstDifferenceN05() {
		numberOfTests++;
		assertEquals(-1, TwelveProblems.firstDifference("", ""));
		testsPassed++;
	} // testFirstDifferenceN05

}
