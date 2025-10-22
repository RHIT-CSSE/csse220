package sllTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;

public class TestInsertAtExceptionHandling {


	@Test
	public void testInsertAtExceptionN01() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.insertAtIndex(1, 7);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN01

	@Test
	public void testInsertAtExceptionN02() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.insertAtIndex(-1, 46);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN02

	@Test
	public void testInsertAtExceptionN03() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(0, 7);
		list1.insertAtIndex(0, 8);
		try {
			list1.insertAtIndex(6, 10);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN03

} // end class TestInsertAtExceptionHandling
