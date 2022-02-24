

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RecursionTest {  

	static List<Integer> sT1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 8, 13, 21));
	static List<Integer> sT2 = new ArrayList<Integer>(Arrays.asList(4, 6, 7, 20, 30, 40));
	static int[] aR1 = { 1, 2, 3, 4, 5, 6, 7, 8, 13, 20, 21, 30, 40 };

	static List<Integer> sT3 = new ArrayList<Integer>();
	static List<Integer> sT4 = new ArrayList<Integer>();
	static int[] aR2 = {};

	static List<Integer> sT5 = new ArrayList<Integer>(Arrays.asList(5, 10, 15));
	static List<Integer> sT6 = new ArrayList<Integer>(Arrays.asList(-15, -10, -5));
	static int[] aR3 = { -15, -10, -5, 5, 10, 15 };

	static List<Integer> sT7 = new ArrayList<Integer>();
	static List<Integer> sT8 = new ArrayList<Integer>(Arrays.asList(-15, -10, -5));
	static int[] aR4 = { -15, -10, -5 };


	// **************************************************************
	// Test: join
	// **************************************************************
	
	@Test
	public void testJoin1() {
		assertArrayEquals(aR1, Recursion.join(sT1, sT2));
	}

	@Test
	public void testJoin2() {
		sT1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 8, 13, 21));
		sT2 = new ArrayList<Integer>(Arrays.asList(4, 6, 7, 20, 30, 40));
		assertArrayEquals(aR1, Recursion.join(sT2, sT1));
	}

	@Test
	public void testJoin3() {
		assertArrayEquals(aR2, Recursion.join(sT3, sT4));
	}

	@Test
	public void testJoin4() {
		assertArrayEquals(aR3, Recursion.join(sT5, sT6));
	}

	@Test
	public void testJoin5() {
		assertArrayEquals(aR4, Recursion.join(sT7, sT8));
	}

	// **************************************************************
	// Test: lastLocation
	// **************************************************************

	@Test
	public void testLastLocation1() {
		assertEquals(15, Recursion.lastLocation("Rose-Hulman CSSE 220-02", 'E'));
	}

	@Test
	public void testLastLocation2() {
		assertEquals(0, Recursion.lastLocation("CSSE 220-02", 'C'));
	}

	@Test
	public void testLastLocation3() {
		assertEquals(2, Recursion.lastLocation("CSSE 220-02", 'S'));
	}

	@Test
	public void testLastLocation4() {
		assertEquals(10, Recursion.lastLocation("CSSE 220-02", '2'));
	}

	@Test
	public void testLastLocation5() {
		assertEquals(-1, Recursion.lastLocation("", '2'));
	}

	@Test
	public void testLastLocation6() {
		assertEquals(-1, Recursion.lastLocation("CSSE 220-02", '3'));
	}

	// **************************************************************
	// Test: countConsequtiveTimesSubstringAppears
	// **************************************************************

	@Test
	public void testCountTimesSubstringAppears1() {
		// iss appears 2 times consecutively starting at location 1
		assertEquals(2, Recursion.countConsequtiveTimesSubstringAppears("iss", "Mississippiss"));
	}

	@Test
	public void testCountTimesSubstringAppears2() {
		// "iss" appears 2 times consecutively starting at location 10
		assertEquals(3, Recursion.countConsequtiveTimesSubstringAppears("iss", "Mississippissississ"));
	}

	@Test
	public void testCountTimesSubstringAppears3() {
		// "ss" appears 3 times consecutively starting at location 1
		assertEquals(3, Recursion.countConsequtiveTimesSubstringAppears("ss", "xssssssy"));
	}

	@Test
	public void testCountTimesSubstringAppears4() {
		// "i" appears 1 time consecutively starting at locations 1, 4, 7, and 10
		assertEquals(1, Recursion.countConsequtiveTimesSubstringAppears("i", "Mississippi"));
	}

	@Test
	public void testCountTimesSubstringAppears5() {
		// "x" appears 0 times
		assertEquals(0, Recursion.countConsequtiveTimesSubstringAppears("x", "Mississippi"));
	}

	@Test
	public void testCountTimesSubstringAppears6() {
		// "pp" appears 1 time consecutively starting at location 9
		assertEquals(1, Recursion.countConsequtiveTimesSubstringAppears("pp", "Miss issippi"));
	}

	@Test
	public void testCountTimesSubstringAppears7() {
		// "" appears 0 time consecutively starting at location 9
		assertEquals(0, Recursion.countConsequtiveTimesSubstringAppears("", "Mississippi"));
	}

	@Test
	public void testCountTimesSubstringAppears8() {
		// "x" appears 0 times
		assertEquals(0, Recursion.countConsequtiveTimesSubstringAppears("x", ""));
	}

	@Test
	public void testCountTimesSubstringAppears9() {
		// "" appears 0 times
		assertEquals(0, Recursion.countConsequtiveTimesSubstringAppears("", ""));
	}

	// **************************************************************
	// Test: isExactLog2Of
	// **************************************************************


	@Test
	public void testIsExactLog2OfV1() {
		// log2(4) = 2, so true
		assertTrue(Recursion.isExactLog2Of(4, 2));
	}

	@Test
	public void testIsExactLog2OfV2() {
		// log2(256) = 8, so true
		assertTrue(Recursion.isExactLog2Of(256, 8));
	}

	@Test
	public void testIsExactLog2OfV3() {
		// log2(13) = 3.7+, so false
		assertFalse(Recursion.isExactLog2Of(13, 4));
	}
	
	@Test
	public void testIsExactLog2OfV4() {
		// log2(4) = 2, so false
		assertFalse(Recursion.isExactLog2Of(4, 1));
	}

}
