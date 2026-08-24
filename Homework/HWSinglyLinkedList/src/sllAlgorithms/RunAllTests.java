package sllAlgorithms;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sllAlgorithmsTest.TestArrayListOf1s;
import sllAlgorithmsTest.TestCheckSorted;
import sllAlgorithmsTest.TestDoubleList;
import sllAlgorithmsTest.TestIsFibSeq;
import sllAlgorithmsTest.TestInsertIntoSorted;
import sllAlgorithmsTest.RunAllTestsTearDown;


@RunWith(Suite.class)
@SuiteClasses({TestArrayListOf1s.class, TestInsertIntoSorted.class, TestCheckSorted.class,
        TestDoubleList.class, TestIsFibSeq.class, RunAllTestsTearDown.class})
public class RunAllTests {
	
	static public int allTestsPassedCountV1 = 0;
	static public int allTestsExecutedCountV1 = 0;
	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();
	
	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllTests.allTestsPassedCountV1 += testsPassed;
		RunAllTests.allTestsExecutedCountV1 += numberOfTests;
	} // outputResults

}
