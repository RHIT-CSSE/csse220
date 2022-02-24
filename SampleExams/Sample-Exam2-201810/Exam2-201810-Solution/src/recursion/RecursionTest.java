package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void testCountVowels(){		
		assertEquals(2, Recursion.countVowels("hello"));
		assertEquals(5, Recursion.countVowels("buffalo hewner"));
		assertEquals(1, Recursion.countVowels("csse220"));
		assertEquals(0, Recursion.countVowels("smthng"));
		assertEquals(9, Recursion.countVowels("this would be a great problem"));
	}
	
	@Test
	public void testCountMovesUntilOne(){		
		assertEquals(0, Recursion.countMovesUntilOne(1));
		assertEquals(1, Recursion.countMovesUntilOne(2));
		assertEquals(3, Recursion.countMovesUntilOne(3));
		assertEquals(2, Recursion.countMovesUntilOne(4));
		assertEquals(5, Recursion.countMovesUntilOne(5));
		assertEquals(6, Recursion.countMovesUntilOne(10));
		assertEquals(9, Recursion.countMovesUntilOne(17));
		assertEquals(10, Recursion.countMovesUntilOne(100));
	}

	@Test
	public void testDoubledArray() {
		assertTrue(Recursion.isDoubledArray(new int[] {1,2,3,1,2,3}));
		assertTrue(Recursion.isDoubledArray(new int[] {4,5,2,3,4,5,2,3}));
		assertFalse(Recursion.isDoubledArray(new int[] {4,5,2,3,8,4,5,2,3}));
		assertTrue(Recursion.isDoubledArray(new int[] {}));
		assertFalse(Recursion.isDoubledArray(new int[] {1,3,3,1}));
		assertFalse(Recursion.isDoubledArray(new int[] {1,4,6,8,10,1,4,6}));
		assertFalse(Recursion.isDoubledArray(new int[] {1}));
		
	}

	@Test
	public void testHasYTripleZ() {
		assertTrue(Recursion.hasYTripleZ("yaazzz"));
		assertTrue(Recursion.hasYTripleZ("yyaazzzzzz"));
		assertTrue(Recursion.hasYTripleZ("iyzzz"));
		assertTrue(Recursion.hasYTripleZ("yzzz"));
		assertTrue(Recursion.hasYTripleZ("iyiizzzi"));
		assertTrue(Recursion.hasYTripleZ("yaybcdzzzezzz"));
		assertTrue(Recursion.hasYTripleZ("iyiizzz"));
		assertFalse(Recursion.hasYTripleZ("yazz"));
		assertFalse(Recursion.hasYTripleZ("ayzz"));
		assertFalse(Recursion.hasYTripleZ("iyiizi"));
		assertFalse(Recursion.hasYTripleZ("eyyeezzzezze"));
	}
}
	
	