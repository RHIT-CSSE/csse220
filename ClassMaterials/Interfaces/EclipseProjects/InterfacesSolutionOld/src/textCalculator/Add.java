package textCalculator;

public class Add implements Function {

	@Override
	public String getFunctionName() {
		return "add";
	}

	@Override
	public double evaluate(double[] operands) {
		double total = 0.0;
		for (double o : operands) {
			total += o;
		}
		return total;
	}
}
