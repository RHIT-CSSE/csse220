package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestMaxArray {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestMaxArray.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testMaxArrayN01() {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		numberOfTests++;
		assertArrayEquals(b, TwelveProblems.maxArray(a, b));
		testsPassed++;
	} // testMaxArrayN01
	
	@Test
	public void testMaxArrayN02() {
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 1, 6 };
		int[] d = { 7, 5, 6 };

		numberOfTests++;
		assertArrayEquals(d, TwelveProblems.maxArray(b, c));
		testsPassed++;
	} // testMaxArrayN02

}
