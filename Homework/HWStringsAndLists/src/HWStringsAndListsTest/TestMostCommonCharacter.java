package HWStringsAndListsTest;
import static org.junit.Assert.*;
import org.junit.Test;

import HWStringsAndLists.HWStringsAndLists;

public class TestMostCommonCharacter {

	@Test
	public void testMostCommonCharacterN01() {
		assertEquals('a', HWStringsAndLists.mostCommonCharacter("aaab"));
	}
	
	@Test
	public void testMostCommonCharacterN02() {
		assertEquals('a', HWStringsAndLists.mostCommonCharacter("bbaaa"));
	}
	
	@Test
	public void testMostCommonCharacterN03() {
		assertEquals('c', HWStringsAndLists.mostCommonCharacter("abcbcdc"));
	}
	
	@Test
	public void testMostCommonCharacterN04() {
		assertEquals('a', HWStringsAndLists.mostCommonCharacter("a"));
	}
	
	@Test
	public void testMostCommonCharacterN05() {
		assertEquals('l', HWStringsAndLists.mostCommonCharacter("hello"));
	}

}
