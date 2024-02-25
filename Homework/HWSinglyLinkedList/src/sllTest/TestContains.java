package sllTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import sll.ILinkedList;
import sll.SinglyLinkedList;


@RunWith(RunAllTestsTestRunner.class)

public class TestContains {

	private static final Integer i2 = 2;
	private static final Integer i8 = 8;
	private static final Integer i9 = 9;
	private static final Integer i17 = 17;
	private static final Integer i71 = 71;
	private static final Integer i64 = 64;
	private static final Integer i89 = 89;
	private static final Integer i107 = 107;
	private static final Integer i200 = 200;


	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testContainsN01() {
		ILinkedList list1 = new SinglyLinkedList();	

		assertEquals(false, list1.contains(i17));
	} // testContainsN01
	
	@Test
	public void testContainsN02() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		list1.add( i89 );		
		assertEquals(false, list1.contains(i107));
	} // testContainsN02
	
	@Test
	public void testContainsN03() {
		ILinkedList list1 = new SinglyLinkedList();			
		
		
		list1.add( i89 );	
		assertEquals(true, list1.contains(i89));
	} // testContainsN03
	
	@Test
	public void testContainsN04() {
		ILinkedList list1 = new SinglyLinkedList();	
				
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		assertEquals(true, list1.contains(i8));
	} // testContainsN04
	
	@Test
	public void testContainsN05() {
		ILinkedList list1 = new SinglyLinkedList();	
		

		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		assertEquals(true, list1.contains(i2));
	} // testContainsN05
	
	@Test
	public void testContainsN06() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		assertEquals(true, list1.contains(i64));
	} // testContainsN06
	
	@Test
	public void testContainsN07() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		assertEquals(true, list1.contains(i9));
	} // testContainsN07
	
	@Test
	public void testContainsN08() {
		ILinkedList list1 = new SinglyLinkedList();	
		
		list1.add(i8);
		list1.add(i2);
		list1.add(i71);
		list1.add(i64);
		list1.add(i9);		
		
		assertEquals(false, list1.contains(i200));
	} // testContainsN08
	
}
