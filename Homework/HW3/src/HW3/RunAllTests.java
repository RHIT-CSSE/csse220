package HW3;

import HW3Test.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestBuildAirportMap.class, TestMostCommonCharacter.class,
        TestGetTemperatureDropCity.class, TestCitiesVisitedMoreThanOnce.class,
        TestFirstDivisibleBy77.class, TestTimesOccur.class})
public class RunAllTests {

    static public int allTestsPassedCount = 0;
    static public int allTestsExecutedCount = 0;

    public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
        double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

        System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
                testClassName);

        // Add to grand total
        RunAllTests.allTestsPassedCount += testsPassed;
        RunAllTests.allTestsExecutedCount += numberOfTests;
    } // outputResults

}
