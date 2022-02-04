
/**
 * A Cool class that would be even cooler if
 * it used generics and iterators
 * 
 * It represents a pair of two objects of the same type.
 * Right now it's only a pair of ints, but we want it to
 * be a pair of anythings
 * 
 * @author hewner
 *
 */
public class CoolPair {

	private int first, last;
	
	public CoolPair(int first, int last) {
		this.first = first;
		this.last = last;
	}
	
	public String toString() {
		return "(" + this.first + ", " + this.last + ")";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
