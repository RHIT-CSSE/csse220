# Implementing Design 1

## Overview:
- This exercise is intended to give you practice with implementing the set classes based on a UML diagram of those classes
- This is an individual exercise/assignment

## The problem:

Online quizzer: Is an online quiz application for teachers who write quizzes and students who take them.  The same quiz question can appear in multiple quizzes.  If a teacher updates a quiz question, it is important that all quizzes immediately reflect that change.

## To do:

1. In Eclipse, import this project (ImplementingDesign1) from your local copy of the CSSE220 repo
2. In the file *QuizMain.java* there are a number of TODOs. These will have you implement the classes *QuizMain.java*, *Question.java*, and *Quiz.java*
3. Implement *QuizMain.java*, *Question.java*, and *Quiz.java* based on your graded *Design Problems 1* UML or an alternative, e.g., the UML design presented in class
4. Test your implementation by running the *main* found in *QuizMain.java*. Make your output to the console window look similar to the that shown in section **Sample Output** (below)
5. Include Javadoc comments in *Question.java* and *Quiz.java* 
6. Create a computer generated UML diagram that represents your implementation
7. Answer the questions in *reflectionQuestions.txt*
8. Upload to this assignment's Moodle Dropbox your completed:
<br>(1) *.java* files, (2) your UML diagram, (3) your answers in *reflectionQuestions.txt*, and (4) any additional *.java* files that you may have created to solve this problem

*Additional Instructions*: 
- Each question should have both an *idNumber* and *data*
- The question's *data* should be stored as a Java String and contain the actual question to be asked. For example, "What is the capital of Egypt?"
- Each quiz should have an *idNumber* along with its data
- When displaying a quiz, the quiz's *idNumber* should be displayed in addition to each question's *idNumber* and *data*

## Rubric:

- To earn a 100% for the assignment you must do the following 4 tasks:

1. (60% of grade) The output from your program closely matches that shown in **Sample Output** (below).
<br>This means your implementation has to allow creation of questions and quizzes, updating of quizzes, and displaying of quizzes
2. (15% of grade) Javadoc comments for *Question.java* and *Quiz.java* - use [BankAccount.java](src/javadocExample/BankAccount.java) for guidance with the class-level Javadoc and Javadocs for methods
3. (15% of grade) A UML diagram that resembles your implementation, we recommend using [PlantUML](http://plantuml.com/plantuml) 
4. (10% of grade) Answers provided to the reflection questions found in *reflectionQuestions.txt*

## Sample Output:

Here is sample output of a working solution in [exampleOutput.txt](src/exampleOutput.txt) that you can use as a
model for your display operation. You do not have to match this exactly, but try to make it look roughly the same.
