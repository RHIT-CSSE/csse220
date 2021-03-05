package Homework2DArrays;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Homework2DArraysTest.RunAllTestsSetUp;
import Homework2DArraysTest.RunAllTestsTearDown;
import Homework2DArraysTest.TestBallRestElevation;
import Homework2DArraysTest.TestDistanceArray;
import Homework2DArraysTest.TestIsDiagonal;
import Homework2DArraysTest.TestLongestRepeatSequence;
import Homework2DArraysTest.TestStringFromColumns;


@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class,  
	TestIsDiagonal.class, TestLongestRepeatSequence.class, TestStringFromColumns.class, 
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
