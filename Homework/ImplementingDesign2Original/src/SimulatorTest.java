import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {

	private QuizSimulatorMain simulator;
	
	@Before
	public void clear() {
		 this.simulator = new QuizSimulatorMain();
	}
	
	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleCreateQuestionAndDisplay() {
		simulator.handleCreateQuestion(1,true,"Is the sky blue?");
		String prompt = simulator.handleGetQuestionPrompt(1);
		assertEquals("Is the sky blue?" ,prompt);
		
		simulator.handleCreateQuestion(2,false,"Is the moon made of cheese?");
		prompt = simulator.handleGetQuestionPrompt(2);
		assertEquals("Is the moon made of cheese?" ,prompt);
		
		simulator.handleCreateQuestion(3,true,"Is 42 the meaning of life, the universe, and everything?");
		prompt = simulator.handleGetQuestionPrompt(3);
		assertEquals("Is 42 the meaning of life, the universe, and everything?", prompt);
		
		simulator.handleCreateQuestion(4,true,"Will people live on mars this century?");
		prompt = simulator.handleGetQuestionPrompt(4);
		assertEquals("Will people live on mars this century?" ,prompt);
		
	}
	
	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleCreateUpdateDisplayQuestionSingle() {
		simulator.handleCreateQuestion(1,true,"Is P=NP?");
		String prompt = simulator.handleGetQuestionPrompt(1);
		assertEquals("Is P=NP?" ,prompt);
		
		simulator.handleUpdateQuestion(1, false, "Is P=NP?");
		prompt = simulator.handleGetQuestionPrompt(1);
		assertEquals("Is P=NP?" ,prompt);
		
		simulator.handleUpdateQuestion(1, false, "Did the chicken cross the road?");
		prompt = simulator.handleGetQuestionPrompt(1);
		assertEquals("Did the chicken cross the road?", prompt);
		
		simulator.handleUpdateQuestion(1, true, "Did the chicken cross the road?");
		prompt = simulator.handleGetQuestionPrompt(1);
		assertEquals("Did the chicken cross the road?" ,prompt);
	}
	

	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleCreateQuizAddQuestionToQuizAddQuizTester() {
		//create 4 quizzes
		for (int i=0; i< 4; i++) {
			simulator.handleCreateQuiz(  i   );
		}
		//create 8 questions
		for (int i=0; i< 8; i++) {
			simulator.handleCreateQuestion(i, i%2==0, "Is "+i+" even?");
			simulator.handleAddQuestionToQuiz(i, i % 4 );
		}
		//quizzes
		//0    0  4
		//1    1  5
		//2    2  6
		//3    3  7
		simulator.handleCreateQuizTester(1, "1");
		simulator.handleCreateQuizTester(2, "2");
		simulator.handleCreateQuizTester(3, "3");
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(1, 1), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 1), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(3, 1), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 2), 0.0001 );
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(2, 2), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 2), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(1, 3), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 3), 0.0001 );
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(3, 3), 0.0001 );
	}

	
	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleCreateChangeQuestionTestWithQuizTester() {
		//create 4 quizzes
		for (int i=1; i<= 4; i++) {
			simulator.handleCreateQuiz(  i   );
		}
		//create 8 questions
		for (int i=1; i<= 8; i++) {
			simulator.handleCreateQuestion(i, i%2==0, "Is "+i+" even?");
			simulator.handleAddQuestionToQuiz(i, i % 4+1 );
		}
		//quizzes
		//1    1  5
		//2    2  6
		//3    3  7
		//4    0  4
		simulator.handleCreateQuizTester(1, "1");
		simulator.handleCreateQuizTester(2, "2");
		simulator.handleCreateQuizTester(3, "3");
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 1), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(2, 1), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 1), 0.0001 );
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(1, 2), 0.0001 );
		assertEquals(1.0, simulator.handleGetQuizTesterScoreOnQuiz(2, 2), 0.0001 );
		assertEquals(1.0, simulator.handleGetQuizTesterScoreOnQuiz(3, 2), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 3), 0.0001 );
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(2, 3), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 3), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(1, 4), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 4), 0.0001 );
		assertEquals(0.5, simulator.handleGetQuizTesterScoreOnQuiz(3, 4), 0.0001 );
		//update 8 questions
		for (int i=1; i<= 8; i++) {
			simulator.handleUpdateQuestion(i, true, "Is 2 even?");
		}
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 1), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 1), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 1), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 2), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 2), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 2), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(1, 3), 0.0001 );
		assertEquals(1,   simulator.handleGetQuizTesterScoreOnQuiz(2, 3), 0.0001 );
		assertEquals(0,   simulator.handleGetQuizTesterScoreOnQuiz(3, 3), 0.0001 );
		//add more questions
		for (int i=9; i<= 16; i++) {
			simulator.handleCreateQuestion(i, i%2==0, "Is "+i+" even?");
			simulator.handleAddQuestionToQuiz(i, i % 4+1 );
		}
		assertEquals(0.5,  simulator.handleGetQuizTesterScoreOnQuiz(1, 1), 0.0001 );
		assertEquals(0.75, simulator.handleGetQuizTesterScoreOnQuiz(2, 1), 0.0001 );
		assertEquals(0.0,  simulator.handleGetQuizTesterScoreOnQuiz(3, 1), 0.0001 );
		assertEquals(0.25, simulator.handleGetQuizTesterScoreOnQuiz(1, 2), 0.0001 );
		assertEquals(1.0,  simulator.handleGetQuizTesterScoreOnQuiz(2, 2), 0.0001 );
		assertEquals(0.25, simulator.handleGetQuizTesterScoreOnQuiz(3, 2), 0.0001 );
		assertEquals(0.5,  simulator.handleGetQuizTesterScoreOnQuiz(1, 3), 0.0001 );
		assertEquals(0.5,  simulator.handleGetQuizTesterScoreOnQuiz(2, 3), 0.0001 );
		assertEquals(0.0,  simulator.handleGetQuizTesterScoreOnQuiz(3, 3), 0.0001 );
	}
	
	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleGetQuizTesterOverallScore() {
		//create 4 quizzes
		for (int i=0; i< 4; i++) {
			simulator.handleCreateQuiz(  i   );
		}
		//create 8 questions
		for (int i=0; i< 8; i++) {
			simulator.handleCreateQuestion(i, i%2==0, "Is "+i+" even?");
			simulator.handleAddQuestionToQuiz(i, i % 4 );
		}
		//quizzes
		//quiz 0  has questions   0,  4
		//quiz 1  has questions   1,  5
		//quiz 2  has questions   2,  6
		//quiz 3  has questions   3,  7
		simulator.handleCreateQuizTester(1, "1");
		simulator.handleCreateQuizTester(2, "2");
		simulator.handleCreateQuizTester(3, "3");
		
		//score quiz tester 1 gets 0%, 50%, 0%, 100%  (on quizzes 0,1,2,3)
		assertEquals(0.375, simulator.handleGetQuizTesterOverallScore(1), 0.0001 );
		
		//score quiz tester 2 gets 100%, 0%, 50%, 100%  (on quizzes 0,1,2,3)
		assertEquals(0.625, simulator.handleGetQuizTesterOverallScore(2), 0.0001 );
		
		//score quiz tester 3 gets 0%, 100%, 0%, 50%  (on quizzes 0,1,2,3)
		assertEquals(0.375, simulator.handleGetQuizTesterOverallScore(3), 0.0001 );
		
	}
	
	/**
	 * This test will only pass when you have successfully completed all the handle methods called within it
	 */
	@Test
	public void testHandleGetQuizTesterOverallScoreHighValues() {
		//create 10 quizzes
		for (int i=0; i< 10; i++) {
			simulator.handleCreateQuiz(  i   );
		}
		
		//create 10 questions
		for (int i=0; i< 10; i++) {
			simulator.handleCreateQuestion(i, i%2==0, "Is "+i+" even?");
			simulator.handleAddQuestionToQuiz(i, i  );
		}
		
		simulator.handleCreateQuizTester(0, "0");
		simulator.handleCreateQuizTester(1, "1");
		simulator.handleCreateQuizTester(2, "2");
		
		assertEquals(0.6, simulator.handleGetQuizTesterOverallScore(0), 0.0001 );
		assertEquals(0.4, simulator.handleGetQuizTesterOverallScore(1), 0.0001 );
		assertEquals(0.6, simulator.handleGetQuizTesterOverallScore(2), 0.0001 );
		
		//create 10 questions for one more quiz (11th quiz)
		simulator.handleCreateQuiz(  10   );
		
		//create 10 additional questions
		for (int i=11; i< 21; i++) {
			simulator.handleCreateQuestion(i, true, "Is 2 even?");
			simulator.handleAddQuestionToQuiz(i, 10  );
		}
		
		//   6/11
		assertEquals(0.54545454, simulator.handleGetQuizTesterOverallScore(0), 0.0001 );
		//   4/11
		assertEquals(0.3636363, simulator.handleGetQuizTesterOverallScore(1), 0.0001 );
		//   7/11
		assertEquals(0.63636363, simulator.handleGetQuizTesterOverallScore(2), 0.0001 );
		
		
		
		
		
	}
	
	
}
	

