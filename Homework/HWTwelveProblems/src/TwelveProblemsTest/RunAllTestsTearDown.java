package TwelveProblemsTest;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Test;
import TwelveProblems.RunAllTests;

public class RunAllTestsTearDown {

	@AfterClass
	public static void oneTimeTearDown() {
		double percentagePassed = (double) RunAllTests.allTestsPassedCount / (double) RunAllTests.allTestsExecutedCount
				* 100.0;
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Total Tests:%5d  	 Total Passed:%8d 		 Grand Total:%10.1f%%\n", 
				RunAllTests.allTestsExecutedCount,RunAllTests.allTestsPassedCount, percentagePassed);

	} // oneTimeTearDown

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
