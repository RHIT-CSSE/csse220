package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;

public class TestSize {

	@Test
	public void testSizeN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		assertEquals((Integer)0, list1.size());
	} // testSizeN01
	
	@Test
	public void testSizeN02() {
		ILinkedList list2 = new SinglyLinkedList();	

		list2.add(5);
		assertEquals((Integer)1, list2.size());
	} // testSizeN02
	
	@Test
	public void testSizeN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(2);
		list1.add(6);
		assertEquals((Integer)2, list1.size());
	} // testSizeN03
	
	@Test
	public void testSizeN04() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		assertEquals((Integer)3, list1.size());
	} // testSizeN04
	
	@Test
	public void testSizeN05() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		list1.add(8);
		assertEquals((Integer)4, list1.size());
	} // testSizeN05
	
} // end class TestSize
