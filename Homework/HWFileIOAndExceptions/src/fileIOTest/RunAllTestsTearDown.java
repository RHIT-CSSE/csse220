package fileIOTest;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;
import fileIO.RunAllTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTests.allTestsPassedCount / (double) RunAllTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
//		System.out.printf("Executed:%2d   Passed:%2d   Percentage:%.1f%%   Grand Total\n",
//				RunAllTests.allTestsExecutedCount, RunAllTests.allTestsPassedCount, percentagePassed);
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllTests.allTestsExecutedCount, RunAllTests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
