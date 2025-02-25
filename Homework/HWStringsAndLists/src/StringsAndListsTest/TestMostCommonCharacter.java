package StringsAndListsTest;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;
@RunWith(RunAllTestsTestRunner.class)

public class TestMostCommonCharacter {

	@Test
	public void testMostCommonCharacterN01() {
		assertEquals('a', StringsAndLists.mostCommonCharacter("aaab"));
	}
	
	@Test
	public void testMostCommonCharacterN02() {
		assertEquals('a', StringsAndLists.mostCommonCharacter("bbaaa"));
	}
	
	@Test
	public void testMostCommonCharacterN03() {
		assertEquals('c', StringsAndLists.mostCommonCharacter("abcbcdc"));
	}
	
	@Test
	public void testMostCommonCharacterN04() {
		assertEquals('a', StringsAndLists.mostCommonCharacter("a"));
	}
	
	@Test
	public void testMostCommonCharacterN05() {
		assertEquals('l', StringsAndLists.mostCommonCharacter("hello"));
	}

}
