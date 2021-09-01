package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import exceptions.MissingGradeException;
import exceptions.NegativeGradeException;

public class ReadAndGradeMain {
	
	
	public static void main(String[] args) {
		
		/* 
		 * TODO 1: Read through the file of names with email addresses, and form a list of all
		 *         records in the file that have malformed email addresses (they will still
		 *		   have files named with the incorrect email addresses and you will need to
		 *		   write the record to the output later, but the user should be warned below
		 *		   about each record that has a malformed email.  It would be wise to create
		 *		   your StudentRecord types here.
		 *
		 *		   A well-formed email is always as follows (and should always be in all lowercase
		 *         letters):
		 *         first.last@rose-hulman.edu
		 *         
		 *         Given a first name of Jane and a last name of Smith, the email should be:
		 *         jane.smith@rose-hulman.edu
		 *         
		 *         Examples of malformed email address:
		 *         janesmith@rose-hulman.edu
		 *         jane.smithrose-hulman.edu
		 *         jane.smith@rose-hulman.com
		 *         jane.smith@rosehulman.edu
		 *         jane.smith@gmail.com
		 */
		
		Scanner scanner = null;
		String filename = "AllNames.csv";
		ArrayList<String> emailWarnings = new ArrayList<String>();
		//set up scanner to read here and the rest of your code here
		
		scanner.close();
		
		
		
		//TODO 2: Create exception classes (NOTE, when this is finished, it should fix the 
		//compiler error in the GradeFileReader.java file
		
		//TODO 3 in the GradeFileReader.java file, MAKE SURE AND LOOK OVER THE METHOD written
		//for you in this file, you only need to complete one method.
		
		
		/*
		 * TODO 4: Now loop through all the files, using the name of the file, you should call
		 *         the readGradeFile method in the GradeFileReader class (note it is a static
		 *         method).  If all goes well, it should return the average of all the integers
		 *         in the file.  Otherwise, if the method throws an exception, you should track
		 *         a list of the files with a missing grade and another list of all the files with
		 *         a negative grade.  If you get an exception, you should call alterGradeInFile with
		 *         the appropriate parameters as described in the comments for the method.  You should
		 *         locate the student record and set the average grade for the StudentRecord
		 */
		
		System.out.println("\n\nNow calculating grades");
		
		File dir = new File("grades/");
		ArrayList<String> filesWithNoName = new ArrayList<String>();
		ArrayList<String> filesWithMissing = new ArrayList<String>();
		ArrayList<String> filesWithNegative = new ArrayList<String>();
		//your code here
		
		
		/*
		 * TODO 5: Now write all the records to the file named AllGrades.csv.  You can write
		 * the records in the order you read them (and even do it above in the previous todo 
		 * section) but if you write the files in alphabetic order of their last names, you
		 * will earn incentive for doing so.  Remember that a CSV file is a file that
		 * contains comma separated records.  The first line should be:
		 * last,first,email,average,letterGrade
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
		 * last,first,email,average,letterGrade
		 * Hollingsworth,Joe,joe.hollingsworthrose-hulman.edu,94.0,A
		 * Wilkin,Aaron,aaron.wilkin@rose-hulman.edu,89.0,B
		 * Yoder,Jason,jason.yoder@rose-hulman.edu,95.0,A
		 */
		
		
		String outputFilename = "AllGrades.csv";
		System.out.println("Now writing grades to " + outputFilename);
		PrintWriter pw = null;
		//your code here
		
		
		pw.close();
		
		/*
		 * TODO 6: Below, print out to the console (using System.out) the following reports:
		 * 
		 * 1) All files that were found in the grades directory for which there was no student 
		 * 2) All records in the AllNames.csv file that had malformed email addresses
		 * 3) All files that had to be repaired because of a missing grade
		 * 4) All files that had to be repaired because of a negative grade
		 */
		
		System.out.println("\n\nThe following files did not apply to any students:");
		
		
		System.out.println("\n\nThe following records had malformed email addresses:");
		
		
		System.out.println("\n\nThe following files had to be repaired due to MISSING grades:");
		
		
		System.out.println("\n\nThe following files had to be repaired due to NEGATIVE grades:");
		
		
		
		System.out.println("\n\nDone.");
	}
}
