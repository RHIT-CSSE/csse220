package smallProblemsTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import smallProblems.RunAllTests;
import smallProblems.SmallProblems;


public class TestRemoveEvens {
	
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestRemoveEvens.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testRemoveEvensN01() {
		numberOfTests++;
		Integer[] inputArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] expectedArray = {1, 3, 5, 7 ,9};
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN01
	
	@Test
	public void testRemoveEvensN02() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		Integer[] expectedArray = {1, 3, 5, 7 ,9};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		SmallProblems.removeEvens(input);
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN02
	
	@Test
	public void testRemoveEvensN03() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {3, 5, 7 ,9, 1};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN03
	
	@Test
	public void testRemoveEvensN04() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {3, 5, 7 ,9, 1};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN04
	
	@Test
	public void testRemoveEvensN05() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {2, 2, 2, 2, 2, 2, 2, 1};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {1};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN05
	
	@Test
	public void testRemoveEvensN06() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {2, 2, 2, 2, 2, 2, 2};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN06
	
	@Test
	public void testRemoveEvensN07() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {2, 2, 2, 2, 2, 2, 2, 1, 3, 5, 7};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {1, 3, 5, 7};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN07
	
	@Test
	public void testRemoveEvensN08() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {1, 3, 5, 7, 2, 2, 2, 2, 2, 2, 2};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {1, 3, 5, 7};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN08
	
	@Test
	public void testRemoveEvensN09() {
		numberOfTests++;
		Integer[] inputArray = new Integer[] {2, 2, 2, 1, 3, 5, 7, 2, 2, 2, 2};
		ArrayList<Integer>input = new ArrayList<Integer>(Arrays.asList(inputArray));
		SmallProblems.removeEvens(input);
		Integer[] expectedArray = new Integer[] {1, 3, 5, 7};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		assertEquals(expected, input);
		testsPassed++;
	} // testRemoveEvensN09
	
}

