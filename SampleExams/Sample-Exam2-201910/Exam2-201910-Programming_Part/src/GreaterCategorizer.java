import java.util.ArrayList;

public class GreaterCategorizer {

	ArrayList<Integer> in;
	ArrayList<Integer> out;
	int cutoff;
	
	public GreaterCategorizer(int cutoff) {
		in = new ArrayList<Integer>();
		out = new ArrayList<Integer>();
		this.cutoff = cutoff;
	}
	
	public void addNumber(int number) {
		if(number > cutoff) {
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
		System.out.println("Percent of numbers that are >" + cutoff + " " + getInPercentage());
		System.out.println(">" + cutoff + " numbers: " + getAllIn());
		System.out.println("Other numbers: " + getAllOut());
	}

}
