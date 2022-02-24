package TwelveProblemsTest;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestThreeCharacterStrings {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestThreeCharacterStrings.class.getSimpleName();
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
	public void testThreeCharacterStringsN01() {
		String[] a = { "hel", "ell", "llo" };

		numberOfTests++;
		assertEquals(toAL(a), TwelveProblems.threeCharacterStrings("hello"));
		testsPassed++;
	} // testThreeCharacterStringsN01
	
	@Test
	public void testThreeCharacterStringsN02() {
		String[] b = { "foo" };

		numberOfTests++;
		assertEquals(toAL(b), TwelveProblems.threeCharacterStrings("foo"));
		testsPassed++;
	} // testThreeCharacterStringsN02
	
	@Test
	public void testThreeCharacterStringsN03() {
		String[] c = {};

		numberOfTests++;
		assertEquals(toAL(c), TwelveProblems.threeCharacterStrings("qq"));
		testsPassed++;
	} // testThreeCharacterStringsN03

}
