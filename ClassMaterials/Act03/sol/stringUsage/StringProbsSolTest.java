package stringUsage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringProbsSolTest {

	@Test
	public void testHasMiddleQ() {
		assertTrue(StringProbsSol.hasMiddleQ("fooQfoo"));
		assertTrue(StringProbsSol.hasMiddleQ("blahQzzzz"));
		assertTrue(StringProbsSol.hasMiddleQ("Q"));
		assertFalse(StringProbsSol.hasMiddleQ("fooZfoo"));
		assertFalse(StringProbsSol.hasMiddleQ("QQQQ"));
		assertFalse(StringProbsSol.hasMiddleQ(""));
	}

	@Test
	public void testFirstMatchesLast() {
		assertTrue(StringProbsSol.firstMatchesLast("abca"));
		assertTrue(StringProbsSol.firstMatchesLast("zbdsadascz"));
		assertTrue(StringProbsSol.firstMatchesLast("h"));
		assertFalse(StringProbsSol.firstMatchesLast("bbca"));
		assertFalse(StringProbsSol.firstMatchesLast("qbdsadascz"));
		assertFalse(StringProbsSol.firstMatchesLast(""));
	}

	@Test
	public void testFirst4Match() {
		assertTrue(StringProbsSol.first4Match("aaaaBBBB", "aaaaCCCC"));
		assertTrue(StringProbsSol.first4Match("aaaaBBBB", "aaaa"));
		assertTrue(StringProbsSol.first4Match("abcdBBBB", "abcd"));
		assertFalse(StringProbsSol.first4Match("aaaBBBB", "aaaCCCC"));
		assertFalse(StringProbsSol.first4Match("abaaBBBB", "aaaa"));
		assertFalse(StringProbsSol.first4Match("abc", "abc"));
	}
	
	@Test
	public void testIsDoubled() {
		assertTrue(StringProbsSol.isDoubled("foofoo"));
		assertTrue(StringProbsSol.isDoubled("zz"));
		assertFalse(StringProbsSol.isDoubled("az"));
		assertFalse(StringProbsSol.isDoubled("foobar"));
		assertFalse(StringProbsSol.isDoubled("fooblah"));
		assertFalse(StringProbsSol.isDoubled("a"));
		assertTrue(StringProbsSol.isDoubled(""));
	}

}
