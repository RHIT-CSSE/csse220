package teamGradebook;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teamGradebookIndividualTests.RunAllTestsSetUp;
import teamGradebookIndividualTests.RunAllTestsTearDown;
import teamGradebookIndividualTests.TestAbsences;
import teamGradebookIndividualTests.TestAddGrade;
import teamGradebookIndividualTests.TestAddStudent;
import teamGradebookIndividualTests.TestAddTeam;
import teamGradebookIndividualTests.TestGetAverage;
import teamGradebookIndividualTests.TestGetAverageNoGrades;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestAddStudent.class, TestAbsences.class, TestAddTeam.class, TestAddGrade.class,
		TestGetAverage.class, TestGetAverageNoGrades.class, RunAllTestsTearDown.class })

public class RunAllIndividualTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllIndividualTests.allTestsPassedCount += testsPassed;
		RunAllIndividualTests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
