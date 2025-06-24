package HW2;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import HW2Test.RunAllTestsTearDown;
import HW2Test.TestDoubleDouble;
import HW2Test.TestEndsWithUpperCaseLetter;
import HW2Test.TestFirstDifference;
import HW2Test.TestFootballScore;
import HW2Test.TestMostCommonCharacter;
import HW2Test.TestThreeCharacterStrings;
import HW2Test.TestTruncateStringsAtX;

@RunWith(Suite.class)

@SuiteClasses({ TestEndsWithUpperCaseLetter.class,
		TestFirstDifference.class, TestFootballScore.class, TestMostCommonCharacter.class,
		TestDoubleDouble.class,
		TestThreeCharacterStrings.class, TestTruncateStringsAtX.class, RunAllTestsTearDown.class })

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
