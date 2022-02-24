import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.junit.Test;

public class MapAnd2DArrayProblemsTest {


	@Test
	public void testRun1() {
		
		int [][] t1 = {{0,0},{0,0},{1,1}};		
		assertEquals(2, MapAnd2DArrayProblems.longest1Run(t1));
		
		int [][] t2 = {{0,0},{0,1},{0,1}};		
		assertEquals(2, MapAnd2DArrayProblems.longest1Run(t2));
		
		int [][] t3 = {{1,0},{0,0},{0,0}};		
		assertEquals(1, MapAnd2DArrayProblems.longest1Run(t3));
		
		int [][] t4 = {{0,1,0},{0,1,0},{0,1,1}};		
		assertEquals(3, MapAnd2DArrayProblems.longest1Run(t4));
		
		int [][] t5 = {{0,0,0,0,0},{0,1,0,0,0},{1,1,1,0,1}};		
		assertEquals(3, MapAnd2DArrayProblems.longest1Run(t5));
		
		int [][] t6 = {{0,0},{0,0},{0,0}};		
		assertEquals(0, MapAnd2DArrayProblems.longest1Run(t6));
		
		int [][] t7 = {{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,1}};		
		assertEquals(2, MapAnd2DArrayProblems.longest1Run(t7));
		
	}

	HashMap<String,String> toMap(String[] names, String[] dateNames) {
		HashMap<String,String> result = new HashMap<String,String>();
		for(int i = 0; i < names.length; i++) {
			result.put(names[i], dateNames[i]);
		}
		return result;
	}
	
	@Test
	public void testUnexpectedSingles() {
		String[] names = {"A", "B", "C"};
		String[] dateNames = {"C", "A", "A"};
		HashMap<String,String> map = toMap(names,dateNames);
		assertEquals("[B]", MapAnd2DArrayProblems.findUnexpectedSingles(map).toString());

		names = new String[] {"A", "B", "C"};
		dateNames = new String[] {"SINGLE", "A", "A"};
		map = toMap(names,dateNames);
		ArrayList<String> result = MapAnd2DArrayProblems.findUnexpectedSingles(map);
		Collections.sort(result);
		assertEquals("[B, C]", result.toString());
		
		names = new String[] {"A", "B", "C"};
		dateNames = new String[] {"B", "C", "A"};
		map = toMap(names,dateNames);
		result = MapAnd2DArrayProblems.findUnexpectedSingles(map);
		Collections.sort(result);
		assertEquals("[A, B, C]", result.toString());
		
		names = new String[] {"A", "B", "C", "D"};
		dateNames = new String[] {"B", "A", "D", "C"};
		map = toMap(names,dateNames);
		result = MapAnd2DArrayProblems.findUnexpectedSingles(map);
		Collections.sort(result);
		assertEquals("[]", result.toString());

		names =     new String[] {"A", "B", "C", "D", "E"};
		dateNames = new String[] {"B", "A", "B", "E", "SINGLE"};
		map = toMap(names,dateNames);
		result = MapAnd2DArrayProblems.findUnexpectedSingles(map);
		Collections.sort(result);
		assertEquals("[C, D]", result.toString());
	}

}
