package textCalculator;

public class Multiply implements Function {

	@Override
	public String getFunctionName() {
		return "multiply";
	}

	@Override
	public double evaluate(double[] operands) {
		double total = 1.0;
		for (double o : operands) {
			total *= o;
		}
		return total;
	}
}
