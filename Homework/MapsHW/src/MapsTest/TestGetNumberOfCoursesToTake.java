package MapsTest;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import MapsHW.Maps;
import MapsHW.RunAllTests;

public class TestGetNumberOfCoursesToTake {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGetNumberOfCoursesToTake.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// Helper Operations
	// --------------------------------------------

	private void loadHashMap(HashMap<String, String> m) {
		String[] keys =   { "105", "104", "103", "102", "101", "110", "205", "204", "203", "202", "201", "300" };
		String[] values = { "104", "103", "102", "101", "",    "102", "204", "203", "202", "201", "205", "201" };

		for (int k = 0, z = keys.length; k < z; k++) {
			m.put(keys[k], values[k]);
		} // end for
		// m = {110=102, 101=, 102=101, 201=205, 300=201, 103=102, 202=201, 104=103, 203=202, 105=104, 204=203, 205=204}

	} // loadHashMap

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetNumberOfCoursesToTakeN01() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);

		numberOfTests++;
		assertEquals(0, Maps.getNumberOfCoursesToTake(prereqMap, "101"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN01
	
	@Test
	public void testGetNumberOfCoursesToTakeN02() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(1, Maps.getNumberOfCoursesToTake(prereqMap, "102"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN02
	
	@Test
	public void testGetNumberOfCoursesToTakeN03() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(2, Maps.getNumberOfCoursesToTake(prereqMap, "103"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN03
	
	@Test
	public void testGetNumberOfCoursesToTakeN04() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(3, Maps.getNumberOfCoursesToTake(prereqMap, "104"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN04
	
	@Test
	public void testGetNumberOfCoursesToTakeN05() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(4, Maps.getNumberOfCoursesToTake(prereqMap, "105"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN05
	
	@Test
	public void testGetNumberOfCoursesToTakeN06() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(2, Maps.getNumberOfCoursesToTake(prereqMap, "110"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN06
	
	@Test
	public void testGetNumberOfCoursesToTakeN07() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "202"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN07
	
	@Test
	public void testGetNumberOfCoursesToTakeN08() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "205"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN08
	
	@Test
	public void testGetNumberOfCoursesToTakeN09() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		numberOfTests++;
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "300"));
		testsPassed++;
	} // testGetNumberOfCoursesToTakeN09
	
}
