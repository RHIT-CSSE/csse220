package sll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a collection of test cases for the {@link SinglyLinkedList} class.
 * 
 * @author defoe. Created Nov 7, 2013.
 */
public class SinglyLinkedListTest {

	protected ILinkedList list1, list2, list3;

	/**
	 * Sets up a few {@link SinglyLinkedList} instances to test the {@link SinglyLinkedList}
	 * class.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.list1 = new SinglyLinkedList();
		this.list2 = new SinglyLinkedList();
		this.list3 = new SinglyLinkedList();
	}

	/**
	 * Tests the {@link SinglyLinkedList#add(Object)} method.
	 * 
	 */
	@Test
	public void testAdd() {
		assertEquals("[]", this.list1.toString());
		this.list2.add(5);
		assertEquals("[5] first=[5] last=[5]", this.list2.toString());
		this.list1.add(2);
		assertEquals("[2] first=[2] last=[2]", this.list1.toString());
		this.list1.add(6);
		assertEquals("[2, 6] first=[2] last=[6]", this.list1.toString());
		this.list1.add(7);
		assertEquals("[2, 6, 7] first=[2] last=[7]", this.list1.toString());
	}

	/**
	 * Tests the {@link SinglyLinkedList#size()} method. This method assumes that the
	 * {@link SinglyLinkedList#add(Object)} method works.
	 * 
	 */
	@Test
	public void testSize() {
		assertEquals((Integer)0, this.list1.size());
		this.list2.add(5);
		assertEquals((Integer)1, this.list2.size());
		this.list1.add(2);
		assertEquals((Integer)1, this.list1.size());
		this.list1.add(6);
		assertEquals((Integer)2, this.list1.size());
		this.list1.add(7);
		assertEquals((Integer)3, this.list1.size());
		this.list1.add(8);
		assertEquals((Integer)4, this.list1.size());

	}

	/**
	 * Tests the {@link SinglyLinkedList#insertAtIndex(int, Object)} method.
	 * 
	 */
	@Test
	public void testInsertAtIndex() {
		this.list1.insertAtIndex(0, 6);
		assertEquals("[6] first=[6] last=[6]", this.list1.toString());
		this.list1.insertAtIndex(0, 2);
		assertEquals("[2, 6] first=[2] last=[6]", this.list1.toString());
		this.list1.insertAtIndex(1, 7);
		assertEquals("[2, 7, 6] first=[2] last=[6]", this.list1.toString());
		this.list1.insertAtIndex(0, 8);
		assertEquals("[8, 2, 7, 6] first=[8] last=[6]", this.list1.toString());
		this.list1.insertAtIndex(4, 9);
		assertEquals("[8, 2, 7, 6, 9] first=[8] last=[9]", this.list1.toString());
	}

	/**
	 * Tests the {@link SinglyLinkedList#insertAtIndex(int, Object)} method for bad cases.
	 * 
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testInsertAtIndexBad() {
		this.list1.insertAtIndex(0,6);
		this.list1.insertAtIndex(0,2);
		this.list1.insertAtIndex(1, 7);
		this.list1.insertAtIndex(0, 8);
		this.list1.insertAtIndex(6, 10);
	}

	/**
	 * Tests the {@link SinglyLinkedList#contains(Object)} method.
	 * 
	 */
	@Test
	public void testContains() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		assertTrue(this.list1.contains(2));
		assertTrue(this.list1.contains(6));
		assertTrue(this.list1.contains(7));
		assertTrue(this.list1.contains(8));
		assertTrue(this.list1.contains(9));
		assertFalse(this.list1.contains(4));
		assertFalse(this.list2.contains(4));
		assertFalse(this.list3.contains(4));
	}

	/**
	 * Tests the {@link SinglyLinkedList#remove(Object)} method. This method assumes
	 * that {@link SinglyLinkedList#add(Object)}, {@link SinglyLinkedList#insertAtIndex(int, Object)},
	 * and {@link SinglyLinkedList#size()} all work.
	 * 
	 */
	@Test
	public void testRemove() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		assertTrue(this.list1.remove(6));
		assertEquals((Integer)5, this.list1.size());
		assertEquals( "[8, 2, 7, 9, 7] first=[8] last=[7]", this.list1.toString() );
		assertTrue(this.list1.remove(7));
		assertEquals( "[8, 2, 9, 7] first=[8] last=[7]", this.list1.toString() );
		assertEquals((Integer)4, this.list1.size());
		assertTrue(this.list1.remove(7));
		assertEquals( "[8, 2, 9] first=[8] last=[9]", this.list1.toString() );
		assertEquals((Integer)3, this.list1.size());
		assertTrue(this.list1.remove(8));
		assertEquals( "[2, 9] first=[2] last=[9]", this.list1.toString() );
		assertEquals((Integer)2, this.list1.size());
		assertFalse(this.list1.remove(8));
		assertEquals( "[2, 9] first=[2] last=[9]", this.list1.toString() );
		assertFalse(this.list3.remove(4));
		assertEquals( "[2, 9] first=[2] last=[9]", this.list1.toString() );
	}

	

	/**
	 * 
	 * Tests the {@link SinglyLinkedList#indexOf(Object)} method.
	 * 
	 */
	@Test
	public void testIndexOf() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		assertEquals(1, this.list1.indexOf(2));
		assertEquals(2, this.list1.indexOf(7));
		assertEquals(-1, this.list1.indexOf(12));
		assertEquals(-1, this.list2.indexOf(12));

	}

	/**
	 * Tests the {@link SinglyLinkedList#set(int, Object)} method.
	 */
	@Test
	public void testSet() {
		this.list1.add(1);
		this.list1.add(2);
		this.list1.add(3);
		this.list1.add(4);
		this.list1.add(5);
		this.list1.add(6);
		assertEquals(new Integer(4), this.list1.set(3, 12));
		assertEquals((Integer)6, this.list1.size());
		assertEquals("[1, 2, 3, 12, 5, 6] first=[1] last=[6]", this.list1.toString());
		assertEquals(new Integer(1), this.list1.set(0, 9));
		assertEquals("[9, 2, 3, 12, 5, 6] first=[9] last=[6]", this.list1.toString());
		assertEquals(new Integer(6), this.list1.set(5, 99));
		assertEquals("[9, 2, 3, 12, 5, 99] first=[9] last=[99]", this.list1.toString());
		assertEquals(new Integer(2), this.list1.set(1, 85));
		assertEquals("[9, 85, 3, 12, 5, 99] first=[9] last=[99]", this.list1.toString());
	}

	/**
	 * Tests the {@link SinglyLinkedList#set(int, Object)} method for a bad case.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetBad1() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		this.list1.set(-8, 5);
	}

	/**
	 * Tests the {@link SinglyLinkedList#set(int, Object)} method for another bad
	 * case.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetBad2() {
		this.list1.add(8);
		this.list1.add(2);
		this.list1.add(7);
		this.list1.add(6);
		this.list1.add(9);
		this.list1.add(7);
		this.list1.set(12, 5);
	}

	/**
	 * Tests the {@link SinglyLinkedList#set(int, Object)} method for yet another bad
	 * case.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetBad3() {
		this.list3.set(0, 5);
	}


	
}
