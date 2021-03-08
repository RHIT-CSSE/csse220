# FileIOAndExceptions

## Overview:
- This assignment will provide practice with reading and writing to several files as well as practice with throwing, catching and creating new exception types
- This assignment has 7 separate TODO items and the entire assignment is to be completed individually

## Rubric:
To earn a Pass for this assignment, your final version of the program should scan through all the necessary files, saving the relevant information, calculating the average grade for each student and it should then write out all the correct information to the AllGrades.csv file as given below as well as have the correct output to the console (i.e., this is an "all-or-nothing" assignment).  While the results are not required to be in any particular order in the final output file, if you order the records in alphabetical order by last name, you can earn awesome points.  If your program is not fully functioning, individual assessments may be made as to how close your program is to the above to determine if it passes the overall assignment.  But grades/averages must be calculated correctly for all students and written to a file in the very least.


## IMPORTANT Notes:
- THE FIRST THING YOU SHOULD DO when starting this assignment, after you import it, you should copy the “grades” directory in the project and place a copy of the directory with all its files somewhere accessible.  You should leave a copy of that directory with all the corresponding files in the project to another location that is easily accessible.  The reason you want this unchanged directory of files handy (like on your desktop or in an accessible window) is that as you finish this program, you will be required to make some changes to these files in the grades directory.  But your program should work from start to finish with the original grades directory containing the correct output.  Once you start making the changes to the files in your program, every time you run the program, you should copy in the ORIGINAL grades directory to the project to assure it is running properly.  This can simply be done by dragging the grades directory that you have somewhere accessible and drag it directly onto the top line of the project (the line that says “FileIOAndExceptions” in the project view.  This will assure your grades file will be in the correct place.
- You will be creating your own type of exceptions, more on this below
- There will be some code provided to you, such as how to walk through all the files of a directory
- You will be dealing with two different types of files, but both will have an almost exact data format.  One type of file will be a CSV file, which stands for Comma Separated Values file, which is essentially a text file with a special format.  The first line in a CSV file is always the header and contains the name of each column separated by commas (each line ends with an entry followed by the “\n” newline character except for the last line in the file, a line that ends in a comma is missing a value (sometimes that can be on purpose)).  There are Eclipse extensions that make it possible to view a CSV file like a spreadsheet in Eclipse, but frankly, you would be better off just viewing it as a text file.  In Eclipse, you can right-click on the CSV file and select Open With -> Text Editor.  In this way, you will see all the commas that would not be displayed in a spreadsheet format.  You can also open CSV files in Microsoft Excel.  When writing to a new csv file, always remember that each line should contain the same number of specific fields/values separated by commas (two commas side-by-side indicates a missing value).  For example, if the header were “first,last,email” an example entry would be “Jane,Doe,doe@gmail.com”.  Note that there is not a comma at the end of the line, but if there were other records to follow, the line would end in a “\n” newline character except the last line in the file.
- The other file type you will deal with is a simple text ".txt" file.  For the purposes of this assignment, all the entries in the text file are similar to the CSV in that values will be separated by commas.  The primary differences are the extension (.txt vs. .csv) and the text files will not have headers, just a number of values.

## IMPORTANT HINTS
There are some very important things to know in this assignment:
1) You need to know how to loop through all the files contained in a directory.  A short loop to just go through and display all the names of the files in the grades directory would be as follows:

	File dir = new File("grades/");
	for (File file : dir.listFiles()) {
		System.out.println(file.getName());
	}

NOTE: Above, file.getName() only returns the name of the file without any path information.  If you send that to the method to read the file, it would either need the full path, or “grades/“ in front of the file name in order to access the file. 
NOTE: If you would rather use the full path to the file, you can instead say file.getAbsolutePath()

When dealing with files, you read in the lines as Strings.  With such strings, often, you need to remove the spaces in front or in back.  A string that has a space in the beginning or the end will not match a string that doesn’t.  To get rid of leading and trailing spaces from a string called str, you can say: str = str.trim();

Also, you will be reading in the integers from the text files in the grades directory.  The lines will come in as Strings.  If you read in a line at a time, you can use the handy split method of the String class to create an array of the strings that are separated by commas with the commas removed from each.  For example, with the string str = “1,2,3,4”, you can say: String[] splitStr = str.split(“,”);  Then, splitStr[0] is "1", splitStr[1] is "2" and so on.  However, they are STILL String objects.  To convert them to an integer, you can say: int num = Integer.parseInt(splitStr[0]); and then num would be the integer with value 1.  Be careful!  If the string is empty or contains something other than digits only (with a possible negative sign), if you use the parseInt method on that string, you will get a NumberFormatException which indicates it could not convert that string to an int.

If you have a double variable named number, you can easily round to the nearest 2 decimal place by doing the following:

	number *= 100;
	number = Math.round(number);
	number /= 100;

