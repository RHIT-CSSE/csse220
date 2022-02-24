import static org.junit.Assert.*;

import org.junit.Test;

public class TestThisClassTest {
	
	@Test
	public void testIntersectionSize() {
		
		// regular
		assertEquals(2, TestThisClass.intersectionSize(1,3,2,4));
		// second range fully inside the first
		assertEquals(2, TestThisClass.intersectionSize(1,4,2,3));
		// disjoint
		assertEquals(0, TestThisClass.intersectionSize(1,4,5,8));
	}
	
}
