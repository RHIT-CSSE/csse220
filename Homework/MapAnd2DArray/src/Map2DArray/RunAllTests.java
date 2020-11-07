package Map2DArray;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import Map2DArrayTest.RunAllTestsSetUp;
import Map2DArrayTest.RunAllTestsTearDown;
import Map2DArrayTest.TestMostCommonCharacter;
import Map2DArrayTest.TestReverseHashMap;
import Map2DArrayTest.TestGetTemperatureDropCity;
import Map2DArrayTest.TestGetNumberOfCoursesToTake;
import Map2DArrayTest.TestIsDiagonal;
import Map2DArrayTest.TestLongestRepeatSequence;
import Map2DArrayTest.TestStringFromColumns;
import Map2DArrayTest.TestDistanceArray;
import Map2DArrayTest.TestBallRestElevation;


@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class, TestMostCommonCharacter.class, TestReverseHashMap.class, TestGetTemperatureDropCity.class, 
	TestGetNumberOfCoursesToTake.class, TestIsDiagonal.class, TestLongestRepeatSequence.class, TestStringFromColumns.class, 
	TestDistanceArray.class, TestBallRestElevation.class, RunAllTestsTearDown.class})
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