And then number will be rounded to the nearest 2 digits after the decimal.

## TODOs
1) As described in the file named ReadAndGradeMain.java under the TODO 1 comment, you are first to go through the file named AllNames.csv.  You may view this file, but it is merely a list of student names and email addresses.  Your first required task is to save all the student names and emails as separate records that you will find grade averages for later, but you should also save all the records that have a malformed email address.  A well formed email address must match “firstname.lastname@rose-hulman.edu”.  In the description for TODO 1, you are given some examples of malformed email addresses.  You will save these records and print them at the end of the program after everything else is finished.
2) Now, for TODO 2, you will be creating two new exception types.  Namely, a MissingGradeException and a NegativeGradeException that will be used in later TODOs.  You can either have a superclass for the two of them, where the superclass extends the basic “Exception” type, or you may just have both of these exceptions extend the “Exception” type directly.  They both will work exactly similar, but it is important to make both exception types separately since they mean something very different.  NOTE: For these exceptions, you will need to track certain information (such as the line number and the position of a value that caused the exception).  When you write the exception classes, they will work just like any other class.  They need fields, you call a constructor (only you say throw new ABCException(…) to do so).  For example, if your MissingGradeException needed to track two Strings (you will likely need something else though), your class would look something like:

	public class MissingGradeException extends Exception {
		
		private String first;
		private String second;
	
		public MissingGradeException(String a, String b) {
			super();
			this.first = a;
			this.second = b;
		}

		//other things like getters and setters…
	}

Once you have this, if your exception needed to save the two strings “abc” and “xyz”, you could say:

	throw new MissingGradeException(“abc”, “xyz”);

Then, when the class catches this exception type, it can call the get methods to get those values.
3) TODO 3 will be done in the file named GradeFileReader.java.  The first method in this class is a static method, so it therefore is a utility method that does not require any class fields to work.  The first method is named readGradeFile.  It takes a file name (note, it is very important that the filename have the correct path to the file, more on that below), and reads all the integers separated by commas on several lines and returns the average of those integers as a double type.  The method has a JavaDoc that explains in detail what this method should do.  But if the file is malformed, an exception should be thrown so that the file may be repaired.  A file is malformed if it is missing a value (hence you would throw a MissingGradeException) or a value is negative (hence you would throw a NegativeGradeException).  When you throw these exceptions, you should think about what the exception needs to track so that the caller of this method can access the right data to determine exactly where this problem is in the file so that it may be fixed.  MAKE SURE YOU READ the JavaDoc for the other method that has been written for you.  You will need to utilize it in the next TODO when you catch exceptions and need to make changes to the file.
4) TODO 4 is in the ReadAndGradeMain.java file and is where you will loop through all the files in the grade directory, requesting the readGradeFile to read the file and return the average.  NOTE: The names of the files are the email addresses for the students AS IT IS LISTED in AllNames.csv (if it is malformed email address, the name of the file will be named the same thing) followed by “.txt”  Since these files are all in the “grades” directory, the path to access a file for Jane Doe (with a properly formed email address) would then be “grades/jane.doe@rose-hulman.edu.txt”.  You can also use the absolute path as described above.  Here is where you would catch the different exceptions that may occur in reading the file.  When you catch the exception, you would call the alterGradeInFile method to repair the value in the file that caused the exception.  You will continue this process until the readGradeFile method finally returns an average.  You should then save that average for that student to write to a file in a later TODO.  You can either round to the nearest 2 decimal places as seen below, or just save the double as it is without rounding.  NOTE: You may loop through some files that do not correspond to ANY student in the AllNames.csv file.  If you find such a file (and you will), you do not need to read the file to get an average since there is no student to associate that average with, however, you should save the name of each file that this happens because you will be printing out these file names to the console with the warning that there was no student these grades belonged to.  NOTE: When a file has a missing grade that needed to be repaired, you want to save the name of that file, and every other file name that had missing values.  These file names will be printed at the end of the program in a later TODO.  NOTE: When a file has a negative grade that needed repair, you should save the names of each and every file that had a negative grade because you will print these out in the end as well.  Final NOTE: You can save each student’s name (first and last), email and average in any way you wish, but we would recommend having a StudentRecord class that tracks all the information for one student such as the name, email and average score.
5) For TODO 5, now you simply need to save all the records you have calculated to a file named AllGrades.csv.  The header for this file should be exactly "last,first,email,average,letterGrade” and for each student that you calculated an average, you should write to this file one line per student.  Note that the breakdowns of all the letter grades are described in the TODO 5 item comment in the file.  NOTE: You may write the records in the file in any order and still pass.  To get them sorted alphabetically by last name AFTER the fact, you can open the file in Excel and select the last name column and select to sort it alphabetically.  HOWEVER, if your program correctly writes all the records in alphabetical order by last name without having to open it in Excel to sort them, that is eligible for AWESOME points.  NOTE: Below is what the file AllGrades.csv should contain when your program runs successfully, it is displayed in alphabetical order.
6) TODO 6: Now, you will print out 4 separate lists to the console (exact expected output displayed below), i.e., All files that had no corresponding student record from TODO 4; All records in AllNames.csv that had malformed email addresses; All files that needed repair due to one or more missing grade (if multiple, it should only be listed once in this category, NOT once for each time you found a missing grade in the same file); All files that needed repair due to one or more negative grades.  NOTE: When your program runs successfully, you should be getting the same output to the console that is displayed below.  

