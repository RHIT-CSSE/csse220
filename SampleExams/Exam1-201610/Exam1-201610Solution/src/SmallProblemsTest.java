import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void TestOnlyVegetables() {
		ArrayList<String> foods1 = new ArrayList<String>();
		foods1.add("potato chip");
		foods1.add("carrot");
		foods1.add("ice cream");
		
		ArrayList<String> veggies = new ArrayList<String>();
		veggies.add("carrot");
		veggies.add("celery");
		veggies.add("onion");
		
		ArrayList<String> notVeggies = new ArrayList<String>();
		notVeggies.add("potato chip");
		notVeggies.add("ice cream");
		
		ArrayList<String> result1 = SmallProblems.onlyVegetables(foods1, veggies);
		assertEquals(1, result1.size());
		assertEquals("carrot", result1.get(0));
		
		ArrayList<String> result2 = SmallProblems.onlyVegetables(new ArrayList<String>(), veggies);
		assertEquals(0, result2.size());

		ArrayList<String> result3 = SmallProblems.onlyVegetables(foods1, new ArrayList<String>());
		assertEquals(0, result3.size());

		ArrayList<String> result4 = SmallProblems.onlyVegetables(foods1, notVeggies);
		assertEquals(2, result4.size());
		assertEquals("potato chip", result4.get(0));
		assertEquals("ice cream", result4.get(1));

	}
	
	@Test 
	public void TestEveryOther() {
		assertEquals("el", SmallProblems.everyOther("Hello"));
		assertEquals("ufl", SmallProblems.everyOther("Buffalo"));
		assertEquals("", SmallProblems.everyOther("a"));
		assertEquals("", SmallProblems.everyOther(""));
		assertEquals("bdfhjlnprtvxz", SmallProblems.everyOther("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test 
	public void TestBeginningContains() {
		int[] input1 = new int[] {1, 2, 3, 4, 5};
		int[] input2 = new int[] {5, 4, 3, 2, 1};
		int[] input3 = new int[] {};
		assertTrue(SmallProblems.beginningContains(input1, 3, 2));
		assertFalse(SmallProblems.beginningContains(input2, 3, 2));
		assertTrue(SmallProblems.beginningContains(input1, 7, 4));
		assertFalse(SmallProblems.beginningContains(input1, 0, 1));
		assertFalse(SmallProblems.beginningContains(input3, 1, 1));
		assertFalse(SmallProblems.beginningContains(input3, 1, -1));
	}
	
	@Test 
	public void TestFirstMiddleLast() {
		int[] input1 = new int[] {1, 2, 3};
		int[] input2 = new int[] {1, 2, 3, 4, 5};
		
		int[] result1 = SmallProblems.firstMiddleLast(input1);
		Assert.assertArrayEquals(new int[] {1, 2, 3}, result1);
		Assert.assertNotSame(input1, result1);

		int[] result2 = SmallProblems.firstMiddleLast(input2);
		Assert.assertArrayEquals(new int[] {1, 3, 5}, result2);
		Assert.assertNotSame(input2, result2);
	}
}
