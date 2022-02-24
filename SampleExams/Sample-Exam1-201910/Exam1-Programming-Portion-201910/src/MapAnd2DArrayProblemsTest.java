import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class MapAnd2DArrayProblemsTest {

	/*******
	 * objects for doing test cases
	 */
	static private HashMap<Integer, String> emptyMap = new HashMap<Integer, String>();
	static private HashMap<Integer, String> m1 = new HashMap<Integer, String>();
	static private String[] birds = {
			/* 87 */ "falcon", 
			/* 91 */ "sparrow", 
			/* 10 */ "woodpecker", 
			/* 11 */ "blackbird", 
			/* 38 */ "nuthatch",
			/* 5 */ "towee", 
			/* 19 */ "woodpecker" };
	static private int[] birdId = { 87, 91, 10, 11, 38, 5, 19 };

	static private HashSet<String> testSet1 = new HashSet<String>();
	static private ArrayList<Integer> keysTestSet1Solution = new ArrayList<Integer>(Arrays.asList(87, 10, 11, 5));

	static private HashSet<String> testSet2 = new HashSet<String>();
	static private ArrayList<Integer> keysTestSet2Solution = new ArrayList<Integer>(Arrays.asList(87, 10, 19));

	static private HashSet<String> emptySet = new HashSet<String>();

	// ********************************************************************

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		for (int k = 0; k < birdId.length; k++) {
			m1.put(birdId[k], birds[k]);
		}

		for (int key : keysTestSet1Solution) {
			testSet1.add(m1.get(key));
		}

		for (int key : keysTestSet2Solution) {
			testSet2.add(m1.get(key));
		}
	}
	
	private boolean equal1Darrays(int [] a1, int[] a2, int column) {
		if (column < 0) {
			return true;
		} else {
			return (a1[column] == a2[column]) && equal1Darrays(a1, a2, (column - 1));
		}
	}
	
	private boolean equal2DArrays(int[][] a1, int [][] a2) {
		int row = 0; 
		while (row < a1.length && equal1Darrays(a1[row], a2[row], (a1[0].length) - 1)) {
			row++;
		} // end while	
		
		return row == a1.length;
	}
	
	@Test
	public void testPutTogether() {
		int [][] a1 = {{0,1},{2,3},{4,5}};
		int [][] a2 = {{6,7}};
		int [][] expectedA1 = {{0,1},{2,3},{4,5},{6,7}};
		
		int [][] result = MapAnd2DArrayProblems.putTogether(a1, a2);
		assertEquals(result.length, 4);
		assertEquals(result[0].length, 2);
		assertTrue(equal2DArrays(result, expectedA1));	
		
		int [][] a3 = {{0,1,-1},{2,3,-10},{4,5,-100}};
		int [][] a4 = {{6,7,800},{5,4,3},{1,2,3},{33,44,55}};
		int [][] expectedA2 = {{0,1,-1},{2,3,-10},{4,5,-100},{6,7,800},{5,4,3},{1,2,3},{33,44,55}};
		
		result = MapAnd2DArrayProblems.putTogether(a3, a4);
		assertEquals(result.length, a3.length + a4.length);
		assertEquals(result[0].length, a3[0].length);
		assertTrue(equal2DArrays(result, expectedA2));	
		
		int [][] a5 = {{0}};
		int [][] a6 = {{1}};
		int [][] expectedA3 = {{0},{1}};
		
		result = MapAnd2DArrayProblems.putTogether(a5, a6);
		assertEquals(result.length, a5.length + a6.length);
		assertEquals(result[0].length, a5[0].length);
		assertTrue(equal2DArrays(result, expectedA3));	
	}

	@Test
	public void testFindKeysThatMatchesValues() {
		ArrayList<Integer> result;

		result = MapAnd2DArrayProblems.findKeysThatMatchesValues(m1, testSet1);
		for (Integer key : keysTestSet1Solution) {
			assertTrue(result.contains(key));
		}

		result = MapAnd2DArrayProblems.findKeysThatMatchesValues(m1, testSet2);
		for (Integer key : keysTestSet2Solution) {
			assertTrue(result.contains(key));
		}

		result = MapAnd2DArrayProblems.findKeysThatMatchesValues(m1, emptySet);
		assertTrue(result.size() == emptySet.size());

		result = MapAnd2DArrayProblems.findKeysThatMatchesValues(emptyMap, testSet1);
		assertTrue(result.size() == emptyMap.size());
	}

}
