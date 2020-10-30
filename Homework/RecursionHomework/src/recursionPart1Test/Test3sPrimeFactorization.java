package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursionPart1.Part1Problems;
import recursionPart1.RunAllTests;

public class Test3sPrimeFactorization {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = Test3sPrimeFactorization.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void test3sPrimeFactorization01() {
		numberOfTests++;
		assertEquals(1, Part1Problems.countNumberOf3sInPrimeFactorization(3));
		testsPassed++;
	} // test3sPrimeFactorization01

	@Test
	public void test3sPrimeFactorization02() {
		numberOfTests++;
		assertEquals(2, Part1Problems.countNumberOf3sInPrimeFactorization(9));
		testsPassed++;
	} // test3sPrimeFactorization02

	@Test
	public void test3sPrimeFactorization03() {
		numberOfTests++;
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(412));
		testsPassed++;
	} // test3sPrimeFactorization03

	@Test
	public void test3sPrimeFactorization04() {
		numberOfTests++;
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(0));
		testsPassed++;
	} // test3sPrimeFactorization04

	@Test
	public void test3sPrimeFactorization05() {
		numberOfTests++;
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(7675489));
		testsPassed++;
	} // test3sPrimeFactorization05

	@Test
	public void test3sPrimeFactorization06() {
		numberOfTests++;
		assertEquals(4, Part1Problems.countNumberOf3sInPrimeFactorization(234516789));
		testsPassed++;
	} // test3sPrimeFactorization06

	@Test
	public void test3sPrimeFactorization07() {
		numberOfTests++;
		assertEquals(15, Part1Problems.countNumberOf3sInPrimeFactorization(14348907));
		testsPassed++;
	} // test3sPrimeFactorization07

} // end Test3sPrimeFactorization
