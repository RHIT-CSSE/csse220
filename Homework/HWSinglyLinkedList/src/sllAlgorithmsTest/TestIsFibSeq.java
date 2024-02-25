package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestIsFibSeq {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testFibSeqN01() {
		ILinkedList list1 = new SinglyLinkedList();

		assertEquals(false, Algorithms.isFibSeq(list1));
	} // testFibSeqN01
	

	@Test
	public void testFibSeqN02() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		assertEquals(false, Algorithms.isFibSeq(list1));
	} // testFibSeqN02
	
	@Test
	public void testFibSeqN03() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		assertEquals(true, Algorithms.isFibSeq(list1));
	} // testFibSeqN03
	
	@Test
	public void testFibSeqN04() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		assertEquals(true, Algorithms.isFibSeq(list1));
	} // testFibSeqN04

	@Test
	public void testFibSeqN05() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals(true, Algorithms.isFibSeq(list1));
	} // testFibSeqN05
	
	@Test
	public void testFibSeqN06() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(200);
		assertEquals(false, Algorithms.isFibSeq(list1));
	} // testFibSeqN06
	
	@Test
	public void testFibSeqN07() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(1000);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		assertEquals(false, Algorithms.isFibSeq(list1));
	} // testFibSeqN07

} // end class TestFibSeq
