package badFrac;

/**
 * This class has some flaws in it.
 * It is intended to represent a non-negative fraction.
 * 
 * Requires that all numerator and denominators 
 * are well-defined and NON-NEGATIVE 
 *
 */
public class BadFrac {
	private int numerator;
	private int denominator;
	
	public BadFrac() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	/** 
	 * There are certain requirements for BadFrac that you should assume
	 * to be true.
	 * 
	 * @param num 
	 * requires non-negative value
	 * 
	 * @param den
	 * requires positive value
	 */
	public BadFrac(int num, int den) {
		this.numerator = num;
		this.denominator = den;
	}


	public static int gcm(int a, int b) {
	    return b == 0 ? a : gcm(b, a % b);
	}
	
	public int getNum() {
		return this.numerator;
	}
	
	public int getDen() {
		return this.denominator;
	}
	
	
	// TODO 1: Write some unit tests in BadFracTest.java to determine the problem
	/**
	 * The method should return true when the fraction has been reduced to its lowest terms
	 * 
	 * Examples of fractions where this is true:
	 * 	1/2, 5/1, 2/5, 0/1
	 * 
	 * Examples of fractions where this is false:
	 * 2/4, 6/2, 0/2
	 * 
	 * @return whether the fraction is reduced
	 */
	public boolean isReduced() {
		if(this.numerator == 0)
			return true;
		
		int val = gcm(this.numerator, this.denominator);
		System.out.println(val);
		if(gcm(this.numerator, this.denominator) == 1)
			return true;
		return false;
	}
	
	public BadFrac add(int num, int den) {
		BadFrac var1 = new BadFrac(num, den);
		return add(var1);
	}
	
	// TODO 2: Write some unit tests in BadFracTest.java to discover what is wrong
	/**
	 * Taking in another fraction, this method should add the two fractions
	 * and return a NEW BadFrac type with the resulting REDUCED fraction.
	 * If the fraction is NOT reduced, the result is considered incorrect.
	 * 
	 * @param incoming (a BadFrac type)
	 * @return new fraction in lowest terms as a BadFrac type
	 */
	public BadFrac add(BadFrac incoming) {
		int commonDen = this.denominator * incoming.denominator;
		int newNum = (this.numerator*incoming.denominator) + (incoming.numerator*this.denominator);
		return new BadFrac(newNum, commonDen);
	}

	public BadFrac multiply(BadFrac incoming) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
