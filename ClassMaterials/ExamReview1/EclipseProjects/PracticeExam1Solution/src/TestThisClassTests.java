import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestThisClassTests {

	@Test
	public void Test() {
		assertTrue(TestThisClass.inTrouble(2100, 1));
		assertFalse(TestThisClass.inTrouble(600, 1));
		assertFalse(TestThisClass.inTrouble(2100, 0));
		assertTrue(TestThisClass.inTrouble(2399, 1));
		assertTrue(TestThisClass.inTrouble(0, 1));
		assertFalse(TestThisClass.inTrouble(1200, 10));
		assertTrue(TestThisClass.inTrouble(1200, 11));
		assertTrue(TestThisClass.inTrouble(1900, 6));
		assertFalse(TestThisClass.inTrouble(2000, 6));
		assertFalse(TestThisClass.inTrouble(1930,4));
		assertTrue(TestThisClass.inTrouble(1930,6));
		assertFalse(TestThisClass.inTrouble(1200, 0));
		
	}
}
