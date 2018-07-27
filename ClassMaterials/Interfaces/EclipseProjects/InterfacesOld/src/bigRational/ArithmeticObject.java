package bigRational;

/**
 * This interface specifies the major arithmetic operations for objects
 * implementing this interface. The operands and returned values are of type T,
 * where T is the type parameter for this interface.
 * 
 * @author David Mutchler, based on work by Claude Anderson. Created Oct 9,
 *         2005.
 * @param <T>
 *            The type of the operands and returned values from operations on
 *            objects that implement this interface.
 */
public interface ArithmeticObject<T> {

	/**
	 * Returns a type T object whose value is the absolute value of this
	 * ArithmeticObject.
	 * 
	 * @return A type T object whose value is the absolute value of this
	 *         ArithmeticObject.
	 */
	public T abs();

	/**
	 * Returns a type T object whose value is (- this), that is, has the same
	 * absolute value but opposite sign of this ArithmeticObject.
	 * 
	 * @return A type T object whose value is (- this), that is, has the same
	 *         absolute value but opposite sign of this ArithmeticObject.
	 */
	public T negate();

	/**
	 * Returns a type T object whose value is (this + other), that is, the
	 * result of adding the given type T object to this ArithmeticObject.
	 * 
	 * @param other
	 *            The type T object to add to this ArithmeticObject.
	 * @return A type T object whose value is (this + other), that is, the
	 *         result of adding the given type T object to this
	 *         ArithmeticObject.
	 */
	public T add(T other);

	/**
	 * Returns a type T object whose value is (this - other), that is, the
	 * result of subtracting the given type T object from this ArithmeticObject.
	 * 
	 * @param other
	 *            The type T object to subtract from this ArithmeticObject.
	 * @return A type T object whose value is (this - other), that is, the
	 *         result of subtracting the given type T object from this
	 *         ArithmeticObject.
	 */
	public T subtract(T other);

	/**
	 * Returns a type T object whose value is (this * other), that is, the
	 * result of multiplying this ArithmeticObject by the given type T object.
	 * 
	 * @param other
	 *            The type T object by which this ArithmeticObject is to be
	 *            multiplied.
	 * @return A type T object whose value is (this * other), that is, the
	 *         result of multiplying this ArithmeticObject by the given type T
	 *         object.
	 */
	public T multiply(T other);

	/**
	 * Returns a type T object whose value is (this / other), that is, the
	 * result of dividing this ArithmeticObject by the given type T object.
	 * 
	 * @param other
	 *            The type T object by which this ArithmeticObject is to be
	 *            divided.
	 * @return A type T object whose value is (this / other), that is, the
	 *         result of dividing this ArithmeticObject by the given type T
	 *         object.
	 * @throws ArithmeticException
	 *             If the given divisor has zero as its value.
	 */
	public T divide(T other) throws ArithmeticException;
}
