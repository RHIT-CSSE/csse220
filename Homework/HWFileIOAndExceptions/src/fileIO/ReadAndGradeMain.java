package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import exceptions.MissingGradeException;
import exceptions.NegativeGradeException;

public class ReadAndGradeMain {
	
	private HashMap<String, StudentRecord> filenameToStudentRecord;
	private ArrayList<String> emailWarnings;
	private ArrayList<String> filesWithMissing;
	private ArrayList<String> filesWithNegative;
	
	public ReadAndGradeMain() {
		this.filenameToStudentRecord = new HashMap<String, StudentRecord>();
		this.emailWarnings = new ArrayList<String>();
		this.filesWithMissing = new ArrayList<String>();
		this.filesWithNegative = new ArrayList<String>();
	}
	
	public ArrayList<String> getEmailWarnings() {return this.emailWarnings;}
	public ArrayList<String> getFilesWithMissing() {return this.filesWithMissing;}
	public ArrayList<String> getFilesWithNegative() {return this.filesWithNegative;}
	public HashMap<String, StudentRecord> getFilenameToStudentRecord() {return this.filenameToStudentRecord;}
	
	/**
	 * You do not need to change ANYTHING in the main method!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//*********************** DO NOT CHANGE the following line *****************
		resetAllFiles();  //good example for reading from and writing to a file!
		//**************************************************************************
		
		
		ReadAndGradeMain fileProg = new ReadAndGradeMain();
		
		//TODO 1: complete the method named step1ReadNames()
		fileProg.step1ReadNamesAndMakeRecords();
		
		
		//Code for TODO 2 below
		Scanner scanInput = new Scanner(System.in);
		String[] dirs = {"onlyGoodGrades/", "onlyOneIssueGrades/", "multipleIssuesGrades/", "allGrades/"};
		String choiceString = "";
		int selection = 0;
		boolean done = false;
		do {
			System.out.println("\n************************************************************************************************"
		        + "\nPlease choose from the following options to test your file reading and averaging:\n" 
				+ "\t1 - Test with files that have NO issues (small subset in onlyGoodGrades directory)\n"
				+ "\t2 - Test with files that have only ONE issue each (small subset in onlyOneIssueGrades directory)\n"
				+ "\t3 - Test with files that have MULTIPLE issues (small subset in multipleIssuesGrades directory)\n"
				+ "\t4 - Test with ALL files in allGrades directory");
			choiceString = scanInput.nextLine();
			char choice = choiceString.charAt(0);
			if(Character.isDigit(choice) && 
					(Integer.parseInt(""+choice) < 5 && Integer.parseInt(""+choice) > 0)) {
				selection = Integer.parseInt(""+choice);
				done = true;
			} else 
				System.out.println("Invalid input of: " + choice + "\nPlease try again");
		} while(!done);
		scanInput.close();
		
		//TODO 2 (2.1 - 2.3): complete the method named step2GetFileAverages()
		System.out.println("\n\nNow calculating grades");
		fileProg.step2GetFileAverages(dirs[selection-1]);
		
		//TODO 3: complete the method named step3WriteGradesToFile()
		System.out.println("Now writing grades to AllAveragedGrades.csv");
		fileProg.step3WriteGradesToFile();
		
		
		
		System.out.println("\n\nThe following records had malformed email addresses:\n");
		Collections.sort(fileProg.getEmailWarnings());
		for(String warning : fileProg.getEmailWarnings())
			System.out.println(warning);
		
		System.out.println("\n\nThe following files had to be repaired due to MISSING grades:\n");
		Collections.sort(fileProg.getFilesWithMissing());
		for(String name : fileProg.getFilesWithMissing()) 
			System.out.println(name);
		
		System.out.println("\n\nThe following files had to be repaired due to NEGATIVE grades:\n");
		Collections.sort(fileProg.getFilesWithNegative());
		for(String name : fileProg.getFilesWithNegative()) 
			System.out.println(name);
		
		
		System.out.println("\n\nDone.");
	}
	
	/**
	 * TODO 1: Read through the file of names with email addresses. For each line in the
	 * file, you will see a last name, first name and an email address separated by commas.
	 * An example line would look like:
	 * Beesly,Pam,pam.beesly@rose-hulman.edu
	 * 
	 * HINT: To look at the CSV file in Eclipse, right-click on AllNames.csv and select
	 * Open With -> Text Editor and you will see the contents of the file.
	 * 
	 * If you get a line of text, you can use the String split method to get each part:
	 * String[] splitLine = line.split(",");
	 * splitLine[0] is the last name
	 * splitLine[1] is the first name
	 * splitLine[2] is the email address 
	 * 
	 * As you move along, there are three things to do here:
	 * 1) For each student, you should create a StudentRecord object for that student (see
	 * the StudentRecord class provided for you).
	 * 
	 * 2) You should check each email address provided in AllNames.csv and make sure the 
	 * email address is "well-formed."  If an email address is malformed, you should add 
	 * a string in the this.emailWarnings (containing lastName, firstName, emailAddress).  
	 * A well-formed email is always as follows (and should always be in all lower case 
	 * letters):
	 * 
	 * first.last@rose-hulman.edu
	 * 
	 * 
	 * Given a first name of Jane and a last name of Smith, the email should be:
	 * jane.smith@rose-hulman.edu
	 *         
	 * Examples of malformed email address:
	 * janesmith@rose-hulman.edu
	 * jane.smithrose-hulman.edu
	 * jane.smith@rose-hulman.com
	 * jane.smith@rosehulman.edu
	 * jane.smith@gmail.com 
	 * 
	 * When you find a malformed email address, you should add the student's information to
	 * the emailWarnings ArrayList.  You should add the following:
	 * "lastName, firstName, malformedEmailAddress"
	 * 
	 * For example: "Smith, Jane, janesmith@rose-hulman.edu" is a string you would add to
	 * emailWarnings.
	 * 
	 * 
	 * 3) For every student record, there will later be a file for that student where we will
	 * read grades.  The file name for that student will be the email address with the ".txt"
	 * extension.  Using the this.filenameToStudentRecord HashMap, add the email+".txt" mapped 
	 * to the new student record created in step 1.  For example, if you have a StudentRecord 
	 * called "rec" for Jane Smith with emailAddress = "jane.smith@rose-hulman.edu", you should say:
	 * this.filenameToStudentRecord(emailAddress+".txt", rec);
	 * 
	 * Do the above for each student found in the file.
	 */
	public void step1ReadNamesAndMakeRecords() {
		Scanner scanner;
		String filename = "AllNames.csv";
		
		
	}
	
