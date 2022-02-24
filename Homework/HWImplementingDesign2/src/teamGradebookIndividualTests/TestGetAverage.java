package teamGradebookIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.TeamGradebook;


public class TestGetAverage {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGetAverage.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetAverageN01() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-grade Ninjas 100");
		
		numberOfTests++;
		assertEquals("100", gb.handleCommand("get-average Bella"));
		testsPassed++;
		
	} // testGetAverageN01
	
	@Test
	public void testGetAverageN02() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-grade Ninjas 100");
		
		numberOfTests++;
		assertEquals("100", gb.handleCommand("get-average Bella"));
		assertEquals("100", gb.handleCommand("get-average Ravi"));
		testsPassed++;
		
	} // testGetAverageN02
	
	@Test
	public void testGetAverageN03() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-team Wizards Rei Ravi");

		gb.handleCommand("add-grade Wizards 50");
		gb.handleCommand("add-grade Ninjas 100");
		
		numberOfTests++;
		assertEquals("100", gb.handleCommand("get-average Bella"));
		assertEquals("50", gb.handleCommand("get-average Rei"));
		assertEquals("75", gb.handleCommand("get-average Ravi"));
		testsPassed++;		
	} // testGetAverageN03
	
	@Test
	public void testGetAverageN04() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-team Wizards Rei Ravi");

		gb.handleCommand("add-grade Ninjas 80");
		gb.handleCommand("add-grade Ninjas 100");
		gb.handleCommand("add-grade Wizards 50");
		
		numberOfTests++;
		assertEquals("90", gb.handleCommand("get-average Bella"));
		assertEquals("77", gb.handleCommand("get-average Ravi"));
		assertEquals("50", gb.handleCommand("get-average Rei"));
		testsPassed++;		
	} // testGetAverageN04
	
	@Test
	public void testGetAverageN05() {
		TeamGradebook gb = new TeamGradebook();
		
		gb.handleCommand("add-student Bella");
		gb.handleCommand("add-student Ravi");
		gb.handleCommand("add-student Rei");
		
		gb.handleCommand("add-team Ninjas Ravi Bella");
		gb.handleCommand("add-team Wizards Rei Ravi");

		gb.handleCommand("add-grade Ninjas 80");
		gb.handleCommand("add-grade Ninjas 100");
		gb.handleCommand("add-grade Wizards 50");

		gb.handleCommand("add-team OnlyRavi Ravi");
		gb.handleCommand("add-grade OnlyRavi 71");
		
		numberOfTests++;
		assertEquals("75", gb.handleCommand("get-average Ravi"));
		testsPassed++;		
	} // testGetAverageN05

} // end class TestGetAverage
