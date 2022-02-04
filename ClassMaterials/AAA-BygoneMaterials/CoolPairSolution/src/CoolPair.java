import java.util.Iterator;

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
public class CoolPair<T> implements Iterable<T> {

	private T first, last;
	
	public CoolPair(T first, T last) {
		this.first = first;
		this.last = last;
	}
	
	public String toString() {
		return "(" + this.first + ", " + this.last + ")";
	}

	@Override
	public Iterator<T> iterator() {
		return new PairIterator();
	}

	class PairIterator implements Iterator<T> {

		private int pos ;
		public PairIterator() {
			this.pos = 0;
		}
		
		@Override
		public boolean hasNext() {

			return (pos < 2);
		}

		@Override
		public T next() {
			pos++;
			if (pos == 1) {
				return first;
			} else {
				return last;
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoolPair<String> fruits = new CoolPair<String>("Bartlett", "Bosc"); // bad pun.
		System.out.println(fruits);
		
		CoolPair<Integer> location = new CoolPair<Integer>(22, 17);
		System.out.println(location);

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		for (Integer coordinate: location) {
			System.out.println(coordinate);
		}
	}
}
