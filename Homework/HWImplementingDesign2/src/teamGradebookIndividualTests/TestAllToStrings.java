package teamGradebookIndividualTests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import teamGradebook.RunAllIndividualTests;
import teamGradebook.Student;
import teamGradebook.Team;
import teamGradebook.TeamGradebook;


public class TestAllToStrings {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAllToStrings.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testAllToStringsN01() {
		String errorMessage = "\nYou must implement Student's toString method to pass this test\nImplement it only after you have declared all of Student's fields";
		Student s1 = new Student();
		numberOfTests++;
		assertFalse(errorMessage, s1.toString().contains("Student@"));
		testsPassed++;
	} // testAllToStringsN01
	
	@Test
	public void testAllToStringsN02() {
		String errorMessage = "\nYou must implement Team's toString method to pass this test\nImplement it only after you have declared all of Team's fields";
		Team t1 = new Team();
		numberOfTests++;
		assertFalse(errorMessage, t1.toString().contains("Team@"));
		testsPassed++;
	} // testAllToStringsN02
	
	@Test
	public void testAllToStringsN03() {
		String errorMessage = "\nYou must implement TeamGradebook's toString method to pass this test";
		TeamGradebook t1 = new TeamGradebook();
		numberOfTests++;
		assertFalse(errorMessage, t1.toString().contains("TeamGradebook@"));
		testsPassed++;
	} // testAllToStringsN03

} // end class TestStudentToString
