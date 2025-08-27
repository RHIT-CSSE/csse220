package recursion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import recursionTest.Test3sPrimeFactorization;
import recursionTest.TestArrayListSummation;
import recursionTest.TestNoDoubleLetters;
import recursionTest.TestNumbersGame;
import recursionTest.TestPowerOfThree;
import recursionTest.TestSummation;

@RunWith(Suite.class)
@SuiteClasses({ TestSummation.class, TestArrayListSummation.class,
		Test3sPrimeFactorization.class, TestPowerOfThree.class,
		TestNoDoubleLetters.class, TestNumbersGame.class })

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
} // RunAllTests