## Proper Output

The following are examples of what your files and output should be (note that it is OK if your output displays the file name with the absolute path to the file as well):

_____________________________________________________
When the program has finished successfully, it should print the following output to the console (and it should match almost exactly, save spacing or something small and similar):

	Now calculating grades
	Now writing grades to AllGrades.csv
	
	
	The following files did not apply to any students:
	.DS_Store
	charles.stanley@rose-hulman.edu.txt
	doc.brown@rose-hulman.edu.txt
	marty.mcfly@rose-hulman.edu.txt
	
	
	The following records had malformed email addresses:
	Adams, John, john.adamsrose-hulman.edu
	Gilmore, Happy, happy.gilmore@gmail.com
	Ludgate, April, april.ludgate@@rose-hulman.edu
	Saperstein, Jean-Ralphio, jean-ralphio.superstein@rose-hulman.edu
	Zippy, Johnny, johnny.zippy
	
	
	The following files had to be repaired due to MISSING grades:
	andy.bernard@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	pam.beesly@rose-hulman.edu.txt
	kieth.pembroke@rose-hulman.edu.txt
	david.wallace@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	josh.porter@rose-hulman.edu.txt
	andy.dwyer@rose-hulman.edu.txt
	
	
	The following files had to be repaired due to NEGATIVE grades:
	andy.bernard@rose-hulman.edu.txt
	meredith.palmer@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	bobby.newport@rose-hulman.edu.txt
	jim.halpert@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	josh.porter@rose-hulman.edu.txt
	roy.anderson@rose-hulman.edu.txt
	
	
	Done.

________________________________________________


