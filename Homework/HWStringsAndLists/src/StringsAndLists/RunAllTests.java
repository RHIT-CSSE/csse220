package StringsAndLists;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import StringsAndListsTest.RunAllTestsTearDown;
import StringsAndListsTest.TestDoubleDouble;
import StringsAndListsTest.TestEndsWithUpperCaseLetter;
import StringsAndListsTest.TestFirstDifference;
import StringsAndListsTest.TestFootballScore;
import StringsAndListsTest.TestMostCommonCharacter;
import StringsAndListsTest.TestThreeCharacterStrings;
import StringsAndListsTest.TestTruncateStringsAtX;

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
