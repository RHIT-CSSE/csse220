# HWRecursion

## Overview:
- This exercise is intended to give you practice writing recursive operations
- There are two parts:
- *recursionPart1* contains 9 unimplemented recursive operations, simply implement each of these operations using recursion
- *recursionPart2* contains 3 unimplemented recursive operations which require you to implement a recursive helper operation
- This is an individual exercise/assignment

## Rubric:

- All JUnit tests for each operation must succeed in order to earn a 100% for the assignment
- Your score for this assignment = (PercentageJUnitTestsPassed * RecursionHWTotalPoints)
- For example:
  - if PercentageJUnitTestsPassed = 80%
  - and if RecursionHWTotalPoints = 25
  - then Your Score = (.80 * 25) = 20 points

## To do:

1. In Eclipse, import this project (HWRecursion) from your local copy of the CSSE220 repo
2. Implement the 12 operations in *Part1Problems.java*
3. Run the included *RunAllTestsPart1.java* to ensure your solution passes all the unit tests
3. Implement the 3 operations in *Part2Problems.java* 
3. Run the included *RunAllTestsPart2.java* to ensure your solution passes all the unit tests
4. Upload your completed *Part1Problems.java* and *PartsProblems.java* files to the RecursionHomework Moodle Dropbox


- There are no documenting/commenting requirements for this assignment

## Notes:
- In both files, the specification of what to do for each of the operations appears as a comment just above the operation
- For *Part1* simply implement each of the unimplemented operations using recursion
- For *Part2* create and implement a recursive helper operation for each of the 3 the unimplemented operations; call corresponding helper from the the unimplemented operation
- In *Part2*, since the 3 provided operations are the ones that a client would call in order to get the work done, declare each of the helper operations as `private` so a client cannot call the helpers directly - this is a good software engineering practice
