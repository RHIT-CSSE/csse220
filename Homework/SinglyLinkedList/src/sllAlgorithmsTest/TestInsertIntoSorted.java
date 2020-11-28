package sllAlgorithmsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestInsertIntoSorted {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestInsertIntoSorted.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testInsertIntoSortedN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		numberOfTests++;
		assertEquals("[1] first=[1] last=[1]", list1.toString());
		testsPassed++;
	} // testInsertIntoSortedN01
	
	@Test
	public void testInsertIntoSortedN02() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);
		numberOfTests++;
		assertEquals("[-1, 1] first=[-1] last=[1]", list1.toString());
		testsPassed++;
	} // testInsertIntoSortedN02
	
	@Test
	public void testInsertIntoSortedN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);
		Algorithms.insertIntoSorted(list1, 6);
		numberOfTests++;
		assertEquals("[-1, 1, 6] first=[-1] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertIntoSortedN03
	
	@Test
	public void testInsertIntoSortedN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);
		Algorithms.insertIntoSorted(list1, 6);
		Algorithms.insertIntoSorted(list1, 4);
		numberOfTests++;
		assertEquals("[-1, 1, 4, 6] first=[-1] last=[6]", list1.toString());
		testsPassed++;
	} // testInsertIntoSortedN04
	
} // end class TestInsertIntoSorted
