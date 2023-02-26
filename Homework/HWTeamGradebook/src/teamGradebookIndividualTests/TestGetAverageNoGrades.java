package teamGradebookIndividualTests;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestGetAverageNoGrades {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGetAverageNoGrades.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetAverageNoGradesN01() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Rei");
		
		numberOfTests++;
		assertEquals("0", gb.handleCommand("get-average Rei"));
		testsPassed++;
	} // testGetAverageNoGradesN01
	
	@Test
	public void testGetAverageNoGradesN02() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-team Ninjas Rei");
		
		numberOfTests++;
		assertEquals("0", gb.handleCommand("get-average Rei"));
		testsPassed++;
	} // testGetAverageNoGradesN02
	
	
	@Test
	public void testGetAverageNoGradesN03() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-team Ninjas Rei");
		gb.handleCommand("add-team Wizards Rei");
		
		numberOfTests++;
		assertEquals("0", gb.handleCommand("get-average Rei"));
		testsPassed++;
	} // testGetAverageNoGradesN03
	
} // end class TestGetAverageNoGrades
