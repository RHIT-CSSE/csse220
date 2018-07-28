import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class MapAnd2DArrayProblemsTest {

	@Test
	public void testLargestColumn() {
		int[][] test1 =
			{{1,2,3},	
			 {4,1,1}};
		assertEquals(5, MapAnd2DArrayProblems.largestColumn(test1));
		
		int[][] test2 =
			{{1,2,3},	
			 {1,2,1},
			 {3,2,1}};
		assertEquals(6, MapAnd2DArrayProblems.largestColumn(test2));
		
		int[][] test3 =
			{{1,2,3},	
			 {1,2,1},
			 {3,2,1},
			 {1,1,3}};
		assertEquals(8, MapAnd2DArrayProblems.largestColumn(test3));

			
	}
	
	@Test
	public void testDuplicateValue() {
		HashMap<String,String> test = new HashMap<String,String>();
		test.put("a","1");
		test.put("b","2");
		test.put("c","2");
		test.put("d","3");
		System.out.println(test);
		assertEquals("2", MapAnd2DArrayProblems.duplicateValue(test));
		test = new HashMap<String,String>();
		test.put("foo","foo");
		test.put("bar","bar");
		test.put("baz","baz");
		test.put("duplicate","duplicate");
		test.put("other-duplicate","duplicate");
		assertEquals("duplicate", MapAnd2DArrayProblems.duplicateValue(test));
		test = new HashMap<String,String>();
		test.put("foo","foo");
		test.put("bar","bar");
		test.put("baz","baz");
		assertEquals(null, MapAnd2DArrayProblems.duplicateValue(test));
		test = new HashMap<String,String>(); //empty map
		assertEquals(null, MapAnd2DArrayProblems.duplicateValue(test));
	}

}