	/**
	 * TODO 2:  **This TODO will require completed code in other places before you can continue.**
	 * It will also require altering the two exception classes.
	 * 
	 * TODO 2.1:
	 * In particular, you first need to complete the GradeFileReader.readGradeFile(filename)
	 * method.  The instructions for this method are in the GradeFileReader class above the
	 * method.  The main method is designed so that you can complete this method incrementally
	 * with varying levels of difficult files.  The readGradeFile method in summary should
	 * read through all the integer grades (separated by commas) and return an average as a
	 * double.  This step2GetFileAverages method should call that method and expect an average
	 * to be returned.  This will also be the place to handle the exceptions that may result
	 * from running the readGradeFile method, but more on that below.
	 * 
	 * TODO 2.2: 
	 * Once you have the GradeFileReader.readGradeFile method ready, in this method, you will 
	 * pass each individual file in a specific directory (chosen from the main method from 
	 * user input).  The looping through the files has already been created for you, you 
	 * simply need to call the readGradeFile with each file and handle exceptions as they occur.
	 * 
	 * For each file, there is supposed to be an average returned.  You should locate the
	 * StudentRecord object for which that file exists and store the average in the 
	 * StudentRecord object.  To fins a StudentRecord object, see the getStudentRecord
	 * method in the StudentRecord class.  You can pass it this.fileNameToStudentRecord if you
	 * have correctly stored the appropriate information in that hash map.
	 * 
	 * To test this method, there are several possibilities.  The simplest case is when all the
	 * files have no missing or negative grades.  The cases can get more complex from there.
	 * When the main program is run, the user will be presented with 4 options.  We HIGHLY
	 * recommend that you test the different cases in order starting with 1.  Get each part
	 * working before moving on to the next, more difficult case.  The cases are as follows:
	 * 
	 * 1) basic functionality -- when you run the program, select option 1.  This will result in
	 * only passing a set of files to the readGradeFile for which an average can be calculated 
	 * simply.
	 * 
	 * 2) one specific issue in each file  -- when you run the program, select option 2.  This will
	 * result in passing files that each have either a single missing grade or a single negative grade.
	 * See below for when exceptions are thrown.
	 * 
	 * 3) files with multiple issues -- when you run the program, select option 3.  This will result
	 * in passing files that each have one to several issues (can contain both negative and missing 
	 * grades).  See below for when exceptions are thrown.
	 * 
	 * 4) all files -- when you run the program, select option 4.  This will result in passing all
	 * files.  Several files have no issue and several have one and several have many issues.
	 * 
	 * TODO 2.3:
	 * When an exception occurs:
	 * When the GradeFileReader.readGradeFile method is called, it is supposed to return an average
	 * of all the grades of the file it was sent.  However, these files might contain a missing grade
	 * or a negative grade.  If this occurs, the readGradeFile method cannot continue.  This is the
	 * very purpose of exceptions.  The readGradeFile should throw the appropriate exception when
	 * a file has something wrong (missing or negative grade).  This method below is where you are
	 * to catch the exceptions and fix the problem and retry.  Luckily, there is already a method
	 * that will fix the file in question.  This method is GradeFileReader.alterGradeInFile.  You
	 * should read through the Javadoc for this method to see how it is used, but depending on the
	 * arguments you send in, it will fix either a negative or missing grade in the position you send
	 * it.
	 * 
	 * When you are reading through the files, you should do the following:
	 * 	for each file:
	 * 		call readGradeFile with the file
	 * 		if readGradeFile returns an average, store it for the student and you are finished
	 * 
	 * 		else an exception occurs:
	 * 			fix the particular problem and keep calling readGradeFile until an average is returned.
	 * 
	 * HINT:  You might be asking yourself "How do I catch the exception from here and know what line
	 * and index to send to the alterGradeInFile method?"  The answer is to use the two exception
	 * classes like you would with any other class to contain the data with methods to access the data
	 * you need.  When the readGradeFile method throws the exception, it knows what line and index the
	 * problem occurred.  When you catch the exception here, the exception object itself should have 
	 * the information you need and you can call alterGradeInFile to fix the problem and try again.
	 * The exception classes are currently blank, so you will need to add something to both of them
	 * to get this working properly.
	 * 
	 * @param directory - the directory in which all the files to read from exist
	 */
	public void step2GetFileAverages(String directory) {
		//The following will loop through all the files, do NOT change the next 4 lines
		File dir = new File(directory);
		for (File file : dir.listFiles()) {
			String curFilename = file.getName().trim();
			String nameToSend = file.getAbsolutePath();
			
			//start here, nameToSend is the variable to pass to GradeFileReader.readGradeFile 
			//and GradeFileReader.alterGradeInFile
			
        }
	}
	
