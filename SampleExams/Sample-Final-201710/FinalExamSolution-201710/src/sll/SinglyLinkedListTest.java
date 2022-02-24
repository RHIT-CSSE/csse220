package sll;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
	
	SinglyLinkedList list, list2, list3;

	@Before
	public void setUp()  {
		this.list = new SinglyLinkedList();
		this.list2 = new SinglyLinkedList();
		this.list2.addFirst("q");
		this.list2.addFirst("v");
		this.list2.addFirst("x");
		this.list2.addFirst("w");
		this.list3 = new SinglyLinkedList();
		this.list3.addFirst("3");
		this.list3.addFirst("2");
		this.list3.addFirst("1");
	}

	@After
	public void tearDown() throws Exception {
		this.list = null;
		this.list2 = null;
	}

	@Test
	public void testGetDuplicate() {
		//list2 is w x v q
		this.list2.addFirst("x"); 
		this.list2.addFirst("zzz");
		assertEquals("x", list2.getDuplicate());
		
		// list3 is 1 2 3
		assertEquals(null, list3.getDuplicate());
		list3.addFirst("3"); //contains a 3 already
		assertEquals("3", list3.getDuplicate());
		
		//list is empty
		assertEquals(null, list.getDuplicate());
		list.addFirst("foo");
		list.addFirst("foo");
		assertEquals("foo", list.getDuplicate());
	}
	
	@Test
	public void testDelRange() {
		//list2 is w x v q
		list2.delRange(1, 1); // should remove nothing
		assertEquals("q", list2.removeLast());
		assertEquals("v", list2.removeLast());
		assertEquals("x", list2.removeLast());
		assertEquals("w", list2.removeLast());
		setUp(); //resets list2
		list2.delRange(1, 2);
		assertEquals("q", list2.removeLast());
		assertEquals("v", list2.removeLast());
		assertEquals("w", list2.removeLast());
		setUp(); //resets list2
		list2.delRange(1, 3);
		assertEquals("q", list2.removeLast());
		assertEquals("w", list2.removeLast());
		setUp(); //resets list2
		list2.delRange(1, 4);
		assertEquals("w", list2.removeLast());
		setUp(); //resets list2
		list2.delRange(2, 3);
		assertEquals("q", list2.removeLast());
		assertEquals("x", list2.removeLast());
		assertEquals("w", list2.removeLast());		
	}
	
	@Test
	public void testIndexOfFirstDifference(){
		//list3 is 1 2 3
		SinglyLinkedList otherList = new SinglyLinkedList();
		otherList.addFirst("3");
		otherList.addFirst("2");
		
		//otherlist is 2 3
		assertEquals(0, SinglyLinkedList.indexOfFirstDifference(list3, otherList));
		
		//otherlist is 1 2 3
		otherList.addFirst("1");
		assertEquals(-1, SinglyLinkedList.indexOfFirstDifference(list3, otherList));
		
		otherList = new SinglyLinkedList();
		otherList.addFirst("3");
		otherList.addFirst("2");
		otherList.addFirst("Q");
		//otherlist is Q 2 3
		assertEquals(0, SinglyLinkedList.indexOfFirstDifference(list3, otherList));

		otherList = new SinglyLinkedList();
		otherList.addFirst("3");
		otherList.addFirst("W");
		otherList.addFirst("1");
		//otherlist is 1 W 3
		assertEquals(1, SinglyLinkedList.indexOfFirstDifference(list3, otherList));

		otherList = new SinglyLinkedList();
		otherList.addFirst("W");
		otherList.addFirst("2");
		otherList.addFirst("1");
		//otherlist is 1 2 W
		assertEquals(2, SinglyLinkedList.indexOfFirstDifference(list3, otherList));

		otherList = new SinglyLinkedList();
		otherList.addFirst("2");
		otherList.addFirst("1");
		//otherlist is 1 2
		assertEquals(2, SinglyLinkedList.indexOfFirstDifference(list3, otherList));

		otherList = new SinglyLinkedList();
		otherList.addFirst("4");
		otherList.addFirst("3");
		otherList.addFirst("2");
		otherList.addFirst("1");
		//otherlist is 1 2 3 4
		assertEquals(3, SinglyLinkedList.indexOfFirstDifference(list3, otherList));

	}
}
