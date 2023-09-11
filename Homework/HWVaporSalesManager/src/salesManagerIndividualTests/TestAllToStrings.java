package salesManagerIndividualTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import salesManager.Bundle;
import salesManager.Game;
import salesManager.RunAllIndividualTests;
import salesManager.SalesManager;

public class TestAllToStrings {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAllToStrings.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testAllToStringsN01() {
		String errorMessage = "\nYou must implement Game's toString method to pass this test.\nImplement it only after you have declared all of Game's fields.";
		Game game = new Game();
		numberOfTests++;
		assertFalse(errorMessage, game.toString().contains("Game@"));
		testsPassed++;
	}
	
	@Test
	public void testAllToStringsN02() {
		String errorMessage = "\nYou must implement Bundle's toString method to pass this test.\nImplement it only after you have declared all of Bundle's fields";
		Bundle bundle = new Bundle();
		numberOfTests++;
		assertFalse(errorMessage, bundle.toString().contains("Bundle@"));
		testsPassed++;
	}
	
	@Test
	public void testAllToStringsN03() {
		String errorMessage = "\nYou must implement SalesManager's toString method to pass this test.";
		SalesManager sm = new SalesManager();
		numberOfTests++;
		assertFalse(errorMessage, sm.toString().contains("SalesManager@"));
		testsPassed++;
	}

}
