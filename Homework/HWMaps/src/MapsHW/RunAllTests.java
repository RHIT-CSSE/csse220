package MapsHW;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import MapsTest.RunAllTestsTearDown;
import MapsTest.TestBuildAirportMap;
import MapsTest.TestGetNumberOfCoursesToTake;
import MapsTest.TestGetTemperatureDropCity;
import MapsTest.TestMostCommonCharacter;
import MapsTest.TestReverseHashMap;

@RunWith(Suite.class)
@SuiteClasses({ TestBuildAirportMap.class, TestMostCommonCharacter.class, TestGetNumberOfCoursesToTake.class,
		TestGetTemperatureDropCity.class, TestReverseHashMap.class, RunAllTestsTearDown.class })

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
