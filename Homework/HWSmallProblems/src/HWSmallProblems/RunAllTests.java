package HWSmallProblems;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import HWSmallProblemsTest.TestDistanceFromOrigin;
import HWSmallProblemsTest.TestFootballScore;
import HWSmallProblemsTest.TestMaxArray;
import HWSmallProblemsTest.TestPow;
import HWSmallProblemsTest.TestPowersOfTwo;
import HWSmallProblemsTest.TestSecondDigit5;

@RunWith(Suite.class)

@SuiteClasses({ TestDistanceFromOrigin.class, TestSecondDigit5.class,
		TestPow.class, TestFootballScore.class,
		TestPowersOfTwo.class, TestMaxArray.class})

public class RunAllTests {

	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();
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
