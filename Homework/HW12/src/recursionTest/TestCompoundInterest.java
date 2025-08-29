package recursionTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import recursion.RunAllTests;
import recursion.HW12;

public class TestCompoundInterest {
	private static int testsPassed;
	private static int numberOfTests;
	
	private static final double DELTA = 1e-2; // Tolerance for floating-point comparisons (accuracy within one cent)
	
	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestCompoundInterest.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// **************************************************************
	// Test: compoundInterest
	// **************************************************************

	@Test
	public void testCompoundInterest01() {
		// Test 1
		double expected = 1061.68;
		double actual = HW12.compoundInterest(1000.0, 6.0, 12);
		numberOfTests++;
		assertEquals(expected, actual, DELTA); // accuracy within one cent
		testsPassed++;
	} // testCompoundInterest01

	@Test
	public void testCompoundInterest02() {
		// Test 2
		double expected = 5502.74;
		double actual = HW12.compoundInterest(5000.0, 4.8, 24);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest02

	@Test
	public void testCompoundInterest03_zeroMonths() {
		double expected = 1000.0;
		double actual = HW12.compoundInterest(1000.0, 5.0, 0);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest03

	@Test
	public void testCompoundInterest04_zeroRate() {
		double expected = 2000.0;
		double actual = HW12.compoundInterest(2000.0, 0.0, 24);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest04

	@Test
	public void testCompoundInterest05_negativeRate() {
		double expected = 980.0; // 1000 * (1 - DELTA)^24 ≈ 980.0
		double actual = HW12.compoundInterest(1000.0, -1.0, 24);
		numberOfTests++;
		assertEquals(expected, actual, 0.5);
		testsPassed++;
	} // testCompoundInterest05

	@Test
	public void testCompoundInterest06_negativePrincipal() {
		double expected = -1061.68;
		double actual = HW12.compoundInterest(-1000.0, 6.0, 12);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest06

	@Test
	public void testCompoundInterest07_largeValues() {
		double expected = 1061677.81;
		double actual = HW12.compoundInterest(1000000.0, 6.0, 12);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest07

	@Test
	public void testCompoundInterest08() {
		double expected = 104.27;
		double actual = HW12.compoundInterest(100.0, 8.4, 6);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest08

	@Test
	public void testCompoundInterest09_zeroPrincipal() {
		double expected = 0.0;
		double actual = HW12.compoundInterest(0.0, 5.0, 12);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest09

	@Test
	public void testCompoundInterest10_highRateShortTerm() {
		double expected = 1050.0; // 1000 * (1 + 0.6/12)^1
		double actual = HW12.compoundInterest(1000.0, 60.0, 1);
		numberOfTests++;
		assertEquals(expected, actual, DELTA);
		testsPassed++;
	} // testCompoundInterest10

}
