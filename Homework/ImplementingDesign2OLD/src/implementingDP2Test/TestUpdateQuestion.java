package implementingDP2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import implementingDP2.QuizSimulatorMain;
import implementingDP2.RunAllTests;

public class TestUpdateQuestion {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestUpdateQuestion.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	/**
	 * This test will only pass when you have successfully implemented
	 * handleCreateQuestion, handleGetQuestionPrompt, handleUpdateQuestion
	 */

	@Test
	public void testUpdateQuestionN01() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPrompt = "Does P = NP?";

		quizSimulator.handleCreateQuestion(1, true, originalPrompt);

		quizSimulator.handleUpdateQuestion(1, false, originalPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals(originalPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN01

	@Test
	public void testUpdateQuestionN02() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPrompt = "Did the chicken cross the road?";
		final String updatedPrompt = "Did the chicken cross the highway?";

		quizSimulator.handleCreateQuestion(1, true, originalPrompt);

		quizSimulator.handleUpdateQuestion(1, true, updatedPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals(updatedPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN02

	@Test
	public void testUpdateQuestionN03() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPrompt = "Did the chicken cross the road?";
		final String updatedPrompt = "Did the chicken cross the highway?";

		quizSimulator.handleCreateQuestion(1, true, originalPrompt);

		quizSimulator.handleUpdateQuestion(1, false, updatedPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals(updatedPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN03

	@Test
	public void testUpdateQuestionN04() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPromptQ1 = "Did the chicken cross the road?";
		final String originalPromptQ2 = "Did the chicken cross the ocean?";
		final String originalPromptQ3 = "Did the chicken cross the river?";
		final String updatedPrompt = "Did the chicken cross the highway?";

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, true, originalPromptQ2);
		quizSimulator.handleCreateQuestion(3, true, originalPromptQ3);

		// Update Q1
		quizSimulator.handleUpdateQuestion(1, false, updatedPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals(updatedPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN04
	
	@Test
	public void testUpdateQuestionN05() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPromptQ1 = "Did the chicken cross the road?";
		final String originalPromptQ2 = "Did the chicken cross the ocean?";
		final String originalPromptQ3 = "Did the chicken cross the river?";
		final String updatedPrompt = "Did the chicken cross the highway?";

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, true, originalPromptQ2);
		quizSimulator.handleCreateQuestion(3, true, originalPromptQ3);

		// Update Q2
		quizSimulator.handleUpdateQuestion(2, false, updatedPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(2);
		numberOfTests++;
		assertEquals(updatedPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN05
	
	@Test
	public void testUpdateQuestionN06() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();
		final String originalPromptQ1 = "Did the chicken cross the road?";
		final String originalPromptQ2 = "Did the chicken cross the ocean?";
		final String originalPromptQ3 = "Did the chicken cross the river?";
		final String updatedPrompt = "Did the chicken cross the highway?";

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, true, originalPromptQ2);
		quizSimulator.handleCreateQuestion(3, true, originalPromptQ3);

		// Update Q3
		quizSimulator.handleUpdateQuestion(3, false, updatedPrompt);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(3);
		numberOfTests++;
		assertEquals(updatedPrompt, currentPrompt);
		testsPassed++;
	} // testUpdateQuestionN06

} // end class TestUpdateQuestion
