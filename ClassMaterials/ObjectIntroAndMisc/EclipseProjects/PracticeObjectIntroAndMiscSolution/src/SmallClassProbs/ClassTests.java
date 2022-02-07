package SmallClassProbs;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassTests {

	@Test
	public void classATest() {
		ClassA myObject = new ClassA();
		ClassA myObject2 = new ClassA();
		
		myObject.setName("Buffalo");
		myObject2.setName("Matt");
		
		assertEquals(4, myObject.alwaysReturns4());
		assertEquals("Buffalo", myObject.getName());
		assertEquals(4, myObject2.alwaysReturns4());
		assertEquals("Matt", myObject2.getName());

	}

	@Test
	public void classBTest() {
		ClassB myObject = new ClassB(5,10);
		ClassB myObject2 = new ClassB(3,1);
		
		assertEquals(15, myObject.sumOfDataPoints());
		assertEquals(4, myObject2.sumOfDataPoints());

	}
	
	@Test
	public void classCTest() {
		ClassC myObject = new ClassC("Buffalo");
		ClassC myObject2 = new ClassC();
		
		assertEquals("Buffalo", myObject.getName());
		assertEquals("default name", myObject2.getName());

	}
	
}
