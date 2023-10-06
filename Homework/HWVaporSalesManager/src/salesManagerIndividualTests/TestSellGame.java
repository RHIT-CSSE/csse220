package salesManagerIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllIndividualTests;
import salesManager.SalesManager;

public class TestSellGame {
	private static int testsPassed;
	private static int numberOfTests;
	private static SalesManager sm;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
		
		sm = new SalesManager();
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestSellGame.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testSellGameN01() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-game MoonCraft"));
		assertEquals("ok", sm.handleCommand("sell-game MoonCraft"));
		assertEquals("ok", sm.handleCommand("sell-game MoonCraft"));
		testsPassed++;
	}
	
	@Test
	public void testSellGameN02() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-game KangarooJane"));
		assertEquals("ok", sm.handleCommand("sell-game TowerRise"));
		assertEquals("ok", sm.handleCommand("sell-game Limitl3ss"));
		testsPassed++;
	}
	
	@Test
	public void testSellGameN03() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-game TeamCastle2"));
		assertEquals("ok", sm.handleCommand("sell-game TeamCastle2"));
		assertEquals("ok", sm.handleCommand("sell-game TowerRise"));
		assertEquals("ok", sm.handleCommand("sell-game Limitl3ss"));
		assertEquals("ok", sm.handleCommand("sell-game Limitl3ss"));
		testsPassed++;
	}
	
	@Test
	public void testSellGameN04() {
		numberOfTests++;
		try {
			assertNotEquals("ok", sm.handleCommand("sell-game not-a-game")); 
		} catch (NullPointerException e) {
			fail("NullPointerException when sell-game is called with a non-existent game.");
			return;
		}
		
		testsPassed++;
	}
}
