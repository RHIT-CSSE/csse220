package HW2Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import HW2.HW2;
@RunWith(RunAllTestsTestRunner.class)

public class TestMostCommonCharacter {

	@Test
	public void testMostCommonCharacterN01() {
		assertEquals('a', HW2.mostCommonCharacter("aaab"));
	}
	
	@Test
	public void testMostCommonCharacterN02() {
		assertEquals('a', HW2.mostCommonCharacter("bbaaa"));
	}
	
	@Test
	public void testMostCommonCharacterN03() {
		assertEquals('c', HW2.mostCommonCharacter("abcbcdc"));
	}
	
	@Test
	public void testMostCommonCharacterN04() {
		assertEquals('a', HW2.mostCommonCharacter("a"));
	}
	
	@Test
	public void testMostCommonCharacterN05() {
		assertEquals('l', HW2.mostCommonCharacter("hello"));
	}

}
