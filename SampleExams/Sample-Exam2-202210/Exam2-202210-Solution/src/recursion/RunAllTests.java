package recursion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import recursionTest.TestNumPairs;
import recursionTest.TestEquals;
import recursionTest.TestAlmostEquals;
import recursionTest.TestHorizontalWordFinder;
import recursionTest.RunAllTestsSetUp;
import recursionTest.RunAllTestsTearDown;


@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class,  TestNumPairs.class, TestEquals.class, TestAlmostEquals.class, TestHorizontalWordFinder.class, RunAllTestsTearDown.class})
public class RunAllTests {
	
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	static public int allMethodsPassed = 0;
	
	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;
		if(percentagePassed > 99)
			allMethodsPassed++;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed, testClassName);

		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

}
