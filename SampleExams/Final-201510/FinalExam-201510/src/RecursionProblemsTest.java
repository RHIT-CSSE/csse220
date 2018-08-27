import static org.junit.Assert.*;

import org.junit.Test;


public class RecursionProblemsTest {

	@Test
	public void testIsClosedBrackets() {
		assertTrue(RecursionProblems.isClosedBrackets(""));
		assertTrue(RecursionProblems.isClosedBrackets("                          "));
		assertTrue(RecursionProblems.isClosedBrackets("{}"));
		assertTrue(RecursionProblems.isClosedBrackets(" { } "));
		assertTrue(RecursionProblems.isClosedBrackets("{                       }"));
		assertTrue(RecursionProblems.isClosedBrackets("          {}              "));
		assertTrue(RecursionProblems.isClosedBrackets("{  }"));
		assertTrue(RecursionProblems.isClosedBrackets("{ }  "));
		assertTrue(RecursionProblems.isClosedBrackets("{{}}"));
		assertTrue(RecursionProblems.isClosedBrackets("{  {   }     }   "));
		assertTrue(RecursionProblems.isClosedBrackets("{{  {   {       {}   }   }   }}"));
		assertFalse(RecursionProblems.isClosedBrackets("{"));
		assertFalse(RecursionProblems.isClosedBrackets("}"));
		assertFalse(RecursionProblems.isClosedBrackets("{{{}}"));
		assertFalse(RecursionProblems.isClosedBrackets("{{}}}"));
		assertFalse(RecursionProblems.isClosedBrackets(" {   {    }    "));
		assertFalse(RecursionProblems.isClosedBrackets("   { {{  }  }   }   }"));
		assertFalse(RecursionProblems.isClosedBrackets("{ { { { { { { { "));
		assertFalse(RecursionProblems.isClosedBrackets("} } } } } }    } }   }"));
		assertFalse(RecursionProblems.isClosedBrackets("{}{}{}{}{}"));
	}
	
	@Test
	public void testTripler() {
		assertEquals("aaabbbccc", RecursionProblems.tripler("abc"));
		assertEquals("aaa", RecursionProblems.tripler("a"));
		assertEquals("cccoooooolll", RecursionProblems.tripler("cool"));
		assertEquals("aaa   bbbiiirrrddd", RecursionProblems.tripler("a bird"));
		assertEquals("", RecursionProblems.tripler(""));
		assertEquals("aaaaaaaaa", RecursionProblems.tripler("aaa"));
	}

}
