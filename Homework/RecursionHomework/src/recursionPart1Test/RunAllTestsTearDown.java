package recursionPart1Test;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import recursionPart1.RunAllTestsPart1;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTestsPart1.allTestsPassedCount / (double) RunAllTestsPart1.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
//		System.out.printf("Executed:%2d   Passed:%2d   Percentage:%.1f%%   Grand Total\n",
//				RunAllTests.allTestsExecutedCount, RunAllTests.allTestsPassedCount, percentagePassed);
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllTestsPart1.allTestsExecutedCount, RunAllTestsPart1.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
