package teamGradebookIndividualTests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestAddStudent {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAddStudent.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testAddStudentN01() {
		TeamGradebook gb = new TeamGradebook();
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-student Bella"));
		testsPassed++;
	} // testAddStudentN01
	
	@Test
	public void testAddStudentN02() {
		TeamGradebook gb = new TeamGradebook();
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-student Ravi"));
		assertEquals("ok", gb.handleCommand("add-student Bella"));
		testsPassed++;
	} // testAddStudentN02
	
	@Test
	public void testAddStudentN03() {
		TeamGradebook gb = new TeamGradebook();
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-student Rei"));
		assertEquals("ok", gb.handleCommand("add-student Ravi"));
		assertEquals("ok", gb.handleCommand("add-student Bella"));
		testsPassed++;
	} // testAddStudentN03	

} // end class TestAddStudent
