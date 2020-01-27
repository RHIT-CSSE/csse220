

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RecursionTest {  

	/*
	 * Passing this test will give you 3 points
	 */
	@Test
	public void testMinimumsSameLength() {
		//Test 1
		Integer[] input1 = {1, 10, 3, 50, 4};
		Integer[] input2 = {2,  9, 5, 20, 8};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		Integer[] result = {1, 9, 3, 20, 4};
		ArrayList<Integer> listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		ArrayList<Integer> actual = Recursion.minimums(list1, list2);
		//Integer[] actualInt = new Integer[actual.length];
		//copyArray(actual, actualInt);
		assertTrue(listRes.equals(actual));
		
		
		//Test 2
		input1 = new Integer[] {1, 1, 1, 1, 1};
		input2 = new Integer[] {2, 2, 2, 2, 2};
		list1 = new ArrayList<Integer>(Arrays.asList(input1));
		list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		result = new Integer[] {1, 1, 1, 1, 1};
		listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		//Test 3
		input1 = new Integer[] {2, 2, 2, 2, 2};
		input2 = new Integer[] {1, 1, 1, 1, 1};
		list1 = new ArrayList<Integer>(Arrays.asList(input1));
		list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		result = new Integer[] {1, 1, 1, 1, 1};
		listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		
		//Big test
		list1 = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		listRes = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			if(i%2 == 0) {
				list1.add(i+1);
				list2.add(i+2);
				listRes.add(i+1);
			} else {
				list1.add(i+2);
				list2.add(i);
				listRes.add(i);
			}
		}
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		
	}
	
	/*
	 * Passing this test will give you the other 3 points
	 */
	@Test
	public void testMinimumsDifferentLength() {

		
		//Test 1
		Integer[] input1 = {1, 10, 3, 50, 4, 6, 7, 8, 20, 100};
		Integer[] input2 = {2,  9, 5, 20, 8};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		Integer[] result = {1, 9, 3, 20, 4, 6, 7, 8, 20, 100};
		ArrayList<Integer> listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		ArrayList<Integer> actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		//Test 2
		input1 = new Integer[] {1, 1, 1, 1, 1};
		input2 = new Integer[] {2, 2, 2, 2, 2, 2, 2, 2, 2};
		list1 = new ArrayList<Integer>(Arrays.asList(input1));
		list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		result = new Integer[] {1, 1, 1, 1, 1, 2, 2, 2, 2};
		listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		//Test 3
		input1 = new Integer[] {2, 2, 2, 2, 2, 2, 2, 2, 2};
		input2 = new Integer[] {1, 1, 1, 1, 1};
		list1 = new ArrayList<Integer>(Arrays.asList(input1));
		list2 = new ArrayList<Integer>(Arrays.asList(input2));
		
		result = new Integer[] {1, 1, 1, 1, 1, 2, 2, 2, 2};
		listRes = new ArrayList<Integer>(Arrays.asList(result));
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		
		//Big test
		list1 = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		listRes = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			if(i > 74) {
				list1.add(i);
				listRes.add(i);
			}
			else if(i%2 == 0) {
				list1.add(i+1);
				list2.add(i+2);
				listRes.add(i+1);
			} else {
				list1.add(i+2);
				list2.add(i);
				listRes.add(i);
			}
		}
		
		actual = Recursion.minimums(list1, list2);
		assertTrue(listRes.equals(actual));
		
		
	}
	
	
	@Test
	public void testFindThirdCapital() {
		//Test 1
		String input = "QQQ";
		int res = 2;
		int actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		
		//Test 2
		input = "abcDefGhiJklmN";
		res = 9;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test3
		input = "abcdef";
		res = -1;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 4
		input = "abCdEf";
		res = -1;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 5
		input = "aaaaAaaaAaaaA";
		res = 12;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 6
		input = "AAAAAAAAAAAAAAAAAAAAAAA";
		res = 2;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 7
		input = "ABCdefghiJKL";
		res = 2;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 8
		input = "0123abcdefgHIJ";
		res = 13;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Test 9
		input = "0123456789";
		res = -1;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
		//Big Test
		input = "";
		for(int i = 0; i < 100; i++) {
			if(i%12 == 0)
				input += "Q";
			else
				input += "q";
		}
		res = 24;
		actual = Recursion.findThirdCapital(input);
		assertEquals(res, actual);
		
	}
	
	
	
	@Test
	public void testFlipAfterNegative() {
		//Test 1
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
		//Test 2
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		res = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -2, -3, -4, -5, -6, -7, -8, -9};
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
		//Test 3
		input = new int[] {-100, -2, -3, -4, -5, -6, -7, -8, -9};
		res = new int[] {-100, 2, 3, 4, 5, 6, 7, 8, 9};
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
		//Test 4
		input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, -1};
		res = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, -1};
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
		//Test5
		input = new int[] {-50, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		res = new int[] {-50, -1, -2, -3, -4, -5, -6, -7, -8, -9};
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
		//Big test
		input = new int[100];
		res = new int[100];
		for(int i = 0; i < 100; i++) {
			if(i==54) {
				input[i] = -i;
				res[i] = -i;
			}
			else if(i > 54) {
				input[i] = i;
				res[i] = -i;
			} else {
				input[i] = i;
				res[i] = i;
			}
		}
		
		Recursion.flipAfterNegative(input);
		assertTrue(Arrays.equals(input, res));
		
	}
	
	/*
	 * If you pass this test, it is worth 3 points out of 6
	 */
	@Test
	public void testFindBestCityPathAnyPath() {
		//Test 1
		HashMap<String, ArrayList<String>> cities = new HashMap<>();
		ArrayList<String> ACities = new ArrayList<String>();
		ACities.add("B");
		cities.put("A", ACities);
		
		ArrayList<String> res = Recursion.findBestCityPath("B", "A", cities);
		assertTrue(isPath(res, cities, "B", "A"));
		
		//Test 2
		cities = new HashMap<>();
		ACities = new ArrayList<String>();
			ACities.add("B");
			cities.put("A", ACities);
		ArrayList<String> BCities = new ArrayList<String>();
			BCities.add("C");
			cities.put("B", BCities);
		ArrayList<String> CCities = new ArrayList<String>();
			CCities.add("D");
			cities.put("C", CCities);
			
		res = Recursion.findBestCityPath("D", "A", cities);
		assertTrue(isPath(res, cities, "D", "A"));
		
		
		//Test 3
		cities = new HashMap<>();
		ACities = new ArrayList<String>();
			ACities.add("B");
			ACities.add("D");
			cities.put("A", ACities);
		BCities = new ArrayList<String>();
			BCities.add("F");
			BCities.add("C");
			cities.put("B", BCities);
		CCities = new ArrayList<String>();
			CCities.add("F");
			CCities.add("D");
			cities.put("C", CCities);
		ArrayList<String> DCities = new ArrayList<String>();
			DCities.add("F");
			cities.put("D", DCities);
		ArrayList<String> ECities = new ArrayList<String>();
			cities.put("E", ECities);
		ArrayList<String> FCities = new ArrayList<String>();
			FCities.add("E");
			cities.put("F", FCities);
		
		res = Recursion.findBestCityPath("E", "A", cities);
		assertTrue(isPath(res, cities, "E", "A"));
		
		res = Recursion.findBestCityPath("F", "A", cities);
		assertTrue(isPath(res, cities, "F", "A"));
		
		res = Recursion.findBestCityPath("E", "F", cities);
		assertTrue(isPath(res, cities, "E", "F"));
		
		
		DCities.add("E");
		res = Recursion.findBestCityPath("E", "A", cities);
		assertTrue(isPath(res, cities, "E", "A"));
	}
	
	private boolean isPath(ArrayList<String> path, HashMap<String, ArrayList<String>> cities, String toCity, String fromCity) {
		if( !fromCity.equals(path.get(0)) || !toCity.equals(path.get(path.size()-1))) {
			return false;
		}
		for(int i = 0; i < path.size()-1; i++) {
			String curCity = path.get(i);
			ArrayList<String> toCities = cities.get(curCity);
			if(!toCities.contains(path.get(i+1))) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * If you pass this test, it is worth the other 3 points
	 */
	@Test
	public void testFindBestCityPathShortestPath() {
		//Test 1
		HashMap<String, ArrayList<String>> cities = new HashMap<>();
		ArrayList<String> ACities = new ArrayList<String>();
		ACities.add("B");
		cities.put("A", ACities);
		
		ArrayList<String> res = Recursion.findBestCityPath("B", "A", cities);
		String[] shouldBe = {"A", "B"};
		ArrayList<String> shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		assertTrue(shouldBeList.equals(res));
		
		//Test 2
		cities = new HashMap<>();
		ACities = new ArrayList<String>();
			ACities.add("B");
			cities.put("A", ACities);
		ArrayList<String> BCities = new ArrayList<String>();
			BCities.add("C");
			cities.put("B", BCities);
		ArrayList<String> CCities = new ArrayList<String>();
			CCities.add("D");
			cities.put("C", CCities);
			
		shouldBe = new String[] {"A", "B", "C", "D"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
			
		res = Recursion.findBestCityPath("D", "A", cities);
		assertTrue(shouldBeList.equals(res));
		
		
		BCities.add("D"); //new better path
		shouldBe = new String[] {"A", "B", "D"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
			
		res = Recursion.findBestCityPath("D", "A", cities);
		assertTrue(shouldBeList.equals(res));
		
		
		//Test 3
		cities = new HashMap<>();
		ACities = new ArrayList<String>();
			ACities.add("B");
			ACities.add("D");
			cities.put("A", ACities);
		BCities = new ArrayList<String>();
			BCities.add("F");
			BCities.add("C");
			cities.put("B", BCities);
		CCities = new ArrayList<String>();
			CCities.add("F");
			CCities.add("D");
			cities.put("C", CCities);
		ArrayList<String> DCities = new ArrayList<String>();
			DCities.add("F");
			cities.put("D", DCities);
		ArrayList<String> ECities = new ArrayList<String>();
			cities.put("E", ECities);
		ArrayList<String> FCities = new ArrayList<String>();
			FCities.add("E");
			cities.put("F", FCities);
		
			
		shouldBe = new String[] {"A", "B", "F", "E"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		String[] couldAlsoBe = {"A", "D", "F", "E"};
		ArrayList<String> couldAlsoBeList = new ArrayList<String>(Arrays.asList(couldAlsoBe));
		
		res = Recursion.findBestCityPath("E", "A", cities);
		assertTrue(shouldBeList.equals(res) || (couldAlsoBeList.equals(res)) || 
				(isPath(res, cities, "E", "A") && res.size() <= shouldBeList.size()));
		
		
		shouldBe = new String[] {"A", "B", "F"};
		String[] couldBe = {"A", "D", "F"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		ArrayList<String> couldBeList = new ArrayList<String>(Arrays.asList(couldBe));
		
		res = Recursion.findBestCityPath("F", "A", cities);
		
		assertTrue((shouldBeList.equals(res)) || (couldBeList.equals(res)));
		
		
		shouldBe = new String[] {"F", "E"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		
		res = Recursion.findBestCityPath("E", "F", cities);
		assertTrue(shouldBeList.equals(res));
		
		
		
		DCities.add("E"); //new better path
		shouldBe = new String[] {"A", "D", "E"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		
		res = Recursion.findBestCityPath("E", "A", cities);
		assertTrue(shouldBeList.equals(res));
		
		
		shouldBe = new String[] {"C", "D"};
		shouldBeList = new ArrayList<String>(Arrays.asList(shouldBe));
		ECities.add("D");
		
		res = Recursion.findBestCityPath("D", "C", cities);
		assertTrue(shouldBeList.equals(res));
		
	}
	
	
}
