
This document is the official grade guide for CSSE220.

# General Instructions

Unless instructed otherwise, programs are graded in 220 based on the
following criteria.

* Correctness
* Style/Documentation

For any points deducted, a note should be placed in your Moodle
feedback explaining why.  If you do not see feedback and you lost
points, contact your grader.

# Correctness

For each item marked (per the grading instructions specific to the assignment):
|             |                                        |
|-------------|----------------------------------------|
| Full credit | Behaves as specifies                    |
| 80%         | One “very small” error                 |
| 40 or 50%   | One “small to medium-sized” error      |
| 0%          | A “large” error or more than one error |


# Style/Documentation

If an assignment does not specify points for style/documentation, you
should assume up to 5 points can be taken off for style/documentation.

Note that points will not be taken off for Style/Documentation until
we have discussed style in class.  Usually the first style graded
assignment is Team Gradebook.

Style/Documentation is not graded on exams.

## 220 Style Rules

Remove 1 or 2 points for a violation of EACH of the following (up to the maximum allotted points for style):

* No duplicate or cut and pasted code
* Naming: Variable, method or class names are chosen poorly.
* Violation of Java Naming Convetions Classes should begin with a capital letter, fields and methods lowercase. Everything should be in camelCase
* Method Length: A method is too long (i.e., it should have been broken up into sub-method calls).
* Statement Length: A statement is too long (i.e., an intermediate variable should have been introduced).
* Improper Code Indentation: Control-Shift-F on the file causes any significant change.

## Documentation

You only need document classes and methods that *you* have written.  Classes where we have provided 50% of the code or more you can leave our documentation.

Remove points for a violation of EACH of the following (up to the maximum allotted points for documentation):

* Missing Class Documentation: Class does not have a reasonable
  description header. At the beginning of each class, you must include
  a Javadoc comment which includes:

  - A description of the class, which includes its main purpose/function
  - How to instantiate and use the class
  - One or more examples of how the class is used

* Undocumented (or poorly documented) methods whose name and parameter
  names do not make it clear what the method accomplishes.

  Such comments should rarely be necessary, since method and parameter
  names should generally be chosen to make the method
  self-documenting.
    
* Hard-to-read Undocumented Code: Chunks of code which are especially
  long and/or obtuse, yet lack an appropriate in-line comment. (Such
  comments should rarely be necessary, but such code shouldn’t be
  submitted.)

# Examples

## Example of Documentation

Remember: EVERY class must be documented! Above each class, you should include a (Javadoc) comment that has:

* A description of the class, which includes its main purpose/function
* How to instantiate and use the class

Here is an example that shows a simple class with “good” style and documentation. This represents the minimum documentation to receive full credit on any assignment when style/documentation is part of    the grading rubric for the assignment:

    /**
    *	Class: GoodExample
    *	@author	John Doe
    *	Purpose: This class demonstrates the proper coding style.
    *		 It contains a method to double any integer value
    *
    *	Use:
    *		GoodExample firstExample = new GoodExample();
    *		int doubledValue = firstExample.doubleThatValue(5); //doubledValue should be 10
    */
    public class GoodExample {
    
    	// This class returns the value passed in doubled
    	public int doubleThatValue(int incomingVariable) {
    		return incomingVariable * 2;
    	}
    	
    }//end class GoodExample
    
## Example of Good Names

    public int a(int b, int c) {
    	return (b < c) ? c : b;
    }

This code is not readable. Now consider the same method with better coding conventions:

    public int max(int num1, int num2) {
    	int maxValue = num1;
    	if(maxValue < num2) {
    		maxValue = num2;
    	}
    	
    	return maxValue;
    }

## Example of Method Length

For the size of methods, this can be tricky sometimes. Researching this topic on Google, you will find MANY opinions regarding the length of a method. Some say a method should NEVER be more than 15 to 20 lines of code. Others say that methods can manageably grow to 100 to 200 lines of code. For our purposes, methods should be kept short. The optimal size of a method allows the full method to be displayed on the computer screen WITHOUT having to scroll to see the whole method. This usually results in approximately 20 lines of code, but can be a little larger. Just remember two things: (1) One method, one task; (2) If you have to scroll to see the whole method, the method should be split.

Also, remember that a method should complete only one task. If you are attempting to do too much in one method, it can quickly grow to an unmanageable mess. In assuring that each method only completes one task, you also assure that the method size remains manageable.

For example, consider the following method to return a letter grade given an array of double values:

    public static char getLetterGrade(double[] grades) {
    	double total = 0;
    	for(double grade : grades) {
    		total += grade;
    	}
    	double avg = total/grades.length;
    	
    	char gradeToReturn;
    	if(avg >= 90.0)
    		gradeToReturn = 'A';
    	else if(avg >= 80.0)
    		gradeToReturn = 'B';
    	else
    		gradeToReturn = 'F';
    	
    	return gradeToReturn;
    }

Even though this method is still quite small, it is apparent that more than this method contains more than just one task. The following better represents the proper coding style when splitting methods:


    private static double getAvg(double[] grades) {
    	double total = 0;
    	for(double grade : grades) {
    		total += grade;
    	}
    	return total/grades.length;
    }
    
    public static char getLetterGrade(double[] grades) {
    	double avg = getAvg(grades);
    	
    	char gradeToReturn;
    	if(avg >= 90.0)
    		gradeToReturn = 'A';
    	else if(avg >= 80.0)
    		gradeToReturn = 'B';
    	else
    		gradeToReturn = 'F';
    	
    	return gradeToReturn;
    }


