package salesManagerGenAITests;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;

import salesManager.RunAllGenAITests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllGenAITests.allTestsPassedCount / (double) RunAllGenAITests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", RunAllGenAITests.allTestsExecutedCount, RunAllGenAITests.allTestsPassedCount, percentagePassed, "<-- Grand Totals");
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
