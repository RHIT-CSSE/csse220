package HW3Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import HW3.HW3;
import HW3.RunAllTests;

public class TestBuildAirportMap {
	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestBuildAirportMap.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testBuildAirportMapN01() {

		String[] airportCodes = {};
		Integer[] altitudeInMeters = {};

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		numberOfTests++;
		HashMap<String, Integer> catcher = HW3.buildAirportMap(airportCodes, altitudeInMeters);
		assertNotEquals("Expected a keySet, but buildAirportMap returned null instead", null, catcher);
		
		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());		
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
		testsPassed++;
	} // testBuildAirportMapN01

	@Test
	public void testBuildAirportMapN02() {

		String[] airportCodes = { "IND" };
		Integer[] altitudeInMeters = { 118 };

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		numberOfTests++;
		HashMap<String, Integer> catcher = HW3.buildAirportMap(airportCodes, altitudeInMeters);

		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());	
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
		testsPassed++;
	} // testBuildAirportMapN02

	@Test
	public void testBuildAirportMapN03() {

		String[] airportCodes = { "CDG", "FOC", "IND", "ORD", "LED", "LPB", "MAD", "MEX", "PEK" };
		Integer[] altitudeInMeters = { 118, 14, 230, 203, 24, 4060, 609, 2238, 35 };

		Set<String> expectedKeySet = new HashSet<>(Arrays.asList(airportCodes));
		Set<Integer> expectedValueSet = new HashSet<>(Arrays.asList(altitudeInMeters));

		numberOfTests++;
		HashMap<String, Integer> catcher = HW3.buildAirportMap(airportCodes, altitudeInMeters);

		Set<String> actualKeySet = (catcher == null) ? new HashSet<String>(): catcher.keySet();
		assertEquals("Expected keySet != acutalKeySet;", expectedKeySet, actualKeySet);

		Set<Integer> actualValueSet = (catcher == null) ? new HashSet<Integer>() : new HashSet<>(catcher.values());	
		assertEquals("expectedValueSet != actualValueSet;", expectedValueSet, actualValueSet);
		testsPassed++;
	} // testBuildAirportMapN03

}
