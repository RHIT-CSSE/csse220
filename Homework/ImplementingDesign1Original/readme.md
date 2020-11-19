# Implementing Design 1

# Rubric

Write code to represent either your design (you should have gotten
Design Problems 1 back) or any alternative you might prefer (perhaps
based on the solution we presented in class?)

* 20 points for implementing and demonstrating functionality of the
  Online Quiz problem.  (10 points for each method successfully
  implemented and demonstrated)
* 5 points for responding completely to the questions in
  reflection_questions.txt
* 5 points for submitting a computer generate UML diagram

  We recommend using either [PlantUML](http://plantuml.com/plantuml) or [UMLet](http://www.umlet.com/)

Total possible: 30 points. 

To receive full credit you must demonstrate functionality using main
to call each required handle* case listed in the UML and problem
description.

# The problem

In an online quiz system, teachers write quizzes and students take
them. The same quiz question can appear in multiple quizzes. If a
teacher updates a quiz question, it's important that all quizzes
reflect that change.

*Additional Instructions*: each question should have both an
identification number and data. The data should be the actual question
being asked, stored as a String. i.e. "What is the capital of Egypt?"
When displaying a quiz, the id of the quiz should be shown, in
addition to the id of each question and the text data it stores. See
the sample output section below to see one way to do this.

# Sample Output

There is sample output of a working solution in
[example_output.txt](src/example_output.txt) that you can use as a
model for display. You do not have to match this exactly, but try to
make it look roughly the same.
