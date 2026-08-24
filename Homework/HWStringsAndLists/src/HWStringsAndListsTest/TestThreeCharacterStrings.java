package HWStringsAndListsTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import HWStringsAndLists.HWStringsAndLists;

public class TestThreeCharacterStrings {

	private ArrayList<String> toAL(String[] array) {
		ArrayList<String> output = new ArrayList<String>();
		for (String s : array) {
			output.add(s);
		} // end for
		return output;
	} // toAL

	@Test
	public void testThreeCharacterStringsN01() {
		String[] a = { "hel", "ell", "llo" };
		assertEquals(toAL(a), HWStringsAndLists.threeCharacterStrings("hello"));
	}

	@Test
	public void testThreeCharacterStringsN02() {
		String[] b = { "foo" };
		assertEquals(toAL(b), HWStringsAndLists.threeCharacterStrings("foo"));
	}

	@Test
	public void testThreeCharacterStringsN03() {
		String[] c = {};
		assertEquals(toAL(c), HWStringsAndLists.threeCharacterStrings("qq"));
	}

}
