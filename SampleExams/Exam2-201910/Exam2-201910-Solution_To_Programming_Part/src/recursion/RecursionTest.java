package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest {
	
	
	//Students: these point values are not guaranteed, but may roughly correspond to final assigned grades
	
	//test longestStreakOfAsSimpleCases ~2pts
	@Test
	public void testLongestStreakAsOneStreak() {
		assertEquals(1, Recursion.longestStreakOfAs("A" ));
		assertEquals(3, Recursion.longestStreakOfAs("AAA" ));
		assertEquals(4, Recursion.longestStreakOfAs("AAAA" ));
		assertEquals(0, Recursion.longestStreakOfAs("" ));
	}
	
	//test longestStreakOfAs ~2pt
	@Test
	public void testLongestStreakOfAsTwoItemsCases() {
		assertEquals(2, Recursion.longestStreakOfAs("AA" ));
		assertEquals(1, Recursion.longestStreakOfAs("A A" ));
		assertEquals(2, Recursion.longestStreakOfAs("AA A" ));
		assertEquals(2, Recursion.longestStreakOfAs("A AA" ));
	}
	
	//test longestStreakOfAsSimpleCases ~2pts
	@Test
	public void testLongestStreakOfAsMultiStreak() {
		assertEquals(3, Recursion.longestStreakOfAs("A AA AAA AA" ));
		assertEquals(2, Recursion.longestStreakOfAs("A AA AA A" ));
		assertEquals(3, Recursion.longestStreakOfAs("AAA A A A AA A" ));
		assertEquals(6, Recursion.longestStreakOfAs("AAAAAA A AAA AAAAA A" ));
	}
	
	//moreAsThanAllOthers  ~3pts
	@Test
	public void testMoreAsThanAllOthers() {
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"Apple","Adam","Banana"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Bob","Adam"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Rebecca","Eli","Banana"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"A","C","D","E","A"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"A","A","D","E","A"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"A","A","D","E","A","F"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"A","A","D","E","A","F","A"} ));
	}
	
	//moreAsThanAllOthers  ~1pts
	@Test
	public void testMoreAsThanAllOthersAllorNone() {
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"Apple","Adam","Alan"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Bob","Betty"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Rebecca","Eli","Banana"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"W","C","D","E","X"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"A","A","A","A","A"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"Add","Ann","All","App"} ));
	}
	
	//moreAsThanAllOthers  ~1pts
	@Test
	public void testMoreAsThanAllOthersSingleWordsOrNone() {
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"Apple"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Bob"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Rebecca"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"A"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"E"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"a"} ));
	}
	
	//moreAsThanAllOthers  ~1pts
	@Test
	public void testMoreAsThanAllOthersTwoWords() {
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"Apple","Adam"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Bob", "Adam"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"Alex", "Rebecca"} ));
		assertTrue( Recursion.moreAsThanAllOthers(new String[] {"A","Axis"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"E","AAAAA"} ));
		assertFalse( Recursion.moreAsThanAllOthers(new String[] {"a","b"} ));
	}
	
	
	
	
	//rotateStringNPlaces   ~4 points
	@Test
	public void testRotateStringNPlaces() {
		assertEquals("abcdefg", Recursion.rotateStringNPlaces("abcdefg", 0  )  );
		assertEquals("bcdefga", Recursion.rotateStringNPlaces("abcdefg", 1  )  );
		assertEquals("cdefgab", Recursion.rotateStringNPlaces("abcdefg", 2  )  );
		assertEquals("defgabc", Recursion.rotateStringNPlaces("abcdefg", 3  )  );
		assertEquals("efgabcd", Recursion.rotateStringNPlaces("abcdefg", 4  )  );
		assertEquals("fgabcde", Recursion.rotateStringNPlaces("abcdefg", 5  )  );
		assertEquals("gabcdef", Recursion.rotateStringNPlaces("abcdefg", 6  )  );
		assertEquals("abcdefg", Recursion.rotateStringNPlaces("abcdefg", 7  )  );
	}
	
	
	//rotateStringNPlaces   ~2 points
	@Test
	public void testRotateStringNPlacesOnePlace() {
		assertEquals("", Recursion.rotateStringNPlaces("", 0  )  );
		assertEquals("pplea", Recursion.rotateStringNPlaces("apple", 1  )  );
		assertEquals("ananab", Recursion.rotateStringNPlaces("banana", 1  )  );
		assertEquals("herryc", Recursion.rotateStringNPlaces("cherry", 1  )  );
		assertEquals("pplea", Recursion.rotateStringNPlaces("apple", 1  )  );
		assertEquals("i", Recursion.rotateStringNPlaces("i", 1  )  );
		assertEquals("ot", Recursion.rotateStringNPlaces("to", 1  )  );
	}
	
	
	// totalConsecutiveQs ~ 4pts
	@Test
	public void testTotalConsecutiveQs() {
		 assertEquals(4, Recursion.totalConsecutiveQs("QQQQQ") );
		 assertEquals(0, Recursion.totalConsecutiveQs("") );
		 assertEquals(0, Recursion.totalConsecutiveQs("QbcdQfghQjklmnQp") );
		 assertEquals(2, Recursion.totalConsecutiveQs("QbcQQdhfQQgr") );
		 assertEquals(3, Recursion.totalConsecutiveQs("wwQQqQjQqQcQhcwQQQhcwQ") );
		 assertEquals(6, Recursion.totalConsecutiveQs("wsdclknwdQQQQQwQqdqQQwQQw") );
		 assertEquals(5, Recursion.totalConsecutiveQs("qsQxsQQQQscawQQQ") );
		 assertEquals(4, Recursion.totalConsecutiveQs("QwcwQcQQQQQcwQ") );
		 assertEquals(6, Recursion.totalConsecutiveQs("qwqQQQQQcqQwcQQQ") );
	 }
	

	// totalConsecutiveQs ~ 2pts
	@Test
	public void testTotalConsecutiveQsOneOrTwoChars() {
		assertEquals(0, Recursion.totalConsecutiveQs("Q") );
		assertEquals(1, Recursion.totalConsecutiveQs("QQ") );
		assertEquals(0, Recursion.totalConsecutiveQs("wx") );
		assertEquals(0, Recursion.totalConsecutiveQs("wQ") );
		assertEquals(0, Recursion.totalConsecutiveQs("ww") );

	}

}
	
	