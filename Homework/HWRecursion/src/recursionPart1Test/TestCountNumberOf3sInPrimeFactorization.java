package recursionPart1Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import recursionPart1.Part1Problems;

@RunWith(RunAllTestsTestRunnerPart1.class)

public class TestCountNumberOf3sInPrimeFactorization {

	@Test
	public void test3sPrimeFactorization01() {
		assertEquals(1, Part1Problems.countNumberOf3sInPrimeFactorization(3));
	} // test3sPrimeFactorization01

	@Test
	public void test3sPrimeFactorization02() {
		assertEquals(2, Part1Problems.countNumberOf3sInPrimeFactorization(9));
	} // test3sPrimeFactorization02

	@Test
	public void test3sPrimeFactorization03() {
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(412));
	} // test3sPrimeFactorization03

	@Test
	public void test3sPrimeFactorization04() {
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(0));
	} // test3sPrimeFactorization04

	@Test
	public void test3sPrimeFactorization05() {
		assertEquals(0, Part1Problems.countNumberOf3sInPrimeFactorization(7675489));
	} // test3sPrimeFactorization05

	@Test
	public void test3sPrimeFactorization06() {
		assertEquals(4, Part1Problems.countNumberOf3sInPrimeFactorization(234516789));
	} // test3sPrimeFactorization06

	@Test
	public void test3sPrimeFactorization07() {
		assertEquals(15, Part1Problems.countNumberOf3sInPrimeFactorization(14348907));
	} // test3sPrimeFactorization07

} // end Test3sPrimeFactorization
