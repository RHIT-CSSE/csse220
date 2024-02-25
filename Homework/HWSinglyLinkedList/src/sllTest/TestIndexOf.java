package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;


@RunWith(RunAllTestsTestRunner.class)

public class TestIndexOf {

	@Test
	public void testIndexOfN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		assertEquals(-1, list1.indexOf(17));
	} // testIndexOfN01
	
	@Test
	public void testIndexOfN02() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);		
		assertEquals(-1, list1.indexOf(107));
	} // testIndexOfN02
	
	@Test
	public void testIndexOfN03() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add(89);	
		assertEquals(0, list1.indexOf(89));
	} // testIndexOfN03
	
	@Test
	public void testIndexOfN04() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		assertEquals(0, list1.indexOf(8));
	} // testIndexOfN04
	
	@Test
	public void testIndexOfN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		assertEquals(1, list1.indexOf(2));
	} // testIndexOfN05
	
	@Test
	public void testIndexOfN06() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		assertEquals(3, list1.indexOf(64));
	} // testIndexOfN06
	
	@Test
	public void testIndexOfN07() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		assertEquals(4, list1.indexOf(9));
	} // testIndexOfN07
	
	@Test
	public void testIndexOfN08() {
		ILinkedList list1 = new SinglyLinkedList();	
			
		list1.add(8);
		list1.add(2);
		list1.add(71);
		list1.add(64);
		list1.add(9);		
		
		assertEquals(-1, list1.indexOf(200));
	} // testIndexOfN08
	
} // end class TestIndexOf
