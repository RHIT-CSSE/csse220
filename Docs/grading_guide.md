
This document is the official grade guide for CSSE220.

# General Instructions

Unless instructed otherwise, assignments are graded in CSSE220 based on the following criteria.

* Completion - all parts are answered
* Correctness - all answers are correct
* Style/Documentation - see guidelines below

A submission meeting all criteria will receive credit. If a submission is close (e.g., passes nearly all of the unit tests), you may still receive credit, but you should review the grader's feedback to learn from your mistake(s). 

A submission not meeting these criteria (but with reasonable progress) will be marked as needing revision. You can then revise your work based on the grader's feedback. Show your revised, complete work to your instructor during drop-in hours to receive credit. 

# Style/Documentation Details

- Style/Documentation will not be assessed until
after we have discussed style in class (usually starting with HW3). 
- Style/Documentation is not graded on MBL skill assessments. 

## CSSE220 Style Rules

All submitted code should avoid these style issues: 

* Duplicate or cut and pasted code
* Naming: Poor choice of variable, method or class names
  * Classes should begin with a capital letter, fields and methods lowercase. Everything should be in camelCase (Exceptions are CONSTANTS in all capital letters)
* Method Length: A method is too long (i.e., it should have been broken up into sub-method calls)
* Statement Length: A statement is too long (i.e., an intermediate variable should have been introduced)
* Improper Code Indentation: using the auto-format feature (Eclipse's `Control+Shift+F`, or IntelliJ's `Control+Shift+Alt+L`) causes any significant change to the file. 

## Documentation

You only need document classes and methods that *you* have written. In classes where we have provided 50% of the code or more, you can leave our documentation.

All submitted code should avoid the following documentation issues:

* Missing Class Documentation: Class does not have a reasonable
  description header. At the beginning of each class, you must include
  a Javadoc comment which includes:

  - Required: A description of the class, which includes its main purpose/function
  - Optional: (but good practice!) How to instantiate and use the class
  - Optional: One or more examples of how the class is used

* Undocumented (or poorly documented) methods whose name and parameter
  names do not make it clear what the method accomplishes.

  Such comments should rarely be necessary, since method and parameter
  names should generally be chosen to make the method
  self-documenting.
    
* Hard-to-read Undocumented Code: Chunks of code which are especially
  long and/or obtuse, yet lack an appropriate in-line comment. (Such
  comments should rarely be necessary, but such code shouldn’t be
  submitted.)

## Examples

Remember: EVERY class must be documented! Above each class, you should include a (Javadoc) comment that has:

* Required: A description of the class, which includes its main purpose/function
* Optional: How to instantiate and use the class

### Example of Good Documentation

Here is an example that shows a simple class with “good” style and documentation. This represents complete documentation which will clearly receive full credit on any assignment when style/documentation is part of the grading rubric for the assignment (meaning you wrote 50% or more of the file):
```
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

  // This method returns the value passed in doubled
  public int doubleThatValue(int incomingVariable) {
    return incomingVariable * 2;
  }
  
}//end class GoodExample
``` 
### Example of Acceptable Documentation

Here is an example that shows a simple class with “acceptable” style and documentation. This represents the minimum documentation to receive full credit on any assignment when style/documentation is part of the grading rubric for the assignment (meaning you wrote 50% or more of the file):
```
/**
*	Class: GoodExample
*	@author	John Doe
*	Purpose: This class demonstrates the proper coding style and 
*		     contains a method to double any integer value
*/
public class GoodExample {

  public int doubleThatValue(int incomingVariable) {
    return incomingVariable * 2;
  }
}
```

### Example of Bad/Good Names

Take a look at the code below and try to determine what is happening.

```
public int a(int b, int c) {
  return (b < c) ? c : b;
}
```

This code is not readable. Now consider the same method with better coding conventions:
```
public int max(int num1, int num2) {
  int maxValue = num1;
  if(maxValue < num2) {
    maxValue = num2;
  }
  return maxValue;
}
```

### Example of Method Length

For the size of methods, this can be tricky sometimes. Researching this topic on Google, you will find MANY opinions regarding the length of a method. Some say a method should NEVER be more than 15 to 20 lines of code. Others say that methods can manageably grow to 100 to 200 lines of code. For our purposes, methods should be kept short. The optimal size of a method allows the full method to be displayed on the computer screen WITHOUT having to scroll to see the whole method. This usually results in approximately 20 lines of code, but can be a little larger. Just remember two things: (1) One method, one task; (2) If you have to scroll to see the whole method, the method should be split.

Also, remember that a method should complete only one task. If you are attempting to do too much in one method, it can quickly grow to an unmanageable mess. In assuring that each method only completes one task, you also assure that the method size remains manageable.

For example, consider the following method to return a letter grade given an array of double values:
```
public static char getLetterGrade(double[] grades) {
  double total = 0;
  for (double grade : grades) {
    total += grade;
  }
  double avg = total/grades.length;
  char gradeToReturn;
  if (avg >= 90.0) {
    gradeToReturn = 'A';
  } else if (avg >= 80.0) {
    gradeToReturn = 'B';
  } else {
    gradeToReturn = 'F';
  } 
  return gradeToReturn;
}
```

Even though this method is still quite small, it is apparent that more than this method contains more than just one task. The following better represents the proper coding style when splitting methods:
```
private static double getAvg(double[] grades) {
  double total = 0;
  for (double grade : grades) {
    total += grade;
  }
  return total/grades.length;
}

public static char getLetterGrade(double[] grades) {
  double avg = getAvg(grades);
  char gradeToReturn;
  if (avg >= 90.0 ) {
    gradeToReturn = 'A';
  } else if (avg >= 80.0) {
    gradeToReturn = 'B';
  } else {
    gradeToReturn = 'F';
  }
  return gradeToReturn;
}
```

