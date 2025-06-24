package HWTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunAllTestsSetUp {
	

	@BeforeAll
	public static void oneTimeSetUp() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("              Running: HW1 JUnit Tests");
		System.out.println("------------------------------------------------------------------");
		System.out.println(" Tests       Tests    Percentage    JUnit Class");
		System.out.println("Executed     Passed     Passed       Executed");
		System.out.println("------------------------------------------------------------------");
	} // oneTimeSetUp

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
