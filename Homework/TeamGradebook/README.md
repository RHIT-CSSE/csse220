# Team Gradebook

You will do part of this exercise by yourself. You MAY do some of this
exercise with a partner.

This exercise will let you practice creating new objects and adding
member variables and methods to classes.

# Rubric


* 30 points for the INDIVIDUAL PART of your code functioning correctly
  (i.e., the current unit tests pass, plus whatever other values
  and/or tests we might care to try always returns the correct result)
* 20 points for the PAIRED PART of your code functioning correctly
* 15 points for the INDIVIDUAL PART of your code being designed as
  described. The design should be simple - if you have concerns about
  this, feel free to stop by my office and get my opinion on your
  design. Each student should be represented by an instance of the
  Student class, and each team should be represented by an instance of
  the Team class. No extra unnecessary data is stored in TeamGradebook
  beyond a list of students and a list of teams. Note that if the code
  does not function mostly correctly, you will likely lose these
  points too
* 5 points for your code being well formatted, following correct Java
  naming conventions, using good variable names, and using Javadocs

Total possible: 70 points. 

# The Individual Part (do by yourself)

 In this program, we're writing a grading application for a
 hypothetical school class. In this class, each student is a member of
 one or more named teams. The teams are given grades for the work they
 submit. A student's average is the average of all the grades given to
 each of the teams of which that student is a member.

The system will also track the number of absences each student has.

The interface for this program is entirely text based. This will give
you an idea of how the program should work. The green text is what the
user inputs, the black text is the output of the program:

<pre>
Welcome to Team gradebook.  Enter commands.  Type 'exit' to end.
<font color="009900">add-student Steve</font>
ok
<font color="009900">add-student Anne</font>
ok
<font color="009900">add-student Carlo</font>
ok
<font color="009900">add-team TeamSA Steve Anne</font>
ok
<font color="009900">add-team TeamAC Anne Carlo</font>
ok
<font color="009900">add-grade TeamSA 90</font>
ok
<font color="009900">add-grade TeamAC 80</font>
ok
<font color="009900">get-average Steve</font>
90
<font color="009900">get-average Carlo</font>
80
<font color="009900">get-average Anne</font>
85
<font color="009900">exit</font>
</pre>

The good news is that the difficulty of dealing with the text based
input and output of the program has all been done for you. All you'll
have to write is the code to update the program's grade information.

To solve this problem, you'll use 3 classes. The instances of the
Student class will keep each student's name and grades. The instances
of the Team class will keep track of each team's name and the students
in that team. The TeamGradebook class will store a list of all the
students and a list of all the Teams.

To make things work, you'll need to write code for the following
commands:

* *add-student StudentName:* creates a new student object with the given name. Note that names in this system have no spaces and are guaranteed to be unique (e.g., no 2 students have the same name). Implement this by writing the handleAddStudent method in TeamGradebook.java, plus anything you need to add to the Student class.
* *add-absence StudentName:* Adds one to absence count for the given student. Implement this by writing the handleAddAbsence method in TeamGradebook.java, plus anything you need to add to the Student class.
* *get-absences StudentName:* Returns the absence count for the given student. Implement this by writing the handleGetAbsences method in TeamGradebook.java, plus anything you need to add to the Student class.
* *add-team TeamName* Student1 Student2 Student3 ... StudentN: creates a new team object with the given name and the names of N students (a team can have 1 or more students). Implement this by writing the handleAddTeam method in TeamGradebook.java, plus anything you need to add to the Team class.
* *add-grade TeamName Grade:* stores a grade in the system for all the students on the given team. Implement this by writing the handleAddGrade method in TeamGradebook.java plus anything you need to add in the Student and Team classes.
* *get-average StudentName:* returns the student's average - the average of all the grades in which all the teams he/she participates. Note that this number should be rounded to the nearest whole number. Implement this by writing the handleGetAverage method in TeamGradebook.java plus anything you need to add in the Student and Team classes. 

Some additional details and hints are provided in the comments of the methods themselves.

Unit tests for these methods have been provided, although there's a limited amount that can be tested until get-average works. 

# The Paired Part (do with a partner if you want)

For this part, you can work with a single partner. Both you and your partner should make clear who you worked with in the comments so there's no issue of cheating. Also, although you can work together and help each other -- your code for the individual part should not be identical. As a result, you may have to write slightly different code for the Paired Part.

If you want you can also work alone for this part.

Here's what you should do:

* Implicit adds for add-team. It can be sort of annoying to have to use add-student for each student when they have to be on a team anyway. So change the behavior of add-team to, if given a student name that isn't found, just create the student.

* get-best-team: returns the team name with the overall best TEAM average. Note, this is different than the team with the members with the best average (e.g., two students might score really high when working together, but when working on other teams they do poorly). Implement this by writing the handleBestTeam method in TeamGradebook.java plus anything you need to add in the Student and Team classes. 

Example: 

<pre>

Welcome to Team gradebook.  Enter commands.  Type 'exit' to end.
<font color="009900">add-team Team1 Amy Bob</font>
ok
<font color="009900">add-team Team2 Bob Cindy</font>
ok
<font color="009900">add-grade Team1 80</font>
ok
<font color="009900">add-grade Team2 90</font>
ok
<font color="009900">get-average Cindy</font>
90
<font color="009900">get-best-team</font>
Team2

</pre>


