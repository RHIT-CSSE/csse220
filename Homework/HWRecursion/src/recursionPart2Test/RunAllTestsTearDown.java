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
		System.out.printf("Total Tests:%5d  	 Total Passed:%8d 		 Grand Total:%10.1f%%\n", 
				RunAllTestsPart2.allTestsExecutedCount,RunAllTestsPart2.allTestsPassedCount, percentagePassed);

	} // oneTimeTearDown

	@Test
	public void alwaysPasses() {
		assertTrue(true);
	} // alwaysPasses
}
