package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionProblemsTest {

	@Test
	public void testReverseWordOrderEmptyString() {
		assertEquals("", RecursionProblems.reverseWordOrder("").trim() );
		assertEquals("", RecursionProblems.reverseWordOrder("   ").trim() );
	}
	
	@Test
	public void testReverseWordOrderOneWordTrimmed() {
		assertEquals("dog", RecursionProblems.reverseWordOrder("dog").trim() );
		assertEquals("monkey", RecursionProblems.reverseWordOrder("monkey ").trim()   );
		assertEquals("fish", RecursionProblems.reverseWordOrder(" fish ").trim()   );
	}
	
	
	
	@Test
	public void testReverseWordOrderTwoWordsTrimmed() {
		assertEquals("a dog", RecursionProblems.reverseWordOrder("dog a").trim() );
		assertEquals("two monkeys", RecursionProblems.reverseWordOrder("monkeys two").trim()   );
		assertEquals("fishing fish", RecursionProblems.reverseWordOrder("fish fishing").trim()   );
	}
	
	
	
	@Test
	public void testReverseWordOrderManyWordsTrimmed() {
		assertEquals("test a is this", RecursionProblems.reverseWordOrder("this is a test").trim()  );
		assertEquals("bear the arm", RecursionProblems.reverseWordOrder("arm the bear").trim()  );
		assertEquals("running went dog big", RecursionProblems.reverseWordOrder("big dog went running").trim()  );
	}
	
	@Test
	public void testForCorrectWordsButPoorSpacing() {
		
		String[] words = RecursionProblems.reverseWordOrder("this is a test").split(" ");
		String ans="";
		for (String word: words) {
			if (!word.equals("")) {
				ans += word + " ";
			}
		}
		ans =ans.trim();
		assertEquals("test a is this", ans );
		
	}
	
	
	
}
	
	
