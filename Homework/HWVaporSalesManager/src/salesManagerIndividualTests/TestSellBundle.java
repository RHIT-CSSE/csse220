package salesManagerIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllIndividualTests;
import salesManager.SalesManagerMain;

public class TestSellBundle {
	private static int testsPassed;
	private static int numberOfTests;
	private static SalesManagerMain sm;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
		
		sm = new SalesManagerMain();
		sm.handleCommand("add-game MoonCraft E 27.49");
		sm.handleCommand("add-game TeamCastle2 T 35");
		sm.handleCommand("add-game TowerRise E10+ 45.49");
		sm.handleCommand("add-game Limitl3ss M 60");
		sm.handleCommand("add-game KangarooJane T 39.95");
		
		sm.handleCommand("add-bundle BuilderBundle 75 MoonCraft TowerRise");
		sm.handleCommand("add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane");
		sm.handleCommand("add-bundle TeamBundle 94.95 TeamCastle2 Limitl3ss TowerRise");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestSellBundle.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testSellBundleN01() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-bundle TeamBundle"));
		testsPassed++;
	}
	
	@Test
	public void testSellBundleN02() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-bundle BuilderBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle BoomerangBundle"));
		testsPassed++;
	}
	
	@Test
	public void testSellBundleN03() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("sell-bundle BoomerangBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle BoomerangBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle BuilderBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle TeamBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle TeamBundle"));
		testsPassed++;
	}
	
	@Test
	public void testSellGameN04() {
		numberOfTests++;
		try {
			assertNotEquals("ok", sm.handleCommand("sell-bundle not-a-bundle"));
		} catch (NullPointerException e) {
			fail("NullPointerException when sell-bundle is called with a non-existent bundle name.");
			return;
		}
		
		testsPassed++;
	}
}
