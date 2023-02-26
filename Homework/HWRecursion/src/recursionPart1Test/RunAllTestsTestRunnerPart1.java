package recursionPart1Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;

import recursionPart1.RunAllTestsPart1;

public class RunAllTestsTestRunnerPart1 extends BlockJUnit4ClassRunner {
	static private final String filepath = "src/TestResults/";
	static private final String csvFilename = "results.csv";

	private int jUnitTestCounterPart1;
	private int testFailure;
	private int currentTestDidPass;
	private String oneJUnitTestResultPart1;
	private String resultsOfAllJUnitTestsPart1;
	private ArrayList<String> resultsToOutputPart1;
	private String didPassAllTestsPart1;
	private boolean operationIsImplemented;
	
	@SuppressWarnings("rawtypes")
	public RunAllTestsTestRunnerPart1(Class testClass) throws org.junit.runners.model.InitializationError {
		super(testClass);

		this.jUnitTestCounterPart1 = 0;
		this.testFailure = 0;
		this.oneJUnitTestResultPart1 = "";
		this.resultsOfAllJUnitTestsPart1 = "";
		this.resultsToOutputPart1 = new ArrayList<>();
		this.didPassAllTestsPart1 = "1";
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
				jUnitTestCounterPart1++;
				oneJUnitTestResultPart1 = jUnitTestCounterPart1 + "T";
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

				oneJUnitTestResultPart1 = jUnitTestCounterPart1 + "F";
				didPassAllTestsPart1 = "0";
				ideJUnitRunner.fireTestFailure(failure);
			}

			@Override
			public void fireTestFinished(Description description) {
				// Executes regardless whether the test passed.
				resultsOfAllJUnitTestsPart1 = resultsOfAllJUnitTestsPart1 + " " + oneJUnitTestResultPart1;
				RunAllTestsPart1.outputResults(currentTestDidPass, 1);
				ideJUnitRunner.fireTestFinished(description);

			}
		};

		super.run(decorator);
		System.out.printf("%-40s %-1d Tests Executed\tFailures: %-3d\n\n", name, jUnitTestCounterPart1, testFailure);

		if (operationIsImplemented) {
			resultsToOutputPart1.add(jUnitTestFileExecuted);
			resultsToOutputPart1.add(resultsOfAllJUnitTestsPart1);
			resultsToOutputPart1.add(didPassAllTestsPart1);
			resultsToOutputPart1.add(RunAllTestsPart1.timestamp);
			exportResults(resultsToOutputPart1);
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
