package salesManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import salesManagerIndividualTests.RunAllTestsSetUp;
import salesManagerIndividualTests.RunAllTestsTearDown;
import salesManagerIndividualTests.TestAddBundle;
import salesManagerIndividualTests.TestAddGame;
import salesManagerIndividualTests.TestAllToStrings;
import salesManagerIndividualTests.TestBundleSalesReport;
import salesManagerIndividualTests.TestGameSalesReport;
import salesManagerIndividualTests.TestSellBundle;
import salesManagerIndividualTests.TestSellGame;


@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestAddBundle.class, TestAddGame.class, 
	TestAllToStrings.class, TestBundleSalesReport.class, TestGameSalesReport.class, 
	TestSellBundle.class, TestSellGame.class, RunAllTestsTearDown.class })

public class RunAllIndividualTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllIndividualTests.allTestsPassedCount += testsPassed;
		RunAllIndividualTests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
