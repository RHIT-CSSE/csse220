package recursionPart2Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;

import recursionPart2.RunAllTestsPart2;

public class RunAllTestsTestRunnerPart2 extends BlockJUnit4ClassRunner {

	static private final String filepath = "src/TestResults/";
	static private final String csvFilename = "results.csv";

	private int jUnitTestCounterPart2;
	private int testFailure;
	private int currentTestDidPass;
	private String oneJUnitTestResultPart2;
	private String resultsOfAllJUnitTestsPart2;
	private ArrayList<String> resultsToOutputPart2;
	private String didPassAllTestsPart2;
	private boolean operationIsImplemented;

	@SuppressWarnings("rawtypes")
	public RunAllTestsTestRunnerPart2(Class testClass) throws org.junit.runners.model.InitializationError {
		super(testClass);

		this.jUnitTestCounterPart2 = 0;
		this.testFailure = 0;
		this.oneJUnitTestResultPart2 = "";
		this.resultsOfAllJUnitTestsPart2 = "";
		this.resultsToOutputPart2 = new ArrayList<>();
		this.didPassAllTestsPart2 = "1";
		this.operationIsImplemented = true;
	}

	@Override
	public void run(RunNotifier ideJUnitRunner) {

		String name = this.getTestClass().getName();
		name = name.substring(name.indexOf(".") + 1, name.length());
		final String jUnitTestFileExecuted = name;

		// count tests with Decorator Pattern
		RunNotifier decorator = new RunNotifier() {
			@Override
			public void fireTestStarted(Description description) throws StoppedByUserException {
				// Sets the state of the current test running so it is updated for every test.
				currentTestDidPass = 1;
				jUnitTestCounterPart2++;
				oneJUnitTestResultPart2 = jUnitTestCounterPart2 + "T";
				ideJUnitRunner.fireTestStarted(description);
			}

			@Override
			public void fireTestFailure(Failure failure) {
				testFailure++;
				currentTestDidPass = 0;
				String msg = failure.getMessage(); // write that

				if (msg != null && msg.equals("TODO: delete this statement and implement this operation.")) {
					operationIsImplemented = false;
				}

				oneJUnitTestResultPart2 = jUnitTestCounterPart2 + "F";
				didPassAllTestsPart2 = "0";
				ideJUnitRunner.fireTestFailure(failure);
			}

			@Override
			public void fireTestFinished(Description description) {
				// Executes regardless whether the test passed.
				resultsOfAllJUnitTestsPart2 = resultsOfAllJUnitTestsPart2 + " " + oneJUnitTestResultPart2;
				RunAllTestsPart2.outputResults(currentTestDidPass, 1);
				ideJUnitRunner.fireTestFinished(description);

			}
		};

		super.run(decorator);
		System.out.printf("%-40s %-1d Tests Executed\tFailures: %-3d\n\n", name, jUnitTestCounterPart2, testFailure);

		if (operationIsImplemented) {
			resultsToOutputPart2.add(jUnitTestFileExecuted);
			resultsToOutputPart2.add(resultsOfAllJUnitTestsPart2);
			resultsToOutputPart2.add(didPassAllTestsPart2);
			resultsToOutputPart2.add(RunAllTestsPart2.timestamp);
			exportResults(resultsToOutputPart2);
		}

	}

	private void exportResults(ArrayList<String> output) {
		try {
			File myObj = new File(filepath + csvFilename);
			myObj.createNewFile();

			try {
				FileOutputStream fos = new FileOutputStream(filepath + csvFilename, true);
				String outputString = output.toString().substring(1, output.toString().length() - 1) + "\n";

				// Software that does post processing of .csv file requires that there be no
				// spaces after the commas
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
