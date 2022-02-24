package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;

public class TestSize {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestSize.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testSizeN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals((Integer)0, list1.size());
		testsPassed++;
	} // testSizeN01
	
	@Test
	public void testSizeN02() {
		ILinkedList list2 = new SinglyLinkedList();	

		numberOfTests++;
		list2.add(5);
		assertEquals((Integer)1, list2.size());
		testsPassed++;
	} // testSizeN02
	
	@Test
	public void testSizeN03() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(2);
		list1.add(6);
		numberOfTests++;
		assertEquals((Integer)2, list1.size());
		testsPassed++;
	} // testSizeN03
	
	@Test
	public void testSizeN04() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		numberOfTests++;
		assertEquals((Integer)3, list1.size());
		testsPassed++;
	} // testSizeN04
	
	@Test
	public void testSizeN05() {
		ILinkedList list1 = new SinglyLinkedList();	

		list1.add(2);
		list1.add(6);
		list1.add(7);	
		list1.add(8);
		numberOfTests++;
		assertEquals((Integer)4, list1.size());
		testsPassed++;
	} // testSizeN05
	
} // end class TestSize
