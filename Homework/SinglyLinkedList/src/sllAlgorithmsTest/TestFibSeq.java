package sllAlgorithmsTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;
import sllAlgorithms.RunAllTests;

public class TestFibSeq {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFibSeq.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testFibSeqN01() {
		ILinkedList list1 = new SinglyLinkedList();

		numberOfTests++;
		assertEquals(false, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
	} // testFibSeqN01
	

	@Test
	public void testFibSeqN02() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		numberOfTests++;
		assertEquals(false, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
	} // testFibSeqN02
	
	@Test
	public void testFibSeqN03() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		numberOfTests++;
		assertEquals(true, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
	} // testFibSeqN03
	
	@Test
	public void testFibSeqN04() {
		ILinkedList list1 = new SinglyLinkedList();

		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		numberOfTests++;
		assertEquals(true, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
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
		numberOfTests++;
		assertEquals(true, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
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
		numberOfTests++;
		assertEquals(false, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
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
		numberOfTests++;
		assertEquals(false, Algorithms.isFibonacciSequence(list1));
		testsPassed++;
	} // testFibSeqN07

} // end class TestFibSeq
