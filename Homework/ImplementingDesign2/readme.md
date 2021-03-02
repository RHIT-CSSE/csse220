# Implementing Design 2

## Overview:
- This exercise is intended to give you practice with implementing a set classes based on a UML diagram of those classes
- This is an individual exercise/assignment

## The Problem
Online quizzer: Is an online quiz application for teachers who write quizzes and students who take them. The same quiz question can appear in multiple quizzes. If a teacher updates a quiz question, it is important that all quizzes immediately reflect that change.

For this exercise, all questions are true/false questions, which have a prompt and a correct answer (*true* or *false*). 

There are also automated quiz-testers which have a unique id and can attempt to answer questions. To do this the quiz-tester always checks the question's prompt for a particular target string and answers *true* if the target string appears in the prompt, otherwise the quiz-tester answers *false*. This target string is customized for each quiz-tester. 

It should be possible to determine the score that a quiz-tester earns on any given quiz. It also should be possible to determine an overall average quiz score, which must be calculated by treating each quiz score (NOT each question) equally and finding the average over all quizzes in the system.

*For Example*: A quiz-tester with a target string of "cow" gets the question prompt "Are all cows blue?" The quiz-tester returns *true* because it finds "cow" in the question's prompt "Are all cows blue?". But *false* is the answer stored with this question's prompt, so the quiz-tester's answer of *true* is incorrect and therefore the quiz-tester gets this question wrong.

*For Example*: A quiz-tester earns a score of 1/4 (25%), 2/10 (20%) and 3/10 (30%) on the three quizzes in the system. The quiz-tester's overall average on all quizzes  would be:
<br>(0.25 + 0.2 + 0.3) / 3 = 25%

## To Do:

1. In Eclipse, import this project (ImplementingDesign2) from your local copy of the CSSE220 repo
2. Create a computer generated UML design diagram that captures how you propose to solve this problem, call it *firstDraftUML.png*
<br>The following 2 files will help you get started: [exampleUML.png](src/uml/exampleUML.png) and [exampleUML.txt](src/uml/exampleUML.txt)
3. In the file *QuizSimulatorMain.java* there are a number of TODOs many associated with unimplemented *handle* operations
<br>These TODOs will have you modify *QuizSimulatorMain.java* and implement the classes *QuizTest.java*, *Question.java*, and *Quiz.java*
4. Run *QuizSimulatorMain.java* to test by hand and execute the JUnit tests in *SimulatorTest.java* for more a thorough testing of your implementation
5. Include Javadoc comments in *QuizTest.java*, *Question.java*, and *Quiz.java* 
6. Create a computer generated UML diagram that corresponds to your final implementation, call it *finalUML.png*
7. Answer the questions in *reflectionQuestions.txt*
8. Upload to this assignment's Moodle Dropbox your completed:
<br>(1) *.java* files, (2) your 2 UML diagrams, (3) your answers in *reflectionQuestions.txt*, and (4) any additional *.java* files that you may have created to solve this problem

## Rubric
A Pass for this assignment requires each of the following:

1. The output from your program while running *QuizSimulatorMain.java* must closely match that shown in **Sample Output** (below).
2. Pass the JUnit tests in *SimulatorTest.java*
2. Javadoc comments for *QuizTest.java*, *Question.java*, and *Quiz.java* - use [BankAccount.java](src/javadocExample/BankAccount.java) for guidance with the class-level Javadoc and Javadocs for methods
3. UML diagrams *firstDraftUML.png* and *finalUML.png*, we recommend using [PlantUML](http://plantuml.com/plantuml) 
4. Answers provided to the reflection questions



## Sample Output
Here is sample output of a working solution in [exampleOutput.txt](exampleOutput.txt) that you can use as a
model for your display operation. You do not have to match this exactly, but try to make it look roughly the same.

