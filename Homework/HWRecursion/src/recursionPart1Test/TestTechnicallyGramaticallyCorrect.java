package recursionPart1Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestTechnicallyGramaticallyCorrect {

	@Test
	public void testTechnicallyCorrect01() {
		assertEquals("", Part1Problems.technicallyGramaticallyCorrect(0));
	} // testTechnicallyCorrect01

	@Test
	public void testTechnicallyCorrect02() {
		assertEquals("Buffalo ", Part1Problems.technicallyGramaticallyCorrect(1));
	} // testTechnicallyCorrect02

	@Test
	public void testTechnicallyCorrect03() {
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo ", Part1Problems.technicallyGramaticallyCorrect(5));
	} // testTechnicallyCorrect03

	@Test
	public void testTechnicallyCorrect04() {
		assertEquals("Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo Buffalo ",
				Part1Problems.technicallyGramaticallyCorrect(10));
	} // testTechnicallyCorrect04

} // end TechnicallyCorrectTest
