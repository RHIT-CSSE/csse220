package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestRecursiveGet {


	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetN01() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getFirst()));
	} // testGetN01
	
	@Test
	public void testGetN02() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getLast()));
	} // testGetN02
	
	@Test
	public void testGetN03() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals((Integer)13, Algorithms.recursiveGet(0, list1.getFirst()));
	} // testGetN03
	
	@Test
	public void testGetN04() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals((Integer)21, Algorithms.recursiveGet(1, list1.getFirst()));
	} // testGetN04
	
	@Test
	public void testGetN05() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals((Integer)89, Algorithms.recursiveGet(4, list1.getFirst()));
	} // testGetN05
	
	@Test
	public void testGetN06() {
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals((Integer)89, Algorithms.recursiveGet(0, list1.getLast()));
	} // testGetN06

} // end class TestRecursiveGet
