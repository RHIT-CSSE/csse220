package HW1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import HWTest.RunAllTestsSetUp;
import HWTest.RunAllTestsTearDown;
import HWTest.TestAddFractionGoodNumbers;
import HWTest.TestLargestSingleDigit;

@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class, TestAddFractionGoodNumbers.class, TestLargestSingleDigit.class, RunAllTestsTearDown.class})
public class RunAllTests {
	
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	
	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed, testClassName);

		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

}
