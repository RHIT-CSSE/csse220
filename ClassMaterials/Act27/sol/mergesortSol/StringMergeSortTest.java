package mergesortSol;
import static org.junit.Assert.*;

import org.junit.Test;


public class StringMergeSortTest {

	@Test
	public void testStringMergeSort() {
		assertEquals("abcd", StringMergeSort.stringMergeSort("dacb"));
		assertEquals("abcde", StringMergeSort.stringMergeSort("edacb"));
		assertEquals("aabbddd", StringMergeSort.stringMergeSort("ddbabad"));
		assertEquals("eeggimnorrrsstt", StringMergeSort.stringMergeSort("stringmergesort"));
	}

}
