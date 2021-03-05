package MapsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import MapsHW.Maps;
import MapsHW.RunAllTests;

public class TestReverseHashMap {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestReverseHashMap.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// Helper Operations
	// --------------------------------------------

	private void loadHashMap(HashMap<Integer, String> m) {
		int[] keys = { 1, 2, 3, 9, 10, 11, 12 };
		String[] values = { "B", "B", "C", "foo", "foo", "foo", "foo" };

		for (int k = 0, z = keys.length; k < z; k++) {
			m.put(keys[k], values[k]);
		} // end for
			// m = {1=B, 2=B, 3=C, 9=foo, 10=foo, 11=foo, 12=foo}
			// reverse of m = {B=[1, 2], C=[3], foo=[9, 10, 11, 12]}
	} // loadHashMap

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testReverseHashmapN01() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		loadHashMap(map);
		HashMap<String, ArrayList<Integer>> reverseMap = Maps.reverseHashmap(map);

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3));
		numberOfTests++;
		assertNotEquals("Expected a map, but reverseMap returned null instead", null, reverseMap);
		assertEquals(expected, reverseMap.get("C"));
		testsPassed++;
	} // testReverseHashmapN01

	@Test
	public void testReverseHashmapN02() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		loadHashMap(map);
		HashMap<String, ArrayList<Integer>> reverseMap = Maps.reverseHashmap(map);

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2));
		numberOfTests++;
		assertNotEquals("Expected a map, but reverseMap returned null instead", null, reverseMap);
		assertEquals(expected, reverseMap.get("B"));
		testsPassed++;
	} // testReverseHashmapN02

	@Test
	public void testReverseHashmapN03() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		loadHashMap(map);
		HashMap<String, ArrayList<Integer>> reverseMap = Maps.reverseHashmap(map);

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(9, 10, 11, 12));
		numberOfTests++;
		assertNotEquals("Expected a map, but reverseMap returned null instead", null, reverseMap);
		assertEquals(expected, reverseMap.get("foo"));
		testsPassed++;
	} // testReverseHashmapN03

	@Test
	public void testReverseHashmapN04() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		loadHashMap(map);
		HashMap<String, ArrayList<Integer>> reverseMap = Maps.reverseHashmap(map);

		// Make sure there's exactly 3 keys in the reverseMap
		numberOfTests++;
		assertNotEquals("Expected a map, but reverseMap returned null instead", null, reverseMap);
		assertEquals(reverseMap.size(), 3);
		testsPassed++;
	} // testReverseHashmapN04

	@Test
	public void testReverseHashmapN05() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<String, ArrayList<Integer>> reverseMap = Maps.reverseHashmap(map);

		// Reverse of an empty map is empty
		numberOfTests++;
		assertNotEquals("Expected a map, but reverseMap returned null instead", null, reverseMap);
		assertEquals(reverseMap.size(), 0);
		testsPassed++;
	} // testReverseHashmapN05
}
