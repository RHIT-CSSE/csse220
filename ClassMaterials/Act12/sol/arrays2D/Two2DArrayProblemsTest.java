//package arrays2D;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//
//public class Practice2DArrayProblemsTest {
//
//
//
//	@Test
//	public void testCount4s() {
//
//		int[][] intArray1 =
//			{{0,4},
//			{4,4}};
//		int[][] intArray2 =
//			{{0,0,0},
//			{4,4,0}};
//		int[][] intArray3 =
//			{{0,0},
//			{0,1},
//			{1,4}};
//		int[][] intArray4 =
//			{{0,0,0,0},
//			{1,1,0,0},
//			{1,1,0,0},
//			{0,0,0,0}};
//
//		assertEquals(3, Practice2DArrayProblems.count4s(intArray1));
//		assertEquals(2, Practice2DArrayProblems.count4s(intArray2));
//		assertEquals(1, Practice2DArrayProblems.count4s(intArray3));
//		assertEquals(0, Practice2DArrayProblems.count4s(intArray4));
//	}
//
//	/**
//	 * Tests the {@link Practice2DArrayProblems#numbersToDigitArrays(int[])} method.
//	 *
//	 */
//	@Test
//	public void testNumbersToDigitArrays() {
//		int[] numArray1 = {123,
//				               456};
//		int[][] result1 = {{1,2,3},
//				            {4,5,6}};
//		int[] numArray2 = {78,
//				               96,
//				               12,
//				               38};
//		int[][] result2 = { {7,8},
//	                        {9,6},
//	                        {1,2},
//	                        {3,8}};
//
//		assertArrayEquals(result1, Practice2DArrayProblems.numbersToDigitArrays(numArray1));
//		assertArrayEquals(result2, Practice2DArrayProblems.numbersToDigitArrays(numArray2));
//	}
//
//	@Test
//	public void testIsSymmetric() {
//		int[][] intArray1 =
//			{{0,0,0,0},
//			{1,1,0,0},
//			{1,1,0,0},
//			{0,0,0,0}};
//		int[][] intArray2 =
//			{{1,0,0,0},
//			{0,1,0,0},
//			{0,0,1,0},
//			{0,0,0,1}};
//		int[][] intArray3 =
//			{{1,2,3,4},
//			{2,1,5,6},
//			{3,5,1,7},
//			{4,6,7,1}};
//		int[][] intArray4 =
//			{{1,2},
//			{2,1}};
//		int[][] intArray5 =
//			{{1,1},
//			{2,2}};
//		assertFalse(Practice2DArrayProblems.isSymmetric(intArray1));
//		assertTrue(Practice2DArrayProblems.isSymmetric(intArray2));
//		assertTrue(Practice2DArrayProblems.isSymmetric(intArray3));
//		assertTrue(Practice2DArrayProblems.isSymmetric(intArray4));
//		assertFalse(Practice2DArrayProblems.isSymmetric(intArray5));
//	}
//
//	@Test
//	public void testDistanceToExit() {
//		char[][] map1 = {{'@','.','.'},
//			             {'.','X','.'}};
//		char[][] map2 = {{'@','.','X'},
//	                     {'X','X','.'}};
//		char[][] map3 = {{'X','.'},
//                         {'.','.'},
//                         {'.','.'},
//                         {'.','@'}};
//		char[][] map4 = {{'X','.','.','X'},
//				         {'X','.','.','@'}};
//
//		assertEquals(2, Practice2DArrayProblems.distanceToExit(map1));
//		assertEquals(1, Practice2DArrayProblems.distanceToExit(map2));
//		assertEquals(4, Practice2DArrayProblems.distanceToExit(map3));
//		assertEquals(1, Practice2DArrayProblems.distanceToExit(map4));
//	}
//
//}
