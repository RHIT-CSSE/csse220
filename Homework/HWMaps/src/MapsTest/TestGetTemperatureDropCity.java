package MapsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import MapsHW.Maps;

@RunWith(RunAllTestsTestRunner.class)

public class TestGetTemperatureDropCity {

	@Test
	public void testGetTemperatureDropCityN01() {
		String[] city1 = {"la","ny","la","la","ny"};
		int[] temp1 =    { 90,  80,  89,  92,  80 };
		
		assertEquals("la", Maps.getTemperatureDropCity(temp1, city1));
	} // testGetTemperatureDropCityN01

		@Test
	public void testGetTemperatureDropCityN02() {
		String[] city2 = {"la","ny","la","la","ny"};
		int[] temp2 =    { 90,  80,  91,  92,  80 };
		
		assertEquals(null, Maps.getTemperatureDropCity(temp2, city2));
	} // testGetTemperatureDropCityN02
	
	@Test
	public void testGetTemperatureDropCityN03() {
		String[] city3 = {"la","sf","ny","la","la","ny","sf","la","la","ny"};
		int[] temp3 =    { 90,  77,  80,  91,  92,  80,  78,  93,  94,  75};
		
		assertEquals("ny", Maps.getTemperatureDropCity(temp3, city3));	
	} // testGetTemperatureDropCityN03

}
