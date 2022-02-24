package teamGradebookIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestAddGrade {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAddGrade.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testAddGradeN01() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-team Ninjas Ravi Bella");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-grade Ninjas 97.5"));
		testsPassed++;
	} // testAddGradeN01
	
	@Test
	public void testAddGradeN02() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-student Jack");
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-team Wizards Rei Jack");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-grade Wizards 100"));
		testsPassed++;
	} // testAddGradeN02
	
	@Test
	public void testAddGradeN03() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		gb.handleCommand("add-student Jack");
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-team Wizards Rei Jack");
		
		numberOfTests++;
		assertEquals("ok", gb.handleCommand("add-grade Wizards 80"));
		assertEquals("ok", gb.handleCommand("add-grade Wizards 100"));
		testsPassed++;
	} // testAddGradeN03

} // end class TestAddGrade














