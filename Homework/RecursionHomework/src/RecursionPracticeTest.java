import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

@SuppressWarnings("javadoc")
public class RecursionPracticeTest {

   @Test
   public void testSummation() {
         assertEquals(1, RecursionPractice.summation(1));
         assertEquals(3, RecursionPractice.summation(2));
         assertEquals(55, RecursionPractice.summation(10));
         assertEquals(5050, RecursionPractice.summation(100));
         assertEquals(1275, RecursionPractice.summation(50));
   }

	@Test
	public void testTechnicallyCorrect() {
		assertEquals("", RecursionPractice.technicallyGramaticallyCorrect(0));
		assertEquals("Buffalo ", RecursionPractice.technicallyGramaticallyCorrect(1));
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo ", RecursionPractice.technicallyGramaticallyCorrect(5));
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo ", RecursionPractice.technicallyGramaticallyCorrect(10));
	}

	@Test
	public void testWeirdo() {
		assertEquals("", RecursionPractice.weirdoString(""));
		assertEquals("", RecursionPractice.weirdoString("aaaaaaa"));
		assertEquals("", RecursionPractice.weirdoString("ababababbbaa"));
		assertEquals("A les like  rook.", RecursionPractice.weirdoString("Abba babbles like a brook."));
		assertEquals("QQQn you feel the love tonight?", RecursionPractice.weirdoString("Can you feel the love tonight?"));
		assertEquals("QQQns of y food", RecursionPractice.weirdoString("Cans of baby food"));
		assertEquals("is unmodified", RecursionPractice.weirdoString("is unmodified"));
	}

	@Test
	public void testArrayListSummation() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		assertEquals(6, RecursionPractice.arrayListSummation(values));
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(1);
		values2.add(2);
		values2.add(3);
		values2.add(40);
		assertEquals(46, RecursionPractice.arrayListSummation(values2));
		ArrayList<Integer> values3 = new ArrayList<Integer>();
		values3.add(1);
		values3.add(2);
		values3.add(3);
		values3.add(40);
		values3.add(25);
		assertEquals(71, RecursionPractice.arrayListSummation(values3));
		ArrayList<Integer> values4 = new ArrayList<Integer>();
		values4.add(1);
		values4.add(2);
		values4.add(3);
		values4.add(40);
		values4.add(25);
		values4.add(20000);
		assertEquals(20071, RecursionPractice.arrayListSummation(values4));
		ArrayList<Integer> values5 = new ArrayList<Integer>();
		values5.add(1);
		values5.add(2);
		values5.add(3);
		values5.add(40);
		values5.add(25);
		values5.add(20000);
		values5.add(-71);
		assertEquals(20000, RecursionPractice.arrayListSummation(values5));
	}

	@Test
	public void test3sPrimeFactorization() {
		assertEquals(1, RecursionPractice.countNumberOf3sInPrimeFactorization(3));
		assertEquals(2, RecursionPractice.countNumberOf3sInPrimeFactorization(9));
		assertEquals(0, RecursionPractice.countNumberOf3sInPrimeFactorization(412));
		assertEquals(0, RecursionPractice.countNumberOf3sInPrimeFactorization(0));
		assertEquals(0, RecursionPractice.countNumberOf3sInPrimeFactorization(7675489));
		assertEquals(4, RecursionPractice.countNumberOf3sInPrimeFactorization(234516789));
		assertEquals(15, RecursionPractice.countNumberOf3sInPrimeFactorization(14348907));
	}

	@Test
	public void testBracketMatch() {
		assertEquals(true, RecursionPractice.bracketMatch(""));
		assertEquals(true, RecursionPractice.bracketMatch("()"));
		assertEquals(true, RecursionPractice.bracketMatch("({[<>]})"));
		assertEquals(false, RecursionPractice.bracketMatch("({[<>]])"));
		assertEquals(false, RecursionPractice.bracketMatch("({[<"));
		assertEquals(false, RecursionPractice.bracketMatch(">})]"));
		assertEquals(false, RecursionPractice.bracketMatch("(((()))"));
		assertEquals(false, RecursionPractice.bracketMatch("(((<>))"));
	}
	
	@Test
	public void testPowerOfThree(){
		assertEquals(false, RecursionPractice.evenPowerOfThree(3));
		assertEquals(true, RecursionPractice.evenPowerOfThree(9));
		assertEquals(false, RecursionPractice.evenPowerOfThree(14348907));
		assertEquals(true, RecursionPractice.evenPowerOfThree(4782969));
		assertEquals(true, RecursionPractice.evenPowerOfThree(729));
		assertEquals(false, RecursionPractice.evenPowerOfThree(2187));
	}
	
	@Test
	public void testNoDoubleLetters(){
		assertEquals(false, RecursionPractice.noDoubledLetters("aaaaaaa"));
		assertEquals(false, RecursionPractice.noDoubledLetters("ababababbbaa"));
		assertEquals(false, RecursionPractice.noDoubledLetters("Abba babbles like a brook."));
		assertEquals(false, RecursionPractice.noDoubledLetters("Can you feel the love tonight?"));
		assertEquals(false, RecursionPractice.noDoubledLetters("Cans of baby food"));
		assertEquals(true, RecursionPractice.noDoubledLetters("is unmodified"));
		assertEquals(true, RecursionPractice.noDoubledLetters("works"));
		assertEquals(true, RecursionPractice.noDoubledLetters("nope"));
		assertEquals(true, RecursionPractice.noDoubledLetters("How many licks does it take?"));
		assertEquals(false, RecursionPractice.noDoubledLetters("One, two, three"));
	}
	
	@Test
	public void testNumbersGame(){
		assertEquals(true, RecursionPractice.numbersGame(1));
		assertEquals(true, RecursionPractice.numbersGame(8));
		assertEquals(true, RecursionPractice.numbersGame(9));
		assertEquals(true, RecursionPractice.numbersGame(15));
		assertEquals(false, RecursionPractice.numbersGame(18));
		assertEquals(false, RecursionPractice.numbersGame(21));
	}
	
}
