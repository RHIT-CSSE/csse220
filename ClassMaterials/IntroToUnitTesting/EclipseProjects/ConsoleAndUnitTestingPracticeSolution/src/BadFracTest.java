import static org.junit.Assert.*;

import org.junit.Test;

public class BadFracTest {
	
	//DONE: Add unit tests for the isReduced method and the add method
	//		Make sure and look at the method descriptions to figure out
	//		your corner cases.

	private BadFrac tester1 = new BadFrac(1, 2);
	private BadFrac tester2 = new BadFrac(1, 4);
	private BadFrac tester3 = new BadFrac(2, 4);
	private BadFrac tester4 = new BadFrac(0, 1);
	private BadFrac tester5 = new BadFrac(0, 2); //this catches problem in isReduced
	
	@Test
	public void testIsReduced() {
		assertTrue(tester1.isReduced());
		assertTrue(tester2.isReduced());
		assertFalse(tester3.isReduced());
		assertTrue(tester4.isReduced());
		
		
	}
	
	
	@Test
	public void testAdd() {
		BadFrac res = tester1.add(tester2);
		assertEquals(3, res.getNum());
		assertEquals(4, res.getDen());
	}
	
	

}
