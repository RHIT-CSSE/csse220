package MapsTest;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import org.junit.runner.RunWith;

import MapsHW.Maps;

@RunWith(RunAllTestsTestRunner.class)

public class TestGetNumberOfCoursesToTake {

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

		assertEquals(0, Maps.getNumberOfCoursesToTake(prereqMap, "101"));
	} // testGetNumberOfCoursesToTakeN01
	
	@Test
	public void testGetNumberOfCoursesToTakeN02() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(1, Maps.getNumberOfCoursesToTake(prereqMap, "102"));
	} // testGetNumberOfCoursesToTakeN02
	
	@Test
	public void testGetNumberOfCoursesToTakeN03() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(2, Maps.getNumberOfCoursesToTake(prereqMap, "103"));
	} // testGetNumberOfCoursesToTakeN03
	
	@Test
	public void testGetNumberOfCoursesToTakeN04() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(3, Maps.getNumberOfCoursesToTake(prereqMap, "104"));
	} // testGetNumberOfCoursesToTakeN04
	
	@Test
	public void testGetNumberOfCoursesToTakeN05() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(4, Maps.getNumberOfCoursesToTake(prereqMap, "105"));
	} // testGetNumberOfCoursesToTakeN05
	
	@Test
	public void testGetNumberOfCoursesToTakeN06() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(2, Maps.getNumberOfCoursesToTake(prereqMap, "110"));
	} // testGetNumberOfCoursesToTakeN06
	
	@Test
	public void testGetNumberOfCoursesToTakeN07() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "202"));
	} // testGetNumberOfCoursesToTakeN07
	
	@Test
	public void testGetNumberOfCoursesToTakeN08() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "205"));
	} // testGetNumberOfCoursesToTakeN08
	
	@Test
	public void testGetNumberOfCoursesToTakeN09() {
		HashMap<String, String> prereqMap = new HashMap<String, String>();
		loadHashMap(prereqMap);
		
		assertEquals(-1, Maps.getNumberOfCoursesToTake(prereqMap, "300"));
	} // testGetNumberOfCoursesToTakeN09
	
}
