import static org.junit.Assert.*;

import org.junit.Test;

public class TestThisClassTest {
	
	@Test
	public void testIntersectionSize() {
		
		// some Qs
		assertEquals(2, TestThisClass.numberOfQs("QQ"));
		// 0 Qs
		assertEquals(0, TestThisClass.numberOfQs("hello"));
		// lowercase Qs
		assertEquals(3, TestThisClass.numberOfQs("qqqHello"));
	}
	
}
