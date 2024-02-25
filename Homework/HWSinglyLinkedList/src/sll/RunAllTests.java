package sll;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sllTest.RunAllTestsTearDown;
import sllTest.TestAdd;
import sllTest.TestContains;
import sllTest.TestIndexOf;
import sllTest.TestInsertAtExceptionHandling;
import sllTest.TestInsertAtIndex;
import sllTest.TestRemove;
import sllTest.TestSet;
import sllTest.TestSetExceptionHandling;
import sllTest.TestSize;


@RunWith(Suite.class)
@SuiteClasses({TestAdd.class, TestSize.class, TestInsertAtIndex.class,
	TestInsertAtExceptionHandling.class, TestContains.class, TestRemove.class,
	TestIndexOf.class, TestSet.class, TestSetExceptionHandling.class, RunAllTestsTearDown.class})
public class RunAllTests {
	
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();
	
	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

}
