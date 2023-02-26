package teamGradebookIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestAddTeam {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAddTeam.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testAddTeamN01() {
		TeamGradebook gb = new TeamGradebook();
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-team NoMembers"));
		testsPassed++;
	} // testAddTeamN01
	
	@Test
	public void testAddTeamN02() {
		TeamGradebook gb = new TeamGradebook();
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-team Ninjas Ravi Bella"));
		testsPassed++;
	} // testAddTeamN02
	
	@Test
	public void testAddTeamN03() {
		TeamGradebook gb = new TeamGradebook();
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-student Jack");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-team Wizards Rei Jack"));
		testsPassed++;
	} // testAddTeamN03
	
	
	@Test
	public void testAddTeamN04() {
		TeamGradebook gb = new TeamGradebook();
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-student Jack");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-team Ninjas Ravi Bella"));
		assertEquals("ok", gb.handleCommand("add-team Wizards Rei Jack"));
		testsPassed++;
	} // testAddTeamN04
	
} // end class TestAddTeam












