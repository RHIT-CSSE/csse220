package Homework2DArrays;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Homework2DArraysTest.RunAllTestsTearDown;
import Homework2DArraysTest.TestBallRestElevation;
import Homework2DArraysTest.TestDistanceArray;
import Homework2DArraysTest.TestIsDiagonal;
import Homework2DArraysTest.TestLongestRepeatSequence;
import Homework2DArraysTest.TestStringFromColumns;

@RunWith(Suite.class)

@SuiteClasses({	TestIsDiagonal.class, TestLongestRepeatSequence.class, TestStringFromColumns.class, 
	TestDistanceArray.class, TestBallRestElevation.class, RunAllTestsTearDown.class})
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
