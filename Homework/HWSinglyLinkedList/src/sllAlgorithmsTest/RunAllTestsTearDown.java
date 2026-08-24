package sllAlgorithmsTest;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;
import sllAlgorithms.RunAllTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTests.allTestsPassedCountV1 / (double) RunAllTests.allTestsExecutedCountV1
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Total Tests:%5d  	 Total Passed:%8d 		 Grand Total:%10.1f%%\n", 
				RunAllTests.allTestsExecutedCountV1,RunAllTests.allTestsPassedCountV1, percentagePassed);

	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
