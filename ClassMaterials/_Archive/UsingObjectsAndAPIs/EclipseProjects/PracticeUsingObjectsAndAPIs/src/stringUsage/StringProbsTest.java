package stringUsage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringProbsTest {

	@Test
	public void testHasMiddleQ() {
		assertTrue(StringProbs.hasMiddleQ("fooQfoo"));
		assertTrue(StringProbs.hasMiddleQ("blahQzzzz"));
		assertTrue(StringProbs.hasMiddleQ("Q"));
		assertFalse(StringProbs.hasMiddleQ("fooZfoo"));
		assertFalse(StringProbs.hasMiddleQ("QQQQ"));
		assertFalse(StringProbs.hasMiddleQ(""));
	}

	@Test
	public void testFirstMatchesLast() {
		assertTrue(StringProbs.firstMatchesLast("abca"));
		assertTrue(StringProbs.firstMatchesLast("zbdsadascz"));
		assertTrue(StringProbs.firstMatchesLast("h"));
		assertFalse(StringProbs.firstMatchesLast("bbca"));
		assertFalse(StringProbs.firstMatchesLast("qbdsadascz"));
		assertFalse(StringProbs.firstMatchesLast(""));
	}

	@Test
	public void testFirst4Match() {
		assertTrue(StringProbs.first4Match("aaaaBBBB", "aaaaCCCC"));
		assertTrue(StringProbs.first4Match("aaaaBBBB", "aaaa"));
		assertTrue(StringProbs.first4Match("abcdBBBB", "abcd"));
		assertFalse(StringProbs.first4Match("aaaBBBB", "aaaCCCC"));
		assertFalse(StringProbs.first4Match("abaaBBBB", "aaaa"));
		assertFalse(StringProbs.first4Match("abc", "abc"));
	}
	
	@Test
	public void testIsDoubled() {
		assertTrue(StringProbs.isDoubled("foofoo"));
		assertTrue(StringProbs.isDoubled("zz"));
		assertFalse(StringProbs.isDoubled("az"));
		assertFalse(StringProbs.isDoubled("foobar"));
		assertFalse(StringProbs.isDoubled("fooblah"));
		assertFalse(StringProbs.isDoubled("a"));
		assertTrue(StringProbs.isDoubled(""));
	}

}
