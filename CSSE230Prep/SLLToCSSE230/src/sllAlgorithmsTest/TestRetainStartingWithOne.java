package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestRetainStartingWithOne {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testArraylistOf1sN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.retainStartingWithOne();
		assertEquals("[]", list1.toString());
	} // testArraylistOf1sN01

	@Test
	public void testArraylistOf1sN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		list1.add(1);
		list1.add(2);
		list1.add(3);

		list1.retainStartingWithOne();
		assertEquals("[1]", list1.toString());
	} // testArraylistOf1sN02

	@Test
	public void testArraylistOf1sN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		list1.add(1);
		list1.add(1000);
		list1.add(51111);

		list1.retainStartingWithOne();
		assertEquals("[1, 1000]", list1.toString());
	} // testArraylistOf1sN03

	@Test
	public void testArraylistOf1sN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		list1.add(21);
		list1.add(311);
		list1.add(4111);

		list1.retainStartingWithOne();
		assertEquals("[]", list1.toString());
	} // testArraylistOf1sN04
	
	@Test
	public void testArraylistOf1sN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		list1.add(21);
		list1.add(311);
		list1.add(14111);

		list1.retainStartingWithOne();
		assertEquals("[14111]", list1.toString());
	} // testArraylistOf1sN05

} // end class TestArrayListOf1s
