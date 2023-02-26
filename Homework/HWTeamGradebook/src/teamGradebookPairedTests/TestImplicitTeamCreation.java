package teamGradebookPairedTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;

public class TestImplicitTeamCreation {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestImplicitTeamCreation.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testImplicitCreationN01() {
		TeamGradebook gb = new TeamGradebook();
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-team ImplicitTeam Mateo Jian"));
		testsPassed++;
	} // testImplicitCreationN01
	
	@Test
	public void testImplicitCreationN02() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team ImplicitTeam Mateo Jian");
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-grade ImplicitTeam 97.5"));
		testsPassed++;
	} // testImplicitCreationN01
	
	@Test
	public void testImplicitCreationN03() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team ImplicitTeam Mateo Jian");
		numberOfTests++;
		assertEquals("0", gb.handleCommand("get-average Mateo"));
		assertEquals("0", gb.handleCommand("get-average Jian"));
		testsPassed++;
	} // testImplicitCreationN03
	
	@Test
	public void testImplicitCreationN04() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-team ImplicitTeam Mateo Jian");
		assertEquals("ok", gb.handleCommand("add-grade ImplicitTeam 97.5"));
		numberOfTests++;
		assertEquals("98", gb.handleCommand("get-average Mateo"));
		assertEquals("98", gb.handleCommand("get-average Jian"));
		testsPassed++;
	} // testImplicitCreationN04
	
	@Test
	public void testImplicitCreationN05() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team ImplicitTeamA Isabel Liam Jian");
		gb.handleCommand("add-team ImplicitTeam2 Mateo Jian");
		
		gb.handleCommand("add-grade ImplicitTeamA 100");
		gb.handleCommand("add-grade ImplicitTeamA 80");
		
		numberOfTests++;
		assertEquals("0", gb.handleCommand("get-average Mateo"));
		assertEquals("90", gb.handleCommand("get-average Jian"));
		testsPassed++;
	} // testImplicitCreationN05
	
} // end class TestImplicitTeamCreation
