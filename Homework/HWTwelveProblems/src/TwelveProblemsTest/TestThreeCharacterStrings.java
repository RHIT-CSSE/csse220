package TwelveProblemsTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)

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
		assertEquals(toAL(a), TwelveProblems.threeCharacterStrings("hello"));
	}

	@Test
	public void testThreeCharacterStringsN02() {
		String[] b = { "foo" };
		assertEquals(toAL(b), TwelveProblems.threeCharacterStrings("foo"));
	}

	@Test
	public void testThreeCharacterStringsN03() {
		String[] c = {};
		assertEquals(toAL(c), TwelveProblems.threeCharacterStrings("qq"));
	}

}
