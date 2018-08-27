import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringLinkedListTest {

	StringLinkedList list, list2, empty, onlyOne;	
	
	@Before
	public void setUp() throws Exception {
		list = new StringLinkedList();
		list.addFirst("c");
		list.addFirst("b");
		list.addFirst("a");
		
		list2 = new StringLinkedList();
		list2.addFirst("a");
		list2.addFirst("d");
		list2.addFirst("a");
		list2.addFirst("a");
		list2.addFirst("aaa");
		list2.addFirst("c");
		list2.addFirst("b");
		list2.addFirst("a");
		
		empty = new StringLinkedList();

		onlyOne = new StringLinkedList();
		onlyOne.addFirst("hello");
	}

	@Test
	public void testRemoveLast() {
		//this code was implemented for you, so this test should pass
		
		assertEquals("c", list.removeLast());
		assertEquals("b", list.removeLast());
		assertEquals("a", list.removeLast());		
		assertEquals(null, list.removeLast());
		
		assertEquals("a", list2.removeLast());
		assertEquals("d", list2.removeLast());
		assertEquals("a", list2.removeLast());		
		assertEquals("a", list2.removeLast());
		assertEquals("aaa", list2.removeLast());
		assertEquals("c", list2.removeLast());		
		assertEquals("b", list2.removeLast());
		assertEquals("a", list2.removeLast());		
		assertEquals(null, list2.removeLast());

	}

	@Test
	public void testReplaceString() {
		list.replaceString("a", "XX");
		assertEquals("c", list.removeLast());
		assertEquals("b", list.removeLast());
		assertEquals("XX", list.removeLast());		
		assertEquals(null, list.removeLast());
		
		list2.replaceString("a", "foo");
		assertEquals("foo", list2.removeLast());
		assertEquals("d", list2.removeLast());
		assertEquals("foo", list2.removeLast());		
		assertEquals("foo", list2.removeLast());
		assertEquals("aaa", list2.removeLast());
		assertEquals("c", list2.removeLast());		
		assertEquals("b", list2.removeLast());
		assertEquals("foo", list2.removeLast());		
		assertEquals(null, list2.removeLast());
		
		empty.replaceString("mike", "buffalo");
		assertEquals(null, empty.removeLast());
		
		onlyOne.replaceString("mike", "buffalo");
		assertEquals("hello", onlyOne.removeLast());
	}
	
	@Test
	public void testJoinPairs() {
		list.joinPairs();
		assertEquals("c", list.removeLast());
		assertEquals("ab", list.removeLast());
		assertEquals(null, list.removeLast());
		
		list.addFirst("Two");
		list.addFirst("One");
		list.joinPairs();
		assertEquals("OneTwo", list.removeLast());
		assertEquals(null, list.removeLast());

		
		list2.joinPairs();
		assertEquals("da", list2.removeLast());
		assertEquals("aa", list2.removeLast());		
		assertEquals("caaa", list2.removeLast());		
		assertEquals("ab", list2.removeLast());
		assertEquals(null, list2.removeLast());
		
		empty.joinPairs();
		assertEquals(null, empty.removeLast());
		
		onlyOne.joinPairs();
		assertEquals("hello", onlyOne.removeLast());
	}
	
	@Test
	public void testCopyList() {

		StringLinkedList copy = list.copyList();

		assertEquals("c", copy.removeLast());
		assertEquals("b", copy.removeLast());
		assertEquals("a", copy.removeLast());		
		assertEquals(null, copy.removeLast());
		
		// ensure original list has not been modified
		assertEquals("c", list.removeLast());
		assertEquals("b", list.removeLast());
		assertEquals("a", list.removeLast());		
		assertEquals(null, list.removeLast());
		
		copy = list2.copyList();
		assertEquals("a", copy.removeLast());
		assertEquals("d", copy.removeLast());
		assertEquals("a", copy.removeLast());		
		assertEquals("a", copy.removeLast());
		assertEquals("aaa", copy.removeLast());
		assertEquals("c", copy.removeLast());		
		assertEquals("b", copy.removeLast());
		assertEquals("a", copy.removeLast());		
		assertEquals(null, copy.removeLast());
		
		// ensure original list has not been modified
		assertEquals("a", list2.removeLast());
		assertEquals("d", list2.removeLast());
		assertEquals("a", list2.removeLast());		
		assertEquals("a", list2.removeLast());
		assertEquals("aaa", list2.removeLast());
		assertEquals("c", list2.removeLast());		
		assertEquals("b", list2.removeLast());
		assertEquals("a", list2.removeLast());		
		assertEquals(null, list2.removeLast());
		
		copy = onlyOne.copyList();
		assertEquals("hello", copy.removeLast());
		assertEquals("hello", onlyOne.removeLast());
		
		copy = empty.copyList();
		assertEquals(null, copy.removeLast());
		
		
	}	

}
