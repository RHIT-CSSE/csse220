package HWTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import HW0.HW0;
import HW0.RunAllTests;



public class TestAddFractionGoodNumbers {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeAll
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterAll
	public static void oneTimeTearDown() {
		String className = TestAddFractionGoodNumbers.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testAddFractionGoodNumbersN01() {
		numberOfTests++;
		assertEquals(0.75, HW0.addFraction(1, 2, 1, 4), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN01

	@Test
	public void testAddFractionGoodNumbersN02() {
		numberOfTests++;
		assertEquals(1.0, HW0.addFraction(1, 2, 1, 2), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN02
	
	@Test
	public void testAddFractionGoodNumbersN03() {
		numberOfTests++;
		assertEquals(0.5, HW0.addFraction(1, 4, 1, 4), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN03
	
	@Test
	public void testAddFractionGoodNumbersN04() {
		numberOfTests++;
		assertEquals(0.7, HW0.addFraction(1, 10, 3, 5), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN04
	
	@Test
	public void testAddFractionGoodNumbersN05() {
		numberOfTests++;
		assertEquals(0, HW0.addFraction(0, 2, 0, 4), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN05
	
	@Test
	public void testAddFractionGoodNumbersN06() {
		numberOfTests++;
		assertEquals(0.5, HW0.addFraction(-1, 10, 3, 5), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN06
	
	@Test
	public void testAddFractionGoodNumbersN07() {
		numberOfTests++;
		assertEquals(-0.7, HW0.addFraction(-1, 10, -3, 5), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN07
	
	@Test
	public void testAddFractionGoodNumbersN08() {
		numberOfTests++;
		assertEquals(-0.75, HW0.addFraction(-1, 2, -1, 4), 0.01);
		testsPassed++;
	} // testAddFractionGoodNumbersN08

}
