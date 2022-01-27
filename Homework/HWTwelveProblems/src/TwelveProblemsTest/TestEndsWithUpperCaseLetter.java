package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;
import TwelveProblems.TwelveProblems;

public class TestEndsWithUpperCaseLetter {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestEndsWithUpperCaseLetter.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	

	@Test
	public void testEndsWithUpperCaseLetterN01() {
		numberOfTests++;
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("doG"));
		testsPassed++;
	} // testEndsWithUpperCaseLetterN0
	
	@Test
	public void testEndsWithUpperCaseLetterN02() {
		numberOfTests++;
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("dog"));
		testsPassed++;
	} // testEndsWithUpperCaseLetterN02
	
	@Test
	public void testEndsWithUpperCaseLetterN03() {
		numberOfTests++;
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("HELLO"));
		testsPassed++;
	} // testEndsWithUpperCaseLetterN03
	
	@Test
	public void testEndsWithUpperCaseLetterN04() {
		numberOfTests++;
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("hello"));
		testsPassed++;
	} // testEndsWithUpperCaseLetterN04
	
	@Test
	public void testEndsWithUpperCaseLetterN05() {
		numberOfTests++;
		assertFalse(TwelveProblems.endsWithUpperCaseLetter(""));
		testsPassed++;
	} // testEndsWithUpperCaseLetterN05

}
