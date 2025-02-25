package StringsAndListsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;

@RunWith(RunAllTestsTestRunner.class)

public class TestFirstDifference {

	@Test
	public void testFirstDifferenceN01() {
		assertEquals(1, StringsAndLists.firstDifference("abc", "axy"));
	}

	@Test
	public void testFirstDifferenceN02() {
		assertEquals(2, StringsAndLists.firstDifference("abx", "aby"));
	}

	@Test
	public void testFirstDifferenceN03() {
		assertEquals(0, StringsAndLists.firstDifference("foo", "bar"));
	}

	@Test
	public void testFirstDifferenceN04() {
		assertEquals(-1, StringsAndLists.firstDifference("foo", "foo"));
	}

	@Test
	public void testFirstDifferenceN05() {
		assertEquals(-1, StringsAndLists.firstDifference("", ""));
	}

}
