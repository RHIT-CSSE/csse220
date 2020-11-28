package teamGradebook;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teamGradebookIndividualTests.RunAllTestsTearDown;
import teamGradebookPairedTests.TestImplicitTeamCreation;
import teamGradebookPairedTests.RunAllTestsSetUp;
import teamGradebookPairedTests.TestBasicBestTeam;
import teamGradebookPairedTests.TestBasicBestTeamNotIndividuals;
import teamGradebookPairedTests.TestBestTeamNotIndividuals;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestImplicitTeamCreation.class, TestBasicBestTeam.class, 
	TestBestTeamNotIndividuals.class, TestBasicBestTeamNotIndividuals.class, RunAllTestsTearDown.class })

public class RunAllPairedTests {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllPairedTests.allTestsPassedCount += testsPassed;
		RunAllPairedTests.allTestsExecutedCount += numberOfTests;
	} // outputResults
} // RunAllTests
