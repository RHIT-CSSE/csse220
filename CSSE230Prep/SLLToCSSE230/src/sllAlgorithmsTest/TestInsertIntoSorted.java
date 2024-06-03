package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestInsertIntoSorted {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testInsertIntoSortedN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insertIntoSorted(1);

		assertEquals("[1]", list1.toString());
	} // testInsertIntoSortedN01
	
	@Test
	public void testInsertIntoSortedN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insertIntoSorted(1);
		list1.insertIntoSorted(-1);		
		assertEquals("[-1, 1]", list1.toString());
	} // testInsertIntoSortedN02
	
	@Test
	public void testInsertIntoSortedN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insertIntoSorted(1);
		list1.insertIntoSorted(-1);
		list1.insertIntoSorted(6);
		assertEquals("[-1, 1, 6]", list1.toString());
	} // testInsertIntoSortedN03
	
	@Test
	public void testInsertIntoSortedN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.insertIntoSorted(1);
		list1.insertIntoSorted(-1);
		list1.insertIntoSorted(3);
		list1.insertIntoSorted(6);
		list1.insertIntoSorted(4);
		assertEquals("[-1, 1, 3, 4, 6]", list1.toString());
	} // testInsertIntoSortedN04
	
} // end class TestInsertIntoSorted
