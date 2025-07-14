package salesManagerManualTests;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import salesManager.RunAllManualTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllManualTests.allTestsPassedCount / (double) RunAllManualTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllManualTests.allTestsExecutedCount, RunAllManualTests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
