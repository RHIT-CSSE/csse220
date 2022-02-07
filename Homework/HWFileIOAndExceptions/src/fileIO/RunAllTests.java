package fileIO;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fileIOTest.RunAllTestsSetUp;
import fileIOTest.RunAllTestsTearDown;
import fileIOTest.TestReadGradeFileSimpleNoExceptions;
import fileIOTest.TestReadGradeFileWithMissing;
import fileIOTest.TestReadGradeFileWithNegative;
import fileIOTest.TestStep1ReadNamesAndMakeRecords;
import fileIOTest.TestStep2GetFileAveragesMultipleIssues;
import fileIOTest.TestStep2GetFileAveragesOneIssueOnly;
import fileIOTest.TestStep2GetFileAveragesSimpleNoExceptions;
import fileIOTest.TestStep3WriteGradesToFileAllFiles;
import fileIOTest.TestStep3WriteGradesToFileMultipleExceptions;
import fileIOTest.TestStep3WriteGradesToFileOneExceptionOnly;
import fileIOTest.TestStep3WriteGradesToFileSimpleNoExceptions;



@RunWith(Suite.class)
@SuiteClasses({RunAllTestsSetUp.class, TestStep1ReadNamesAndMakeRecords.class, TestReadGradeFileSimpleNoExceptions.class,
	TestReadGradeFileWithMissing.class, TestReadGradeFileWithNegative.class, TestStep2GetFileAveragesSimpleNoExceptions.class,
	TestStep2GetFileAveragesOneIssueOnly.class, TestStep2GetFileAveragesMultipleIssues.class, 
	TestStep3WriteGradesToFileSimpleNoExceptions.class, TestStep3WriteGradesToFileOneExceptionOnly.class, 
	TestStep3WriteGradesToFileMultipleExceptions.class, TestStep3WriteGradesToFileAllFiles.class, RunAllTestsTearDown.class})
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
