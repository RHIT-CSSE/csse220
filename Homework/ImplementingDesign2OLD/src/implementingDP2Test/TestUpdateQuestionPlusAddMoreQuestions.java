package implementingDP2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import implementingDP2.QuizSimulatorMain;
import implementingDP2.RunAllTests;

public class TestUpdateQuestionPlusAddMoreQuestions {
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

	private final static int INITIAL_QUESTION_MAX = 8;
	private final static int AFTER_ADD_MORE_QUESTION_MAX = 16;

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
		String className = TestUpdateQuestionPlusAddMoreQuestions.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	private static void simulatorSetupForAllTests() {
		quizSimulator = new QuizSimulatorMain();

		// Create quizMax quizzes
		// Numbered from 1 .. QUIZ_MAX
		for (int quizID = 1; quizID <= QUIZ_MAX; quizID++) {
			quizSimulator.handleCreateQuiz(quizID);
		} // end for

		// Create questionMax questions
		// Numbered from 1 .. QUESTION_MAX
		for (int questionID = 1; questionID <= INITIAL_QUESTION_MAX; questionID++) {
			boolean answer = (questionID % 2 == 0);
			String prompt = "Is " + questionID + " even?";
			quizSimulator.handleCreateQuestion(questionID, answer, prompt);

			int quizID = (questionID % QUIZ_MAX) + 1;
			quizSimulator.handleAddQuestionToQuiz(questionID, quizID);

			// This 'for' creates the following Quiz to question mapping
			// quiz1 -> {1, 5}
			// quiz2 -> {2, 6}
			// quiz3 -> {3, 7}
			// quiz4 -> {0, 4}
		} /// end for

		// Now update questions with IDs: 1..QUESTION_MAX
		for (int questionID = 1; questionID <= INITIAL_QUESTION_MAX; questionID++) {
			quizSimulator.handleUpdateQuestion(questionID, true, "Is 2 even?");
		} // end for

		// And finally add more questions with IDs: (INITIAL_QUESTION_MAX + 1)..AFTER_ADD_MORE_QUESTION_MAX
		for (int questionID = (INITIAL_QUESTION_MAX + 1); questionID <= AFTER_ADD_MORE_QUESTION_MAX; questionID++) {
			boolean answer = (questionID % 2 == 0);
			String prompt = "Is " + questionID + " even?";
			quizSimulator.handleCreateQuestion(questionID, answer, prompt);

			int quizID = (questionID % QUIZ_MAX) + 1;
			quizSimulator.handleAddQuestionToQuiz(questionID, quizID);
		} // end for

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
	 * handleCreateQuizTester, handleGetQuizTesterScoreOnQuiz, handleUpdateQuestion
	 */
	
	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN01() {
		final double expectedAnswer = 0.5;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID1, QUIZ_ID1);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN01

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN02() {
		final double expectedAnswer = 0.25;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID1, QUIZ_ID2);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN02

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN03() {
		final double expectedAnswer = 0.5;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID1, QUIZ_ID3);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN03
	
	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN04() {
		final double expectedAnswer = 0.75;
		simulatorSetupForAllTests();

		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID2, QUIZ_ID1);
		numberOfTests++;
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN04

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN05() {
		final double expectedAnswer = 1.0;
		simulatorSetupForAllTests();

		numberOfTests++;
		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID2, QUIZ_ID2);
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN05

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN06() {
		final double expectedAnswer = 0.5;
		simulatorSetupForAllTests();

		numberOfTests++;
		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID2, QUIZ_ID3);
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN06

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN07() {
		final double expectedAnswer = 0.0;
		simulatorSetupForAllTests();

		numberOfTests++;
		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID3, QUIZ_ID1);
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN07

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN08() {
		final double expectedAnswer = 0.25;
		simulatorSetupForAllTests();

		numberOfTests++;
		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID3, QUIZ_ID2);
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN08

	@Test
	public void testUpdateQuestionPlusAddMoreQuestionsN09() {
		final double expectedAnswer = 0.0;
		simulatorSetupForAllTests();

		numberOfTests++;
		double actualAnswer = quizSimulator.handleGetQuizTesterScoreOnQuiz(QUIZ_TESTER_ID3, QUIZ_ID3);
		assertEquals(expectedAnswer, actualAnswer, 0.0001);
		testsPassed++;
	} // testUpdateQuestionPlusAddMoreQuestionsN09

} // end class TestUpdateQuestionPlusAddMoreQuestions
