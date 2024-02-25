package recursionPart1;

import java.sql.Timestamp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import recursionPart1Test.RunAllTestsSetUp;
import recursionPart1Test.RunAllTestsTearDown;
import recursionPart1Test.TestCountNumberOf3sInPrimeFactorization;
import recursionPart1Test.TestArrayListSummation;
import recursionPart1Test.TestBracketMatch;
import recursionPart1Test.TestNoDoubledLetters;
import recursionPart1Test.TestNumbersGame;
import recursionPart1Test.TestEvenPowerOfThree;
import recursionPart1Test.TestSummation;
import recursionPart1Test.TestTechnicallyGramaticallyCorrect;
import recursionPart1Test.TestWeirdoString;

@RunWith(Suite.class)
@SuiteClasses({TestSummation.class, TestTechnicallyGramaticallyCorrect.class, TestWeirdoString.class, TestArrayListSummation.class,
		TestCountNumberOf3sInPrimeFactorization.class, TestBracketMatch.class, TestEvenPowerOfThree.class, TestNoDoubledLetters.class,
		TestNumbersGame.class, RunAllTestsTearDown.class })

public class RunAllTestsPart1 {

	static public int allTestsPassedCount = 0;
	static public int allTestsExecutedCount = 0;
	static public String timestamp = new Timestamp(System.currentTimeMillis()).toString();

	public static void outputResults(int testsPassed, int numberOfTests) {
		// Add to grand total
		RunAllTestsPart1.allTestsPassedCount += testsPassed;
		RunAllTestsPart1.allTestsExecutedCount += numberOfTests;

	} // outputResults
} // RunAllTests
