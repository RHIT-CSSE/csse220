package recursionTest;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;
import recursion.RunAllTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTests.allTestsPassedCount / (double) RunAllTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
//		System.out.printf("Executed:%2d   Passed:%2d   Percentage:%.1f%%   Grand Total\n",
//				RunAllTests.allTestsExecutedCount, RunAllTests.allTestsPassedCount, percentagePassed);
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllTests.allTestsExecutedCount, RunAllTests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	
		System.out.println("\nYou have passed all tests in " + RunAllTests.allMethodsPassed + " of the 4 methods\n"
				+ "You need 3 to receive full credit for this part.");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
