package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;

public class TestRemove {

	@Test
	public void testRemoveN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		assertEquals(false, list1.remove(17));
	} // testRemoveN01
	
	@Test
	public void testRemoveN02() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(false, list1.remove(107));
	} // testRemoveN02
	
	@Test
	public void testRemoveN03() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(true, list1.remove(89));
	} // testRemoveN03
	
	@Test
	public void testRemoveN04() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.remove(89);
		assertEquals(null, list1.getFirst());
	} // testRemoveN04
	
	@Test
	public void testRemoveN05() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.remove(89);
		assertEquals(null, list1.getLast());
	} // testRemoveN05
	
	@Test
	public void testRemoveN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(81));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[21, 71, 61, 91] first=[21] last=[91]", list1.toString());
	} // testRemoveN06
	
	@Test
	public void testRemoveN07() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(71));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[81, 21, 61, 91] first=[81] last=[91]", list1.toString());
	} // testRemoveN07
	
	@Test
	public void testRemoveN08() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(true, list1.remove(91));
		assertEquals((Integer)(originalSize - 1), list1.size());
		assertEquals("[81, 21, 71, 61] first=[81] last=[61]", list1.toString());
	} // testRemoveN08
	
	@Test
	public void testRemoveN09() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(false, list1.remove(200));
		assertEquals((Integer)originalSize, list1.size());
		assertEquals("[81, 21, 71, 61, 91] first=[81] last=[91]", list1.toString());
	} // testRemoveN09
	
} // end class TestRemove
