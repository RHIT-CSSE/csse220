# FileIOAndExceptions

## Overview:
- This assignment will provide practice with reading and writing to several files as well as practice with throwing, catching and creating new exception types


## Rubric:
To earn a full credit for this assignment, your final version of the program should scan through all the necessary files, saving the relevant information, calculating the average grade for each student and it should then write out all the correct information to the AllAveragedGrades.csv file as given below as well as have the correct output to the console.  While the results are not required to be in any particular order in the final output file, if you order the records in alphabetical order by last name, you can earn incentive points.  The breakdown of points is as follows:
- (20% of the points) Completing TODO 1 by: completing the step1ReadNamesAndMakeRecords method, storing the student records and determining which damsel addresses are malformed
- (60% total) Completing TODO 2 (2.1-2.3) by: 
	- (20%) completing the GradeFileReader.readGradeFile method to properly return an average of the values read or to throw the proper exception
	- (20%) completing the step2GetFileAverages method to properly call the readGradeFile method and storing the averages in each student record
	- (20%) handling the exceptions and correctly fixing the files to then get their averages after the fix
- (20% of the points) Completing TODO 3 by: completing the step3WriteGradesToFile method that will write records for each student (firstname,lastname,email,average,letterGrade) in a file named AllAveragedGrades.csv.


## IMPORTANT Notes:
- There is a directory named originalFilesDoNotUseOrChange that you should not do anything with at any point.  When you run your program and it runs correctly, it will be changing a number of files.  The files in the originalFilesDoNotUseOrChange will be used to restore the files to their original state every time you run the program.  You do not need to do anything to change the files back since this will be done automatically.
- You will be creating your own type of exceptions, more on this below
- There will be some code provided to you, such as how to walk through all the files of a directory
- You will be dealing with two different types of files, but both will have an almost exact data format.  One type of file will be a CSV file, which stands for Comma Separated Values file, which is essentially a text file with a special format.  The first line in a CSV file is always the header and contains the name of each column separated by commas (each line ends with an entry followed by the “\n” newline character except for the last line in the file, a line that ends in a comma is missing a value (sometimes that can be on purpose)).  There are Eclipse extensions that make it possible to view a CSV file like a spreadsheet in Eclipse, but frankly, you would be better off just viewing it as a text file.  In Eclipse, you can right-click on the CSV file and select Open With -> Text Editor.  In this way, you will see all the commas that would not be displayed in a spreadsheet format.  You can also open CSV files in Microsoft Excel.  When writing to a new csv file, always remember that each line should contain the same number of specific fields/values separated by commas (two commas side-by-side indicates a missing value).  For example, if the header were “first,last,email” an example entry would be “Jane,Doe,doe@gmail.com”.  Note that there is not a comma at the end of the line, but if there were other records to follow, the line would end in a “\n” newline character except the last line in the file.
- The other file type you will deal with is a simple text ".txt" file.  For the purposes of this assignment, all the entries in the text file are similar to the CSV in that values will be separated by commas.  The primary differences are the extension (.txt vs. .csv) and the text files will not have headers, just a number of values.

## IMPORTANT HINTS

When dealing with files, you read in the lines as Strings.  With such strings, often, you need to remove the spaces in front or in back.  A string that has a space in the beginning or the end will not match a string that doesn’t.  To get rid of leading and trailing spaces from a string called str, you can say: str = str.trim();

If you have a File object, you can use file.getName() get the name of the file and file.getAbsolutePath() to get the full path and file name.  You will typically want to open the file to read it using the full path.

Also, you will be reading in the integers from the text files in the grades directory.  The lines will come in as Strings.  If you read in a line at a time, you can use the handy split method of the String class to create an array of the strings that are separated by commas with the commas removed from each.  For example, with the string str = “1,2,3,4”, you can say: String[] splitStr = str.split(“,”);  Then, splitStr[0] is "1", splitStr[1] is "2" and so on.  However, they are STILL String objects.  To convert them to an integer, you can say: int num = Integer.parseInt(splitStr[0]); and then num would be the integer with value 1.  Be careful!  If the string is empty or contains something other than digits only (with a possible negative sign), if you use the parseInt method on that string, you will get a NumberFormatException which indicates it could not convert that string to an int.

If you have a double variable named number, you can easily round to the nearest 2 decimal place by doing the following:

	number *= 100;
	number = Math.round(number);
	number /= 100;

And then number will be rounded to the nearest 2 digits after the decimal.

## TODOs
There are 3 TODOs and they are all explained above the methods in which you will complete them.

