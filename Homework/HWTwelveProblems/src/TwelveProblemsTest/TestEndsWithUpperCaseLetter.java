package TwelveProblemsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import TwelveProblems.TwelveProblems;

@RunWith(RunAllTestsTestRunner.class)
public class TestEndsWithUpperCaseLetter {
	@Test
	public void testEndsWithUpperCaseLetterN01() {
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("doG"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN02() {
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("dog"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN03() {
		assertTrue(TwelveProblems.endsWithUpperCaseLetter("HELLO"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN04() {
		assertFalse(TwelveProblems.endsWithUpperCaseLetter("hello"));
	}

	@Test
	public void testEndsWithUpperCaseLetterN05() {
		assertFalse(TwelveProblems.endsWithUpperCaseLetter(""));
	}

}
