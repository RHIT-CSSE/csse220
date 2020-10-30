package recursionPart1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import recursionPart1Test.RunAllTestsSetUp;
import recursionPart1Test.RunAllTestsTearDown;
import recursionPart1Test.Test3sPrimeFactorization;
import recursionPart1Test.TestArrayListSummation;
import recursionPart1Test.TestBracketMatch;
import recursionPart1Test.TestNoDoubleLetters;
import recursionPart1Test.TestNumbersGame;
import recursionPart1Test.TestPowerOfThree;
import recursionPart1Test.TestSummation;
import recursionPart1Test.TestTechnicallyCorrect;
import recursionPart1Test.TestWeirdo;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestSummation.class, TestTechnicallyCorrect.class, TestWeirdo.class, TestArrayListSummation.class,
		Test3sPrimeFactorization.class, TestBracketMatch.class, TestPowerOfThree.class, TestNoDoubleLetters.class,
		TestNumbersGame.class, RunAllTestsTearDown.class })

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
} // RunAllRecursionHomeworkTests