TODO 2.1 is to be completed in the GradeFileReader class in the readGradeFile method.  We recommend using the incremental nature of the option for the user in main to incrementally test this method with the simplest cases first and working your way up.

For TODO 2.3, you will be altering the exception types MissingGradeException and NegativeGradeException.  NOTE: For these exceptions, you will need to track certain information (such as the line number and the position of a value that caused the exception).  When you write the exception classes, they will work just like any other class.  They need fields, you call a constructor (only you say throw new ABCException(…) to do so).  For example, if you had an exception named ABCException needed to track two Strings, an int and a double, your exception class would look something like:

	public class ABCException extends Exception {
		
		private String first;
		private String second;
		private int third;
		private double fourth;
	
		public MissingGradeException(String a, String b, int c, double d) {
			super();
			this.first = a;
			this.second = b;
			this.third = c;
			this.fourth = d;
		}

		//other things like getters and setters…
	}

Once you have this, if your exception needed to save the two strings “abc” and “xyz”, an int = 5 and a double = 7.5, you could say:

	throw new ABCException(“abc”, “xyz”, 5, 7.5);

This is basically just like calling any constructor of any class and then returning that object.

Then, when the class catches this exception type, it can call the get methods to get those values.  

For TODO 3, now you simply need to save all the records you have calculated to a file named AllAveragedGrades.csv.  The header for this file should be exactly "last,first,email,average,letterGrade” and for each student that you calculated an average, you should write to this file one line per student.  NOTE: You may write the records in the file in any order and still pass.  To get them sorted alphabetically by last name AFTER the fact, you can open the file in Excel and select the last name column and select to sort it alphabetically.  HOWEVER, if your program correctly writes all the records in alphabetical order by last name without having to open it in Excel to sort them, that is eligible for INCENTIVE points.  NOTE: The file named WhatAllAveragedGradeShouldLookLikeWhenFinished.csv is what the file AllAveragedGrades.csv should contain when your program runs successfully.  The file provided is displayed in alphabetical order, but your solution does not need to do such unless you want the incentive points (your file may contain the records in any order for full credit).


## Proper Output

The following are examples of what your files and output should be (note that it is OK if your output displays the file name with the absolute path to the file as well):

_____________________________________________________
Below are the separate run-throughs of the program using the different options.  When the program has finished successfully, it should print the following output to the console in the following four cases (and it should match almost exactly, save spacing or something small and similar, and the ORDER of the names and files do not matter, only that they are all present):

	************************************************************************************************
	Please choose from the following options to test your file reading and averaging:
	1 - Test with files that have NO issues (small subset in onlyGoodGrades directory)
	2 - Test with files that have only ONE issue each (small subset in onlyOneIssueGrades directory)
	3 - Test with files that have MULTIPLE issues (small subset in multipleIssuesGrades directory)
	4 - Test with ALL files in allGrades directory
	
	1
	
	
	Now calculating grades
	Now writing grades to AllAveragedGrades.csv
	
	
	The following records had malformed email addresses:
	
	Adams, John, john.adamsrose-hulman.edu
	Gilmore, Happy, happy.gilmore@gmail.com
	Ludgate, April, april.ludgate@@rose-hulman.edu
	Saperstein, Jean-Ralphio, jean-ralphio.superstein@rose-hulman.edu
	Zippy, Johnny, johnny.zippy
	
	
	The following files had to be repaired due to MISSING grades:
	
	
	
	The following files had to be repaired due to NEGATIVE grades:
	
	
	
	Done.
	
________________________________________________

	************************************************************************************************
	Please choose from the following options to test your file reading and averaging:
	1 - Test with files that have NO issues (small subset in onlyGoodGrades directory)
	2 - Test with files that have only ONE issue each (small subset in onlyOneIssueGrades directory)
	3 - Test with files that have MULTIPLE issues (small subset in multipleIssuesGrades directory)
	4 - Test with ALL files in allGrades directory
	
	2
	
	
	Now calculating grades
	Now writing grades to AllAveragedGrades.csv
	
	
	The following records had malformed email addresses:
	
	Adams, John, john.adamsrose-hulman.edu
	Gilmore, Happy, happy.gilmore@gmail.com
	Ludgate, April, april.ludgate@@rose-hulman.edu
	Saperstein, Jean-Ralphio, jean-ralphio.superstein@rose-hulman.edu
	Zippy, Johnny, johnny.zippy
	
	
	The following files had to be repaired due to MISSING grades:
	
	dan.gore@rose-hulman.edu.txt
	happy.gilmore@gmail.com.txt
	kelly.kapoor@rose-hulman.edu.txt
	
	
	The following files had to be repaired due to NEGATIVE grades:
	
	leslie.knope@rose-hulman.edu.txt
	pete.miller@rose-hulman.edu.txt
	stanley.hudson@rose-hulman.edu.txt
	tammy.swanson@rose-hulman.edu.txt
	
	
	Done.
	
	
