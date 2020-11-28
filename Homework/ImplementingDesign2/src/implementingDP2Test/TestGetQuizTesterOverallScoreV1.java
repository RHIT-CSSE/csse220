package implementingDP2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import implementingDP2.QuizSimulatorMain;
import implementingDP2.RunAllTests;

public class TestGetQuizTesterOverallScoreV1 {	
	private final static int QUIZ_TESTER_ID1 = 1;
	private final static int QUIZ_TESTER_ID2 = 2;
	private final static int QUIZ_TESTER_ID3 = 3;
	
	private final static String TESTER_1_TARGET_STRING = "1";
	private final static String TESTER_2_TARGET_STRING = "2";
	private final static String TESTER_3_TARGET_STRING = "3";
	
	private final static int QUIZ_ID1 = 1;
	private final static int QUIZ_ID2 = 2;
	private final static int QUIZ_ID3 = 3;
	private final static int QUIZ_MAX = 4;
	
	private final static int QUESTION_MAX = 8;

	private static int testsPassed;
	private static int numberOfTests;
	private static QuizSimulatorMain quizSimulator;
	
	// --------------------------------------------------------------------------
	
	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGetQuizTesterOverallScoreV1.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	private static void simulatorSetupForAllTests() {
		quizSimulator = new QuizSimulatorMain();

		// Create QUIZ_MAX quizzes
		// Numbered from 0 .. (QUIZ_MAX - 1)
		for (int quizID = 0; quizID < QUIZ_MAX; quizID++) {
			quizSimulator.handleCreateQuiz(quizID);
		} // end for

		// Create QUESTION_MAX questions
		// Numbered from 0 .. (QUESTION_MAX - 1)
		for (int questionID = 0; questionID < QUESTION_MAX; questionID++) {
			boolean answer = (questionID % 2 == 0);
			String prompt = "Is " + questionID + " even?";
			quizSimulator.handleCreateQuestion(questionID, answer, prompt);

			int quizID = (questionID % QUIZ_MAX);
			quizSimulator.handleAddQuestionToQuiz(questionID, quizID);
			
			// This 'for' creates the following Quiz to question mapping
			// quiz0 -> {0, 4}
			// quiz1 -> {1, 5}
			// quiz2 -> {2, 6}
			// quiz3 -> {3, 7}
		} /// end for
		
		// Create quiz testers
		quizSimulator.handleCreateQuizTester(QUIZ_TESTER_ID1, TESTER_1_TARGET_STRING);
		quizSimulator.handleCreateQuizTester(QUIZ_TESTER_ID2, TESTER_2_TARGET_STRING);
		quizSimulator.handleCreateQuizTester(QUIZ_TESTER_ID3, TESTER_3_TARGET_STRING);
	} // simulatorSetupForAllTests

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	/**
	 * This test will only pass when you have successfully implemented
	 * handleCreateQuiz, handleCreateQuestion, handleAddQuestionToQuiz,
	 * handleCreateQuizTester, handleGetQuizTesterScoreOnQuiz
	 */
	
	@Test
	public void testGetQuizTesterOverallScoreN01() {
		final double expectedAnswer = 0.375;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterOverallScore(QUIZ_ID1);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testGetQuizTesterOverallScoreN01
	
	@Test
	public void testGetQuizTesterOverallScoreN02() {	
		final double expectedAnswer = 0.625;	
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterOverallScore(QUIZ_ID2);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testGetQuizTesterOverallScoreN02
	
	@Test
	public void testGetQuizTesterOverallScoreN03() {
		final double expectedAnswer = 0.375;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterOverallScore(QUIZ_ID3);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testGetQuizTesterOverallScoreN03

} // end class TestGetQuizTesterOverallScoreV1
