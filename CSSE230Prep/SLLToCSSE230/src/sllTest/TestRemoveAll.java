package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)

public class TestRemoveAll {

	@Test
	public void testRemoveAllN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		assertEquals(0, list1.removeAll(17));
	} // testRemoveAllN01
	
	@Test
	public void testRemoveAllN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(0, list1.removeAll(107));
	} // testRemoveAllN02
	
	@Test
	public void testRemoveAllN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);		
		assertEquals(1, list1.removeAll(89));
	} // testRemoveAllN03
	
	@Test
	public void testRemoveAllN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();	

		list1.add(89);	
		list1.removeAll(89);
		assertEquals((0), list1.size());
		assertEquals("[]", list1.toString());
	} // testRemoveAllN04
	
	@Test
	public void testRemoveAllN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(81);
		list1.add(61);
		list1.add(81);
		int originalSize = list1.size();
		assertEquals(3, list1.removeAll(81));
		assertEquals((originalSize - 3), list1.size());
		assertEquals("[21, 61]", list1.toString());
	} // testRemoveAllN05
	
	@Test
	public void testRemoveAllN06() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(1, list1.removeAll(71));
		assertEquals((originalSize - 1), list1.size());
		assertEquals("[81, 21, 61, 91]", list1.toString());
	} // testRemoveAllN06
	
	@Test
	public void testRemoveAllN07() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(1, list1.removeAll(91));
		assertEquals((originalSize - 1), list1.size());
		assertEquals("[81, 21, 71, 61]", list1.toString());
	} // testRemoveAllN07
	
	@Test
	public void testRemoveAllN08() {
		SinglyLinkedList list1 = new SinglyLinkedList();	
		
		list1.add(81);
		list1.add(21);
		list1.add(71);
		list1.add(61);
		list1.add(91);
		int originalSize = list1.size();
		assertEquals(0, list1.removeAll(200));
		assertEquals(originalSize, list1.size());
		assertEquals("[81, 21, 71, 61, 91]", list1.toString());
	} // testRemoveAllN08
	
} // end class TestRemove
