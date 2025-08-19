package HW2Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import HW2.HW2;

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
		assertEquals(toAL(a), HW2.threeCharacterStrings("hello"));
	}

	@Test
	public void testThreeCharacterStringsN02() {
		String[] b = { "foo" };
		assertEquals(toAL(b), HW2.threeCharacterStrings("foo"));
	}

	@Test
	public void testThreeCharacterStringsN03() {
		String[] c = {};
		assertEquals(toAL(c), HW2.threeCharacterStrings("qq"));
	}

}
