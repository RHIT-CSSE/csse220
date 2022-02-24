import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class MapProblemsTest {

	@Test
	public void testNicknames() {
		String[] names = {"Alice","Bill","Charles"};
		String[] test1 = {"Foo","Bar","Foo"};
		String[] test2 = {"Foo","Bar","Baz"};
		String[] test3 = {"Foo","Baz","Baz"};
		assertEquals("Foo", MapProblems.duplicateNicknames(names, test1));
		assertEquals(null, MapProblems.duplicateNicknames(names, test2));
		assertEquals("Baz", MapProblems.duplicateNicknames(names, test3));
	}

	@Test
	public void testComputeScore() {
		assertEquals(7, MapProblems.computeScore("ABAA"));
		assertEquals(7, MapProblems.computeScore("BAAA"));
		assertEquals(3, MapProblems.computeScore("ABC"));
		assertEquals(6, MapProblems.computeScore("ABAB"));
	}

	@Test
	public void testReverseMap() {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		HashMap<String,Integer> result = MapProblems.reverseMap(map);
		assertEquals(1, (int) result.get("A"));
		assertEquals(2, (int) result.get("B"));
		assertEquals(3, (int) result.get("C"));
	}

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
		assertTrue(MapProblems.canTravelTo(map, "A", "B"));
		assertTrue(MapProblems.canTravelTo(map, "A", "D"));
		assertTrue(MapProblems.canTravelTo(map, "A", "E"));
		assertFalse(MapProblems.canTravelTo(map, "A", "F"));
		assertFalse(MapProblems.canTravelTo(map, "B", "A"));
		assertFalse(MapProblems.canTravelTo(map, "H", "F"));
		assertTrue(MapProblems.canTravelTo(map, "H", "G"));
		assertTrue(MapProblems.canTravelTo(map, "F", "J"));
		assertFalse(MapProblems.canTravelTo(map, "J", "A"));
		
		
	}

}
