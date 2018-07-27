import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	
	private LinkedList oneTwoThree;
	private LinkedList emptyList;
	
	@Before
	public void setUp() throws Exception {
		oneTwoThree = new LinkedList();
		oneTwoThree.addAtBeginning(3);
		oneTwoThree.addAtBeginning(2);
		oneTwoThree.addAtBeginning(1);
		emptyList = new LinkedList();
	}

	@Test
	public void testAddAtBeginning() {
		assertEquals("1->2->3->null", oneTwoThree.toString());
	}
	
	@Test
	public void testSize() {
		assertEquals(3, oneTwoThree.size());
		assertEquals(0, emptyList.size());
		emptyList.addAtBeginning(1);
		assertEquals(1, emptyList.size());
	}

	@Test
	public void testAddAtEnd() {
		oneTwoThree.addAtEnd(4);
		assertEquals("1->2->3->4->null", oneTwoThree.toString());
		emptyList.addAtEnd(55);
		assertEquals("55->null", emptyList.toString());
	}

	@Test
	public void testAddAfterValue() {
		oneTwoThree.addAfterValue(7, 2);
		oneTwoThree.addAfterValue(8, 3);
		assertEquals("1->2->7->3->8->null", oneTwoThree.toString());
	}

	@Test
	public void testAddBeforeValue() {
		oneTwoThree.addBeforeValue(0, 1);
		oneTwoThree.addBeforeValue(7, 2);
		oneTwoThree.addBeforeValue(8, 3);
		assertEquals("0->1->7->2->8->3->null", oneTwoThree.toString());

	}

	@Test
	public void testLinkedListIntArray() {
		int[] test = {3,4,5};
		LinkedList list = new LinkedList(test);
		assertEquals("3->4->5->null", list.toString());
	}

	@Test
	public void testRemoveBeginning() {
		oneTwoThree.removeBeginning();
		assertEquals("2->3->null", oneTwoThree.toString());
	}

	@Test
	public void testRemoveEnd() {
		oneTwoThree.removeEnd();
		assertEquals("1->2->null", oneTwoThree.toString());
		oneTwoThree.removeEnd();
		assertEquals("1->null", oneTwoThree.toString());
		oneTwoThree.removeEnd();
		assertEquals("null", oneTwoThree.toString());
	}

	@Test
	public void testRemoveAfter() {
		oneTwoThree.removeAfter(1);
		assertEquals("1->3->null", oneTwoThree.toString());
	}

	@Test
	public void testRemovalAll() {
		int[] data = {2,1,2,3,2,4,2};
		LinkedList list = new LinkedList(data);
		list.removalAll(2);
		assertEquals("1->3->4->null", list.toString());
	}

}