When your program finishes, your AllGrades.csv file should look like the following (you may sort the file in Excel, or output in this order to get awesome points):

	last,first,email,average,letterGrade
	Adams,John,john.adamsrose-hulman.edu,94.0,A
	Anderson,Justin,justin.anderson@rose-hulman.edu,73.23,C
	Anderson,Roy,roy.anderson@rose-hulman.edu,58.0,F
	Barkley,Jennifer,jennifer.barkley@rose-hulman.edu,0.0,F
	Beesly,Pam,pam.beesly@rose-hulman.edu,58.13,F
	Bennett,Jo,jo.bennett@rose-hulman.edu,96.0,A
	Bernard,Andy,andy.bernard@rose-hulman.edu,54.33,F
	Bertram,Nellie,nellie.bertram@rose-hulman.edu,91.5,A
	Boyle,Charles,charles.boyle@rose-hulman.edu,78.95,C
	Bratton,Creed,creed.bratton@rose-hulman.edu,76.83,C
	Brendanawicz,Mark,mark.brendanawicz@rose-hulman.edu,94.31,A
	California,Robert,robert.california@rose-hulman.edu,0.0,F
	Costa,Marissa,marissa.costa@rose-hulman.edu,97.0,A
	Diaz,Rosa,rosa.diaz@rose-hulman.edu,77.6,C
	Dunn,Ron,ron.dunn@rose-hulman.edu,94.0,A
	Dwyer,Andy,andy.dwyer@rose-hulman.edu,40.35,F
	Filippelli,Karen,karen.filippelli@rose-hulman.edu,88.67,B
	Flax,Holly,holly.flax@rose-hulman.edu,95.3,A
	Flenderson,Toby,toby.flenderson@rose-hulman.edu,95.22,A
	Gergich,Jerry,jerry.gergich@rose-hulman.edu,94.8,A
	Gilmore,Happy,happy.gilmore@gmail.com,94.6,A
	Gore,Dan,dan.gore@rose-hulman.edu,94.0,A
	Green,Clark,clark.green@rose-hulman.edu,88.5,B
	Halpert,Jim,jim.halpert@rose-hulman.edu,59.75,F
	Hannon,Erin,erin.hannon@rose-hulman.edu,71.91,C
	Haverford,Tom,tom.haverford@rose-hulman.edu,83.85,B
	Hawkins,Melanie,melanie.hawkins@rose-hulman.edu,70.0,C
	Holt,Ray,ray.holt@rose-hulman.edu,77.33,C
	Howard,Ryan,ryan.howard@rose-hulman.edu,75.24,C
	Hudson,Stanley,stanley.hudson@rose-hulman.edu,93.8,A
	Jamm,Jeremy,jeremy.jamm@rose-hulman.edu,95.26,A
	Jeffords,Sharon,sharon.jeffords@rose-hulman.edu,75.0,C
	Jeffords,Terry,terry.jeffords@rose-hulman.edu,81.2,B
	Judy,Doug,doug.judy@rose-hulman.edu,80.73,B
	Kapoor,Kelly,kelly.kapoor@rose-hulman.edu,71.57,C
	Knope,Leslie,leslie.knope@rose-hulman.edu,80.67,B
	Levinson,Jan,jan.levinson@rose-hulman.edu,76.0,C
	Lewis,Diane,diane.lewis@rose-hulman.edu,93.0,A
	Lewis,Gabe,gabe.lewis@rose-hulman.edu,95.28,A
	Linetti,Gina,gina.linetti@rose-hulman.edu,0.0,F
	Lorthner,Carl,carl.lorthner@rose-hulman.edu,79.86,C
	Ludgate,April,april.ludgate@@rose-hulman.edu,93.4,A
	Malone,Kevin,kevin.malone@rose-hulman.edu,75.62,C
	Martin,Angela,angela.martin@rose-hulman.edu,46.33,F
	Martinez,Oscar,oscar.martinez@rose-hulman.edu,79.2,C
	Meagle,Donna,donna.meagle@rose-hulman.edu,81.05,B
	Middlebrooks,Craig,craig.middlebrooks@rose-hulman.edu,94.0,A
	Miller,Pete,pete.miller@rose-hulman.edu,74.0,C
	Miner,Charles,charles.miner@rose-hulman.edu,78.0,C
	Newport,Bobby,bobby.newport@rose-hulman.edu,46.25,F
	Palmer,Jake,jake.palmer@rose-hulman.edu,75.91,C
	Palmer,Meredith,meredith.palmer@rose-hulman.edu,42.92,F
	Pembroke,Kieth,kieth.pembroke@rose-hulman.edu,49.57,F
	Peralta,Jake,jake.peralta@rose-hulman.edu,77.44,C
	Peralta,Karen,karen.peralta@rose-hulman.edu,69.8,D
	Perez,Sophia,sophia.perez@rose-hulman.edu,95.0,A
	Perkins,Ann,ann.perkins@rose-hulman.edu,74.32,C
	Philbin,Darryl,darryl.philbin@rose-hulman.edu,80.58,B
	Pimento,Adrian,adrian.pimento@rose-hulman.edu,81.0,B
	Porter,Josh,josh.porter@rose-hulman.edu,51.2,F
	Santiago,Amy,amy.santiago@rose-hulman.edu,93.74,A
	Saperstein,Jean-Ralphio,jean-ralphio.superstein@rose-hulman.edu,94.09,A
	Saperstein,Mona-Lisa,mona-lisa.saperstein@rose-hulman.edu,72.75,C
	Schrute,Dwight,dwight.schrute@rose-hulman.edu,94.5,A
	Scott,Michael,michael.scott@rose-hulman.edu,57.78,F
	Stills,Carol,carol.stills@rose-hulman.edu,80.5,B
	Swanson,Ron,ron.swanson@rose-hulman.edu,79.7,C
	Swanson,Tammy,tammy.swanson@rose-hulman.edu,93.95,A
	Traeger,Chris,chris.traeger@rose-hulman.edu,79.44,C
	Vance,Phyllis,phyllis.vance@rose-hulman.edu,94.0,A
	Vickers,Deangelo,deangelo.vickers@rose-hulman.edu,72.43,C
	Wallace,David,david.wallace@rose-hulman.edu,58.8,F
	White,Devon,devon.white@rose-hulman.edu,78.33,C
	Wyatt,Ben,ben.wyatt@rose-hulman.edu,78.11,C
	Zippy,Johnny,johnny.zippy,78.0,C

_____________________________________________________________


The following is an example of a malformed file and what it looks like BEFORE the program runs, and what it should look like AFTER the program has finished:

The file named andy.bernard@rose-hulman.edu.txt before the program runs is malformed because it has a missing grade as well as a negative grade.  Before the program runs, the file contains the following:

	70,24
	59,10
	-31,53
	19,89
	,80
	91,71
	67,21
	72,58

Once the program is finished, the file named andy.bernard@rose-hulman.edu.txt should have been repaired and should look like the following:

	70,24
	59,10
	31,53
	19,89
	80
	91,71
	67,21
	72,58

When the readGradeFile method is done with the file above, it would return 54.33 (and it may display more than 2 digits past the decimal).

