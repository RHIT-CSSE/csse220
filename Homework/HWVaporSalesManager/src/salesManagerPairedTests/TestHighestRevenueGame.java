package salesManagerPairedTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import salesManager.RunAllPairedTests;
import salesManager.SalesManagerMain;

public class TestHighestRevenueGame {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestHighestRevenueGame.class.getSimpleName();
		RunAllPairedTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testHighestRevenueGameN01() {
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		sm.handleCommand("add-bundle BuilderBundle 75 MoonCraft TowerRise");
		sm.handleCommand("add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane");
		sm.handleCommand("add-bundle TeamBundle 94.95 TeamCastle2 Limitl3ss TowerRise");
		
		sm.handleCommand("sell-bundle BuilderBundle");
		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle TeamBundle");

		numberOfTests++;
		assertEquals("TowerRise", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
	@Test
	public void testHighestRevenueGameN02() {
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		sm.handleCommand("add-bundle BuilderBundle 75 MoonCraft TowerRise");
		sm.handleCommand("add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane");
		sm.handleCommand("add-bundle TeamBundle 94.95 TeamCastle2 Limitl3ss TowerRise");
		
		String[] gameTitles = {"MoonCraft", "TeamCastle2", "TowerRise", "Limitl3ss", "KangarooJane"};
		for (String gameTitle : gameTitles) {
			sm.handleCommand("sell-game " + gameTitle);
		}
		
		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle TeamBundle");
			
		numberOfTests++;
		assertEquals("Limitl3ss", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
	@Test
	public void testHighestRevenueGameN03() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny");
		sm.handleCommand("sell-game DeadMitochondria");
		sm.handleCommand("sell-game CallOfDestiny");
		sm.handleCommand("add-game VertebrateCrossing E 49.94");
		sm.handleCommand("sell-game VertebrateCrossing");
		sm.handleCommand("add-bundle MixedBundle 105.00 CallOfDestiny VertebrateCrossing");
		sm.handleCommand("sell-bundle ImplicitBundle");
		sm.handleCommand("sell-bundle MixedBundle");
		
		assertEquals("CallOfDestiny", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
	
	@Test
	public void testHighestRevenueGameN04() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		
		sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny");
		sm.handleCommand("sell-game DeadMitochondria");
		sm.handleCommand("sell-game CallOfDestiny");
		sm.handleCommand("add-game VertebrateCrossing E 39.99");
		sm.handleCommand("sell-game VertebrateCrossing");
		sm.handleCommand("sell-game VertebrateCrossing");
		sm.handleCommand("sell-game VertebrateCrossing");
		sm.handleCommand("add-bundle MixedBundle 105.00 CallOfDestiny VertebrateCrossing");
		sm.handleCommand("sell-bundle ImplicitBundle");
		sm.handleCommand("sell-bundle MixedBundle");
		
		assertEquals("VertebrateCrossing", sm.handleCommand("highest-revenue-game"));
		testsPassed++;
	}
}
