package salesManagerGenAITests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import salesManager.RunAllGenAITests;
import salesManager.SalesManagerMain;

public class TestBasicHighestRevenueGame {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBasicHighestRevenueGame.class.getSimpleName();
		RunAllGenAITests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testBasicHighestRevenueGameN01() {
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		String[] gameTitles = {"MoonCraft", "TeamCastle2", "TowerRise", "Limitl3ss", "KangarooJane"};
		
		for (String gameTitle : gameTitles) {
			sm.handleCommand("sell-game " + gameTitle);
		}

		numberOfTests++;
		assertEquals("Limitl3ss", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
	@Test
	public void testBasicHighestRevenueGameN02() {
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		String[] gameTitles = {"MoonCraft", "TeamCastle2", "TowerRise", "Limitl3ss", "KangarooJane"};
		
		for (String gameTitle : gameTitles) {
			sm.handleCommand("sell-game " + gameTitle);
		}
		sm.handleCommand("sell-game TowerRise");
			
		numberOfTests++;
		assertEquals("TowerRise", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
	@Test
	public void testBasicHighestRevenueGameN03() {
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game MoonCraft");
		sm.handleCommand("sell-game MoonCraft");
		sm.handleCommand("sell-game MoonCraft");
		sm.handleCommand("sell-game MoonCraft");
			
		numberOfTests++;
		assertEquals("KangarooJane", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
}
