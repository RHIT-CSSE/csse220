package recursionPart2Test;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import recursionPart2.RunAllTestsPart2;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTestsPart2.allTestsPassedCount / (double) RunAllTestsPart2.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllTestsPart2.allTestsExecutedCount,
				RunAllTestsPart2.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
