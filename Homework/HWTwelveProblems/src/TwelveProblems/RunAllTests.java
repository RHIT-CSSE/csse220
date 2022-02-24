package TwelveProblems;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import TwelveProblemsTest.RunAllTestsSetUp;
import TwelveProblemsTest.RunAllTestsTearDown;
import TwelveProblemsTest.TestDistanceFromOrigin;
import TwelveProblemsTest.TestDoubleDouble;
import TwelveProblemsTest.TestEndsWithUpperCaseLetter;
import TwelveProblemsTest.TestFirstDifference;
import TwelveProblemsTest.TestFirstDivisibleBy77;
import TwelveProblemsTest.TestMaxArray;
import TwelveProblemsTest.TestMostCommonCharacter;
import TwelveProblemsTest.TestPower;
import TwelveProblemsTest.TestPowersOfTwo;
import TwelveProblemsTest.TestSecondDigit5;
import TwelveProblemsTest.TestThreeCharacterStrings;
import TwelveProblemsTest.TestTimesOccur;

@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class,  TestDistanceFromOrigin.class, TestSecondDigit5.class, TestEndsWithUpperCaseLetter.class, TestPower.class, 
	TestFirstDifference.class, TestMostCommonCharacter.class, TestFirstDivisibleBy77.class, TestPowersOfTwo.class, 
	TestMaxArray.class, TestTimesOccur.class, TestDoubleDouble.class, TestThreeCharacterStrings.class, RunAllTestsTearDown.class})
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

}
