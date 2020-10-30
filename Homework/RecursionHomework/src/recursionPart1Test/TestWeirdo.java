package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTests;

public class TestWeirdo {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestWeirdo.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testWeirdo01() {
		numberOfTests++;
		assertEquals("", Part1Problems.weirdoString(""));
		testsPassed++;
	} // testWeirdo01

	@Test
	public void testWeirdo02() {
		numberOfTests++;
		assertEquals("", Part1Problems.weirdoString("aaaaaaa"));
		testsPassed++;
	} // testWeirdo02

	@Test
	public void testWeirdo03() {
		numberOfTests++;
		assertEquals("", Part1Problems.weirdoString("ababababbbaa"));
		testsPassed++;
	} // testWeirdo03

	@Test
	public void testWeirdo04() {
		numberOfTests++;
		assertEquals("A les like  rook.", Part1Problems.weirdoString("Abba babbles like a brook."));
		testsPassed++;
	} // testWeirdo01

	@Test
	public void testWeirdo05() {
		numberOfTests++;
		assertEquals("QQQn you feel the love tonight?", Part1Problems.weirdoString("Can you feel the love tonight?"));
		testsPassed++;
	} // testWeirdo05

	@Test
	public void testWeirdo06() {
		numberOfTests++;
		assertEquals("QQQns of y food", Part1Problems.weirdoString("Cans of baby food"));
		testsPassed++;
	} // testWeirdo06

	@Test
	public void testWeirdo07() {
		numberOfTests++;
		assertEquals("is unmodified", Part1Problems.weirdoString("is unmodified"));
		testsPassed++;
	} // testWeirdo07

} // end TestWeirdo
