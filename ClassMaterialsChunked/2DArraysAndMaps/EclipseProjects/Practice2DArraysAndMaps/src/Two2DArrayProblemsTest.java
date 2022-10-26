import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Tests the {@link Two2DArrayProblems} class.
 *
 * @author defoe.
 *         Created Dec 15, 2013.
 */
public class Two2DArrayProblemsTest {

	
	
	/**
	 * Tests the {@link Two2DArrayProblems#count4s(int[][])} method.
	 *
	 */
	@Test
	public void testCount4s() {
		
		int[][] intArray1 = 
			{{0,4},
			{4,4}};
		int[][] intArray2 = 
			{{0,0,0},
			{4,4,0}};
		int[][] intArray3 = 
			{{0,0},
			{0,1},
			{1,4}};
		int[][] intArray4 = 
			{{0,0,0,0},
			{1,1,0,0},
			{1,1,0,0},
			{0,0,0,0}};
		
		assertEquals(3, Two2DArrayProblems.count4s(intArray1));
		assertEquals(2, Two2DArrayProblems.count4s(intArray2));
		assertEquals(1, Two2DArrayProblems.count4s(intArray3));
		assertEquals(0, Two2DArrayProblems.count4s(intArray4));
	}

	/**
	 * Tests the {@link Two2DArrayProblems#stringsToCharArrays(String[])} method.
	 *
	 */
	@Test
	public void testStringsToCharArrays() {
		String[] charArray1 = {"abc",
				               "def"};
		char[][] result1 = {{'a','b','c'},
				            {'d','e','f'}};
		String[] charArray2 = {"xy",
				               "zq",
				               "12",
				               "iy"};
		char[][] result2 = {{'x','y'},
	                        {'z','q'},
	                        {'1','2'},
	                        {'i','y'}};

		assertArrayEquals(result1, Two2DArrayProblems.stringsToCharArrays(charArray1));
		assertArrayEquals(result2, Two2DArrayProblems.stringsToCharArrays(charArray2));
	}

	/**
	 * Tests the {@link Two2DArrayProblems#isSymmetric(int[][])} method.
	 *
	 */
	@Test
	public void testIsSymmetric() {
		int[][] intArray1 = 
			{{0,0,0,0},
			{1,1,0,0},
			{1,1,0,0},
			{0,0,0,0}};
		int[][] intArray2 = 
			{{1,0,0,0},
			{0,1,0,0},
			{0,0,1,0},
			{0,0,0,1}};
		int[][] intArray3 = 
			{{1,2,3,4},
			{2,1,5,6},
			{3,5,1,7},
			{4,6,7,1}};
		int[][] intArray4 = 
			{{1,2},
			{2,1}};
		int[][] intArray5 = 
			{{1,1},
			{2,2}};
		assertFalse(Two2DArrayProblems.isSymmetric(intArray1));
		assertTrue(Two2DArrayProblems.isSymmetric(intArray2));
		assertTrue(Two2DArrayProblems.isSymmetric(intArray3));
		assertTrue(Two2DArrayProblems.isSymmetric(intArray4));
		assertFalse(Two2DArrayProblems.isSymmetric(intArray5));
	}

	/**
	 * Tests the {@link Two2DArrayProblems#distanceToExit(char[][])} method.
	 *
	 */
	@Test
	public void testDistanceToExit() {
		char[][] map1 = {{'@','.','.'},
			             {'.','X','.'}};
		char[][] map2 = {{'@','.','X'},
	                     {'X','X','.'}};
		char[][] map3 = {{'X','.'},
                         {'.','.'},
                         {'.','.'},
                         {'.','@'}};
		char[][] map4 = {{'X','.','.','X'},
				         {'X','.','.','@'}};

		assertEquals(2, Two2DArrayProblems.distanceToExit(map1));
		assertEquals(1, Two2DArrayProblems.distanceToExit(map2));
		assertEquals(4, Two2DArrayProblems.distanceToExit(map3));
		assertEquals(1, Two2DArrayProblems.distanceToExit(map4));
	}

}
