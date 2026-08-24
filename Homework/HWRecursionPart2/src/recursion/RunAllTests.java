package recursion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import recursionTest.TestCompoundInterest;
import recursionTest.TestFindIn;
import recursionTest.TestIsNearPalindrome;
import recursionTest.TestHighestSubsequenceSum;

@RunWith(Suite.class)
@SuiteClasses({ TestFindIn.class, TestHighestSubsequenceSum.class,
		TestCompoundInterest.class, TestIsNearPalindrome.class })

public class RunAllTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("Passed %3d of %-3d  %10.1f%%   %-15s\n", testsPassed, numberOfTests, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

} // RunAllTests
