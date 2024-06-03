package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestSize {

	@Test
	public void testSizeN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		assertEquals(0, list1.size());
	} // testSizeN01
	
	@Test
	public void testSizeN02() {
		SinglyLinkedList list2 = new SinglyLinkedList();	

		list2.add(5);
		assertEquals(1, list2.size());
	} // testSizeN02
	
	@Test
	public void testSizeN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(2);
		list1.add(6);
		assertEquals(2, list1.size());
	} // testSizeN03
	
	@Test
	public void testSizeN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		assertEquals(3, list1.size());
	} // testSizeN04
	
	@Test
	public void testSizeN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		list1.add(8);
		assertEquals(4, list1.size());
	} // testSizeN05
	
} // end class TestSize
