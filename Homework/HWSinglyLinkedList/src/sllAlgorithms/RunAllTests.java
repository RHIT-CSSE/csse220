package sllAlgorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sllAlgorithmsTest.TestArrayListOf1s;
import sllAlgorithmsTest.TestCheckSorted;
import sllAlgorithmsTest.TestDoubleList;
import sllAlgorithmsTest.TestFibSeq;
import sllAlgorithmsTest.TestInsertIntoSorted;
import sllAlgorithmsTest.TestRecursiveGet;
import sllAlgorithmsTest.TestRecursiveGetExceptionHandling;
import sllAlgorithmsTest.TestRemoveLongNumbers;
import sllAlgorithmsTest.RunAllTestsSetUp;
import sllAlgorithmsTest.RunAllTestsTearDown;



@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class, TestArrayListOf1s.class, TestInsertIntoSorted.class, 
	TestRemoveLongNumbers.class, TestCheckSorted.class, TestDoubleList.class, TestFibSeq.class,
	TestRecursiveGet.class, TestRecursiveGetExceptionHandling.class, RunAllTestsTearDown.class})
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
