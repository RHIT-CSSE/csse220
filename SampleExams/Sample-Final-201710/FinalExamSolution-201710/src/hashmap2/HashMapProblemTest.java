package hashmap2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HashMapProblemTest {
	/**
	 * Testing {@link HashMapProblem#computeGPA(String)}
	 */
	@Test
	public void testIsAllPairs() {
		assertFalse(HashMapProblem.isAllPairs(new String[] { "X" }));
		assertTrue(HashMapProblem.isAllPairs(new String[] { "A", "A" }));
		assertFalse(HashMapProblem.isAllPairs(new String[] { "A", "B", "A" }));
		assertTrue(HashMapProblem.isAllPairs(new String[] { "A", "B", "B", "A" }));
		assertTrue(HashMapProblem.isAllPairs(new String[] { "A", "B", "C", "B", "C", "A" }));
		assertTrue(HashMapProblem.isAllPairs(new String[] { "A", "B", "A", "A", "B", "A" }));
		assertFalse(HashMapProblem.isAllPairs(new String[] { "A", "A", "A" }));
		assertFalse(HashMapProblem.isAllPairs(new String[] { "A", "B", "C", "A" }));
		assertFalse(HashMapProblem.isAllPairs(new String[] { "C", "E", "E", "E", "C", "C" }));
		assertTrue(HashMapProblem.isAllPairs(new String[] {}));
	}
}
