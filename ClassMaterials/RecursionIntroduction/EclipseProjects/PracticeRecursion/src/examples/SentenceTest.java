package examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Some test cases for Sentence.
 *
 * @author Curt Clifton.
 */
public class SentenceTest {

	private Sentence sentence1;
	private Sentence sentence2;
	private Sentence sentence3;
	private Sentence sentence4;
	private Sentence sentence5;
	private Sentence sentence6;
	private Sentence sentence7;
	private Sentence sentence8;
	private Sentence sentence9;
	private Sentence sentence10;

	/**
	 * Sets up some test sentences.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.sentence1 = new Sentence("deified");
		this.sentence2 = new Sentence("I prefer Pi");
		this.sentence3 = new Sentence("A man, a plan, a canal -- Panama!");
		this.sentence4 = new Sentence("Madam, I'm Adam");
		this.sentence5 = new Sentence("Go hang a salami, I'm a lasagna hog.");
		this.sentence6 = new Sentence("A");
		this.sentence7 = new Sentence("AA");
		this.sentence8 = new Sentence("ABA");
		this.sentence9 = new Sentence("AB");
		this.sentence10 = new Sentence("!AB");
	}

	/**
	 * Test method for {@link examples.Sentence#isPalindrome()}.
	 */
	@Test
	public void testIsPalindrome() {
		assertTrue(this.sentence1.isPalindrome());
		assertTrue(this.sentence2.isPalindrome());
		assertTrue(this.sentence3.isPalindrome());
		assertTrue(this.sentence4.isPalindrome());
		assertTrue(this.sentence5.isPalindrome());
		assertTrue(this.sentence6.isPalindrome());
		assertTrue(this.sentence7.isPalindrome());
		assertTrue(this.sentence8.isPalindrome());
		assertFalse(this.sentence9.isPalindrome());
		assertFalse(this.sentence10.isPalindrome());
	}

	/**
	 * Test method for {@link examples.Sentence#isPalindrome()}.
	 */
	@Test
	public void testReverse() {
		// TODO: implement tests for your reverse method
	}

}
