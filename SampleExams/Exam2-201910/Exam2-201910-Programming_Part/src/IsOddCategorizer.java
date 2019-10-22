import java.util.ArrayList;

public class IsOddCategorizer {

	ArrayList<Integer> in;
	ArrayList<Integer> out;
	
	public IsOddCategorizer() {
		in = new ArrayList<Integer>();
		out = new ArrayList<Integer>();
	}
	
	public void addNumber(int number) {
		if(number % 2 == 1) {
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
		System.out.println("Percent of numbers that are Odd: " + getInPercentage());
		System.out.println("Odd numbers: " + getAllIn());
		System.out.println("Other numbers: " + getAllOut());
	}

}
