package HW0Test;

import HW0.HW0;
import HW0.RunAllTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestIsProductAMultipleOfFour {
	
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestIsProductAMultipleOfFour.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testIsProductAMultipleOfFourN01() {
		numberOfTests++;
		assertTrue(HW0.isProductAMultipleOfFour(2, 6));
		testsPassed++;
	} // testFootballScoreN0
	
	@Test
	public void testIsProductAMultipleOfFourN02() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(5, 3));
		testsPassed++;
	} // testFootballScoreN02
	
	@Test
	public void testIsProductAMultipleOfFourN03() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(9, 10));
		testsPassed++;
	} // testFootballScoreN03
	
	@Test
	public void testIsProductAMultipleOfFourN04() {
		numberOfTests++;
		assertTrue(HW0.isProductAMultipleOfFour(0, 7));
		testsPassed++;
	} // testFootballScoreN04
	
	@Test
	public void testIsProductAMultipleOfFourN05() {
		numberOfTests++;
		assertTrue(HW0.isProductAMultipleOfFour(5, -12));
		testsPassed++;
	} // testFootballScoreN05
	
	@Test
	public void testIsProductAMultipleOfFourN06() {
		numberOfTests++;
		assertTrue(HW0.isProductAMultipleOfFour(22, 34));
		testsPassed++;
	} // testFootballScoreN06
	
	@Test
	public void testIsProductAMultipleOfFourN07() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(7, 2));
		testsPassed++;
	} // testFootballScoreN07
	
	@Test
	public void testIsProductAMultipleOfFourN08() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(17, -6));
		testsPassed++;
	} // testFootballScoreN08

	@Test
	public void testIsProductAMultipleOfFourN09() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(1, 14));
		testsPassed++;
	} // testFootballScoreN09
	
	@Test
	public void testIsProductAMultipleOfFourN10() {
		numberOfTests++;
		assertFalse(HW0.isProductAMultipleOfFour(2, 7));
		testsPassed++;
	} // testFootballScoreN10

}
