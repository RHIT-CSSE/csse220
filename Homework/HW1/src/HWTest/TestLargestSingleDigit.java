package HWTest;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW1.HW1;
import HW1.RunAllTests;


public class TestLargestSingleDigit {
	
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestLargestSingleDigit.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testLargestSingleDigitN01() {
		numberOfTests++;
		assertEquals(9, HW1.largestSingleDigit(9));
		testsPassed++;
	} // testLargestSingleDigitN0
	
	@Test
	public void testLargestSingleDigitN02() {
		numberOfTests++;
		assertEquals(1, HW1.largestSingleDigit(1));
		testsPassed++;
	} // testLargestSingleDigitN02
	
	@Test
	public void testLargestSingleDigitN03() {
		numberOfTests++;
		assertEquals(8, HW1.largestSingleDigit(12345678));
		testsPassed++;
	} // testLargestSingleDigitN03
	
	@Test
	public void testLargestSingleDigitN04() {
		numberOfTests++;
		assertEquals(7, HW1.largestSingleDigit(7654321));
		testsPassed++;
	} // testLargestSingleDigitN04
	
	@Test
	public void testLargestSingleDigitN05() {
		numberOfTests++;
		assertEquals(3, HW1.largestSingleDigit(123321));
		testsPassed++;
	} // testLargestSingleDigitN05
	
	@Test
	public void testLargestSingleDigitN06() {
		numberOfTests++;
		assertEquals(7, HW1.largestSingleDigit(1234567654321l));
		testsPassed++;
	} // testLargestSingleDigitN06
	
	@Test
	public void testLargestSingleDigitN07() {
		numberOfTests++;
		assertEquals(1, HW1.largestSingleDigit(10000000));
		testsPassed++;
	} // testLargestSingleDigitN07
	
	@Test
	public void testLargestSingleDigitN08() {
		numberOfTests++;
		assertEquals(2, HW1.largestSingleDigit(100000002));
		testsPassed++;
	} // testLargestSingleDigitN08

	@Test
	public void testLargestSingleDigitN09() {
		numberOfTests++;
		assertEquals(2, HW1.largestSingleDigit(1000000020));
		testsPassed++;
	} // testLargestSingleDigitN09
	
	@Test
	public void testLargestSingleDigitN10() {
		numberOfTests++;
		assertEquals(3, HW1.largestSingleDigit(130000002));
		testsPassed++;
	} // testLargestSingleDigitN10

}
