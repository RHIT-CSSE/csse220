import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


@SuppressWarnings("javadoc")
public class MapAnd2DArrayHomeworkTest {

	@Test
	public void testMostCommonCharacter() {
		assertEquals('a', MapAnd2DArrayHomework.mostCommonCharacter("aaab"));
		assertEquals('a', MapAnd2DArrayHomework.mostCommonCharacter("bbaaa"));
		assertEquals('c', MapAnd2DArrayHomework.mostCommonCharacter("abcbcdc"));
		assertEquals('a', MapAnd2DArrayHomework.mostCommonCharacter("a"));
		assertEquals('l', MapAnd2DArrayHomework.mostCommonCharacter("hello"));
	}

	@Test
	public void testReverseHashmap() {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "B");
		map.put(2, "B");
		map.put(3, "C");
		map.put(9, "foo");
		map.put(10, "foo");
		map.put(11, "foo");
		map.put(12, "foo");
		
		//It's unlikely (but possible) that your version of the hashmap
		//has the correct results but in different order
		// e.g. B = [2,1] rather than [1,2]
		// if so just put a comment saying as much in your source code
		// and it's fine.
		
		ArrayList<Integer> correct = new ArrayList<Integer>();
		correct.add(3);
		HashMap<String,ArrayList<Integer>> reverse = MapAnd2DArrayHomework.reverseHashmap(map);
		assertEquals(correct,reverse.get("C"));
		correct = new ArrayList<Integer>();
		correct.add(1);
		correct.add(2);
		assertEquals(correct, reverse.get("B"));
		correct = new ArrayList<Integer>();
		correct.add(9);
		correct.add(10);
		correct.add(11);
		correct.add(12);
		assertEquals(correct, reverse.get("foo"));
		//just making sure there's no extra keys in the map
		assertEquals(reverse.size(), 3);
		//try with extra map
		reverse = MapAnd2DArrayHomework.reverseHashmap(new HashMap<Integer,String>());
		assertEquals(reverse.size(), 0);
	}

	@Test
	public void getTemperatureDropCity() {
		String[] city1 = {"la","ny","la","la","ny"};
		int[] temp1 =    { 90,  80,  89,  92,  80 };
		assertEquals("la", MapAnd2DArrayHomework.getTemperatureDropCity(temp1, city1));
		String[] city2 = {"la","ny","la","la","ny"};
		int[] temp2 =    { 90,  80,  91,  92,  80 };
		assertEquals(null, MapAnd2DArrayHomework.getTemperatureDropCity(temp2, city2));
		String[] city3 = {"la","sf","ny","la","la","ny","sf","la","la","ny"};
		int[] temp3 =    { 90,  77,  80,  91,  92,  80,  78,  93,  94,  75};
		assertEquals("ny", MapAnd2DArrayHomework.getTemperatureDropCity(temp3, city3));
		
	}

	
	@Test
	public void testGetNumberOfCoursesToTake() {
		HashMap<String,String> courses = new HashMap<String,String>();
		courses.put("105","104");
		courses.put("104","103");
		courses.put("103", "102");
		courses.put("102", "101");
		courses.put("101", "");
		courses.put("110", "102");
		courses.put("205","204");
		courses.put("204","203");
		courses.put("203", "202");
		courses.put("202", "201");
		courses.put("201", "205");
		courses.put("300", "201");
		
		assertEquals(0,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "101"));
		assertEquals(1,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "102"));
		assertEquals(2,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "103"));
		assertEquals(3,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "104"));
		assertEquals(4,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "105"));
		assertEquals(2,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "110"));
		assertEquals(-1,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "202"));
		assertEquals(-1,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "205"));
		assertEquals(-1,MapAnd2DArrayHomework.getNumberOfCoursesToTake(courses, "300"));
		
	}

	@Test
	public void testIsDiagonal() {
		int[][] array = {{1,0,0},{0,2,0},{0,0,3}};
		assertTrue(MapAnd2DArrayHomework.isDiagonal(array));
		array[0][2] = 44;
		assertFalse(MapAnd2DArrayHomework.isDiagonal(array));
		int[][] array2 = {{0,0},{0,99}};
		assertTrue(MapAnd2DArrayHomework.isDiagonal(array2));
		array2[1][0] = 5;
		assertFalse(MapAnd2DArrayHomework.isDiagonal(array2));
		int[][] array3 = {{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
		assertTrue(MapAnd2DArrayHomework.isDiagonal(array3));
		array3[0][0] = 0;
		array3[0][3] = 5;
		assertFalse(MapAnd2DArrayHomework.isDiagonal(array3));
	}

	@Test
	public void testLongestRepeatSequence() {
		char[][] foo = {{'a','b','c'},{'d','d','e'}};
		assertEquals(2,MapAnd2DArrayHomework.longestRepeatSequence(foo));

		char[][] foo2 = {{'a','b','b'},{'b','e','f'}};
		assertEquals(3,MapAnd2DArrayHomework.longestRepeatSequence(foo2));

		char[][] foo3 = {{'a','b','b'},{'b','e','f'},{'b','e','f'},{'b','e','f'}};
		assertEquals(3,MapAnd2DArrayHomework.longestRepeatSequence(foo3));
		
		char[][] foo4 = {{'a','b','b'},{'b','e','f'},{'b','e','q'},{'q','q','q'}};
		assertEquals(4,MapAnd2DArrayHomework.longestRepeatSequence(foo4));
		
	}

	@Test
	public void testStringFromColumns() {
		char[][] foo = {{'h','l','o'},{'e','l','!'}};
		assertEquals("hello!",MapAnd2DArrayHomework.stringFromColumns(foo));
		
		char[][] foo2 = {{'a','b','c'},{'d','d','e'}};
		assertEquals("adbdce",MapAnd2DArrayHomework.stringFromColumns(foo2));
		
		char[][] foo3 = {{'w',' ','h'},{'h','i','e'},{'a','s','r'},{'t',' ','e'}};
		assertEquals("what is here",MapAnd2DArrayHomework.stringFromColumns(foo3));
	}
	
	private char[][] strArrayToCharArray(String[] input) {
		char[][] result = new char[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				result[i][j] = input[i].charAt(j);
			}
		}
		return result;
	}
	
	@Test
	public void testDistanceArray() {
		
		 String[] test1 = {
		 ".x........",
		 "xxx.......",
		 ".x........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 };
		assertArrayEquals(strArrayToCharArray(test1), MapAnd2DArrayHomework.distanceArray(1, 1, 1));

		 String[] test2 = {
		 "xx........",
		 "x.........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 };
		assertArrayEquals(strArrayToCharArray(test2), MapAnd2DArrayHomework.distanceArray(0, 0, 1));

		String[] test3 = {
		 ".....xxx..",
		 "....xxxxx.",
		 ".....xxx..",
		 "......x...",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 "..........",
		 ".........."};

		assertArrayEquals(strArrayToCharArray(test3), MapAnd2DArrayHomework.distanceArray(1, 6, 2));

		String[] test4 = {
				 "..........",
				 "..........",
				 "..........",
				 "..........",
				 "......x...",
				 ".....xxx..",
				 "....xxxxx.",
				 ".....xxx..",
				 "......x...",
				 ".........."};

		assertArrayEquals(strArrayToCharArray(test4), MapAnd2DArrayHomework.distanceArray(6, 6, 2));
	}

	@Test
	public void testBallRestElevation() {
		int[][] array1 = {
				{9,9,9,9,9,9},
				{9,8,5,4,9,9},
				{9,7,9,9,9,9},
				{9,7,5,2,2,9},
				{9,9,9,9,9,9}};
		assertEquals(4,MapAnd2DArrayHomework.ballRestElevation(array1));
		
		int[][] array3 = {
				{9,9,9,9,9,9},
				{9,8,9,4,1,9},
				{9,7,9,9,2,9},
				{9,6,5,4,3,9},
				{0,9,9,9,9,9}};
		assertEquals(1,MapAnd2DArrayHomework.ballRestElevation(array3));
		
		int[][] array2 = {
				{9,9,9,9,9,9},
				{9,8,6,4,9,9},
				{9,5,9,9,9,9},
				{9,5,5,2,2,9},
				{9,9,9,9,9,9}};
		assertEquals(5,MapAnd2DArrayHomework.ballRestElevation(array2));
		

	}

}
