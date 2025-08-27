package recursionTest;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursion.HW8;
import recursion.RunAllTests;

public class TestNoDoubleLetters {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestNoDoubleLetters.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testNoDoubleLetters01() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("aaaaaaa"));
		testsPassed++;
	} // testNoDoubleLetters01

	@Test
	public void testNoDoubleLetters02() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("ababababbbaa"));
		testsPassed++;
	} // testNoDoubleLetters02

	@Test
	public void testNoDoubleLetters03() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("Abba babbles like a brook."));
		testsPassed++;
	} // testNoDoubleLetters03

	@Test
	public void testNoDoubleLetters04() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("Can you feel the love tonight?"));
		testsPassed++;
	} // testNoDoubleLetters04

	@Test
	public void testNoDoubleLetters05() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("Cans of baby food"));
		testsPassed++;
	} // testNoDoubleLetters05

	@Test
	public void testNoDoubleLetters06() {
		numberOfTests++;
		assertEquals(true, HW8.noDoubledLetters("is unmodified"));
		testsPassed++;
	} // testNoDoubleLetters06

	@Test
	public void testNoDoubleLetters07() {
		numberOfTests++;
		assertEquals(true, HW8.noDoubledLetters("works"));
		testsPassed++;
	} // testNoDoubleLetters07

	@Test
	public void testNoDoubleLetters08() {
		numberOfTests++;
		assertEquals(true, HW8.noDoubledLetters("nope"));
		testsPassed++;
	} // testNoDoubleLetters08

	@Test
	public void testNoDoubleLetters09() {
		numberOfTests++;
		assertEquals(true, HW8.noDoubledLetters("How many licks does it take?"));
		testsPassed++;
	} // testNoDoubleLetters09

	@Test
	public void testNoDoubleLetters10() {
		numberOfTests++;
		assertEquals(false, HW8.noDoubledLetters("One, two, three"));
		testsPassed++;
	} // testNoDoubleLetter10

} // end TestNoDoubleLetters
