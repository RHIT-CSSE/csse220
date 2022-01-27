package sllAlgorithmsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestCheckSorted {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestCheckSorted.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testCheckSortedN01(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		numberOfTests++;
		assertEquals(true, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN01
	
	@Test
	public void testCheckSortedN02(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(Integer.MAX_VALUE);
		numberOfTests++;
		assertEquals(true, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN02
	
	@Test
	public void testCheckSortedN03(){
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(Integer.MIN_VALUE);
		list1.add(Integer.MAX_VALUE);
		numberOfTests++;
		assertEquals(true, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN03
	
	@Test
	public void testCheckSortedN04(){
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(Integer.MAX_VALUE);
		list1.add(Integer.MIN_VALUE);
		numberOfTests++;
		assertEquals(false, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN04
	
	@Test
	public void testCheckSortedN05() {
		final int maxSize = 101;
		ILinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for

		numberOfTests++;
		assertEquals(true, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN05
	
	@Test
	public void testCheckSortedN06() {
		final int maxSize = 101;
		ILinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for
		list1.add(Integer.MIN_VALUE);

		numberOfTests++;
		assertEquals(false, Algorithms.checkSorted(list1));
		testsPassed++;
	} // testCheckSortedN06	

} // end class TestCheckSorted
