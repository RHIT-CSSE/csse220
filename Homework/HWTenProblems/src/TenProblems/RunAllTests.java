package TenProblems;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TenProblemsTest.RunAllTestsTearDown;
import TenProblemsTest.TestDistanceFromOrigin;
import TenProblemsTest.TestFirstDivisibleBy77;
import TenProblemsTest.TestFootballScore;
import TenProblemsTest.TestIsDiagonal;
import TenProblemsTest.TestLongestRepeatSequence;
import TenProblemsTest.TestMaxArray;
import TenProblemsTest.TestPow;
import TenProblemsTest.TestPowersOfTwo;
import TenProblemsTest.TestSecondDigit5;
import TenProblemsTest.TestTimesOccur;

@RunWith(Suite.class)

@SuiteClasses({ TestDistanceFromOrigin.class, TestSecondDigit5.class,
		TestPow.class, TestFirstDivisibleBy77.class, TestFootballScore.class,
		TestPowersOfTwo.class, TestMaxArray.class, TestTimesOccur.class, TestIsDiagonal.class,
		TestLongestRepeatSequence.class, RunAllTestsTearDown.class })

public class RunAllTests {

	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;

	} // outputResults

}
