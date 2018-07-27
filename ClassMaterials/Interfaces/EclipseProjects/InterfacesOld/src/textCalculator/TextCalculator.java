package textCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TextCalculator {
	HashMap<String, Function> functions = new HashMap<String, Function>();
	
	public TextCalculator(ArrayList<Function> calcFunctions) {
		for (Function f : calcFunctions) {
			// TODO: Uncomment this line
			// functions.put(f.getFunctionName(), f);
		}
	}
	
	
	public void run() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a command:");
			String[] line = input.nextLine().split(" ");
			String command = line[0];
			double[] operands = new double[line.length-1];
			for (int i=1;i<line.length;i++) {
				operands[i-1] = Double.parseDouble(line[i]);
			}
			if (functions.containsKey(command)) {
				// TODO: Uncomment this line
				// System.out.println("Result: " + functions.get(command).evaluate(operands));
			}	
			else if (command.equals("exit")) {
				break;
			}
			else {
				System.out.println("Command not found.");
			}
		}
		input.close();
	}

	private static double[] parseDoubles(String values) {
		String[] data = values.split(" ");
		double[] toReturn = new double[data.length];
		for (int i=0;i<data.length;i++) {
			toReturn[i] = Double.parseDouble(data[i]);
		}
		return toReturn;
	}
	
	public static void main(String[] args) {
		ArrayList<Function> calcFunctions = new ArrayList<Function>();
//TODO: Implement these, then comment these lines back in. If you finish early, add your own functions.
//		calcFunctions.add(new Add());
//		calcFunctions.add(new Multiply());
		TextCalculator calc = new TextCalculator(calcFunctions);
		calc.run();	
	}

}
