package sllTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestSetExceptionHandling {

	@Test
	public void testSetExceptionN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.set(1, 7);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN01

	@Test
	public void testSetExceptionN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		try {
			list1.set(-1, 46);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN02

	@Test
	public void testSetExceptionN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		list1.insert(0, 6);
		list1.insert(0, 2);
		list1.insert(0, 7);
		list1.insert(0, 8);
		try {
			list1.set(6, 10);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testSetExceptionN03

} // end class TestSetExceptionHandling
