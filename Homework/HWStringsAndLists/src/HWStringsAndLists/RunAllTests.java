package HWStringsAndLists;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import HWStringsAndListsTest.TestDoubleDouble;
import HWStringsAndListsTest.TestEndsWithUpperCaseLetter;
import HWStringsAndListsTest.TestFirstDifference;
import HWStringsAndListsTest.TestFootballScore;
import HWStringsAndListsTest.TestMostCommonCharacter;
import HWStringsAndListsTest.TestThreeCharacterStrings;
import HWStringsAndListsTest.TestTruncateStringsAtX;

@RunWith(Suite.class)

@SuiteClasses({
        TestEndsWithUpperCaseLetter.class,
        TestFirstDifference.class,
        TestFootballScore.class,
        TestMostCommonCharacter.class,
        TestDoubleDouble.class,
        TestThreeCharacterStrings.class,
        TestTruncateStringsAtX.class
})

public class RunAllTests {
    // This class remains empty. It is used only as a holder for the above JUnit annotations.
    // Click the green "play" icon next to the class name to run all tests.
}
