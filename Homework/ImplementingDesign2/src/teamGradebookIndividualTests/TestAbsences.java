package teamGradebookIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestAbsences {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAbsences.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testAbsencesN01() {
		TeamGradebook gb = new TeamGradebook();
		
		numberOfTests++;
		gb.handleCommand("add-student Bella");
		assertEquals("0", gb.handleCommand("get-absences Bella"));
		testsPassed++;
	} // testAbsencesN01
	
	@Test
	public void testAbsencesN02() {
		TeamGradebook gb = new TeamGradebook();

		numberOfTests++;
		gb.handleCommand("add-student Bella");
		assertEquals("0", gb.handleCommand("get-absences Bella"));
		gb.handleCommand("add-student Ravi");
		assertEquals("0", gb.handleCommand("get-absences Ravi"));
		testsPassed++;
	} // testAbsencesN02

	@Test
	public void testAbsencesN03() {
		TeamGradebook gb = new TeamGradebook();
		
		numberOfTests++;
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		assertEquals("ok", gb.handleCommand("add-absence Ravi"));
		assertEquals("ok", gb.handleCommand("add-absence Ravi"));
		assertEquals("ok", gb.handleCommand("add-absence Bella"));
		testsPassed++;
	} // testAbsencesN03
	
	@Test
	public void testAbsencesN04() {
		TeamGradebook gb = new TeamGradebook();

		numberOfTests++;
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-absence Bella");
		assertEquals("1", gb.handleCommand("get-absences Bella"));
		testsPassed++;
	} // testAbsencesN04
	
	@Test
	public void testAbsencesN05() {
		TeamGradebook gb = new TeamGradebook();

		numberOfTests++;
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-absence Ravi");
		gb.handleCommand("add-absence Ravi");
		gb.handleCommand("add-absence Bella");
		assertEquals("1", gb.handleCommand("get-absences Bella"));
		assertEquals("2", gb.handleCommand("get-absences Ravi"));
		testsPassed++;
	} // testAbsencesN05
	
} // end class TestAbsences
