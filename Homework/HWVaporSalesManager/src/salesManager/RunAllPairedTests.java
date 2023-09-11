package salesManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import salesManagerPairedTests.RunAllTestsSetUp;
import salesManagerPairedTests.RunAllTestsTearDown;
import salesManagerPairedTests.TestBasicBestBundle;
import salesManagerPairedTests.TestBasicHighestRevenueGame;
import salesManagerPairedTests.TestHighestRevenueGame;
import salesManagerPairedTests.TestImplicitBundleCreation;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestBasicBestBundle.class, 
	TestBasicHighestRevenueGame.class, TestHighestRevenueGame.class, 
	TestImplicitBundleCreation.class, RunAllTestsTearDown.class })

public class RunAllPairedTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllPairedTests.allTestsPassedCount += testsPassed;
		RunAllPairedTests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
