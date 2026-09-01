package function;
/**
 * This Comparator orders strings by reversing the order 
 * specified by the given Comparator.
 * 
 * @author Delvin Defoe and you. Created Nov 4, 2015.
 */
import java.util.Comparator;

public class Reverser implements Comparator<String> {
	
	private Comparator<String> other;
	
	Reverser(Comparator<String> other){
		this.other = other;
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO: implement
		return -1 * other.compare(o1, o2);
	}

}
