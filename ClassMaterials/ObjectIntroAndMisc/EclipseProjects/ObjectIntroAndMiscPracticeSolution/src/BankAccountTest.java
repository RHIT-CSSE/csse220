
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testBasics() {
		BankAccount b = new BankAccount();
		b.deposit(100);
		b.deposit(50);
		b.setName("Buffalo");
		assertEquals(150, b.getBalance(), 0.001);
		assertEquals("Buffalo", b.getName());

	}
	
	@Test
	public void testOtherConstructor() {
		BankAccount b = new BankAccount("Buffalo",100);
		assertEquals("Buffalo", b.getName());
		assertEquals(100, b.getBalance(), 0.001);
	}


}
