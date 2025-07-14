package salesManagerManualTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllManualTests;
import salesManager.SalesManagerMain;

public class TestBundleSalesReport {
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

		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle BoomerangBundle");
		sm.handleCommand("sell-bundle BuilderBundle");
		sm.handleCommand("sell-bundle TeamBundle");
		sm.handleCommand("sell-bundle TeamBundle");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBundleSalesReport.class.getSimpleName();
		RunAllManualTests.outputResults(testsPassed, numberOfTests, className);
	}

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBundleSalesReportN01() {
		numberOfTests++;
		String reportBoomerangBundle = "Name: BoomerangBundle\n" 
				+ "Games: TowerRise,Limitl3ss,KangarooJane\n" 
				+ "Price: $100.00\n"
				+ "Copies Sold: 4\n" 
				+ "Total Revenue: $400.00";
		assertEquals(reportBoomerangBundle, sm.handleCommand("print-bundle-sales-report BoomerangBundle"));
		testsPassed++;
	}

	@Test
	public void testBundleSalesReportN02() {
		numberOfTests++;
		String reportBuilderBundle = "Name: BuilderBundle\n" 
				+ "Games: MoonCraft,TowerRise\n" 
				+ "Price: $75.00\n"
				+ "Copies Sold: 1\n" 
				+ "Total Revenue: $75.00";
		assertEquals(reportBuilderBundle, sm.handleCommand("print-bundle-sales-report BuilderBundle"));
		testsPassed++;
	}

	@Test
	public void testBundleSalesReportN03() {
		numberOfTests++;
		String reportTeamBundle = "Name: TeamBundle\n" 
				+ "Games: TeamCastle2,Limitl3ss,TowerRise\n" 
				+ "Price: $94.95\n"
				+ "Copies Sold: 2\n" 
				+ "Total Revenue: $189.90";
		assertEquals(reportTeamBundle, sm.handleCommand("print-bundle-sales-report TeamBundle"));
		testsPassed++;
	}
}
