import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


/**
 * Tests for the {@link MapProblems} class.
 *
 * @author CSSE Faculty
 */
public class MapProblemsTest {

	/**
	 * Tests for the {@link MapProblems#hasDuplicates(int[])} method.
	 *
	 */
	@Test
	public void testNicknames() {
		String[] names = {"Arun","Bill","Nala"};
		String[] test1 = {"Foo","Bar","Foo"};
		String[] test2 = {"Foo","Baz","Baz"};
		assertEquals("Foo", MapProblems.duplicateNicknames(names, test1));
		assertEquals("Baz", MapProblems.duplicateNicknames(names, test2));
	}

	/**
	 * Tests for the {@link MapProblems#computeTotalScore(String)} method.
	 *
	 */
	@Test
	public void testComputeTotalScore() {		
		assertEquals(7, MapProblems.computeTotalScore("AJAA"));
		assertEquals(7, MapProblems.computeTotalScore("JAAA"));
		assertEquals(9, MapProblems.computeTotalScore("KQKQQ"));
		assertEquals(6, MapProblems.computeTotalScore("AQAQ"));
		assertEquals(0, MapProblems.computeTotalScore(""));
	}

	
	/**
	 * Tests for the {@link MapProblems#inverseMap(HashMap)} method.
	 *
	 */
	@Test
	public void testInverseMap() {
		HashMap<Integer,String> inputMap = new HashMap<Integer,String>();
		inputMap.put(1, "A");
		inputMap.put(2, "B");
		inputMap.put(7, "X");
		HashMap<String,Integer> result = MapProblems.inverseMap(inputMap);
		assertEquals(1, (int) result.get("A"));
		assertEquals(2, (int) result.get("B"));
		assertEquals(7, (int) result.get("X"));
		
		// Clear out the inputMap
		// Make sure the inverse of an empty map is an empty map, i.e., has size = 0
		inputMap.clear();
		HashMap<String, Integer> returnedMap = MapProblems.inverseMap(inputMap);
		assertEquals(0, returnedMap.size());
	}

	
	/**
	 * Tests for the {@link MapProblems#canTravelTo(HashMap, String, String)} method.
	 *
	 */
	@Test
	public void testCanTravelTo() {
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		ArrayList<String> cities = new ArrayList<String>();
		ArrayList<String> emptyList = new ArrayList<String>();
		/*
		 * The city network represented here looks like this
		 * 
		 *  A->B->D
		 *  \
		 *   ->C->E
		 *  
		 *  F->G->H (H is also connected back to G)
		 *     \
		 *      ->I->J
		 */
		cities.add("B");
		cities.add("C");
		map.put("A", cities);
		cities = new ArrayList<String>();
		cities.add("D");
		map.put("B", cities);
		cities = new ArrayList<String>();
		cities.add("E");
		map.put("C", cities);
		map.put("D", emptyList);
		map.put("E", emptyList);
		cities = new ArrayList<String>();
		cities.add("G");
		map.put("F", cities);
		map.put("H", cities);
		cities = new ArrayList<String>();
		cities.add("H");
		cities.add("I");
		map.put("G", cities);
		cities = new ArrayList<String>();
		cities.add("J");
		map.put("I", cities);
		map.put("J", emptyList);
		assertEquals(true, MapProblems.canTravelTo(map, "A", "B"));
		assertEquals(true, MapProblems.canTravelTo(map, "A", "D"));
		assertEquals(true, MapProblems.canTravelTo(map, "A", "E"));
		assertEquals(false, MapProblems.canTravelTo(map, "A", "F"));
		assertEquals(false, MapProblems.canTravelTo(map, "B", "A"));
		assertEquals(false, MapProblems.canTravelTo(map, "H", "F"));
		assertEquals(true, MapProblems.canTravelTo(map, "H", "G"));
		assertEquals(true, MapProblems.canTravelTo(map, "F", "J"));
		assertEquals(false, MapProblems.canTravelTo(map, "J", "A"));
		
		
	}

}
