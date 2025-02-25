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
	public void testFootballScoreN01() {
		numberOfTests++;
		assertEquals(9, HW1.largestSingleDigit(9));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testFootballScoreN02() {
		numberOfTests++;
		assertEquals(1, HW1.largestSingleDigit(1));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testFootballScoreN03() {
		numberOfTests++;
		assertEquals(8, HW1.largestSingleDigit(12345678));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testFootballScoreN04() {
		numberOfTests++;
		assertEquals(7, HW1.largestSingleDigit(7654321));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testFootballScoreN05() {
		numberOfTests++;
		assertEquals(3, HW1.largestSingleDigit(123321));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testFootballScoreN06() {
		numberOfTests++;
		assertEquals(7, HW1.largestSingleDigit(1234567654321l));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testFootballScoreN07() {
		numberOfTests++;
		assertEquals(1, HW1.largestSingleDigit(10000000));
		testsPassed++;
	} // testFootballScoreN07
	
	@Test
	public void testFootballScoreN08() {
		numberOfTests++;
		assertEquals(2, HW1.largestSingleDigit(100000002));
		testsPassed++;
	} // testFootballScoreN08

	@Test
	public void testFootballScoreN09() {
		numberOfTests++;
		assertEquals(2, HW1.largestSingleDigit(1000000020));
		testsPassed++;
	} // testFootballScoreN09
	
	@Test
	public void testFootballScoreN10() {
		numberOfTests++;
		assertEquals(3, HW1.largestSingleDigit(130000002));
		testsPassed++;
	} // testFootballScoreN10

}
