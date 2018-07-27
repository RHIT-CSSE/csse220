package bigRational;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;



/**
 * This class tests the BigRational implementation of the Rational interface, in
 * particular for the requirement that the implementation "can input, store and
 * process rationals of arbitrary length"
 * 
 * @author Curt Clifton
 */
public class LargeBigRationalTest {
	/**
	 * This string represents the number 154! + 1. This number is prime per
	 * http://en.wikipedia.org/wiki/Prime_number, referenced Mar. 21, 2007.
	 */
	private static final String BIG_PRIME = "3089769613" + "8473508879"
			+ "5856467036" + "3240465920" + "1907040888" + "8204778715"
			+ "8928986550" + "5687886666" + "2203004472" + "8564095261"
			+ "9071680544" + "3374941092" + "6464999468" + "0187591361"
			+ "3110727379" + "5145469552" + "5676891035" + "6408637432"
			+ "0089969475" + "8450943586" + "7110685710" + "2203101122"
			+ "8320107310" + "6124800000" + "0000000000" + "0000000000"
			+ "0000000000" + "01";

	private static final String tenToThe140th;

	static {
		// Constructs a string which is 1 followed by 140 zero's
		char[] digits = new char[141];
		digits[0] = '1';
		Arrays.fill(digits, 1, digits.length, '0');
		tenToThe140th = new String(digits);

	}

	private BigRational zero;

	private BigRational negOne;

	private BigRational huge;

	private BigRational negHuge;

	private BigRational hugeReciprocal;

	private BigRational negHugeReciprocal;

	private BigRational large;

	private static final String hugePlusHugeReciprocalNumerator = "9546676266"
			+ "6544078200" + "4388497049" + "1572144901" + "4897105699"
			+ "2678824850" + "3894116159" + "6435782651" + "8876984421"
			+ "2012002716" + "6979966399" + "9684931956" + "8957778497"
			+ "0123530569" + "5106865645" + "6884519744" + "1036607544"
			+ "3110379561" + "4262663065" + "1346351325" + "6197422122"
			+ "7069415307" + "6219827985" + "2155193033" + "5943032218"
			+ "6831418998" + "0319886441" + "6201525105" + "6001266013"
			+ "2635690473" + "1157194726" + "0461442945" + "9199785770"
			+ "4692343187" + "9882389506" + "8577274171" + "1293421697"
			+ "5080750021" + "7857315917" + "1912907951" + "5744991208"
			+ "7928225763" + "8658368937" + "4801900229" + "6081057050"
			+ "5602341403" + "4963363757" + "3422137142" + "0440620224"
			+ "5664021462" + "1224960000" + "0000000000" + "0000000000"
			+ "0000000000" + "170";

	private static final String hugePlusHugeReciprocalDenominator = "4016700498"
			+ "0015561543"
			+ "4613407147"
			+ "2212605696"
			+ "2479153155"
			+ "4666212330"
			+ "6607682515"
			+ "7394252666"
			+ "0863905814"
			+ "7133323840"
			+ "4793184707"
			+ "6387423420"
			+ "4404499308"
			+ "4243868769"
			+ "7043945593"
			+ "3689110418"
			+ "3379958346"
			+ "3331228661"
			+ "6116960318"
			+ "5986226662"
			+ "7243891423"
			+ "2864031459"
			+ "6816139503"
			+ "7962240000"
			+ "0000000000"
			+ "0000000000" + "0000000000" + "013";

	private BigRational hugePlusHugeReciprocal;

	private static final String hugeMinusHugeReciprocalNumerator = "9546676266"
			+ "6544078200" + "4388497049" + "1572144901" + "4897105699"
			+ "2678824850" + "3894116159" + "6435782651" + "8876984421"
			+ "2012002716" + "6979966399" + "9684931956" + "8957778497"
			+ "0123530569" + "5106865645" + "6884519744" + "1036607544"
			+ "3110379561" + "4262663065" + "1346351325" + "6197422122"
			+ "7069415307" + "6219827985" + "2155193033" + "5943032218"
			+ "6831418998" + "0319886441" + "6201525105" + "6001266013"
			+ "2635690473" + "1157194726" + "0461442945" + "9199785770"
			+ "4692343187" + "9882389506" + "8577274171" + "1293421697"
			+ "5080750021" + "7857315917" + "1912907951" + "5744991208"
			+ "7928225763" + "8658368937" + "4801900229" + "6081057050"
			+ "5602341403" + "4963363757" + "3422137142" + "0440620224"
			+ "5664021462" + "1224959999" + "9999999999" + "9999999999"
			+ "9999999999" + "832";

