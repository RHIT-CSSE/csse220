package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestRemoveLongNumbers {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testRemoveLongNumbersN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.retainShortNumbers(3);
		assertEquals("[]", list1.toString());
	} // testRemoveLongNumbersN01

	@Test
	public void testRemoveLongNumbersN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(Integer.MIN_VALUE);

		list1.retainShortNumbers(3);
		assertEquals("[]", list1.toString());
	} // testRemoveLongNumbersN02

	@Test
	public void testRemoveLongNumbersN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(Integer.MAX_VALUE);

		list1.retainShortNumbers(3);
		assertEquals("[]", list1.toString());
	} // testRemoveLongNumbersN03

	@Test
	public void testRemoveLongNumbersN04() {
		SinglyLinkedList list2 = new SinglyLinkedList();

		list2.add(1);
		list2.add(1000);
		list2.add(3);
		list2.add(99999);
		list2.add(999);
		list2.retainShortNumbers(3);
		assertEquals("[1, 3, 999]", list2.toString());
	} // testRemoveLongNumbersN04

	@Test
	public void testRemoveLongNumbersN05() {
		SinglyLinkedList list2 = new SinglyLinkedList();

		list2.add(1);
		list2.add(1000);
		list2.add(3);
		list2.add(99999);
		list2.add(999);
		list2.retainShortNumbers(2);
		assertEquals("[1, 3]", list2.toString());
	} // testRemoveLongNumbersN05

	@Test
	public void testRemoveLongNumbersN06() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(-1);
		list1.add(Integer.MIN_VALUE);
		list1.add(-2);

		list1.retainShortNumbers(3);
		assertEquals("[-1, -2]", list1.toString());
	}

	@Test
	public void testRemoveLongNumbersN07() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(999);
		list1.add(1000);

		list1.retainShortNumbers(3);
		assertEquals("[999]", list1.toString());
	}

	@Test
	public void testRemoveLongNumbersN08() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(-1000);
		list1.add(-999);

		list1.retainShortNumbers(3);
		assertEquals("[-999]", list1.toString());
	}

} // end class TestRemoveLongNumbers
