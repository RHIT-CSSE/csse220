package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void testCountConsecutiveLettersMixed(){		
		assertEquals(1, Recursion.countConsecutivePairs("hello"));
		assertEquals(3, Recursion.countConsecutivePairs("mississippi"));
		assertEquals(2, Recursion.countConsecutivePairs("csse220"));
		assertEquals(4, Recursion.countConsecutivePairs("EEEEeek!"));
		assertEquals(0, Recursion.countConsecutivePairs("ababababa"));
		assertEquals(3, Recursion.countConsecutivePairs("bsdvsdaaasdds"));
		assertEquals(2, Recursion.countConsecutivePairs("sdcdscaaa"));
		assertEquals(2, Recursion.countConsecutivePairs("aaasdcdsc"));
	}
	
	@Test
	public void testCountConsecutiveLettersLongNoConsecutives() {
		assertEquals(0, Recursion.countConsecutivePairs("smthng"));
		assertEquals(0, Recursion.countConsecutivePairs("ababababa"));
		assertEquals(0, Recursion.countConsecutivePairs("abcdabcdcdba"));
		assertEquals(0, Recursion.countConsecutivePairs("wyuwkenyuaewewkdkg"));
		assertEquals(0, Recursion.countConsecutivePairs("eyhdbwghfyfhfhfhrhrhth"));
	}
	
	@Test
	public void testCountConsecutiveLettersEmptyString(){		
		assertEquals(0, Recursion.countConsecutivePairs(""));
	}
	
	@Test
	public void testCountConsecutiveLettersSingleCharacter(){		
		assertEquals(0, Recursion.countConsecutivePairs("a"));
		assertEquals(1, Recursion.countConsecutivePairs("aa"));
		assertEquals(2, Recursion.countConsecutivePairs("aaa"));
		assertEquals(3, Recursion.countConsecutivePairs("aaaa"));
		assertEquals(4, Recursion.countConsecutivePairs("aaaaa"));
		assertEquals(5, Recursion.countConsecutivePairs("aaaaaa"));
	}
	
	@Test
	public void testEvensOddsOrTieEMPTY(){		
		assertEquals("tie", Recursion.evensOddsOrTie(new int[] {} ));
	}
	
	@Test
	public void testEvensOddsOrTieTIED(){		
		assertEquals("tie", Recursion.evensOddsOrTie(new int[] {1,2,3,4,5,6} ));
		assertEquals("tie", Recursion.evensOddsOrTie(new int[] {1,1,1,2,2,2} ));
	}
	
	@Test
	public void testEvensOddsOrTieODDS(){		
		assertEquals("odds", Recursion.evensOddsOrTie(new int[] {2,3,4,5,1} ));
		assertEquals("odds", Recursion.evensOddsOrTie(new int[] {1,7,3,4,5,6} ));
		assertEquals("odds", Recursion.evensOddsOrTie(new int[] {1} ));
	}
	
	@Test
	public void testEvensOddsOrTieEVENS(){		
		assertEquals("evens", Recursion.evensOddsOrTie(new int[] {2,3,4,5,6} ));
		assertEquals("evens", Recursion.evensOddsOrTie(new int[] {2} ));
		assertEquals("evens", Recursion.evensOddsOrTie(new int[] {1,1,1,1,1,4,4,6,8,10,12,14,16} ));
	}

	@Test
	public void testHasPositiveNegativeExactMatchesEmptyAndSingleELementArrays() {
		assertTrue(Recursion.hasMatchingPositiveAndNegatives(new int[] {}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {2}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {-2}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {1}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {-1}));
	}
	
	@Test
	public void testHasPositiveNegativeExactMatchesMultipleElements() {
		assertTrue(Recursion.hasMatchingPositiveAndNegatives(new int[] {1,2,3,-3,-2,-1}));
		assertTrue(Recursion.hasMatchingPositiveAndNegatives(new int[] {1,2,3,-3,-2,-1}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {2,2,-1,-3}));
		assertFalse(Recursion.hasMatchingPositiveAndNegatives(new int[] {2,-1,-1}));
	}
	
	@Test
	public void testAverageWordLengthEmptyString() {
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "" }), 0.001  );
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "","" }), 0.001  );
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "","","" }), 0.001  );
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "","","","" }), 0.001  );
		
	}
	
	@Test
	public void testAverageWordLengthLessThanOne() {
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "" }), 0.001  );
		assertEquals(0.5, Recursion.averageWordLength( new String[] { "","a" }), 0.001  );
		assertEquals(0.0, Recursion.averageWordLength( new String[] { "","","" }), 0.001  );
		assertEquals(0.25, Recursion.averageWordLength( new String[] { "","a","","" }), 0.001  );
		assertEquals(0.11111111, Recursion.averageWordLength( new String[] { "","","","","","","","","a"   }), 0.001  );
		
	}

	@Test
	public void testAverageWordLengthOneOrMore() {
		assertEquals(2.0, Recursion.averageWordLength( new String[] { "a","aa","aaa"   }), 0.001  );
		assertEquals(3.0, Recursion.averageWordLength( new String[] { "abc","aad","aaa"   }), 0.001  );
		assertEquals(1.0, Recursion.averageWordLength( new String[] { "a","c","d","e","f","g"   }), 0.001  );
		assertEquals(3.2, Recursion.averageWordLength( new String[] { "ab","aa","aa", "adece", "asdf4" }), 0.001  );
		assertEquals(5.0, Recursion.averageWordLength( new String[] { "a745t4545t5","a","aaa"   }), 0.001  );
		assertEquals(1.0, Recursion.averageWordLength( new String[] { "","","aaa"   }), 0.001  );
	}
	
	
	
	@Test
	public void testIsAVowelPalindrome() {
		assertTrue(Recursion.isAVowelPalindrome(""));
		assertTrue(Recursion.isAVowelPalindrome("a"));
		assertTrue(Recursion.isAVowelPalindrome("e"));
		assertTrue(Recursion.isAVowelPalindrome("i"));
		assertTrue(Recursion.isAVowelPalindrome("o"));
		assertTrue(Recursion.isAVowelPalindrome("uu"));
		assertTrue(Recursion.isAVowelPalindrome("anbdcea"));
		assertTrue(Recursion.isAVowelPalindrome("aeaea"));
		assertTrue(Recursion.isAVowelPalindrome("aeiouoiea"));
		
		assertFalse(Recursion.isAVowelPalindrome("aeiou"));
		assertFalse(Recursion.isAVowelPalindrome("aeiae"));
		assertFalse(Recursion.isAVowelPalindrome("ea"));

	}
	
	
}
	
	