package TwelveProblemsTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;

import TwelveProblems.RunAllTests;

public class RunAllTestsTestRunner extends BlockJUnit4ClassRunner {

	private int testCount = 0;
	private int testFailure = 0;

	private String result;
	private String totalResult = "";
	private ArrayList<String> output = new ArrayList<>();
	private String passed = "1";
	private boolean implemented = true;

	@SuppressWarnings("rawtypes")
	public RunAllTestsTestRunner(Class testClass) throws org.junit.runners.model.InitializationError {
		super(testClass);
	}

	@Override
	public void run(RunNotifier ideJUnitRunner) {
		// *** Insert print header stuff here
		String name = this.getTestClass().getName();
		name = name.substring(name.indexOf(".")+1, name.length()); 
		
		// count tests with Decorator Pattern
		RunNotifier decorator = new RunNotifier() {
			@Override
			public void fireTestStarted(Description description) throws StoppedByUserException {
				testCount++;
				result = testCount + "T";
				ideJUnitRunner.fireTestStarted(description);
			}

			@Override
			public void fireTestFailure(Failure failure) {
				testFailure++;
				String msg = failure.getMessage(); // write that

				if (msg.equals("TODO: delete this statement and implement this operation.")) {
					implemented = false;
				}

				result = testCount + "F";
				passed = "0";
				ideJUnitRunner.fireTestFailure(failure);
			}

			@Override
			public void fireTestFinished(Description description) {
				// Executes regardless whether the test passed.
				totalResult = totalResult + " " + result;
				RunAllTests.outputResults(Integer.parseInt(passed), 1);
				ideJUnitRunner.fireTestFinished(description);
			}
		};

		super.run(decorator);
		System.out.printf("%-40s %-1d Tests Executed\tFailures: %-3d\n\n", name, testCount, testFailure);

		if (implemented) {
			output.add(totalResult);
			output.add(passed);
			String outputString = output.toString().substring(1, output.toString().length() - 1);
			outputString = outputString.replace(",  ", ",");
			outputString = outputString.replace(", ", ",");
			exportResults(output);
		}

	}

	private void exportResults(ArrayList<String> output) {
		String filepath = "src/TestResults/";
		try {
			File myObj = new File(filepath + this.getTestClass().getName() + ".csv");
			myObj.createNewFile();

			try {
				FileOutputStream fos = new FileOutputStream(filepath + this.getTestClass().getName() + ".csv", true);
				String outputString = output.toString().substring(1, output.toString().length() - 1) + "\n";
				outputString = outputString.replace(",  ", ",");
				outputString = outputString.replace(", ", ",");
				fos.write(outputString.getBytes());
				fos.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
