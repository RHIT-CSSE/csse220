package MapsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import MapsHW.Maps;

@RunWith(RunAllTestsTestRunner.class)

public class TestMostCommonCharacter {

	@Test
	public void testMostCommonCharacterN01() {
		assertEquals('a', Maps.mostCommonCharacter("aaab"));
	} // testMostCommonCharacterN01
	
	@Test
	public void testMostCommonCharacterN02() {
		assertEquals('a', Maps.mostCommonCharacter("bbaaa"));
	} // testMostCommonCharacterN02
	
	@Test
	public void testMostCommonCharacterN03() {
		assertEquals('c', Maps.mostCommonCharacter("abcbcdc"));
	} // testMostCommonCharacterN03
	
	@Test
	public void testMostCommonCharacterN04() {
		assertEquals('a', Maps.mostCommonCharacter("a"));
	} // testMostCommonCharacterN04
	
	@Test
	public void testMostCommonCharacterN05() {
		assertEquals('l', Maps.mostCommonCharacter("hello"));
	} // testMostCommonCharacterN05

}
