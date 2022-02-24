import static org.junit.Assert.*;

import org.junit.Test;

public class TestThisClassTests {

	@Test
	public void Test() {
		assertTrue(TestThisClass.retestSample(false, 1000));
		assertTrue(TestThisClass.retestSample(false, 3000));
		assertTrue(TestThisClass.retestSample(false, 5000));

		assertTrue(TestThisClass.retestSample(true, 1000));
		assertFalse(TestThisClass.retestSample(true, 3000));
		assertTrue(TestThisClass.retestSample(true, 5000));
	}

}
