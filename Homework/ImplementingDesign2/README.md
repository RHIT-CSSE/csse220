# ImplementingDesign2 -- Team Gradebook

## Overview:
- This exercise is intended to give you practice with implementing a set classes based on a UML diagram of those classes
- Team Gradebook will also provide practice creating new objects and adding fields and methods to various classes
- Team Gradebook has two required parts an *Individual Part* and a *Paired Part*
- You may chose to do the *Paired Part* with one partner
<br>If you work with a partner on the *Paired Part*, then add a comment with your partner's name at the top the files you submit

## Rubrics:

- To earn a 100% for the assignment you must do the following 3 tasks:
1. (60% of grade) *Individual Part*
2. (30% of grade) *Paired Part*
3. (10% of grade) *Commenting & Conventions*

### 1) Individual Part Rubric
To earn a 100% for this part, all JUnit tests for the *Individual Part* operations must succeed 
- Your score for the *Individual Part* of the assignment = (PercentageJUnitTestsPassed * IndividualPartTotalPoints)

### 2) Paired Part Rubric
To earn a 100% for this part, all JUnit tests for the *Paired Part* operations must succeed 
- Your score for the *Paired Part* of the assignment = (PercentageJUnitTestsPassed * PairedPartTotalPoints)

### 3) Commenting & Conventions Rubric
To earn 100% for *Commenting & Conventions*, you must do the following:
- The code in each file must being well formatted - Use Eclipse's *Format* command on the *Source* menu
- Use conventional Java variable naming conventions and also provide meaningful variable names
- Add Javadoc *class-level* comments for each at class: Student, Team, and TeamGradebook


## To do:

1. In Eclipse, import this project (ImplementingDesign2) into Eclipse from your local copy of the CSSE220 repo
2. Modify the classes TeamGradebook, Team, and Student so that they implement the required functionality
3. Run the included JUnit tests to ensure your solution passes all the unit tests - do this by running *RunAllIndividualTests.java* and *RunAllPairedTests.java*
4. Each student uploads her or his completed *.java* files to this assignment's Moodle Dropbox
<br>Upload *Student.java*, *Team.java*, and *TeamGradebook.java*


## Notes
### The Individual Part (required to be done individually)

 In this program, you are implementing a grading application for a
 hypothetical school's class. In this class, each student is a member of
 one or more teams - each team has a unique name. The teams are assigned grades for the work they
 submit. A student's average is the average of all the grades earned by 
 each of the teams to which that student is a member.

The app will also track each student's absences

To run this app, right click on the file *TeamGradebook.java* and choose *Run As* | *Java Application*

The interface for this program is entirely text based and the example input/output (below) will give
you an idea of how the program will work. The green text is what the
user inputs, the black text is the output of the program:

<pre>

Welcome to Team Gradebook.  Enter commands.  Type 'exit' to end.
<font color="009900">add-student Rei</font>
ok
<font color="009900">add-student Sofia</font>
ok
<font color="009900">add-student Carlo</font>
ok
<font color="009900">add-team TeamSA Rei Sofia</font>
ok
<font color="009900">add-team TeamAC Sofia Carlo</font>
ok
<font color="009900">add-grade TeamSA 90</font>
ok
<font color="009900">add-grade TeamAC 80</font>
ok
<font color="009900">get-student-grades Rei</font>
Rei 90
<font color="009900">get-student-grades Sofia</font>
Sofia 90 80
<font color="009900">get-average Rei</font>
90
<font color="009900">get-average Carlo</font>
80
<font color="009900">get-average Sofia</font>
85
<font color="009900">exit</font>
</pre>

The good news is that the difficulty of dealing with the text based
input and output of the program has all been done for you. All you'll
have to write is the code to update the program's student, team, grade, and absences information.

To solve this problem, you will modify 3 classes. 
1. The an object instances of the Student class will keep a student's name, grades, and absences
2. The an object instances of the Team class will keep track of a team's name, students members of the team, and grades assigned to that team
3. The TeamGradebook class will store a list of all the student objects and a list of all the team objects.

To make things work, you'll need to write code for the following commands:

- *add-student StudentName:* creates a new student object with the given name
<br>Note that names in this system have no spaces and are guaranteed to be unique (e.g., no 2 students have the same name). Implement this by writing the handleAddStudent method in TeamGradebook.java, plus anything you need to add to the Student class.

- *add-absence StudentName:* Adds one to absence count for the named student
<br>Implement this by writing the handleAddAbsence method in TeamGradebook.java, plus anything you need to add to the Student class.

- *get-absences StudentName:* Returns the absence count for the named student
<br>Implement this by writing the handleGetAbsences method in TeamGradebook.java, plus anything you need to add to the Student class.

- *get-student-grades StudentName:* Returns a String of the student name and all grades the student received
<br>Implement this by writing the handleGetStudentGrades method in TeamGradebook.java, plus anything you need to add to the Student class.

- *add-team TeamName* Student1 Student2 Student3 ... StudentN: creates a new team object with the given name and the names of N students (a team can have 1 or more students)
<br>Implement this by writing the handleAddTeam method in TeamGradebook.java, plus anything you need to add to the Team class.

- *add-grade TeamName Grade:* stores a grade in the system for all the students on the named team
<br>Implement this by writing the handleAddGrade method in TeamGradebook.java plus anything you need to add in the Student and Team classes.

- *get-average StudentName:* returns the named student's average - the average of all the grades in which all the teams he/she participates
<br> Note that this number should be rounded to the nearest whole number. Implement this by writing the handleGetAverage method in TeamGradebook.java plus anything you need to add in the Student and Team classes. 

Some additional details and hints are provided in the comments of the methods themselves.

Unit tests for these methods have been provided, although there's a limited amount that can be tested until get-average works. 

# The Paired Part (optionally do with a partner)

For this part, you may work with a single partner. Both you and your partner should make clear who you worked with in the comments so there is no issue of plagiarism. Also, although you can work together and help each other -- your code for the individual part should not be identical. As a result, you may have to write slightly different code for the Paired Part.

We highly recommend that you seek out a partner to collaborate on part. <br>Why? Because you will be working on a multi-week project with at least 1 partner toward the end of this quarter. Now is a good time to find someone you can work with.


Here's what you should do:

* Implicit adds for add-team. It can be sort of annoying to have to use add-student for each student when they have to be on a team anyway. So change the behavior of add-team to, if given a student name that isn't found, just create the student.

* get-best-team: returns the team name with the overall best TEAM average. Note, this is different than the team with the members with the best average (e.g., two students might score really high when working together, but when working on other teams they do poorly). Implement this by writing the handleBestTeam method in TeamGradebook.java plus anything you need to add in the Student and Team classes. 

Example: 

<pre>

Welcome to Team gradebook.  Enter commands.  Type 'exit' to end.
<font color="009900">add-team Team1 Bella Jack</font>
ok
<font color="009900">add-team Team2 Jack Isabel</font>
ok
<font color="009900">add-grade Team1 80</font>
ok
<font color="009900">add-grade Team2 90</font>
ok
<font color="009900">get-average Isabel</font>
90
<font color="009900">get-best-team</font>
Team2

</pre>


