package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionProblemsTest {

	/**
	 * Testing {@link RecursionProblems#mergeStrings(String, String)}
	 */
	@Test
	public void testSeparateAdjacentDuplicates() {
		assertEquals("fo-od", RecursionProblems.separateAdjacentDuplicates("food"));
		assertEquals("bal-lo-on", RecursionProblems.separateAdjacentDuplicates("balloon"));
		assertEquals("bo-ok-ke-eper", RecursionProblems.separateAdjacentDuplicates("bookkeeper"));
		assertEquals("ba-a-ad", RecursionProblems.separateAdjacentDuplicates("baaad"));
		assertEquals("nodups", RecursionProblems.separateAdjacentDuplicates("nodups"));
		assertEquals("", RecursionProblems.separateAdjacentDuplicates(""));
	}
}
