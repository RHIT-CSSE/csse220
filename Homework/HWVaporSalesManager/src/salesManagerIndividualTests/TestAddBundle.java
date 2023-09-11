package salesManagerIndividualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllIndividualTests;
import salesManager.SalesManager;

public class TestAddBundle {
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
		String className = TestAddBundle.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testAddBundleN01() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-bundle BuilderBundle 75 MoonCraft TowerRise"));
		testsPassed++;
	}
	
	@Test
	public void testAddBundleN02() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane"));
		testsPassed++;
	}
	
	@Test
	public void testAddBundleN03() {
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-bundle TeamBundle 94.95 TeamCastle2 Limitl3ss TowerRise"));
		testsPassed++;
	}
}
