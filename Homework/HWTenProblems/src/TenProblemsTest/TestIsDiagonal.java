package TenProblemsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import TenProblems.TenProblems;

//*** Have to insert this @RunWith that appears on the next line in order to use the TestRunner class
@RunWith(RunAllTestsTestRunner.class)

public class TestIsDiagonal {
	
	@Test
	public void testIsDiagonalN01() {
		int[][] array = {{1,0,0},{0,2,0},{0,0,3}};
		assertEquals(true, TenProblems.isDiagonal(array));
	} // testIsDiagonalN01
	
	@Test
	public void testIsDiagonalN02() {
		int[][] array = {{1,0,0},{0,2,0},{0,0,3}};
		array[0][2] = 44;
		assertEquals(false, TenProblems.isDiagonal(array));
	} // testIsDiagonalN02
	
	@Test
	public void testIsDiagonalN03() {
		int[][] array2 = {{0,0},{0,99}};
		assertEquals(true, TenProblems.isDiagonal(array2));
	} // testIsDiagonalN03
	
	@Test
	public void testIsDiagonalN04() {
		int[][] array2 = {{0,0},{0,99}};
		array2[1][0] = 5;
		assertEquals(false, TenProblems.isDiagonal(array2));
	} // testIsDiagonalN04
	
	@Test
	public void testIsDiagonalN05() {
		int[][] array3 = {{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
		assertEquals(true, TenProblems.isDiagonal(array3));
	} // testIsDiagonalN05
	
	@Test
	public void testIsDiagonalN06() {
		int[][] array3 = {{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
		array3[0][0] = 0;
		array3[0][3] = 5;
		assertEquals(false, TenProblems.isDiagonal(array3));
	} // testIsDiagonalN06
	
}
