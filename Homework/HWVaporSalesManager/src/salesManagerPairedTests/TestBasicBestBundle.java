package salesManagerPairedTests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import salesManager.RunAllPairedTests;
import salesManager.SalesManagerMain;

public class TestBasicBestBundle {
		private static int testsPassed;
		private static int numberOfTests;

		@BeforeClass
		public static void oneTimeSetUp() {
			testsPassed = 0;
			numberOfTests = 0;
		}

		@AfterClass
		public static void oneTimeTearDown() {
			String className = TestBasicBestBundle.class.getSimpleName();
			RunAllPairedTests.outputResults(testsPassed, numberOfTests, className);
		}
		
		// --------------------------------------------
		// JUnit Tests
		// --------------------------------------------
		
		@Test
		public void testBasicBestBundleN01() {
			SalesManagerMain sm = new SalesManagerMain();
			
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
			
			numberOfTests++;
			assertEquals("BoomerangBundle", sm.handleCommand("best-selling-bundle"));
			testsPassed++;
		}
		
		@Test
		public void testBasicBestBundleN02() {
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
			sm.handleCommand("sell-bundle TeamBundle");
			sm.handleCommand("sell-bundle TeamBundle");
			
			numberOfTests++;
			assertEquals("TeamBundle", sm.handleCommand("best-selling-bundle"));
			testsPassed++;
		}
		
		@Test
		public void testBasicBestBundleN03() {
			SalesManagerMain sm = new SalesManagerMain();
			
			sm.handleCommand("add-game MoonCraft E 27.49");
			sm.handleCommand("add-game TeamCastle2 T 35");
			sm.handleCommand("add-game TowerRise E10+ 45.49");
			sm.handleCommand("add-game Limitl3ss M 60");
			sm.handleCommand("add-game KangarooJane T 39.95");

			sm.handleCommand("add-bundle BuilderBundle 5 MoonCraft TowerRise");
			sm.handleCommand("add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane");
			sm.handleCommand("add-bundle TeamBundle 94.95 TeamCastle2 Limitl3ss TowerRise");

			sm.handleCommand("sell-bundle BuilderBundle");
			sm.handleCommand("sell-bundle BuilderBundle");
			sm.handleCommand("sell-bundle BuilderBundle");
			sm.handleCommand("sell-bundle BoomerangBundle");
			sm.handleCommand("sell-bundle BoomerangBundle");
			sm.handleCommand("sell-bundle TeamBundle");
			sm.handleCommand("sell-bundle TeamBundle");
			
			numberOfTests++;
			assertEquals("BuilderBundle", sm.handleCommand("best-selling-bundle"));
			testsPassed++;
		}
		
}
