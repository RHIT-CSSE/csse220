package HW3Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW3.HW3;
import HW3.RunAllTests;

public class TestCitiesVisitedMoreThanOnce {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestCitiesVisitedMoreThanOnce.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testCitiesVisitedMoreThanOnceN01() {
		String namesToSplit =  "Bill, Jan, Jon, Bill, Jon, Jon, Jon, Bill";
		String citiesToSplit = "Chicago, Philly, LA, Philly, LA, LA, Chicago, Philly";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {"Jon", "Bill"};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN01
	
	@Test
	public void testCitiesVisitedMoreThanOnceN02() {
		String namesToSplit =  "A, A, A, B, B, B, C";
		String citiesToSplit = "1, 2, 3, 1, 2, 1, 1";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {"B"};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN02
	
	@Test
	public void testCitiesVisitedMoreThanOnceN03() {
		String namesToSplit =  "A, A, A, B, B, B, C";
		String citiesToSplit = "1, 2, 3, 1, 2, 3, 1";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN03
	
	@Test
	public void testCitiesVisitedMoreThanOnceN04() {
		String namesToSplit =  "A, A, A, B, B, B, C, C";
		String citiesToSplit = "1, 1, 1, 1, 1, 1, 1, 1";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {"A", "B", "C"};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN04
	
	@Test
	public void testCitiesVisitedMoreThanOnceN05() {
		String namesToSplit =  "F, A, B, C, D, A, B, C, D, A, B, C, D, A, B, C, D, A, B, C, D, E, E, E, F";
		String citiesToSplit = "1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 1, 3, 3, 4, 4, 1, 4, 5, 5, 5, 1, 8, 9, 8, 1";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {"A", "B", "C", "D", "E", "F"};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN05
	
	@Test
	public void testCitiesVisitedMoreThanOnceN06() {
		String namesToSplit =  "F, A, B, C, D, A, B, C, D, A, B, C, D, A, B, C, D, A, B, C, D, E, E, E, F";
		String citiesToSplit = "1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 8, 9, 0, 1";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {"F"};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN06
	
	@Test
	public void testCitiesVisitedMoreThanOnceN07() {
		String namesToSplit =  "A, A, A, A, A, A, A, A, A, 9";
		String citiesToSplit = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN07
	
	@Test
	public void testCitiesVisitedMoreThanOnceN08() {
		String namesToSplit =  "A, B, C, D, E, F, G, H, I, J";
		String citiesToSplit = "B, C, D, E, F, G, H, I, J, A";
		
		String[] names = namesToSplit.split(", ");
		String[] citiesVisited = citiesToSplit.split(", ");
		
		String[] expected = {};

		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		Collections.sort(expectedList);
		numberOfTests++;
		ArrayList<String> actual = HW3.citiesVisitedMoreThanOnce(names, citiesVisited);
		Collections.sort(actual);
		assertEquals(expectedList, actual);
		testsPassed++;
	} // testCitiesVisitedMoreThanOnceN08
}
