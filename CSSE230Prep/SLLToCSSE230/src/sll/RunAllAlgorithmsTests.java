package sll;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sllAlgorithmsTest.TestCheckSorted;
import sllAlgorithmsTest.TestDoubleList;
import sllAlgorithmsTest.TestInsertIntoSorted;
import sllAlgorithmsTest.TestIsFibSeq;
import sllAlgorithmsTest.TestRemoveLongNumbers;
import sllAlgorithmsTest.TestRetainStartingWithOne;

@RunWith(Suite.class)
@SuiteClasses({ TestCheckSorted.class, TestDoubleList.class, TestInsertIntoSorted.class, TestIsFibSeq.class,
		TestRemoveLongNumbers.class, TestRetainStartingWithOne.class })
public class RunAllAlgorithmsTests {

	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();

	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllAlgorithmsTests.allTestsPassedCount += testsPassed;
		RunAllAlgorithmsTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

}
