package hashmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapProblemTest {
	/**
	 * Testing {@link HashMapProblem#computeGPA(String)}
	 */
	@Test
	public void testCount() {
		assertEquals(2, HashMapProblem.count(1, new String[] {"A", "A", "A", "B", "C", "A", "B", "D"}));
		assertEquals(1, HashMapProblem.count(2, new String[] {"A", "A", "A", "B", "C", "A", "B", "D"}));
		assertEquals(0, HashMapProblem.count(3, new String[] {"A", "A", "A", "B", "C", "A", "B", "D"}));
		assertEquals(1, HashMapProblem.count(4, new String[] {"A", "A", "A", "B", "C", "A", "B", "D"}));
		assertEquals(3, HashMapProblem.count(1, new String[] {"Bob", "Joe", "Rick", "Joe", "Mike", "Bob", "Alice"}));
		assertEquals(2, HashMapProblem.count(2, new String[] {"Bob", "Joe", "Rick", "Joe", "Mike", "Bob", "Alice"}));
	}
}
