package sllAlgorithmsTest;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;
import sll.RunAllAlgorithmsTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllAlgorithmsTests.allTestsPassedCount / (double) RunAllAlgorithmsTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Total Tests:%5d  	 Total Passed:%8d 		 Grand Total:%10.1f%%\n", 
				RunAllAlgorithmsTests.allTestsExecutedCount,RunAllAlgorithmsTests.allTestsPassedCount, percentagePassed);

	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
