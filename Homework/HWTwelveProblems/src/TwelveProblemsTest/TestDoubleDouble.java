package TwelveProblemsTest;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestDoubleDouble {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestDoubleDouble.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	private ArrayList<String> toAL(String[] array) {
		ArrayList<String> output = new ArrayList<String>();
		for (String s : array) {
			output.add(s);
		} // end for
		return output;
	} // toAL

	@Test
	public void testDoubleDoubleN01() {
		String[] a = { "foo", "double" };
		String[] aSolution = { "foo", "double", "double" };

		numberOfTests++;
		assertEquals(toAL(aSolution), TwelveProblems.doubleDouble(toAL(a)));
		testsPassed++;
	} // testDoubleDoubleN01
	
	@Test
	public void testDoubleDoubleN02() {
		String[] b = { "double", "foo", "double", "bar" };
		String[] bSolution = { "double", "double", "foo", "double", "double", "bar" };

		numberOfTests++;
		assertEquals(toAL(bSolution), TwelveProblems.doubleDouble(toAL(b)));
		testsPassed++;
	} // testDoubleDoubleN02
	
	@Test
	public void testDoubleDoubleN03() {
		String[] c = {};

		numberOfTests++;
		assertEquals(toAL(c), TwelveProblems.doubleDouble(toAL(c)));
		testsPassed++;
	} // testDoubleDoubleN03
	
	@Test
	public void testDoubleDoubleN04() {
		String[] d = { "foo", "bar" };

		numberOfTests++;
		assertEquals(toAL(d), TwelveProblems.doubleDouble(toAL(d)));
		testsPassed++;
	} // testDoubleDoubleN04

}
