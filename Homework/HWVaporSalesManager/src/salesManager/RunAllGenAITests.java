package salesManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import salesManagerGenAITests.RunAllTestsSetUp;
import salesManagerGenAITests.RunAllTestsTearDown;
import salesManagerGenAITests.TestBasicBestBundle;
import salesManagerGenAITests.TestBasicHighestRevenueGame;
import salesManagerGenAITests.TestHighestRevenueGame;
import salesManagerGenAITests.TestImplicitBundleCreation;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestBasicBestBundle.class, 
	TestBasicHighestRevenueGame.class, TestHighestRevenueGame.class, 
	TestImplicitBundleCreation.class, RunAllTestsTearDown.class })

public class RunAllGenAITests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllGenAITests.allTestsPassedCount += testsPassed;
		RunAllGenAITests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
