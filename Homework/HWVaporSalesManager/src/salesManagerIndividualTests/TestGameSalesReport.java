package salesManagerIndividualTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import salesManager.RunAllIndividualTests;
import salesManager.SalesManagerMain;

public class TestGameSalesReport {
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
		
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game KangarooJane");
		sm.handleCommand("sell-game TeamCastle2");
		sm.handleCommand("sell-game TeamCastle2");
		sm.handleCommand("sell-game Limitl3ss");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGameSalesReport.class.getSimpleName();
		RunAllIndividualTests.outputResults(testsPassed, numberOfTests, className);
	}

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGameSalesReportN01() {
		numberOfTests++;
		String reportMoonCraft = "Title: MoonCraft\n" 
				+ "Rating: E\n" 
				+ "Price: $27.49\n"
				+ "Copies Sold Individually: 0\n"
				+ "Copies Sold in Bundles: 1\n"
				+ "Total Copies Sold: 1\n"
				+ "Total Revenue: $37.50";
		assertEquals(reportMoonCraft, sm.handleCommand("print-game-sales-report MoonCraft"));
		testsPassed++;
	}
	
	@Test
	public void testGameSalesReportN02() {
		numberOfTests++;
		String reportTeamCastle2 = "Title: TeamCastle2\n" 
				+ "Rating: T\n" 
				+ "Price: $35.00\n"
				+ "Copies Sold Individually: 2\n"
				+ "Copies Sold in Bundles: 2\n"
				+ "Total Copies Sold: 4\n"
				+ "Total Revenue: $133.30"; // $35 * 2 + ($94.95 / 3) * 2
		assertEquals(reportTeamCastle2, sm.handleCommand("print-game-sales-report TeamCastle2"));
		testsPassed++;
	}
	
	@Test
	public void testGameSalesReportN03() {
		numberOfTests++;
		String reportTowerRise = "Title: TowerRise\n" 
				+ "Rating: E10+\n" 
				+ "Price: $45.49\n"
				+ "Copies Sold Individually: 0\n"
				+ "Copies Sold in Bundles: 7\n"
				+ "Total Copies Sold: 7\n"
				+ "Total Revenue: $234.13"; // ($100 / 3) * 4 + ($75 / 2) + ($94.95 / 3) * 2 = $234.1333333...
		assertEquals(reportTowerRise, sm.handleCommand("print-game-sales-report TowerRise"));
		testsPassed++;
	}
	
	@Test
	public void testGameSalesReportN04() {
		numberOfTests++;
		String reportLimitl3ss = "Title: Limitl3ss\n" 
				+ "Rating: M\n" 
				+ "Price: $60.00\n"
				+ "Copies Sold Individually: 1\n"
				+ "Copies Sold in Bundles: 6\n"
				+ "Total Copies Sold: 7\n"
				+ "Total Revenue: $256.63"; // $60 * 1 + ($100 / 3) * 4 + ($94.95 / 3) * 2 = $256.633333...
		assertEquals(reportLimitl3ss, sm.handleCommand("print-game-sales-report Limitl3ss"));
		testsPassed++;
	}
	
	@Test
	public void testGameSalesReportN05() {
		numberOfTests++;
		String reportKangarooJane = "Title: KangarooJane\n" 
				+ "Rating: T\n" 
				+ "Price: $39.95\n"
				+ "Copies Sold Individually: 3\n"
				+ "Copies Sold in Bundles: 4\n"
				+ "Total Copies Sold: 7\n"
				+ "Total Revenue: $253.18"; // $39.95 * 3 + ($100 / 3) * 4 = $253.18333333...
		assertEquals(reportKangarooJane, sm.handleCommand("print-game-sales-report KangarooJane"));
		testsPassed++;
	}
}
