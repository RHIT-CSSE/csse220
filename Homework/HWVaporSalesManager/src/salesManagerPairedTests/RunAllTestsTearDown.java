package salesManagerPairedTests;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import salesManager.RunAllPairedTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllPairedTests.allTestsPassedCount / (double) RunAllPairedTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllPairedTests.allTestsExecutedCount, RunAllPairedTests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
