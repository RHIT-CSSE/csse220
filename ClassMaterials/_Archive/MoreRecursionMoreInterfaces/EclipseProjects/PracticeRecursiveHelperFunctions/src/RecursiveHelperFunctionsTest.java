import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class RecursiveHelperFunctionsTest {
	private int[] array;
	
	@Before
	public void setUp(){
		this.array = new int[4];
		for(int i = 1; i < 5; i++){
			this.array[i-1] = i;
		}
	}
	
	@After
	public void tearDown(){
		this.array = null;
	}

	@Test
	public void testSumArray() {
		assertEquals(10, RecursiveHelperFunctions.sumArray(0, 3, array));
		assertEquals(1, RecursiveHelperFunctions.sumArray(0, 0, array));
		assertEquals(4, RecursiveHelperFunctions.sumArray(3, 3, array));
		assertEquals(5, RecursiveHelperFunctions.sumArray(1, 2, array));
	}

	@Test
	public void testSumWholeArray() {
		assertEquals(10, RecursiveHelperFunctions.sumWholeArray(array));
	}

	@Test
	public void testIsOrdered() {
		assertTrue(RecursiveHelperFunctions.isOrdered(new int[] {1,2,3,4}));
		assertTrue(RecursiveHelperFunctions.isOrdered(new int[] {1,2,3}));
		assertFalse(RecursiveHelperFunctions.isOrdered(new int[] {4,1,2,3}));
		assertFalse(RecursiveHelperFunctions.isOrdered(new int[] {1,2,4,3}));
		assertTrue(RecursiveHelperFunctions.isOrdered(new int[] {1}));
		assertTrue(RecursiveHelperFunctions.isOrdered(new int[] {}));
	}

	@Test
	public void testHasExactlyOneUppercase() {
		assertTrue(RecursiveHelperFunctions.hasExactlyOneUppercase("aBc"));
		assertTrue(RecursiveHelperFunctions.hasExactlyOneUppercase("Abc"));
		assertTrue(RecursiveHelperFunctions.hasExactlyOneUppercase("abC"));
		assertTrue(RecursiveHelperFunctions.hasExactlyOneUppercase("A"));
		assertFalse(RecursiveHelperFunctions.hasExactlyOneUppercase("abc"));
		assertFalse(RecursiveHelperFunctions.hasExactlyOneUppercase("AabcB"));
		assertFalse(RecursiveHelperFunctions.hasExactlyOneUppercase("aAbBc"));
		assertFalse(RecursiveHelperFunctions.hasExactlyOneUppercase("aAbBcC"));
		assertFalse(RecursiveHelperFunctions.hasExactlyOneUppercase(""));
	}

	@Test
	public void testLongestChainLength() {
		assertEquals(3, RecursiveHelperFunctions.longestChainLength("aaa"));
		assertEquals(3, RecursiveHelperFunctions.longestChainLength("bbaaa"));
		assertEquals(3, RecursiveHelperFunctions.longestChainLength("bbaccca"));
		assertEquals(0, RecursiveHelperFunctions.longestChainLength(""));
	}

}
