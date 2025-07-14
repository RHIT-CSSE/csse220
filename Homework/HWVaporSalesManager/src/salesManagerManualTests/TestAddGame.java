package salesManagerManualTests;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllManualTests;
import salesManager.SalesManagerMain;

public class TestAddGame {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestAddGame.class.getSimpleName();
		RunAllManualTests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testAddGameN01() {
		SalesManagerMain sm = new SalesManagerMain();
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-game TowerRise E10+ 45.49"));
		testsPassed++;
	}
	
	@Test
	public void testAddGameN02() {
		SalesManagerMain sm = new SalesManagerMain();
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-game TowerRise E10+ 45.49"));
		assertEquals("ok", sm.handleCommand("add-game TeamCastle2 T 35"));
		testsPassed++;
	}
	
	@Test
	public void testAddGameN03() {
		SalesManagerMain sm = new SalesManagerMain();
		numberOfTests++;
		assertEquals("ok", sm.handleCommand("add-game TowerRise E10+ 45.49"));
		assertEquals("ok", sm.handleCommand("add-game TeamCastle2 T 35"));
		assertEquals("ok", sm.handleCommand("add-game KangarooJane T 39.95"));
		testsPassed++;
	}
	
}
