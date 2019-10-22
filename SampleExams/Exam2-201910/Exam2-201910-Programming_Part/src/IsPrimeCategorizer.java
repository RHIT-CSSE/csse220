import java.math.BigInteger;
import java.util.ArrayList;

public class IsPrimeCategorizer {

	ArrayList<Integer> in;
	ArrayList<Integer> out;
	
	public IsPrimeCategorizer() {
		in = new ArrayList<Integer>();
		out = new ArrayList<Integer>();
	}
	
	public void addNumber(int number) {
		if(BigInteger.valueOf(number).isProbablePrime(15)) {
			in.add(number);
		} else {
			out.add(number);
		}
	}
	
	public ArrayList<Integer> getAllIn() {
		return in;
	}
	
	public ArrayList<Integer> getAllOut() {
		return out;
	}
	
	public double getInPercentage() {
		return (double) in.size()/(in.size() + out.size());
	}

	public void displaySummary() {
		System.out.println("Percent of numbers that are Prime: " + getInPercentage());
		System.out.println("Prime numbers: " + getAllIn());
		System.out.println("Other numbers: " + getAllOut());
	}
}