	private static final String hugeMinusHugeReciprocalDenominator = "4016700498"
			+ "0015561543"
			+ "4613407147"
			+ "2212605696"
			+ "2479153155"
			+ "4666212330"
			+ "6607682515"
			+ "7394252666"
			+ "0863905814"
			+ "7133323840"
			+ "4793184707"
			+ "6387423420"
			+ "4404499308"
			+ "4243868769"
			+ "7043945593"
			+ "3689110418"
			+ "3379958346"
			+ "3331228661"
			+ "6116960318"
			+ "5986226662"
			+ "7243891423"
			+ "2864031459"
			+ "6816139503"
			+ "7962240000"
			+ "0000000000"
			+ "0000000000" + "0000000000" + "013";

	private BigRational hugeMinusHugeReciprocal;

	private BigRational negHugePlusHugeReciprocal;

	private BigRational negHugeMinusHugeReciprocal;

	private static final String hugeSquaredNumerator = "9546676266"
			+ "6544078200" + "4388497049" + "1572144901" + "4897105699"
			+ "2678824850" + "3894116159" + "6435782651" + "8876984421"
			+ "2012002716" + "6979966399" + "9684931956" + "8957778497"
			+ "0123530569" + "5106865645" + "6884519744" + "1036607544"
			+ "3110379561" + "4262663065" + "1346351325" + "6197422122"
			+ "7069415307" + "6219827985" + "2155193033" + "5943032218"
			+ "6831418998" + "0319886441" + "6201525105" + "6001266013"
			+ "2635690473" + "1157194726" + "0461442945" + "9199785770"
			+ "4692343187" + "9882389506" + "8577274171" + "1293421697"
			+ "5080750021" + "7857315917" + "1912907951" + "5744991208"
			+ "7928225763" + "8658368937" + "4801900229" + "6081057050"
			+ "5602341403" + "4963363757" + "3422137142" + "0440620224"
			+ "5664021462" + "1224960000" + "0000000000" + "0000000000"
			+ "0000000000" + "001";

	private static final String hugeSquaredDenominator = "169";

	private BigRational hugeSquared;

	private BigRational negHugeSquared;

	/**
	 * Sets up some numbers for testing.
	 */
	@Before
	public void setUp() {
		this.zero = new BigRational("0", "1");
		this.negOne = new BigRational("-1", "1");
		this.huge = new BigRational(BIG_PRIME, "13");
		this.hugeReciprocal = new BigRational("13", BIG_PRIME);
		this.negHuge = new BigRational(BIG_PRIME, "-13");
		this.negHugeReciprocal = new BigRational("-13", BIG_PRIME);
		this.large = new BigRational(BIG_PRIME, tenToThe140th);
		this.hugePlusHugeReciprocal = new BigRational(
				hugePlusHugeReciprocalNumerator,
				hugePlusHugeReciprocalDenominator);
		this.hugeMinusHugeReciprocal = new BigRational(
				hugeMinusHugeReciprocalNumerator,
				hugeMinusHugeReciprocalDenominator);
		this.negHugePlusHugeReciprocal = new BigRational("-"
				+ hugeMinusHugeReciprocalNumerator,
				hugeMinusHugeReciprocalDenominator);
		this.negHugeMinusHugeReciprocal = new BigRational("-"
				+ hugePlusHugeReciprocalNumerator,
				hugePlusHugeReciprocalDenominator);
		this.hugeSquared = new BigRational(hugeSquaredNumerator,
				hugeSquaredDenominator);
		this.negHugeSquared = new BigRational("-" + hugeSquaredNumerator,
				hugeSquaredDenominator);
	}

	/**
	 * Basic construction and toString for "rationals of arbitrary length"
	 */
	@Test
	public void testBigRationalLarge() {
		assertEquals(BIG_PRIME + "/13", this.huge.toString());
		assertEquals(BIG_PRIME + "/" + tenToThe140th, this.large.toString());
	}

	/**
	 * Equality testing: positives and negatives for "rationals of arbitrary
	 * length"
	 */
	@Test
	public void testSignsALarge() {
		assertEquals(this.huge, new BigRational(BIG_PRIME, "13"));
	}

	/**
	 * Equality testing: positives and negatives for "rationals of arbitrary
	 * length"
	 */
	@Test
	public void testSignsBLarge() {
		assertEquals(this.huge, new BigRational("-" + BIG_PRIME, "-13"));
	}

