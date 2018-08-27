package hashmap;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class HashMapProblemTest {
	
	private ArrayList<Integer> positiveNums1, positiveNums2, positiveNums3;
	private ArrayList<Integer> negativeNums1, negativeNums2, negativeNums3;
	private ArrayList<Integer> mixedNums1, mixedNums2, mixedNums3;
	private ArrayList<Integer> zeroNums1, zeroNums2, zeroNums3;
	private ArrayList<ArrayList<Integer>> positiveList, negativeList, mixedList, zeroList, emptyList;
	private ArrayList<ArrayList<Integer>> singleList1, singleList2, singleList3;
	
	@Before
	public void setUp() {
		this.positiveNums1 = new ArrayList<Integer>();
		this.positiveNums2 = new ArrayList<Integer>();
		this.positiveNums3 = new ArrayList<Integer>();
		Collections.addAll(this.positiveNums1, new Integer[] {1,2,3,4}  );
		Collections.addAll(this.positiveNums2, new Integer[] {1,100,1000}  );
		Collections.addAll(this.positiveNums3, new Integer[] {1}  );
		
		this.negativeNums1 = new ArrayList<Integer>();
		this.negativeNums2 = new ArrayList<Integer>();
		this.negativeNums3 = new ArrayList<Integer>();
		Collections.addAll(this.negativeNums1, new Integer[] {-1,-2,-3,-4}  );
		Collections.addAll(this.negativeNums2, new Integer[] {-100,-99,-45}  );
		Collections.addAll(this.negativeNums3, new Integer[] {-10}  );
		
		this.zeroNums1 = new ArrayList<Integer>();
		this.zeroNums2 = new ArrayList<Integer>();
		this.zeroNums3 = new ArrayList<Integer>();
		Collections.addAll(this.zeroNums1, new Integer[] {}  );
		Collections.addAll(this.zeroNums1, new Integer[] {1,3,-4}  );
		Collections.addAll(this.zeroNums1, new Integer[] {-1,1,-2,2}  );
		
		this.mixedNums1 = new ArrayList<Integer>();
		this.mixedNums2 = new ArrayList<Integer>();
		this.mixedNums3 = new ArrayList<Integer>();
		Collections.addAll(this.mixedNums1, new Integer[] {-1,2,-5,100}  );
		Collections.addAll(this.mixedNums2, new Integer[] {-100,100,2}  );
		Collections.addAll(this.mixedNums3, new Integer[] {-1,-1,-1,-1,5}  );
		
		this.zeroNums1 = new ArrayList<Integer>();
		this.zeroNums2 = new ArrayList<Integer>();
		this.zeroNums3 = new ArrayList<Integer>();
		Collections.addAll(this.zeroNums1, new Integer[] {-2,-8,10}  );
		Collections.addAll(this.zeroNums2, new Integer[] {-100,100,-55,55}  );
		Collections.addAll(this.zeroNums3, new Integer[] {-1,-1,-1,-1,-1,5}  );
		
		this.positiveList = new ArrayList<ArrayList<Integer>>();
		this.positiveList.add( positiveNums1);
		this.positiveList.add( positiveNums2);
		this.positiveList.add( positiveNums3);
		
		this.negativeList = new ArrayList<ArrayList<Integer>>();
		this.negativeList.add( negativeNums1);
		this.negativeList.add( negativeNums2);
		this.negativeList.add( negativeNums3);
		
		this.mixedList = new ArrayList<ArrayList<Integer>>();
		this.mixedList.add( mixedNums1);
		this.mixedList.add( mixedNums2);
		this.mixedList.add( mixedNums3);
		
		this.zeroList = new ArrayList<ArrayList<Integer>>();
		this.zeroList.add( zeroNums1);
		this.zeroList.add( zeroNums2);
		this.zeroList.add( zeroNums3);
		
		
		this.emptyList = new ArrayList<ArrayList<Integer>>();
		this.emptyList.add( new ArrayList<Integer>()  );
		
		this.singleList1 =  new ArrayList<ArrayList<Integer>>();
		this.singleList2 =  new ArrayList<ArrayList<Integer>>();
		this.singleList3 =  new ArrayList<ArrayList<Integer>>();
		
		this.singleList1.add( positiveNums1);
		this.singleList2.add( negativeNums1);
		this.singleList3.add( zeroNums3);
		
		
	}
	
	
	@Test
	public void testReturnHashMapOfSumsAsKeysPositive() {
		
		HashMap<Integer, ArrayList<Integer>> ans1 = new HashMap<Integer, ArrayList<Integer>>();
		ans1.put(10 , positiveNums1 );
		ans1.put(1101 , positiveNums2 );
		ans1.put(1 , positiveNums3 );
		HashMap<Integer, ArrayList<Integer>> actual1 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.positiveList  );
		String str1 = "Failure!\nExpected: " +ans1 + "\nActual:      " + actual1;
		assertTrue(str1,  ans1.equals( actual1) );
	}	
	
	@Test
	public void testReturnHashMapOfSumsAsKeysNegative() {
		
		HashMap<Integer, ArrayList<Integer>> ans2 = new HashMap<Integer, ArrayList<Integer>>();
		ans2.put(-10 , negativeNums1 );
		ans2.put(-244 , negativeNums2 );
		ans2.put(-10 , negativeNums3 );
		HashMap<Integer, ArrayList<Integer>> actual2 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.negativeList  );
		String str2 = "Failure!\nExpected: " +ans2 + "\nActual:      " + actual2;
		assertTrue(str2,  ans2.equals( actual2) );
	}
	
	@Test
	public void testReturnHashMapOfSumsAsKeysMixed() {
	
		HashMap<Integer, ArrayList<Integer>> ans3 = new HashMap<Integer, ArrayList<Integer>>();
		ans3.put(96 , mixedNums1 );
		ans3.put(2 , mixedNums2 );
		ans3.put(1 , mixedNums3 );
		HashMap<Integer, ArrayList<Integer>> actual3 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.mixedList  );
		String str3 = "Failure!\nExpected: " +ans3 + "\nActual:      " + actual3;
		assertTrue(str3,  ans3.equals( actual3) );

	}
	
	@Test
	public void testReturnHashMapOfSumsAsKeysZero() {
		HashMap<Integer, ArrayList<Integer>> ans = new HashMap<Integer, ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> actual = HashMapProblem.returnHashMapOfSumsAsKeys(  this.zeroList  );
		String str = "Failure!\nExpected: " +ans + "\nActual:      " + actual;
		assertTrue(str,  ans.equals( actual) );

	}
	
	@Test
	public void testReturnHashMapOfSumsAsKeysListOfEmptyLists() {
		HashMap<Integer, ArrayList<Integer>> ans1 = new HashMap<Integer, ArrayList<Integer>>();
		
		HashMap<Integer, ArrayList<Integer>> actual1 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.emptyList  );
		String str1 = "Failure!\nExpected: " +ans1 + "\nActual:      " + actual1;
		assertTrue(str1,  ans1.equals( actual1) );
	
	}
	
	@Test
	public void testReturnHashMapOfSumsAsKeysSingleList() {
		HashMap<Integer, ArrayList<Integer>> ans1 = new HashMap<Integer, ArrayList<Integer>>();
		ans1.put(10, this.positiveNums1  );
		HashMap<Integer, ArrayList<Integer>> actual1 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.singleList1  );
		String str1 = "Failure!\nExpected: " +ans1 + "\nActual:      " + actual1;
		assertTrue(str1,  ans1.equals( actual1) );
		
		HashMap<Integer, ArrayList<Integer>> ans2 = new HashMap<Integer, ArrayList<Integer>>();
		ans2.put(-10, this.negativeNums1  );
		HashMap<Integer, ArrayList<Integer>> actual2 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.singleList2  );
		String str2 = "Failure!\nExpected: " +ans2 + "\nActual:      " + actual2;
		assertTrue(str2,  ans2.equals( actual2) );
		
		HashMap<Integer, ArrayList<Integer>> ans3 = new HashMap<Integer, ArrayList<Integer>>();
		ans1.put(10, this.zeroNums3  );
		HashMap<Integer, ArrayList<Integer>> actual3 = HashMapProblem.returnHashMapOfSumsAsKeys(  this.singleList3  );
		String str3 = "Failure!\nExpected: " +ans3 + "\nActual:      " + actual3;
		assertTrue(str3,  ans3.equals( actual3) );
	
	}


	
}
