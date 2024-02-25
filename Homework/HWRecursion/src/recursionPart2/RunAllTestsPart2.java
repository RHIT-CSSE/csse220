package recursionPart2;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import recursionPart2Test.TestFindIn;
import recursionPart2Test.TestFindThirdCapital;
import recursionPart2Test.TestHighestSubsequenceSum;
import recursionPart2Test.RunAllTestsTearDown;

@RunWith(Suite.class)
@SuiteClasses({TestFindIn.class, TestHighestSubsequenceSum.class, TestFindThirdCapital.class,
		RunAllTestsTearDown.class })

public class RunAllTestsPart2 {
	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();

	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllTestsPart2.allTestsPassedCount += testsPassed;
		RunAllTestsPart2.allTestsExecutedCount += numberOfTests;
	} // outputResults

} // RunAllTests
