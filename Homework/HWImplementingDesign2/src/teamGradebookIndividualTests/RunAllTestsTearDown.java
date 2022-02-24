package teamGradebookIndividualTests;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import teamGradebook.RunAllIndividualTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllIndividualTests.allTestsPassedCount / (double) RunAllIndividualTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllIndividualTests.allTestsExecutedCount, RunAllIndividualTests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
