package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestCheckSorted {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testCheckSortedN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		assertEquals(true, list1.checkIfSorted());
	} // testCheckSortedN01

	@Test
	public void testCheckSortedN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(Integer.MAX_VALUE);

		assertEquals(true, list1.checkIfSorted());
	} // testCheckSortedN02

	@Test
	public void testCheckSortedN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(Integer.MAX_VALUE);
		list1.add(Integer.MAX_VALUE);

		assertEquals(true, list1.checkIfSorted());
	} // testCheckSortedN03

	@Test
	public void testCheckSortedN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(Integer.MAX_VALUE);
		list1.add(Integer.MIN_VALUE);
		
		assertEquals(false, list1.checkIfSorted());
	} // testCheckSortedN04

	@Test
	public void testCheckSortedN05() {
		final int maxSize = 101;
		SinglyLinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for

		assertEquals(true, list1.checkIfSorted());
	} // testCheckSortedN05

	@Test
	public void testCheckSortedN06() {
		final int maxSize = 101;
		SinglyLinkedList list1 = new SinglyLinkedList();

		for (int k = 5, z = maxSize; k < z; k += 5) {
			list1.add(k);
		} // end for
		list1.add(Integer.MIN_VALUE);

		assertEquals(false, list1.checkIfSorted());
	} // testCheckSortedN06

} // end class TestCheckSorted
