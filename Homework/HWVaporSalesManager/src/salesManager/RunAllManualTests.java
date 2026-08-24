package salesManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import salesManagerManualTests.RunAllTestsSetUp;
import salesManagerManualTests.RunAllTestsTearDown;
import salesManagerManualTests.TestAddBundle;
import salesManagerManualTests.TestAddGame;
import salesManagerManualTests.TestAllToStrings;
import salesManagerManualTests.TestBundleSalesReport;
import salesManagerManualTests.TestGameSalesReport;
import salesManagerManualTests.TestSellBundle;
import salesManagerManualTests.TestSellGame;


@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestAddBundle.class, TestAddGame.class, 
	TestAllToStrings.class, TestBundleSalesReport.class, TestGameSalesReport.class, 
	TestSellBundle.class, TestSellGame.class, RunAllTestsTearDown.class })

public class RunAllManualTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllManualTests.allTestsPassedCount += testsPassed;
		RunAllManualTests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
