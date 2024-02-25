package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestInsertIntoSorted {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testInsertIntoSortedN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);

		assertEquals("[1] first=[1] last=[1]", list1.toString());
	} // testInsertIntoSortedN01
	
	@Test
	public void testInsertIntoSortedN02() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);		
		assertEquals("[-1, 1] first=[-1] last=[1]", list1.toString());
	} // testInsertIntoSortedN02
	
	@Test
	public void testInsertIntoSortedN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);
		Algorithms.insertIntoSorted(list1, 6);
		assertEquals("[-1, 1, 6] first=[-1] last=[6]", list1.toString());
	} // testInsertIntoSortedN03
	
	@Test
	public void testInsertIntoSortedN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		Algorithms.insertIntoSorted(list1, 1);
		Algorithms.insertIntoSorted(list1, -1);
		Algorithms.insertIntoSorted(list1, 3);
		Algorithms.insertIntoSorted(list1, 6);
		Algorithms.insertIntoSorted(list1, 4);
		assertEquals("[-1, 1, 3, 4, 6] first=[-1] last=[6]", list1.toString());
	} // testInsertIntoSortedN04
	
} // end class TestInsertIntoSorted
