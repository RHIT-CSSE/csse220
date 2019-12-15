import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class SmallProblemsTest {
	
	@Test
	public void testInterchange() {
		int[] input1 = {1, 2, 3, 4, 5, 6, 7};
		int[] input2 = {10, 20, 30, 40, 50, 60, 70};
		Integer[] resultArray = {1, 70, 2, 60, 3, 50, 4, 40, 5, 30, 6, 20, 7, 10};
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(SmallProblems.interchange(input1, input2)));
		
		input1 = new int[]{100, 200};
		input2 = new int[]{4000, 5000};
		resultArray = new Integer[]{100, 5000, 200, 4000};
		result = new ArrayList<Integer>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(SmallProblems.interchange(input1, input2)));
		
		input1 = new int[]{100};
		input2 = new int[]{4000};
		resultArray = new Integer[]{100, 4000};
		result = new ArrayList<Integer>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(SmallProblems.interchange(input1, input2)));
		
		//big test
		input1 = new int[100];
		input2 = new int[100];
		result = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			input1[i] = i;
			input2[100-i-1] = i*i;
			result.add(i);
			result.add(i*i);
		}
		
		assertTrue(result.equals(SmallProblems.interchange(input1, input2)));
	}
	
	@Test
	public void testFindThePairs() {
		int[] test = {1, 2, 3, 1, 3};
		assertEquals(2, SmallProblems.findThePairs(test));
		
		test = new int[] {1, 1, 2, 3, 2, 3};
		assertEquals(-1, SmallProblems.findThePairs(test));
		
		test = new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4};
		assertEquals(5, SmallProblems.findThePairs(test));
		
		test = new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		assertEquals(-1, SmallProblems.findThePairs(test));
		
		//big test 1, all pairs present
		test = new int[200];
		for(int i = 0; i < 100; i++) {
			test[i] = i;
			test[i+100] = i;
		}
		assertEquals(-1, SmallProblems.findThePairs(test));
		
		//big test 2, one missing pair
		test = new int[199];
		for(int i = 0; i < 99; i++) {
			test[i] = i;
			test[i+100] = i;
		}
		test[99] = 1000;
		assertEquals(1000, SmallProblems.findThePairs(test));
	}
	
	@Test
	public void testGetSubsetStrings() {
		String test = "abc";
		String[] temp = {"a", "ab", "abc", "b", "bc", "c"};
		ArrayList<String> result = new ArrayList<String>(Arrays.asList(temp));
		ArrayList<String> returned = SmallProblems.getSubrangeStrings(test);
		Collections.sort(result);
		Collections.sort(returned);
		assertTrue(result.equals(returned));
		
		test = "abcdef";
		temp = new String[] {"a", "ab", "abc", "abcd", "abcde", "abcdef",
				"b", "bc", "bcd", "bcde", "bcdef",
				"c", "cd", "cde", "cdef",
				"d", "de", "def",
				"e", "ef", 
				"f"};
		
		result = new ArrayList<String>(Arrays.asList(temp));
		returned = SmallProblems.getSubrangeStrings(test);
		Collections.sort(result);
		Collections.sort(returned);
		assertTrue(result.equals(returned));
		
		test = "a";
		temp = new String[] {"a"};
		result = new ArrayList<String>(Arrays.asList(temp));
		assertTrue(result.equals(SmallProblems.getSubrangeStrings(test)));
		
		test = "";
		result = new ArrayList<String>();
		assertTrue(result.equals(SmallProblems.getSubrangeStrings(test)));
		
		
		//big test, iterate over ascii table lower-case characters
		test = "";
		result = new ArrayList<String>();
		int firstAsciiLetter = 97; //ASCII value of letter 'a'
		int lastAsciiLetter = 122; //ASCII value of letter 'z'
		for (int i = 0; i < 200; i++) { //make a 200 character string that contains all lower-case letters
			char tempChar = (char) ((i%(lastAsciiLetter-firstAsciiLetter+1))+firstAsciiLetter);
			test = "" + tempChar + test;
			for(int j = test.length(); j > 0; j--) {
				result.add(0, test.substring(0, j));
			}
		}
		
		returned = SmallProblems.getSubrangeStrings(test);
		Collections.sort(result);
		Collections.sort(returned);
		assertTrue(result.equals(returned));
	}
	
	

	/*
	 * private ArrayList<Integer> nums8421 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums9999 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums888 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums77 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums123 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums56187 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums653 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums32 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums65 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums76 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums3 = new ArrayList<Integer>(); private
	 * ArrayList<Integer> nums765987 = new ArrayList<Integer>();
	 * 
	 * @Test public void testMoveEsToEndSingleOrNoE() { assertEquals("snake" ,
	 * SmallProblems.moveEsToEnd("sneak") ); assertEquals("stake" ,
	 * SmallProblems.moveEsToEnd("steak") ); assertEquals("brake" ,
	 * SmallProblems.moveEsToEnd("break") ); assertEquals("rade" ,
	 * SmallProblems.moveEsToEnd("read") );
	 * 
	 * assertEquals("candy" , SmallProblems.moveEsToEnd("candy") );
	 * assertEquals("dandy" , SmallProblems.moveEsToEnd("dandy") );
	 * assertEquals("fun" , SmallProblems.moveEsToEnd("fun") ); assertEquals("drum"
	 * , SmallProblems.moveEsToEnd("drum") ); assertEquals("jump" ,
	 * SmallProblems.moveEsToEnd("jump") ); }
	 * 
	 * @Test public void testMoveEsToEndMultiE() { assertEquals("atnee" ,
	 * SmallProblems.moveEsToEnd("eaten") ); assertEquals("ltricee" ,
	 * SmallProblems.moveEsToEnd("eletric") ); assertEquals("atnee" ,
	 * SmallProblems.moveEsToEnd("eaten") ); assertEquals("zxccvvcvbvbvbneeeeeeeee"
	 * , SmallProblems.moveEsToEnd("zxcecvevecvbeevbeevbene") ); }
	 * 
	 * 
	 * @Test public void testMoveEsToEndEAlreadyAtEnd() { assertEquals("lee" ,
	 * SmallProblems.moveEsToEnd("lee") ); assertEquals("cake" ,
	 * SmallProblems.moveEsToEnd("cake") ); assertEquals("bake" ,
	 * SmallProblems.moveEsToEnd("bake") ); assertEquals("quake" ,
	 * SmallProblems.moveEsToEnd("quake") ); assertEquals("lake" ,
	 * SmallProblems.moveEsToEnd("lake") ); assertEquals("madee" ,
	 * SmallProblems.moveEsToEnd("meade") ); assertEquals("brathee" ,
	 * SmallProblems.moveEsToEnd("breathe") ); assertEquals("ngagee" ,
	 * SmallProblems.moveEsToEnd("engage") ); assertEquals("nvlopeee" ,
	 * SmallProblems.moveEsToEnd("envelope") ); }
	 * 
	 * @Test public void testMoveEsToEndSimpleCases() { assertEquals("" ,
	 * SmallProblems.moveEsToEnd("") ); assertEquals("e" ,
	 * SmallProblems.moveEsToEnd("e") ); assertEquals("a" ,
	 * SmallProblems.moveEsToEnd("a") );
	 * 
	 * }
	 * 
	 * @Before public void setup() { this.nums8421.addAll(Arrays.asList(8, 4, 2,
	 * 1)); this.nums9999.addAll(Arrays.asList(9, 9, 9, 9));
	 * this.nums123.addAll(Arrays.asList(1,2,3));
	 * this.nums56187.addAll(Arrays.asList(5,6,1,8,7));
	 * this.nums653.addAll(Arrays.asList(6,5,3));
	 * this.nums32.addAll(Arrays.asList(3,2));
	 * this.nums65.addAll(Arrays.asList(6,5));
	 * this.nums76.addAll(Arrays.asList(7,6)); this.nums3.addAll(Arrays.asList(3));
	 * this.nums765987.addAll(Arrays.asList(7,6,5,9,8,7));
	 * this.nums888.addAll(Arrays.asList(8,8,8));
	 * this.nums77.addAll(Arrays.asList(7,7)); }
	 * 
	 * 
	 * //Checking if the longest list is identified correctly
	 * 
	 * @Test public void testFindSmallestNumberInLongestListHomogenousLists() {
	 * ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
	 * test1.add( this.nums77 ); assertEquals( 7,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) ); test1.add(
	 * this.nums888 ); assertEquals( 8,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) ); test1.add(
	 * this.nums9999 ); assertEquals( 9,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) );
	 * 
	 * }
	 * 
	 * 
	 * //Checking if the smallest element in a list is identified correctly
	 * 
	 * @Test public void testFindSmallestNumberInLongestListSingleList() {
	 * ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
	 * ArrayList<ArrayList<Integer>> test2 = new ArrayList<ArrayList<Integer>>();
	 * ArrayList<ArrayList<Integer>> test3 = new ArrayList<ArrayList<Integer>>();
	 * test1.add( this.nums653 ); assertEquals( 3,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) ); test2.add(
	 * this.nums9999 ); assertEquals( 9,
	 * SmallProblems.findSmallestNumberInLongestList( test2 ) ); test3.add(
	 * this.nums123 ); assertEquals( 1,
	 * SmallProblems.findSmallestNumberInLongestList( test3 ) );
	 * 
	 * }
	 * 
	 * @Test public void testFindSmallestNumberInLongestListMultipleLists() {
	 * ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
	 * test1.add( this.nums653 ); assertEquals( 3,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) ); test1.add(
	 * this.nums9999 ); assertEquals( 9,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) ); test1.add(
	 * this.nums56187 ); assertEquals( 1,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) );
	 * test1.add(nums765987); assertEquals( 5,
	 * SmallProblems.findSmallestNumberInLongestList( test1 ) );
	 * 
	 * ArrayList<ArrayList<Integer>> test2 = new ArrayList<ArrayList<Integer>>();
	 * test2.add(nums765987); assertEquals( 5,
	 * SmallProblems.findSmallestNumberInLongestList( test2 ) ); test2.add(
	 * this.nums56187 ); assertEquals( 5,
	 * SmallProblems.findSmallestNumberInLongestList( test2 ) ); test2.add(
	 * this.nums9999 ); assertEquals( 5,
	 * SmallProblems.findSmallestNumberInLongestList( test2 ) ); test2.add(
	 * this.nums653 ); assertEquals( 5,
	 * SmallProblems.findSmallestNumberInLongestList( test2 ) ); }
	 * 
	 */
}

