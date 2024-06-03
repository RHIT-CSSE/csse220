package sll;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sllTest.RunAllTestsTearDown;
import sllTest.TestAdd;
import sllTest.TestContains;
import sllTest.TestGet;
import sllTest.TestGetExceptionHandling;
import sllTest.TestIndexOf;
import sllTest.TestInsertExceptionHandling;
import sllTest.TestInsert;
import sllTest.TestRemove;
import sllTest.TestRemoveAll;
import sllTest.TestSet;
import sllTest.TestSetExceptionHandling;
import sllTest.TestSize;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd.class, TestSize.class, TestInsert.class, TestInsertExceptionHandling.class, TestContains.class,
		TestGet.class, TestGetExceptionHandling.class, TestRemove.class, TestRemoveAll.class, TestIndexOf.class, TestSet.class,
		TestSetExceptionHandling.class, RunAllTestsTearDown.class })
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
