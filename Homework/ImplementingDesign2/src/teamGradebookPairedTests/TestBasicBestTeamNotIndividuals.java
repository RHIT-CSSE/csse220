package teamGradebookPairedTests;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;

public class TestBasicBestTeamNotIndividuals {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBasicBestTeamNotIndividuals.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBasicBestTeamNotIndividualsN01() {
		TeamGradebook gb = new TeamGradebook();
		gb.handleCommand("add-team Ninjas Bob Alice");
		
		gb.handleCommand("add-team JustCharlie Charlie");
		gb.handleCommand("add-team JustAlice Alice");
		gb.handleCommand("add-team JustBob Bob");
		gb.handleCommand("add-grade JustCharlie 90");
		gb.handleCommand("add-grade JustAlice 0");
		gb.handleCommand("add-grade JustBob 0");
		gb.handleCommand("add-grade Ninjas 91");

		numberOfTests++;
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));
		testsPassed++;
	} // testBasicBestTeamNotIndividualsN01

} // end class TestBasicBestTeamNotIndividuals
