package sllTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;

import sll.RunAllTests;



public class RunAllTestsTestRunner extends BlockJUnit4ClassRunner {
	static private final String filepath = "src/TestResults/";
	static private final String csvFilename = "results.csv";

	private int jUnitTestCounter;
	private int testFailure;
	private int currentTestDidPass;
	private String oneJUnitTestResult;
	private String resultsOfAllJUnitTests;
	private ArrayList<String> resultsToOutput;
	private String didPassAllTests;
	private boolean operationIsImplemented;

	@SuppressWarnings("rawtypes")
	public RunAllTestsTestRunner(Class testClass) throws org.junit.runners.model.InitializationError {
		super(testClass);

		this.jUnitTestCounter = 0;
		this.testFailure = 0;
		this.oneJUnitTestResult = "";
		this.resultsOfAllJUnitTests = "";
		this.resultsToOutput = new ArrayList<>();
		this.didPassAllTests = "1";
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
				jUnitTestCounter++;
				oneJUnitTestResult = jUnitTestCounter + "T";
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

				oneJUnitTestResult = jUnitTestCounter + "F";
				didPassAllTests = "0";
				ideJUnitRunner.fireTestFailure(failure);
			}

			@Override
			public void fireTestFinished(Description description) {
				// Executes regardless whether the test passed.
				resultsOfAllJUnitTests = resultsOfAllJUnitTests + " " + oneJUnitTestResult;
				RunAllTests.outputResults(currentTestDidPass, 1);
				ideJUnitRunner.fireTestFinished(description);

			}
		};

		super.run(decorator);

		//Data collection section
		//All of this was added by me, except for the thing in the first else statement
		ArrayList<String> dataList = importComplexityData(name.substring(4));
		String compString = "NaN";
		String functionTree = "N/A";
		if (dataList.size() == 0) {
			//Original output string
			System.out.printf("%-40s %-1d Tests Executed\tFailures: %-3d\t\n\n", name, jUnitTestCounter, testFailure);
		} else {
			double compScore = Double.parseDouble(dataList.get(0));
			double barrier = Double.parseDouble(dataList.get(1));
			functionTree = dataList.get(2).replaceAll(",", ":");
			compString = String.format("%.1f", compScore);
			String output = String.format("%-40s %-1d Tests Executed\tFailures: %-3d\tComplexity Score: %.1f", name, jUnitTestCounter, testFailure, compScore);
			if (compScore > barrier) {
				output += "!\n\n";
			} else {
				output += "\n\n";
			}
			System.out.print(output);
		}
		if (operationIsImplemented) {
			resultsToOutput.add(jUnitTestFileExecuted);
			resultsToOutput.add(resultsOfAllJUnitTests);
			resultsToOutput.add(didPassAllTests);
			resultsToOutput.add(RunAllTests.timestamp);
			//Added these two to be output
			resultsToOutput.add(compString);
			resultsToOutput.add(functionTree);
			exportResults(resultsToOutput);
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
	
	/*
	 * repineap: used to collect the complexity data from the saved files based on function name
	 */
	private ArrayList<String> importComplexityData(String functionName) {
		functionName = functionName.substring(0, 1).toLowerCase() + functionName.substring(1);
		ArrayList<String> dataList = new ArrayList<>();
		try {
		      File myObj = new File("src" + File.separator + "TestResults" + File.separator + functionName + "-compdata.txt");
		      Scanner myReader = new Scanner(myObj);
		      String line = "";
		      String compScore = "NaN";
		      String overRatio = "NaN";
		      String functionTree = "(r,())";
		      while (myReader.hasNextLine()) {
		    	line = myReader.nextLine();
		    	String[] splitLine = line.split(" ");
		    	if (splitLine.length != 3) {
		    		myReader.close();
		    		return dataList;
		    	}
		    	compScore = splitLine[0];
		    	overRatio = splitLine[1];
		    	functionTree = splitLine[2];
		      }
		      dataList.add(compScore);
		      dataList.add(overRatio);
		      dataList.add(functionTree);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      return dataList;
		    }
		return dataList;
	}

}
