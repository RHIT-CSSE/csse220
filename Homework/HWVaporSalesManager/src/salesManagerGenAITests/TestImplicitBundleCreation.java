package salesManagerGenAITests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import salesManager.RunAllGenAITests;
import salesManager.SalesManagerMain;

public class TestImplicitBundleCreation {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestImplicitBundleCreation.class.getSimpleName();
		RunAllGenAITests.outputResults(testsPassed, numberOfTests, className);
	}
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------
	
	@Test
	public void testImplicitBundleCreationN01() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		assertEquals("ok", sm.handleCommand("add-bundle ImplicitBundle 42.96 DeadMitochondria CallOfDestiny"));
		testsPassed++;
	}
	
	@Test
	public void testImplicitBundleCreationN02() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		assertEquals("ok", sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny"));
		assertEquals("ok", sm.handleCommand("sell-game DeadMitochondria"));
		assertEquals("ok", sm.handleCommand("sell-game CallOfDestiny"));
		String codSalesReport = sm.handleCommand("print-game-sales-report CallOfDestiny");
		assertTrue(codSalesReport.contains("49.95"));
		assertTrue(codSalesReport.contains("T"));
		testsPassed++;
	}
	
	@Test
	public void testImplicitBundleCreationN03() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		assertEquals("ok", sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny"));
		assertEquals("ok", sm.handleCommand("add-game VertebrateCrossing E 39.99")); 
		assertEquals("ok", sm.handleCommand("add-bundle MixedBundle 78.33 CallOfDestiny VertebrateCrossing"));
		assertEquals("ok", sm.handleCommand("sell-bundle ImplicitBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle MixedBundle"));
		assertEquals("ok", sm.handleCommand("sell-game CallOfDestiny"));
		assertEquals("ok", sm.handleCommand("sell-game DeadMitochondria"));
		testsPassed++;
	}
	
	@Test
	public void testImplicitBundleCreationN04() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		assertEquals("ok", sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny"));
		assertEquals("ok", sm.handleCommand("add-game VertebrateCrossing E 39.99")); 
		assertEquals("ok", sm.handleCommand("add-bundle MixedBundle 78.00 CallOfDestiny VertebrateCrossing"));
		assertEquals("ok", sm.handleCommand("sell-bundle ImplicitBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle MixedBundle"));
		assertEquals("ok", sm.handleCommand("sell-game CallOfDestiny")); 
		
		String reportCallOfDestiny = sm.handleCommand("print-game-sales-report CallOfDestiny"); 
		assertTrue(reportCallOfDestiny.contains("Total Revenue: $136.43")); // $49.95 * 1 + ($78.00 / 2) * 1 + ($94.96 / 2) * 1
		testsPassed++;
	}
	
	@Test
	public void testImplicitBundleCreationN05() {
		numberOfTests++;
		SalesManagerMain sm = new SalesManagerMain();
		assertEquals("ok", sm.handleCommand("add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny"));
		assertEquals("ok", sm.handleCommand("add-game VertebrateCrossing E 39.99")); 
		assertEquals("ok", sm.handleCommand("add-bundle MixedBundle 105.00 CallOfDestiny VertebrateCrossing DeadMitochondria"));
		assertEquals("ok", sm.handleCommand("sell-bundle ImplicitBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle MixedBundle"));
		assertEquals("ok", sm.handleCommand("sell-bundle MixedBundle"));
		assertEquals("ok", sm.handleCommand("sell-game DeadMitochondria"));
		assertEquals("ok", sm.handleCommand("sell-game DeadMitochondria")); 
		assertEquals("ok", sm.handleCommand("sell-game DeadMitochondria")); 
		
		String reportCallOfDestiny = sm.handleCommand("print-game-sales-report DeadMitochondria");
		assertTrue(reportCallOfDestiny.contains("Total Revenue: $267.33")); // $49.95 * 3 + ($105.00 / 3) * 2 + ($94.96 / 2) * 1
		testsPassed++;
	}
}
