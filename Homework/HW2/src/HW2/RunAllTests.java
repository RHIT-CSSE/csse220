package HW2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import HW2Test.TestDoubleDouble;
import HW2Test.TestEndsWithUpperCaseLetter;
import HW2Test.TestFirstDifference;
import HW2Test.TestFootballScore;
import HW2Test.TestMostCommonCharacter;
import HW2Test.TestThreeCharacterStrings;
import HW2Test.TestTruncateStringsAtX;

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
