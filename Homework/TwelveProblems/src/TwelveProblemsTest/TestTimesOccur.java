package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestTimesOccur {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestTimesOccur.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testTimesOccurN01() {
		int[] f = {4,7,2};
		int[] h = {4,7,2,1,8};

		numberOfTests++;
		assertEquals(1, TwelveProblems.timesOccur(f, h));
		testsPassed++;
	} // testTimesOccurN01
	
	@Test
	public void testTimesOccurN02() {
		int[] a = {7,1,1,7,7,1,1};
		int[] b =  {1,1};

		numberOfTests++;
		assertEquals(2, TwelveProblems.timesOccur(b, a));
		testsPassed++;
	} // testTimesOccurN02
	
	@Test
	public void testTimesOccurN03() {
		int[] b =  {1,1};
		int[] c = {1,1,1,3};

		numberOfTests++;
		assertEquals(2, TwelveProblems.timesOccur(b, c));
		testsPassed++;
	} // testTimesOccurN03
	
	@Test
	public void testTimesOccurN04() {
		int[] b =  {1,1};
		int[] d = {1,3,4,1,2,1};

		numberOfTests++;
		assertEquals(0, TwelveProblems.timesOccur(b, d));
		testsPassed++;
	} // testTimesOccurN04
	
	@Test
	public void testTimesOccurN05() {
		int[] c = {1,1,1,3};
		int[] d = {1,3,4,1,2,1};

		numberOfTests++;
		assertEquals(0, TwelveProblems.timesOccur(c, d));
		testsPassed++;
	} // testTimesOccurN05
	
	@Test
	public void testTimesOccurN06() {
		int[] e = {4,7,2,1,8,4,7,2,0,8,4,7,2,1,8};
		int[] f = {4,7,2};

		numberOfTests++;
		assertEquals(3, TwelveProblems.timesOccur(f, e));
		testsPassed++;
	} // testTimesOccurN06
	
	@Test
	public void testTimesOccurN07() {
		int[] e = {4,7,2,1,8,4,7,2,0,8,4,7,2,1,8};
		int[] g = {4,7,2,1};

		numberOfTests++;
		assertEquals(2, TwelveProblems.timesOccur(g, e));
		testsPassed++;
	} // testTimesOccurN07
	
	@Test
	public void testTimesOccurN08() {
		int[] e = {4,7,2,1,8,4,7,2,0,8,4,7,2,1,8};
		int[] h = {4,7,2,1,8};

		numberOfTests++;
		assertEquals(2, TwelveProblems.timesOccur(h, e));
		testsPassed++;
	} // testTimesOccurN08
	
	@Test
	public void testTimesOccurN09() {
		int[] a = {7,1,1,7,7,1,1};
		int[] h = {4,7,2,1,8};
		
		numberOfTests++;
		assertEquals(0, TwelveProblems.timesOccur(h, a));
		testsPassed++;
	} // testTimesOccurN09
}
