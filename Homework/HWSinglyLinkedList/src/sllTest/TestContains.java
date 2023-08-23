package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;


public class TestContains {

	private static int testsPassed;
	private static int numberOfTests;
	
	private static final Integer i8 = new Integer(8);
	private static final Integer i2 = new Integer(2);
	private static final Integer i71 = new Integer(71);
	private static final Integer i64 = new Integer(64);
	private static final Integer i9 = new Integer(9);
	private static final Integer i89 = new Integer(89);

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestContains.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testContainsN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		numberOfTests++;
		assertEquals(false, list1.contains(17));
		testsPassed++;
	} // testContainsN01
	
	@Test
	public void testContainsN02() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add( new Integer(89) );		
		numberOfTests++;
		assertEquals(false, list1.contains(107));
		testsPassed++;
	} // testContainsN02
	
	@Test
	public void testContainsN03() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		
		list1.add( i89 );		
		numberOfTests++;
		assertEquals(true, list1.contains(i89));
		testsPassed++;
	} // testContainsN03
	
	@Test
	public void testContainsN04() {
		ILinkedList list1 = new SinglyLinkedList();	
				
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(i8));
		testsPassed++;
	} // testContainsN04
	
	@Test
	public void testContainsN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		

		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(i2));
		testsPassed++;
	} // testContainsN05
	
	@Test
	public void testContainsN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(i64));
		testsPassed++;
	} // testContainsN06
	
	@Test
	public void testContainsN07() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		numberOfTests++;
		assertEquals(true, list1.contains(i9));
		testsPassed++;
	} // testContainsN07
	
	@Test
	public void testContainsN08() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		numberOfTests++;
		assertEquals(false, list1.contains(200));
		testsPassed++;
	} // testContainsN08
	
}