	/**
	 * Equality testing: positives and negatives for "rationals of arbitrary
	 * length"
	 */
	@Test
	public void testSignsCLarge() {
		assertEquals(this.negHuge, new BigRational("-" + BIG_PRIME, "13"));
	}

	/**
	 * Equality testing: positives and negatives for "rationals of arbitrary
	 * length"
	 */
	@Test
	public void testSignsDLarge() {
		assertEquals(this.negHuge, new BigRational(BIG_PRIME, "-13"));
	}

	/**
	 * Equality testing: zero for "rationals of arbitrary length"
	 */
	@Test
	public void testZeroALarge() {
		assertEquals(this.zero, new BigRational("0", BIG_PRIME));
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()} for "rationals of
	 * arbitrary length"
	 */
	@Test
	public void testAbsALarge() {
		assertEquals(this.huge, new BigRational(BIG_PRIME, "13").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()} for "rationals of
	 * arbitrary length"
	 */
	@Test
	public void testAbsBLarge() {
		assertEquals(this.huge, new BigRational(BIG_PRIME, "-13").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()} for "rationals of
	 * arbitrary length"
	 */
	@Test
	public void testAbsCLarge() {
		assertEquals(this.huge, new BigRational("-" + BIG_PRIME, "13").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#abs()} for "rationals of
	 * arbitrary length"
	 */
	@Test
	public void testAbsDLarge() {
		assertEquals(this.huge, new BigRational("-" + BIG_PRIME, "-13").abs());
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddALarge() {
		assertEquals(this.zero, this.huge.add(this.negHuge));
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddBLarge() {
		assertEquals(this.zero, this.negHuge.add(this.huge));
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddCLarge() {
		assertEquals(this.hugePlusHugeReciprocal, this.huge
				.add(this.hugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddDLarge() {
		assertEquals(this.hugeMinusHugeReciprocal, this.huge
				.add(this.negHugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddELarge() {
		assertEquals(this.negHugePlusHugeReciprocal, this.negHuge
				.add(this.hugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#add(bigRational.BigRational)}. for
	 * "rationals of arbitrary length".
	 */
	@Test
	public void testAddFLarge() {
		assertEquals(this.negHugeMinusHugeReciprocal, this.negHuge
				.add(this.negHugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideALarge() {
		assertEquals(new BigRational("0", "1"), this.zero.divide(this.huge));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideBLarge() {
		assertEquals(this.negOne, this.huge.divide(this.negHuge));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideCLarge() {
		assertEquals(this.negOne, this.negHuge.divide(this.huge));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideDLarge() {
		assertEquals(this.negOne, this.hugeReciprocal
				.divide(this.negHugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideELarge() {
		assertEquals(this.negOne, this.negHugeReciprocal
				.divide(this.hugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideFLarge() {
		assertEquals(this.hugeSquared, this.huge.divide(this.hugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideGLarge() {
		assertEquals(this.negHugeSquared, this.huge
				.divide(this.negHugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideHLarge() {
		assertEquals(this.negHugeSquared, this.negHuge
				.divide(this.hugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#divide(bigRational.BigRational)}.
	 */
	@Test
	public void testDivideILarge() {
		assertEquals(this.hugeSquared, this.negHuge
				.divide(this.negHugeReciprocal));
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToALarge() {
		assertTrue(this.zero.compareTo(this.negHuge) > 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToBLarge() {
		assertTrue(this.zero.compareTo(this.zero) == 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToCLarge() {
		assertTrue(this.zero.compareTo(this.huge) < 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToDLarge() {
		assertTrue(this.huge.compareTo(this.negHuge) > 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToELarge() {
		assertTrue(this.huge.compareTo(this.zero) > 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToFLarge() {
		assertTrue(this.huge.compareTo(this.huge) == 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToGLarge() {
		assertTrue(this.negHuge.compareTo(this.negHuge) == 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToHLarge() {
		assertTrue(this.negHuge.compareTo(this.zero) < 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToILarge() {
		assertTrue(this.negHuge.compareTo(this.huge) < 0);
	}

	/**
	 * Test method for {@link bigRational.BigRational#compareTo(bigRational.BigRational)}.
	 * for "rationals of arbitrary length".
	 */
	@Test
	public void testCompareToJLarge() {
		BigRational r1 = new BigRational(BIG_PRIME, BIG_PRIME + "0");
		BigRational r2 = new BigRational(BIG_PRIME, BIG_PRIME + "1");
		int compareToResult = r1.compareTo(r2);
		// It should be the case that r1 > r2 since the denominator is larger
		// for r2
		assertTrue(compareToResult > 0);
	}

}
