package TwelveProblemsTest;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;
@RunWith(RunAllTestsTestRunner.class)

public class TestMostCommonCharacter {

	@Test
	public void testMostCommonCharacterN01() {
		assertEquals('a', TwelveProblems.mostCommonCharacter("aaab"));
	}
	
	@Test
	public void testMostCommonCharacterN02() {
		assertEquals('a', TwelveProblems.mostCommonCharacter("bbaaa"));
	}
	
	@Test
	public void testMostCommonCharacterN03() {
		assertEquals('c', TwelveProblems.mostCommonCharacter("abcbcdc"));
	}
	
	@Test
	public void testMostCommonCharacterN04() {
		assertEquals('a', TwelveProblems.mostCommonCharacter("a"));
	}
	
	@Test
	public void testMostCommonCharacterN05() {
		assertEquals('l', TwelveProblems.mostCommonCharacter("hello"));
	}

}
