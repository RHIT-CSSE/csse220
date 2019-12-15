import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void testExtractAndReverse() {
		ArrayList<Character> x;
		x = SmallProblems.extractAndReverse("Hello");
		assertTrue(x.size() == 3);
		assertTrue(x.get(0) == 'o');
		assertTrue(x.get(1) == 'l');
		assertTrue(x.get(2) == 'H');

		x = SmallProblems.extractAndReverse("oalbacfdfeufB");
		assertTrue(x.size() == 7);
		assertTrue(x.get(0) == 'B');
		assertTrue(x.get(1) == 'u');
		assertTrue(x.get(2) == 'f');
		assertTrue(x.get(3) == 'f');
		assertTrue(x.get(4) == 'a');
		assertTrue(x.get(5) == 'l');
		assertTrue(x.get(6) == 'o');

		x = SmallProblems.extractAndReverse("");
		assertTrue(x.size() == 0);

		x = SmallProblems.extractAndReverse("Z");
		assertTrue(x.size() == 1);
		assertTrue(x.get(0) == 'Z');
	}

	@Test
	public void testComputeBoardPathV1() {

		//followRelativeIndicesV1([2,-1,0], 1) --> <1,0,2> 
		int [] input1 = {2,-1,0};
		int startLoc1 = 1;
		ArrayList<Integer> output1 = new ArrayList<Integer>(Arrays.asList(1,0,2));
		assertTrue(output1.equals(SmallProblems.computeBoardPathV1(input1, startLoc1)));
		
		//followRelativeIndicesV1([3,3,-2,0,-2], 1) --> <1,4,2,0,3>
		int [] input2 = {3,3,-2,0,-2};
		int startLoc2 = 1;
		ArrayList<Integer> output2 = new ArrayList<Integer>(Arrays.asList(1,4,2,0,3));
		assertTrue(output2.equals(SmallProblems.computeBoardPathV1(input2, startLoc2)));
		
		//followRelativeIndicesV1([6,4,2,0,-1,-3,-5], 0) --> <0,6,1,5,2,4,3>
		int [] input3 = {6,4,2,0,-1,-3,-5};
		int startLoc3 = 0;
		ArrayList<Integer> output3 = new ArrayList<Integer>(Arrays.asList(0,6,1,5,2,4,3));
		assertTrue(output3.equals(SmallProblems.computeBoardPathV1(input3, startLoc3)));
		
		//followRelativeIndicesV1([6,4,2,0,-1,-3,-5], 4) --> <4,3>
		int [] input4 = {6,4,2,0,-1,-3,-5};
		int startLoc4 = 4;
		ArrayList<Integer> output4 = new ArrayList<Integer>(Arrays.asList(4,3));
		assertTrue(output4.equals(SmallProblems.computeBoardPathV1(input4, startLoc4)));
		
		//followRelativeIndicesV1([0], 0) --> <0>
		int [] input5 = {0};
		int startLoc5 = 0;
		ArrayList<Integer> output5 = new ArrayList<Integer>(Arrays.asList(0));
		assertTrue(output5.equals(SmallProblems.computeBoardPathV1(input5, startLoc5)));
		
		//followRelativeIndicesV1([1,1,1,2,0,1,-2], 2) --> <2,3,5,6,4>
		int [] input6 = {1,1,1,2,0,1,-2};
		int startLoc6 = 2;
		ArrayList<Integer> output6 = new ArrayList<Integer>(Arrays.asList(2,3,5,6,4));
		assertTrue(output6.equals(SmallProblems.computeBoardPathV1(input6, startLoc6)));
	}
	
	
	@Test
	public void testComputeBoardPathV2() {

		//followRelativeIndicesV2([2,-1,0], 1) --> <1,0,2> 
		int [] input1 = {2,-1,0};
		int startLoc1 = 1;
		ArrayList<Integer> output1 = new ArrayList<Integer>(Arrays.asList(1,0,2));
		assertTrue(output1.equals(SmallProblems.computeBoardPathV2(input1, startLoc1)));
		
		//followRelativeIndicesV2([3,3,-2,0,-2], 1) --> <1,4,2,0,3>
		int [] input2 = {3,3,-2,0,-2};
		int startLoc2 = 1;
		ArrayList<Integer> output2 = new ArrayList<Integer>(Arrays.asList(1,4,2,0,3));
		assertTrue(output2.equals(SmallProblems.computeBoardPathV2(input2, startLoc2)));
		
		//followRelativeIndicesV2([6,4,2,0,-1,-3,-5], 0) --> <0,6,1,5,2,4,3>
		int [] input3 = {6,4,2,0,-1,-3,-5};
		int startLoc3 = 0;
		ArrayList<Integer> output3 = new ArrayList<Integer>(Arrays.asList(0,6,1,5,2,4,3));
		assertTrue(output3.equals(SmallProblems.computeBoardPathV2(input3, startLoc3)));
		
		//followRelativeIndicesV2([6,4,2,0,-1,-3,-5], 4) --> <4,3>
		int [] input4 = {6,4,2,0,-1,-3,-5};
		int startLoc4 = 4;
		ArrayList<Integer> output4 = new ArrayList<Integer>(Arrays.asList(4,3));
		assertTrue(output4.equals(SmallProblems.computeBoardPathV2(input4, startLoc4)));
		
		//followRelativeIndicesV2([0], 0) --> <0>
		int [] input5 = {0};
		int startLoc5 = 0;
		ArrayList<Integer> output5 = new ArrayList<Integer>(Arrays.asList(0));
		assertTrue(output5.equals(SmallProblems.computeBoardPathV2(input5, startLoc5)));
		
		//followRelativeIndicesV2([4,2,4,0,-2,-4,-6], 5) --> <5,1,3>
		int [] input6 = {4,2,4,0,-2,-4,-6};
		int startLoc6 = 5;
		ArrayList<Integer> output6 = new ArrayList<Integer>(Arrays.asList(5,1,3));
		assertTrue(output6.equals(SmallProblems.computeBoardPathV2(input6, startLoc6)));

		//followRelativeIndicesV2([1,-1,0], 0) --> <>
		int [] input7 = {1,-1,0};
		int startLoc7 = 0;
		ArrayList<Integer> output7 = new ArrayList<Integer>();
		assertTrue(output7.equals(SmallProblems.computeBoardPathV2(input7, startLoc7)));
				
		//followRelativeIndicesV2([4,2,4,0,-2,-4,-6], 5) --> <5,1,3>
		int [] input8 = {4,2,4,0,-2,-4,-6};
		int startLoc8 = 2;
		ArrayList<Integer> output8 = new ArrayList<Integer>();
		assertTrue(output8.equals(SmallProblems.computeBoardPathV2(input8, startLoc8)));
	}
}
