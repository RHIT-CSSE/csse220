package implementingDP2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import implementingDP2Test.RunAllTestsSetUp;
import implementingDP2Test.RunAllTestsTearDown;
import implementingDP2Test.TestGetQuizTesterOverallScoreV1;
import implementingDP2Test.TestGetQuizTesterOverallScoreV2;
import implementingDP2Test.TestGetQuizTesterScoreOnQuizV1;
import implementingDP2Test.TestGetQuizTesterScoreOnQuizV2;
import implementingDP2Test.TestCreateQuestion;
import implementingDP2Test.TestUpdateQuestionPlusAddMoreQuestions;
import implementingDP2Test.TestUpdateQuestion;

@RunWith(Suite.class)
@SuiteClasses({ RunAllTestsSetUp.class, TestCreateQuestion.class, TestUpdateQuestion.class,
		TestGetQuizTesterScoreOnQuizV1.class, TestGetQuizTesterScoreOnQuizV2.class,
		TestUpdateQuestionPlusAddMoreQuestions.class, TestGetQuizTesterOverallScoreV1.class,
		TestGetQuizTesterOverallScoreV2.class, RunAllTestsTearDown.class })
public class RunAllTests {

	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;

	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;

		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed,
				testClassName);

		// Add to grand total
		RunAllTests.allTestsPassedCount += testsPassed;
		RunAllTests.allTestsExecutedCount += numberOfTests;
	} // outputResults

} // end class RunAllTests
