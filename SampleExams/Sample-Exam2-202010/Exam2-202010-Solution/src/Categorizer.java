import java.util.ArrayList;

public abstract class Categorizer {

	private ArrayList<Integer> in;
	private ArrayList<Integer> out;

	public Categorizer() {
		in = new ArrayList<Integer>();
		out = new ArrayList<Integer>();
	}

	public abstract boolean doTest(int number);

	public abstract String getName();

	public void addNumber(int number) {
		if (doTest(number)) {
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
		return (double) in.size() / (in.size() + out.size());
	}

	public void displaySummary() {
		System.out.println("Percent of numbers that are " + getName() + " " + getInPercentage());
		System.out.println(getName() + " numbers: " + getAllIn());
		System.out.println("Other numbers: " + getAllOut());
	}

}
