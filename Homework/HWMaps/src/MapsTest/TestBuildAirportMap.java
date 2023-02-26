package MapsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;

import MapsHW.Maps;

@RunWith(RunAllTestsTestRunner.class)
public class TestBuildAirportMap {
	@Test
	public void testBuildAirportMapN01() {

		String[] airportCodes = {};
		Integer[] altitudeInMeters = {};

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		HashMap<String, Integer> catcher = Maps.buildAirportMap(airportCodes, altitudeInMeters);
		assertNotEquals("Expected a keySet, but buildAirportMap returned null instead", null, catcher);
		
		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());		
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
	} // testBuildAirportMapN01

	@Test
	public void testBuildAirportMapN02() {

		String[] airportCodes = { "IND" };
		Integer[] altitudeInMeters = { 118 };

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		HashMap<String, Integer> catcher = Maps.buildAirportMap(airportCodes, altitudeInMeters);

		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());	
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
	} // testBuildAirportMapN02

	@Test
	public void testBuildAirportMapN03() {

		String[] airportCodes = { "CDG", "FOC", "IND", "ORD", "LED", "LPB", "MAD", "MEX", "PEK" };
		Integer[] altitudeInMeters = { 118, 14, 230, 203, 24, 4060, 609, 2238, 35 };

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		HashMap<String, Integer> catcher = Maps.buildAirportMap(airportCodes, altitudeInMeters);

		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());	
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
	} // testBuildAirportMapN03

}
