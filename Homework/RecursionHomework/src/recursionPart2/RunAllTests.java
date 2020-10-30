package recursionPart2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import recursionPart2Test.RunAllTestsSetUp;
import recursionPart2Test.RunAllTestsTearDown;
import recursionPart2Test.TestFindIn;
import recursionPart2Test.TestFindThirdCapital;
import recursionPart2Test.TestHighestSubsequenceSum;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestFindIn.class, TestHighestSubsequenceSum.class, TestFindThirdCapital.class,
		RunAllTestsTearDown.class })

public class RunAllTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

} // RunAllTests
