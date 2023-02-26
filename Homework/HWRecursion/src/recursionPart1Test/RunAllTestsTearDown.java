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
		System.out.printf("Total Tests:%5d  	 Total Passed:%8d 		 Grand Total:%10.1f%%\n", 
				RunAllTestsPart1.allTestsExecutedCount,RunAllTestsPart1.allTestsPassedCount, percentagePassed);

	} // oneTimeTearDown

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}