________________________________________________

	************************************************************************************************
	Please choose from the following options to test your file reading and averaging:
	1 - Test with files that have NO issues (small subset in onlyGoodGrades directory)
	2 - Test with files that have only ONE issue each (small subset in onlyOneIssueGrades directory)
	3 - Test with files that have MULTIPLE issues (small subset in multipleIssuesGrades directory)
	4 - Test with ALL files in allGrades directory
	
	3
	
	
	Now calculating grades
	Now writing grades to AllAveragedGrades.csv
	
	
	The following records had malformed email addresses:
	
	Adams, John, john.adamsrose-hulman.edu
	Gilmore, Happy, happy.gilmore@gmail.com
	Ludgate, April, april.ludgate@@rose-hulman.edu
	Saperstein, Jean-Ralphio, jean-ralphio.superstein@rose-hulman.edu
	Zippy, Johnny, johnny.zippy
	
	
	The following files had to be repaired due to MISSING grades:
	
	andy.bernard@rose-hulman.edu.txt
	andy.dwyer@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	david.wallace@rose-hulman.edu.txt
	josh.porter@rose-hulman.edu.txt
	kieth.pembroke@rose-hulman.edu.txt
	meredith.palmer@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	pam.beesly@rose-hulman.edu.txt
	roy.anderson@rose-hulman.edu.txt
	
	
	The following files had to be repaired due to NEGATIVE grades:
	
	andy.bernard@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	bobby.newport@rose-hulman.edu.txt
	jim.halpert@rose-hulman.edu.txt
	josh.porter@rose-hulman.edu.txt
	meredith.palmer@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	roy.anderson@rose-hulman.edu.txt
	
	
	Done.
	
________________________________________________

	************************************************************************************************
	Please choose from the following options to test your file reading and averaging:
	1 - Test with files that have NO issues (small subset in onlyGoodGrades directory)
	2 - Test with files that have only ONE issue each (small subset in onlyOneIssueGrades directory)
	3 - Test with files that have MULTIPLE issues (small subset in multipleIssuesGrades directory)
	4 - Test with ALL files in allGrades directory
	
	4
	
	
	Now calculating grades
	Now writing grades to AllAveragedGrades.csv
	
	
	The following records had malformed email addresses:
	
	Adams, John, john.adamsrose-hulman.edu
	Gilmore, Happy, happy.gilmore@gmail.com
	Ludgate, April, april.ludgate@@rose-hulman.edu
	Saperstein, Jean-Ralphio, jean-ralphio.superstein@rose-hulman.edu
	Zippy, Johnny, johnny.zippy
	
	
	The following files had to be repaired due to MISSING grades:
	
	andy.bernard@rose-hulman.edu.txt
	andy.dwyer@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	dan.gore@rose-hulman.edu.txt
	david.wallace@rose-hulman.edu.txt
	happy.gilmore@gmail.com.txt
	josh.porter@rose-hulman.edu.txt
	kelly.kapoor@rose-hulman.edu.txt
	kieth.pembroke@rose-hulman.edu.txt
	meredith.palmer@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	pam.beesly@rose-hulman.edu.txt
	roy.anderson@rose-hulman.edu.txt
	
	
	The following files had to be repaired due to NEGATIVE grades:
	
	andy.bernard@rose-hulman.edu.txt
	angela.martin@rose-hulman.edu.txt
	bobby.newport@rose-hulman.edu.txt
	jim.halpert@rose-hulman.edu.txt
	josh.porter@rose-hulman.edu.txt
	leslie.knope@rose-hulman.edu.txt
	meredith.palmer@rose-hulman.edu.txt
	michael.scott@rose-hulman.edu.txt
	pete.miller@rose-hulman.edu.txt
	roy.anderson@rose-hulman.edu.txt
	stanley.hudson@rose-hulman.edu.txt
	tammy.swanson@rose-hulman.edu.txt
	
	
	Done.
	
________________________________________________

When your program finishes, depending on which option you chose your AllAveragedGrades.csv file should look like the following.  The output below is with running the program with option 4 to average for all the files, if you use the other options, your file will look different than below:

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

