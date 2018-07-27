import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;


public class MapAnd2DArrayTest {

	@Test
	public void testWordgameWinner() {
		assertEquals("Bob", MapAnd2DArray.wordgameWinner(
				new String[] {"word"},
				new String[] {"Bob"}));
		assertEquals("Alice", MapAnd2DArray.wordgameWinner(
				new String[] {"word","longer"},
				new String[] {"Bob","Alice"}));
		assertEquals("Bob", MapAnd2DArray.wordgameWinner(
				new String[] {"word","longer","the"},
				new String[] {"Bob","Alice","Bob"}));
		assertEquals("Alice", MapAnd2DArray.wordgameWinner(
				new String[] {"word","waylonger","the"},
				new String[] {"Bob","Alice","Bob"}
				));
		assertEquals("TIE", MapAnd2DArray.wordgameWinner(
				new String[] {"word","waylong","the"},
				new String[] {"Bob","Alice","Bob"}
				));
		assertEquals("TIE", MapAnd2DArray.wordgameWinner(
				new String[] {"word","waylong","the","this"},
				new String[] {"Bob","Alice","Bob","Dave"}
				));
		assertEquals("Alice", MapAnd2DArray.wordgameWinner(
				new String[] {"word","waylonger","the","waylong"},
				new String[] {"Bob","Alice","Bob","Dave"}
				));

	}
	
	@Test
	public void testTranstitiveMap() {
		HashMap<Integer, Integer> test1 = new HashMap<Integer, Integer>();
		test1.put(1, 2);
		test1.put(5, 6);
		test1.put(11, 12);
		
		HashMap<Integer, Integer> test2 = new HashMap<Integer, Integer>();
		test2.put(2, 4);
		test2.put(6, 4);
		test2.put(12, 12);
		
		HashMap<Integer, Integer> result = MapAnd2DArray.transitiveMap(test1, test2);
		assertEquals(4, (int) result.get(1));
		assertEquals(4, (int) result.get(5));
		assertEquals(12, (int) result.get(11));
		
		//DO NOT MODIFY THE PASSED IN MAPS
		assertEquals(2, (int) test1.get(1));
		assertEquals(4, (int) test2.get(2));
		
		// testing with empty maps
		result = MapAnd2DArray.transitiveMap(new HashMap<Integer, Integer>(), new HashMap<Integer, Integer>());
		assertEquals(0, result.size());
	}
	
	@Test
	public void testZeroColumn() {
		
		int[][] test1 = {{1,0,0},
				         {2,0,0},
		                 {0,0,3}};
		
		assertEquals(1, MapAnd2DArray.getZeroColumn(test1));
		
		int[][] test2 = {{1,0,0,0},
  		                 {2,5,0,0},
                         {0,0,3,0}};

        assertEquals(3, MapAnd2DArray.getZeroColumn(test2));
        
		int[][] test3 = {{1,0},
	                     {2,5},
                         {0,0}};

         assertEquals(-1, MapAnd2DArray.getZeroColumn(test3));
         
 		int[][] test4 = {{0,1,2,3,4,5}};

 		assertEquals(0, MapAnd2DArray.getZeroColumn(test4));
 		
 		int[][] test5 = {{-1,1,2,3,4,5}};

 		assertEquals(-1, MapAnd2DArray.getZeroColumn(test5));

 		int[][] test6 = {{-1},
 				         {0},
 				         {0}};

 		assertEquals(-1, MapAnd2DArray.getZeroColumn(test6));
	}

}
