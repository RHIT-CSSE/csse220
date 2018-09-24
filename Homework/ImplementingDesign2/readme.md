# Implementing Design 2

# Rubric


* 10 points for submitting UML diagram FIRST DRAFT
  * COMPLETE BEFORE CODING
  * Save this as first_draft.png (or whichever format you choose)
  * For your benefit, there is a starting example_uml.png and plantuml.txt source located in /src/uml of the ImplementingDesign2 Eclipse package which correspond to the QuizSimulatorMain class found in /src of the package
* 10 points for submitting a computer-generated UML diagram FINAL DRAFT which corresponds to your code
  * Save this as final_draft.png (or whichever format you choose)
  * We recommend using either [PlantUML](http://plantuml.com/plantuml) or [UMLet](http://www.umlet.com/)
* 36 points for implementing and demonstrating functionality of the Extended Online Quiz problem (approximately 4 points for each handle* method successfully implemented)
* 4 points for responding completely to the questions in [reflection_questions.txt](src/reflection_questions.txt)

Total possible: 60 points. 

To receive full credit, you must pass all unit tests and your simulator should be able to handle all valid inputs

# The problem

In an online quiz system, teachers write quizzes and students take them. The same quiz question can appear in multiple quizzes. If a teacher updates a quiz question, it's important that all quizzes reflect that change. Questions are true or false questions, which have a prompt and a correct answer (true or false). There are also automated quiz-testers which have a unique id and can attempt to answer questions. To do this they always check the prompt of a question for a particular string and answer true if they find it, or false if they do not. This string is customized for each quiz-tester. It should be possible to get the score a quiz-tester receives on any given quiz. It also should be possible to get an overall average quiz score, which should be calculated by treating each quiz score (NOT question!) equally and finding the average of all quizzes in the system.

*Example*: A quiz-tester with a search string of "cow" gets the question prompt "Are all cows blue?" The quiz-tester returns true because it finds "cow" in the string "Are all cows blue?". The answer for this question is false, so the quiz-tester would get this question wrong.

*Example*: A quiz-tester gets 1/4 (25%), 2/10(20%) and 3/10(30%) on the three quizzes in the system. Its overall average quiz score would be: (0.25+0.2+0.3)/3 = 25%

# Sample Output

There is sample output of a working solution in
[example_output.txt](src/example_output.txt) that you can use as a
model for display. You do not have to match this exactly, but try to
make it look roughly the same.
