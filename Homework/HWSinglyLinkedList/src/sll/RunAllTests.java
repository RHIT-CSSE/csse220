package sll;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import sllTest.RunAllTestsSetUp;
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
@SuiteClasses({RunAllTestsSetUp.class, TestAdd.class, TestSize.class, TestInsertAtIndex.class,
	TestInsertAtExceptionHandling.class, TestContains.class, TestRemove.class,
	TestIndexOf.class, TestSet.class, TestSetExceptionHandling.class, RunAllTestsTearDown.class})
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
