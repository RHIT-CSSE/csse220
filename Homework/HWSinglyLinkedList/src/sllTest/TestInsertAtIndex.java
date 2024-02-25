package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestInsertAtIndex {

	@Test
	public void testInsertAtIndexN01() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		assertEquals("[6] first=[6] last=[6]", list1.toString());
	} // testInsertAtIndexN01
	
	@Test
	public void testInsertAtIndexN02() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		assertEquals("[2, 6] first=[2] last=[6]", list1.toString());
	} // testInsertAtIndexN02
	
	@Test
	public void testInsertAtIndexN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		assertEquals("[2, 7, 6] first=[2] last=[6]", list1.toString());
	} // testInsertAtIndexN03
	
	@Test
	public void testInsertAtIndexN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		assertEquals("[8, 2, 7, 6] first=[8] last=[6]", list1.toString());
	} // testInsertAtIndexN04
	
	@Test
	public void testInsertAtIndexN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		list1.insertAtIndex(4, 9);
		assertEquals("[8, 2, 7, 6, 9] first=[8] last=[9]", list1.toString());
	} // testInsertAtIndexN05
	
	@Test
	public void testInsertAtIndexN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(1, 7);
		list1.insertAtIndex(0, 8);
		list1.insertAtIndex(4, 9);
		list1.insertAtIndex(2, 31);
		assertEquals("[8, 2, 31, 7, 6, 9] first=[8] last=[9]", list1.toString());
	} // testInsertAtIndexN06
	
} // end class TestInsertAtIndex
