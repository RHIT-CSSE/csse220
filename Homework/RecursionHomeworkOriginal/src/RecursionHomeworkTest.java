import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

@SuppressWarnings("javadoc")
public class RecursionHomeworkTest {

   @Test
   public void testSummation() {
         assertEquals(1, RecursionHomework.summation(1));
         assertEquals(3, RecursionHomework.summation(2));
         assertEquals(55, RecursionHomework.summation(10));
         assertEquals(5050, RecursionHomework.summation(100));
         assertEquals(1275, RecursionHomework.summation(50));
   }

	@Test
	public void testTechnicallyCorrect() {
		assertEquals("", RecursionHomework.technicallyGramaticallyCorrect(0));
		assertEquals("Buffalo ", RecursionHomework.technicallyGramaticallyCorrect(1));
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo ", RecursionHomework.technicallyGramaticallyCorrect(5));
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo ", RecursionHomework.technicallyGramaticallyCorrect(10));
	}

	@Test
	public void testWeirdo() {
		assertEquals("", RecursionHomework.weirdoString(""));
		assertEquals("", RecursionHomework.weirdoString("aaaaaaa"));
		assertEquals("", RecursionHomework.weirdoString("ababababbbaa"));
		assertEquals("A les like  rook.", RecursionHomework.weirdoString("Abba babbles like a brook."));
		assertEquals("QQQn you feel the love tonight?", RecursionHomework.weirdoString("Can you feel the love tonight?"));
		assertEquals("QQQns of y food", RecursionHomework.weirdoString("Cans of baby food"));
		assertEquals("is unmodified", RecursionHomework.weirdoString("is unmodified"));
	}

	@Test
	public void testArrayListSummation() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		assertEquals(6, RecursionHomework.arrayListSummation(values));
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(1);
		values2.add(2);
		values2.add(3);
		values2.add(40);
		assertEquals(46, RecursionHomework.arrayListSummation(values2));
		ArrayList<Integer> values3 = new ArrayList<Integer>();
		values3.add(1);
		values3.add(2);
		values3.add(3);
		values3.add(40);
		values3.add(25);
		assertEquals(71, RecursionHomework.arrayListSummation(values3));
		ArrayList<Integer> values4 = new ArrayList<Integer>();
		values4.add(1);
		values4.add(2);
		values4.add(3);
		values4.add(40);
		values4.add(25);
		values4.add(20000);
		assertEquals(20071, RecursionHomework.arrayListSummation(values4));
		ArrayList<Integer> values5 = new ArrayList<Integer>();
		values5.add(1);
		values5.add(2);
		values5.add(3);
		values5.add(40);
		values5.add(25);
		values5.add(20000);
		values5.add(-71);
		assertEquals(20000, RecursionHomework.arrayListSummation(values5));
	}

	@Test
	public void test3sPrimeFactorization() {
		assertEquals(1, RecursionHomework.countNumberOf3sInPrimeFactorization(3));
		assertEquals(2, RecursionHomework.countNumberOf3sInPrimeFactorization(9));
		assertEquals(0, RecursionHomework.countNumberOf3sInPrimeFactorization(412));
		assertEquals(0, RecursionHomework.countNumberOf3sInPrimeFactorization(0));
		assertEquals(0, RecursionHomework.countNumberOf3sInPrimeFactorization(7675489));
		assertEquals(4, RecursionHomework.countNumberOf3sInPrimeFactorization(234516789));
		assertEquals(15, RecursionHomework.countNumberOf3sInPrimeFactorization(14348907));
	}

	@Test
	public void testBracketMatch() {
		assertEquals(true, RecursionHomework.bracketMatch(""));
		assertEquals(true, RecursionHomework.bracketMatch("()"));
		assertEquals(true, RecursionHomework.bracketMatch("({[<>]})"));
		assertEquals(false, RecursionHomework.bracketMatch("({[<>]])"));
		assertEquals(false, RecursionHomework.bracketMatch("({[<"));
		assertEquals(false, RecursionHomework.bracketMatch(">})]"));
		assertEquals(false, RecursionHomework.bracketMatch("(((()))"));
		assertEquals(false, RecursionHomework.bracketMatch("(((<>))"));
	}
	
	@Test
	public void testPowerOfThree(){
		assertEquals(false, RecursionHomework.evenPowerOfThree(3));
		assertEquals(true, RecursionHomework.evenPowerOfThree(9));
		assertEquals(false, RecursionHomework.evenPowerOfThree(14348907));
		assertEquals(true, RecursionHomework.evenPowerOfThree(4782969));
		assertEquals(true, RecursionHomework.evenPowerOfThree(729));
		assertEquals(false, RecursionHomework.evenPowerOfThree(2187));
	}
	
	@Test
	public void testNoDoubleLetters(){
		assertEquals(false, RecursionHomework.noDoubledLetters("aaaaaaa"));
		assertEquals(false, RecursionHomework.noDoubledLetters("ababababbbaa"));
		assertEquals(false, RecursionHomework.noDoubledLetters("Abba babbles like a brook."));
		assertEquals(false, RecursionHomework.noDoubledLetters("Can you feel the love tonight?"));
		assertEquals(false, RecursionHomework.noDoubledLetters("Cans of baby food"));
		assertEquals(true, RecursionHomework.noDoubledLetters("is unmodified"));
		assertEquals(true, RecursionHomework.noDoubledLetters("works"));
		assertEquals(true, RecursionHomework.noDoubledLetters("nope"));
		assertEquals(true, RecursionHomework.noDoubledLetters("How many licks does it take?"));
		assertEquals(false, RecursionHomework.noDoubledLetters("One, two, three"));
	}
	
	@Test
	public void testNumbersGame(){
		assertEquals(true, RecursionHomework.numbersGame(1));
		assertEquals(true, RecursionHomework.numbersGame(8));
		assertEquals(true, RecursionHomework.numbersGame(9));
		assertEquals(true, RecursionHomework.numbersGame(15));
		assertEquals(false, RecursionHomework.numbersGame(18));
		assertEquals(false, RecursionHomework.numbersGame(21));
	}
	
}
