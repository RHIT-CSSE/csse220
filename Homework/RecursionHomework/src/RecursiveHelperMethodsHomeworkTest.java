import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecursiveHelperMethodsHomeworkTest {

	// **************************************************************
	// Test: findIn
	// **************************************************************
	@Test
	public void testFindIn() {
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] toFind = {1, 2, 3};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {2, 3, 4};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {3, 4, 5};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {4, 5, 6};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {5, 6, 7};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {6, 7, 8};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {7, 8, 9};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
	
		
		
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {1, 3, 5};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {1, 5, 9};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {7, 9};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {5, 7, 9};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
	
		
		
		input = new int[]  {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {10, 20, 30};
		assertFalse(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {9, 5, 1};
		assertFalse(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {8, 9, 10};
		assertFalse(RecursiveHelperMethodsHomework.findIn(input, toFind));
	
		
		
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		toFind = new int[] {1};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {6};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[] {9};
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
	
		
		
		input = new int[100];
		toFind = new int[100];
		
		for(int i = 0; i < 100; i++) {
			input[i] = i;
			toFind[i] = i;
		}
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		toFind = new int[5];
		int index = 0;
		for(int i = 0; i < 100; i++) {
			if(i%9 == 0)
				toFind[index++] = i;
			if(index >= 5)
				break;
		}
		assertTrue(RecursiveHelperMethodsHomework.findIn(input, toFind));
		
		int[] temp = new int[6];
		for(int i = 0; i < 5; i++) {
			temp[i] = toFind[i];
		}
		temp[5] = 10000;
		assertFalse(RecursiveHelperMethodsHomework.findIn(input, temp));
	}
	
	
	// **************************************************************
	// Test: highestSubsequenceSum
	// **************************************************************
	@Test
	public void testHighestSubsequenceSum() {
		
		//edge cases
		int[] testInput = {-1, -2, 3, 4, 6, -2, -2};
		assertEquals(13, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
		
		testInput = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(10, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
	
		testInput = new int[] {1};
		assertEquals(1, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
		
		
		testInput = new int[] {-1, -2, 2, 5, 6, -1, 7, -3};
		assertEquals(19, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
	
		testInput = new int[] {-1, 2, 3, 4, -10, 5, 6, -3, 7, -20, 2, 3};
		assertEquals(15, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
		
		testInput = new int[] {-1, -2, -3, -4, -10, 5, 6, -3, -7, -20, -2, -3};
		assertEquals(11, RecursiveHelperMethodsHomework.highestSubsequenceSum(testInput));
		
	}
	
	
	// **************************************************************
	// Test: findThirdCapital
	// **************************************************************
  @Test
	public void testFindThirdCapital() {
		//Test 1
		String input = "QQQ";
		int res = 2;
		int actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		
		//Test 2
		input = "abcDefGhiJklmN";
		res = 9;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test3
		input = "abcdef";
		res = -1;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 4
		input = "abCdEf";
		res = -1;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 5
		input = "aaaaAaaaAaaaA";
		res = 12;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 6
		input = "AAAAAAAAAAAAAAAAAAAAAAA";
		res = 2;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 7
		input = "ABCdefghiJKL";
		res = 2;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 8
		input = "0123abcdefgHIJ";
		res = 13;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 9
		input = "0123456789";
		res = -1;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Big Test
		input = "";
		for(int i = 0; i < 100; i++) {
			if(i%12 == 0)
				input += "Q";
			else
				input += "q";
		}
		res = 24;
		actual = RecursiveHelperMethodsHomework.findThirdCapital(input);
		assertEquals(res, actual);
		
	}
}

