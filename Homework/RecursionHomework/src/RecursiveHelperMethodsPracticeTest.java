import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecursiveHelperMethodsPracticeTest {

	// **************************************************************
	// Test: findIn
	// **************************************************************
	@Test
	public void testFindIn() {
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] toFind = {1, 2, 3};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {2, 3, 4};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {3, 4, 5};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {4, 5, 6};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {5, 6, 7};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {6, 7, 8};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {7, 8, 9};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
	
		
		
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {1, 3, 5};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {1, 5, 9};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {7, 9};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {5, 7, 9};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
	
		
		
		input = new int[]  {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {10, 20, 30};
		assertFalse(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {9, 5, 1};
		assertFalse(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {8, 9, 10};
		assertFalse(RecursiveHelperMethodsPractice.findIn(input, toFind));
	
		
		
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {1};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {6};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[] {9};
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
	
		
		
		input = new int[100];
		toFind = new int[100];
		
		for(int i = 0; i < 100; i++) {
			input[i] = i;
			toFind[i] = i;
		}
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		toFind = new int[5];
		int index = 0;
		for(int i = 0; i < 100; i++) {
			if(i%9 == 0)
				toFind[index++] = i;
			if(index >= 5)
				break;
		}
		assertTrue(RecursiveHelperMethodsPractice.findIn(input, toFind));
		
		int[] temp = new int[6];
		for(int i = 0; i < 5; i++) {
			temp[i] = toFind[i];
		}
		temp[5] = 10000;
		assertFalse(RecursiveHelperMethodsPractice.findIn(input, temp));
	}
	
	
	// **************************************************************
	// Test: highestSubsequenceSum
	// **************************************************************
	@Test
	public void testHighestSubsequenceSum() {
		
		//edge cases
		int[] testInput = {-1, -2, 3, 4, 6, -2, -2};
		assertEquals(13, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
		
		testInput = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(10, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
	
		testInput = new int[] {1};
		assertEquals(1, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
		
		
		testInput = new int[] {-1, -2, 2, 5, 6, -1, 7, -3};
		assertEquals(19, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
	
		testInput = new int[] {-1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3};
		assertEquals(15, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
		
		testInput = new int[] {-1, -2, -3, -4, -10, 5, 6, -3, -7, -20, -2, -3};
		assertEquals(11, RecursiveHelperMethodsPractice.highestSubsequenceSum(testInput));
		
	}
	
	
	// **************************************************************
	// Test: findThirdGreater
	// **************************************************************
	@Test
	public void testFindThirdGreater() {
		//Test 1
		int[] input = {1, 1, 1};
		int num = 0;
		int res = 2;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		
		//Test 2
		input = new int[] {1, 2, 3, 4, 2, 2, 5, 3, 3, 6, 1, 2, 3, 2, 7};
		num = 3;
		res = 9;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Test3
		input = new int[] {1, 1, 1, 1, 1, 1};
		num = 1;
		res = -1;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Test 4
		input = new int[] {1, 2, 3, 1, 3, 2};
		num = 2;
		res = -1;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		
		
		//Test 5
		input = new int[] {1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2};
		num = 1;
		res = 12;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Test 6
		input = new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
		num = 1;
		res = 2;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Test 7
		input = new int[] {10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
		num = 9;
		res = 2;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		input = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
		num = 9;
		res = 12;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Test 8
		input = new int[] {10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		num = 9;
		res = -1;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
		
		//Big Test
		input = new int[100];
		for(int i = 0; i < 100; i++) {
			if(i%12 == 0)
				input[i] = 1000;
			else
				input[i] = i;
		}
		num = 900;
		res = 24;
		assertEquals(res, RecursiveHelperMethodsPractice.findThirdGreater(input, num));
	}

}

