package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestPowersOfTwo {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestPowersOfTwo.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testPowersOfTwoN01() {
		int[] a = { 1, 2, 4, 8 };

		numberOfTests++;
		assertArrayEquals(a, TwelveProblems.powersOfTwo(3));
		testsPassed++;
	} // testPowersOfTwoN01
	
	@Test
	public void testPowersOfTwoN02() {
		int[] b = { 1, 2, 4, 8, 16, 32, 64, 128 };

		numberOfTests++;
		assertArrayEquals(b, TwelveProblems.powersOfTwo(7));
		testsPassed++;
	} // testPowersOfTwoN02
	
	@Test
	public void testPowersOfTwoN03() {
		int[] c = { 1 };

		numberOfTests++;
		assertArrayEquals(c, TwelveProblems.powersOfTwo(0));
		testsPassed++;
	} // testPowersOfTwoN03
	
	@Test
	public void testPowersOfTwoN04() {
		int[] d = {};

		numberOfTests++;
		assertArrayEquals(d, TwelveProblems.powersOfTwo(-200));
		testsPassed++;
	} // testPowersOfTwoN04
	
	


}
