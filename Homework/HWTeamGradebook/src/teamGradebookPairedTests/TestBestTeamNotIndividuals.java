package teamGradebookPairedTests;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;

public class TestBestTeamNotIndividuals {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBestTeamNotIndividuals.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBestTeamNotIndividualsN01() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team Ninjas Jason Sofia Dan Dave");
		
		gb.handleCommand("add-grade Ninjas 90");
		gb.handleCommand("add-grade Ninjas 90");
		
		numberOfTests++;
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBestTeamNotIndividualsN01
	
	@Test
	public void testBestTeamNotIndividualsN02() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team ImplicitTeamZ Dan Dave");
		gb.handleCommand("add-team Ninjas Jason Sofia");
		
		gb.handleCommand("add-grade Ninjas 90");
		gb.handleCommand("add-grade Ninjas 90");
		gb.handleCommand("add-grade ImplicitTeamZ 0");
		gb.handleCommand("add-grade ImplicitTeamZ 100");
		
		numberOfTests++;
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBestTeamNotIndividualsN02
	
	
	@Test
	public void testBestTeamNotIndividualsN03() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team ImplicitTeamQ Dan Dave");
		gb.handleCommand("add-team Ninjas Jason Sofia Roberto");

		gb.handleCommand("add-grade ImplicitTeamQ 0");
		gb.handleCommand("add-grade ImplicitTeamQ 100");
		
		numberOfTests++;
		assertEquals("ImplicitTeamQ", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBestTeamNotIndividualsN03
	
	@Test
	public void testBestTeamNotIndividualsN04() {
		TeamGradebook gb = new TeamGradebook();

		gb.handleCommand("add-team Ninjas Jason Sofia Dan Dave");
		
		numberOfTests++;
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBestTeamNotIndividualsN04


} // end class TestBestTeamNotIndividuals
