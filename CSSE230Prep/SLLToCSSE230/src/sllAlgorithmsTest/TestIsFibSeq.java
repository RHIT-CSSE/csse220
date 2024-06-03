package sllAlgorithmsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.SinglyLinkedList;

@RunWith(RunAllTestsTestRunner.class)
public class TestIsFibSeq {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testFibSeqN01() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		assertEquals(false, list1.isFibSeq());
	} // testFibSeqN01
	

	@Test
	public void testFibSeqN02() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		assertEquals(false, list1.isFibSeq());
	} // testFibSeqN02
	
	@Test
	public void testFibSeqN03() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		assertEquals(true, list1.isFibSeq());
	} // testFibSeqN03
	
	@Test
	public void testFibSeqN04() {
		SinglyLinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		assertEquals(true, list1.isFibSeq());
	} // testFibSeqN04

	@Test
	public void testFibSeqN05() {
		SinglyLinkedList list1 = new SinglyLinkedList();

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
		assertEquals(true, list1.isFibSeq());
	} // testFibSeqN05
	
	@Test
	public void testFibSeqN06() {
		SinglyLinkedList list1 = new SinglyLinkedList();

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
		assertEquals(false, list1.isFibSeq());
	} // testFibSeqN06
	
	@Test
	public void testFibSeqN07() {
		SinglyLinkedList list1 = new SinglyLinkedList();

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
		assertEquals(false, list1.isFibSeq());
	} // testFibSeqN07

} // end class TestFibSeq
