package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

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
		String className = TestDistanceFromOrigin.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testDistanceFromOriginN01() {
		numberOfTests++;
		assertEquals(1, TwelveProblems.distanceFromOrigin(-1, 0), .001);
		testsPassed++;
	} // testDistanceFromOriginN01
	
	@Test
	public void testDistanceFromOriginN02() {
		numberOfTests++;
		assertEquals(108.894, TwelveProblems.distanceFromOrigin(77, 77), .001);
		testsPassed++;
	} // testDistanceFromOriginN02
	
	@Test
	public void testDistanceFromOriginN03() {
		numberOfTests++;
		assertEquals(5, TwelveProblems.distanceFromOrigin(-3, -4), .001);
		testsPassed++;
	} // testDistanceFromOriginN03
	
	@Test
	public void testDistanceFromOriginN04() {
		numberOfTests++;
		assertEquals(11.1803, TwelveProblems.distanceFromOrigin(5, -10), .001);
		testsPassed++;
	} // testDistanceFromOriginN04

}
