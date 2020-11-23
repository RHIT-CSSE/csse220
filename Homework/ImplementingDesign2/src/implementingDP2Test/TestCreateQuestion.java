package implementingDP2Test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import implementingDP2.QuizSimulatorMain;
import implementingDP2.RunAllTests;

public class TestCreateQuestion {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestCreateQuestion.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	/**
	 * This test will only pass when you have successfully implemented
	 * handleCreateQuestion and handleGetQuestionPrompt
	 */
	@Test
	public void testCreateQuestionN01() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();

		quizSimulator.handleCreateQuestion(1, true, "Is the sky blue?");
		String prompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals("Is the sky blue?", prompt);
		testsPassed++;
	} // testCreateQuestionN01

	@Test
	public void testCreateQuestionN02() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();

		quizSimulator.handleCreateQuestion(2, false, "Is the moon made of cheese?");
		String prompt = quizSimulator.handleGetQuestionPrompt(2);
		numberOfTests++;
		assertEquals("Is the moon made of cheese?", prompt);
		testsPassed++;
	} // testCreateQuestionN02

	@Test
	public void testCreateQuestionN03() {
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();

		quizSimulator.handleCreateQuestion(3, true, "Is 42 the meaning of life, the universe, and everything?");
		String prompt = quizSimulator.handleGetQuestionPrompt(3);
		numberOfTests++;
		assertEquals("Is 42 the meaning of life, the universe, and everything?", prompt);
		testsPassed++;
	} // testCreateQuestionN03

	@Test
	public void testCreateQuestionN04() {
		final String originalPromptQ1 = "Is the sky blue?";
		final String originalPromptQ2 = "Is the moon made of cheese?";
		final String originalPromptQ7 = "Will people live on Mars this century?";
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();	

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, false, originalPromptQ2);
		quizSimulator.handleCreateQuestion(7, true, originalPromptQ7);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(1);
		numberOfTests++;
		assertEquals(originalPromptQ1, currentPrompt);
		testsPassed++;
	} // testCreateQuestionN04
	
	@Test
	public void testCreateQuestionN05() {
		final String originalPromptQ1 = "Is the sky blue?";
		final String originalPromptQ2 = "Is the moon made of cheese?";
		final String originalPromptQ7 = "Will people live on Mars this century?";
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();	

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, false, originalPromptQ2);
		quizSimulator.handleCreateQuestion(7, true, originalPromptQ7);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(2);
		numberOfTests++;
		assertEquals(originalPromptQ2, currentPrompt);
		testsPassed++;
	} // testCreateQuestionN05
	
	@Test
	public void testCreateQuestionN06() {
		final String originalPromptQ1 = "Is the sky blue?";
		final String originalPromptQ2 = "Is the moon made of cheese?";
		final String originalPromptQ7 = "Will people live on Mars this century?";
		QuizSimulatorMain quizSimulator = new QuizSimulatorMain();	

		quizSimulator.handleCreateQuestion(1, true, originalPromptQ1);
		quizSimulator.handleCreateQuestion(2, false, originalPromptQ2);
		quizSimulator.handleCreateQuestion(7, true, originalPromptQ7);
		String currentPrompt = quizSimulator.handleGetQuestionPrompt(7);
		numberOfTests++;
		assertEquals(originalPromptQ7, currentPrompt);
		testsPassed++;
	} // testCreateQuestionN06

} // end class TestCreateQuestion
