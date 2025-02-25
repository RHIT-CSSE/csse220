package StringsAndListsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;

@RunWith(RunAllTestsTestRunner.class)
public class TestEndsWithUpperCaseLetter {
	@Test
	public void testEndsWithUpperCaseLetterN01() {
		assertTrue(StringsAndLists.endsWithUpperCaseLetter("doG"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN02() {
		assertFalse(StringsAndLists.endsWithUpperCaseLetter("dog"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN03() {
		assertTrue(StringsAndLists.endsWithUpperCaseLetter("HELLO"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN04() {
		assertFalse(StringsAndLists.endsWithUpperCaseLetter("hello"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN05() {
		assertFalse(StringsAndLists.endsWithUpperCaseLetter(""));
	}

}
