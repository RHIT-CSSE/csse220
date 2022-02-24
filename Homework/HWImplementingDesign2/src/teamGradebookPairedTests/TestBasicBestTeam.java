package teamGradebookPairedTests;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;

public class TestBasicBestTeam {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBasicBestTeam.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBasicBestTeamN01() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Isabel");
		gb.handleCommand("add-student Roberto");
		gb.handleCommand("add-team Wizards Roberto Isabel");
		
		gb.handleCommand("add-team ImplicitTeamA Charlie Dave");
		gb.handleCommand("add-grade ImplicitTeamA 50");
		gb.handleCommand("add-grade Wizards 60");
		
		numberOfTests++;
		assertEquals("Wizards", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBasicBestTeamN01
	
	@Test
	public void testBasicBestTeamN02() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-team Wizards Roberto Isabel");
		gb.handleCommand("add-team ImplicitTeamA Charlie Dave");
		
		gb.handleCommand("add-grade ImplicitTeamA 50");		
		gb.handleCommand("add-grade ImplicitTeamA 100");
		gb.handleCommand("add-grade Wizards 60");
		
		numberOfTests++;
		assertEquals("ImplicitTeamA", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBasicBestTeamN02
	
	@Test
	public void testBasicBestTeamN03() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-team Wizards Roberto Isabel");
		gb.handleCommand("add-team ImplicitTeamA Charlie Dave");
		gb.handleCommand("add-team ImplicitTeam2 Charlie Dave Roberto Isabel");
		
		gb.handleCommand("add-grade ImplicitTeamA 50");		
		gb.handleCommand("add-grade ImplicitTeamA 100");
		gb.handleCommand("add-grade Wizards 60");
		
		numberOfTests++;
		assertEquals("ImplicitTeamA", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBasicBestTeamN03


}