	/**
	 * TODO 3: 
	 * Now that you have finished reading all the grades from the files and storing the
	 * averages in all the StudentRecord objects, it is time to write all this information
	 * to a file along with what letter grade the student earned.  You are to write all 
	 * the records to a file named AllAveragedGrades.csv.  You can write the records in 
	 * the order you read them from the HashMap (and even do it above in the previous todo 
	 * section if you wish) but if you write to the file in alphabetic order of their last 
	 * names, you will receive INCENTIVE POINTS for doing so.  Remember that a CSV file is 
	 * a text file that contains comma separated records.  
	 * 
	 * THE FIRST LINE YOU WRITE to the AllAveragedGradesFile.csv file should be the exact
	 * string:
	 * 
	 * last,first,email,average,letterGrade
	 * 
	 * 
	 * And then every record should place each record accordingly.
	 * 
	 * NOTE: A letter grade is calculated as follows:
	 * 90.0 < A < 100.0
	 * 80.0 < B < 90.0
	 * 70.0 < C < 80.0
	 * 60.0 < D < 70.0
	 * F < 60.0
	 * 
	 * An example of a file with three records might look like:
	 * 
	 * last,first,email,average,letterGrade
	 * Hollingsworth,Joe,joe.hollingsworthrose-hulman.edu,94.0,A
	 * Wilkin,Aaron,aaron.wilkin@rose-hulman.edu,89.0,B
	 * Yoder,Jason,jason.yoder@rose-hulman.edu,95.0,A 
	 */
	public void step3WriteGradesToFile() {
		String outputFilename = "AllAveragedGrades.csv";
		
		
	}
	
	//**************************************************************************************************************
	// DO NOT CHANGE ANY CODE BELOW THIS POINT!!!
	//**************************************************************************************************************
	
	
	/**
	 * DO NOT CHANGE THIS METHOD!
	 * 
	 * This method is used to reset all the files so that every time the program is run,
	 * the files start from the state they were before they were altered.  This is done 
	 * using the directory named "originalFilesDoNotUseOrChange/".
	 * 
	 * This is a static method that depends on the directories to be named and oriented
	 * in a particular way.
	 */
	public static void resetAllFiles() {
		String[] dirs = {"onlyGoodGrades/", "onlyOneIssueGrades/", "multipleIssuesGrades/", "allGrades/"};
		for(String curDir : dirs) {
			
			Scanner scanner;
			String fullDir = "originalFilesDoNotUseOrChange/" + curDir;
			File dirFile = new File(fullDir);
			
			for (File file : dirFile.listFiles()) {
				try {
					scanner = new Scanner(new File(file.getAbsolutePath()));
				} catch (FileNotFoundException e) {
					System.out.println(fullDir + file.getName() + " not found, you should reset your directories and try again.");
					//e.printStackTrace();
					return;
				}
			
				String fileContents = "";
				int curLine = 1;
				while(scanner.hasNext()) {
					String line = (curLine == 1) ? (scanner.nextLine()) : ("\n"+scanner.nextLine());
					fileContents += line;
					curLine++;
				}
				
				scanner.close();
				
				PrintWriter pw = null;
				String fName = file.getName();
				try {
					pw = new PrintWriter(curDir + fName);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				pw.write(fileContents);
				pw.close();
			}
		}
	}
}
