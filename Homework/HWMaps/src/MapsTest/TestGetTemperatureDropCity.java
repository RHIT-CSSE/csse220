package MapsTest;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import MapsHW.Maps;
import MapsHW.RunAllTests;


public class TestGetTemperatureDropCity {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestGetTemperatureDropCity.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetTemperatureDropCityN01() {
		String[] city1 = {"la","ny","la","la","ny"};
		int[] temp1 =    { 90,  80,  89,  92,  80 };
		
		numberOfTests++;
		assertEquals("la", Maps.getTemperatureDropCity(temp1, city1));
		testsPassed++;
	} // testGetTemperatureDropCityN01

		@Test
	public void testGetTemperatureDropCityN02() {
		String[] city2 = {"la","ny","la","la","ny"};
		int[] temp2 =    { 90,  80,  91,  92,  80 };
		
		numberOfTests++;
		assertEquals(null, Maps.getTemperatureDropCity(temp2, city2));
		testsPassed++;
	} // testGetTemperatureDropCityN02
	
	@Test
	public void testGetTemperatureDropCityN03() {
		String[] city3 = {"la","sf","ny","la","la","ny","sf","la","la","ny"};
		int[] temp3 =    { 90,  77,  80,  91,  92,  80,  78,  93,  94,  75};
		
		numberOfTests++;
		assertEquals("ny", Maps.getTemperatureDropCity(temp3, city3));	
		testsPassed++;
	} // testGetTemperatureDropCityN03

}
