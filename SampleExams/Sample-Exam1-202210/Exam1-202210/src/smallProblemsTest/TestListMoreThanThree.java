package smallProblemsTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import smallProblems.RunAllTests;
import smallProblems.SmallProblems;

public class TestListMoreThanThree {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestListMoreThanThree.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testListOfMoreThanThreeN01() {
		numberOfTests++;
		int[] input = {1, 2, 3, 4, 1, 2, 3, 1, 2, 3};
		Integer[] expectedArray = {1, 2, 3};
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN01
	
	@Test
	public void testListOfMoreThanThreeN02() {
		numberOfTests++;
		int[] input = new int[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3};
		Integer[] expectedArray = new Integer[] {1, 2};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN02
	
	@Test
	public void testListOfMoreThanThreeN03() {
		numberOfTests++;
		int[] input = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
		Integer[] expectedArray = new Integer[] {1};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN03
	
	@Test
	public void testListOfMoreThanThreeN04() {
		numberOfTests++;
		int[] input = new int[] {1, 2, 3, 4};
		//Integer[] expectedArray = new Integer[] {};
		ArrayList<Integer>expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN04
	
	@Test
	public void testListOfMoreThanThreeN05() {
		numberOfTests++;
		int[] input = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 1, 4};
		Integer[] expectedArray = new Integer[] {1, 4};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN05
	
	@Test
	public void testListOfMoreThanThreeN06() {
		numberOfTests++;
		int[] input = new int[] {1, 1, 2, 2, 3, 3, 4, 4};
		//Integer[] expectedArray = new Integer[] {};
		ArrayList<Integer>expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN06
	
	@Test
	public void testListOfMoreThanThreeN07() {
		numberOfTests++;
		int[] input = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		Integer[] expectedArray = new Integer[] {5};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN07
	
	@Test
	public void testListOfMoreThanThreeN08() {
		numberOfTests++;
		int[] input = new int[] {5, 5, 5, 1, 1, 2, 2, 3, 3, 4, 4};
		Integer[] expectedArray = new Integer[] {5};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN08
	
	@Test
	public void testListOfMoreThanThreeN09() {
		numberOfTests++;
		int[] input = new int[] {5, 5, 5, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		Integer[] expectedArray = new Integer[] {5};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN09
	
	@Test
	public void testListOfMoreThanThreeN10() {
		numberOfTests++;
		int[] input = new int[] {5, 5, 5, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		Integer[] expectedArray = new Integer[] {5};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN10
	
	@Test
	public void testListOfMoreThanThreeN11() {
		numberOfTests++;
		int[] input = new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 3, 5};
		Integer[] expectedArray = new Integer[] {1, 3, 5};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN11
	
	@Test
	public void testListOfMoreThanThreeN12() {
		numberOfTests++;
		int[] input = new int[] {1, 7, 7, 7, 2, 7, 7, 7, 3, 7, 7, 7, 4, 7, 7, 7};
		Integer[] expectedArray = new Integer[] {7};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN12
	
	@Test
	public void testListOfMoreThanThreeN13() {
		numberOfTests++;
		int[] input = new int[] {1, 7, 7, 7, 1, 7, 7, 7, 1, 7, 7, 7, 1, 7, 7, 7};
		Integer[] expectedArray = new Integer[] {1, 7};
		ArrayList<Integer>expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN13
	
	@Test
	public void testListOfMoreThanThreeN14() {
		numberOfTests++;
		int[] input = new int[150];
		ArrayList<Integer>expected = new ArrayList<Integer>();
		int cur = 0;
		for(int i = 0; i < 150; i++) {
			if(cur > 49)
				cur = 0;
			
			input[i] = cur;
			if(i < 50)
				expected.add(cur);
			
			cur++;
		}
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN14
	
	@Test
	public void testListOfMoreThanThreeN15() {
		numberOfTests++;
		int[] input = new int[150];
		ArrayList<Integer>expected = new ArrayList<Integer>();
		int cur = 0;
		for(int i = 0; i < 148; i+=3) {
			if(cur > 49)
				cur = 0;
			
			input[i] = cur;
			input[i+1] = cur;
			input[i+2] = cur;
			if(!expected.contains(cur))
				expected.add(cur);
			
			cur++;
		}
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		Collections.sort(expected);
		Collections.sort(actual);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN15
	
	@Test
	public void testListOfMoreThanThreeN16() {
		numberOfTests++;
		int[] input = new int[200];
		ArrayList<Integer>expected = new ArrayList<Integer>();
		int cur = 0;
		for(int i = 0; i < 200; i++) {
			if(cur > 99)
				cur = 0;
			
			input[i] = cur++;
		}
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN16
	
	@Test
	public void testListOfMoreThanThreeN17() {
		numberOfTests++;
		int[] input = new int[200];
		ArrayList<Integer>expected = new ArrayList<Integer>();
		int cur = 0;
		for(int i = 0; i < 199; i+=2) {
			if(cur > 99)
				cur = 0;
			
			input[i] = cur;
			input[i+1] = cur++;
		}
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN17
	
	@Test
	public void testListOfMoreThanThreeN18() {
		numberOfTests++;
		int[] input = new int[200];
		ArrayList<Integer>expected = new ArrayList<Integer>();
		int cur = 0;
		for(int i = 0; i < 199; i+=2) {
			if(cur > 99)
				cur = 0;
			
			input[i] = cur;
			input[i+1] = cur++;
		} // end for
		
		input[199] = 1;
		input[198] = 1;
		expected.add(1);
		ArrayList<Integer> actual = SmallProblems.listOfMoreThanThree(input);
		assertEquals(expected, actual);
		testsPassed++;
	} // testListOfMoreThanThreeN18
	
}

