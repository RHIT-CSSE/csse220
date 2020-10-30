package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTests;

public class TestTechnicallyCorrect {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestTechnicallyCorrect.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testTechnicallyCorrect01() {
		numberOfTests++;
		assertEquals("", Part1Problems.technicallyGramaticallyCorrect(0));
		testsPassed++;
	} // testTechnicallyCorrect01

	@Test
	public void testTechnicallyCorrect02() {
		numberOfTests++;
		assertEquals("Buffalo ", Part1Problems.technicallyGramaticallyCorrect(1));
		testsPassed++;
	} // testTechnicallyCorrect02

	@Test
	public void testTechnicallyCorrect03() {
		numberOfTests++;
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo ", Part1Problems.technicallyGramaticallyCorrect(5));
		testsPassed++;
	} // testTechnicallyCorrect03

	@Test
	public void testTechnicallyCorrect04() {
		numberOfTests++;
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo ",
				Part1Problems.technicallyGramaticallyCorrect(10));
		testsPassed++;
	} // testTechnicallyCorrect04

} // end TechnicallyCorrectTest
