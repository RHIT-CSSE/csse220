# HWLinearLightsOut

## Overview:
- This exercise will provide more practice with event based programming in Java Swing
- There is an individual part and a paired part (details are below)

## Rubric:
To earn a 100% for the assignment you must do the following 3 tasks:

1. (30% of grade) *Part 1 - Ball/Strike Counter* you must add the ball and strike buttons and handle clicks on the buttons correctly (see details below)
2. (60% of grade) *Part 2 - Linear Lights Out* you must allow the user to choose the number of buttons to be displayed and correctly handle clicks on all of the app's buttons (see details below)
3. (10% of grade) Javadoc comments are required for all your *.java* files
<br> -- See the *Documentation Requirements* section below


## Documentation Requirements

- Provide Javadoc comments in your *.java* files
<br> -- Use the provided *BankAccount.java* for guidance with the class-level Javadoc and Javadocs for methods
- Use standard Java comments that need to appear in the code body of a method, e.g., to explain non-obvious computations
- Give self-documenting variable and method name
<br>Use name completion in Eclipse, i.e., type Ctrl-Space, to keep typing cost low and readability high
- Delete all of the TODO comments as you complete each TODO
- Use Ctrl-Shift-F in Eclipse to format your code

## To Do:

1. In Eclipse, import this project (HWLinearLightsOut) from your local copy of the CSSE220 repo
2. Implement *Part 1 - Ball/Strike Counter*
3. Implement *Part 2 - Linear Lights Out*
3. Include Javadoc comments in for all your classes - see Documentation Requirements section (above)
4. Each student uploads her or his completed *.java* files to the LinearLightsOut Moodle Dropbox

## Part 1 - Individual Part: Ball/Strike Counter

*Overview*

- This part is to be done individually
- Implement the code in the *ballStrikeCounter* package. In this starter project you have been give simple GUI framework for a program 
that tracks balls and strikes for a baseball game. You need to add the buttons, ActionListeners, and variables necessary to make the code function correctly.
You may add any new classes or make any changes you feel necessary. The method for properly displaying the label in the app has been provided 
for you in the *updateLabel* method

*Part 1 To Do*:
1. Make the Ball and Add Strike buttons appear in the app's window as shown in the screenshot below
2. The buttons must work as follows: 
<br> -- The *Add Ball* button, when clicked adds a 1 to the Balls count label. If the count in the Balls count label ever reaches 4, then
both the Balls count and Strikes count labels must be reset to 0
<br> -- The *Add Strike* button, when clicked adds 1 to the Strikes count label. If the count in the Strikes count label ever reaches 3, then
both the Balls count and Strikes count labels must be reset to 0
<br> -- The labels should be updated to reflect the new ball/strike counts every time a button is clicked

 ![ball-strike](images/ballstrike.png)


## Part 2 - Pair Part: Linear Lights Out
*Working Together*

- You may work with a single classmate of your choosing on this part
- You may sit together while you work and discuss ideas and code freely, but each person must type and upload their 
own files to the Moodle assignment's dropbox
- We highly recommend that you seek out a partner to collaborate on this part of the assignment
<br> -- Why? Because you will be working on a multi-week project with at least 1 partner toward the end of this quarter. Now is a good time to find someone you can work with
- If you do work together, each partner must identify the other in a comment at the top of your program  

*Overview*
1. Implement the app Linear Lights Out in the *linearLightsOut* package 
2. The app presents the user with an array of buttons that are randomly initialized to either Xs or Os, using a 50% probability
3. Clicking on a button changes the symbol of the clicked-on button and *both its left and right neighbors*, if those neighbors exist
<br>For example, a click on a button with the label X, changes it to an O, and changes the left and right neighbors' symbols similarly
4. Buttons on the end just change their own symbol and their one neighbor's symbol; the end buttons do not "wrap around"
5. The object of the game is to reach a state where all the buttons show the same symbol, either all Xs or all Os, it doesn't matter
6. When that happens the user *wins* and the game is over


- This starter package is providing less *scaffolding* for getting you started
- But everything you need to solve the problem has either appeared in previous homework or examples, or is in the Java API
documentation for *JButton*
- Remember to ask for help if you get stuck.  

Here's a screenshot of the game in progress:
<br>
![LinearLightsOut app](images/LinearLightsOut.png)


Here's a screenshot of a game that was won with all Xs:
<br>
![game won](images/LinearLightsOutWonGame.png)


*Part 2 To Do*:
- *Stage 0:* Examine the main method in the LinearMain class in the linearLightsOut package in the LinearLightsOut 
project that you checked out in class
<br> -- This is all the code that we supply for the project: the rest is your responsibility
- *Stage 1:* Display a frame with the right title
- *Stage 2:* Display the right number of buttons in the frame (see the nButtons variable in *LinearMain.main*) 
without worrying about event handling or the symbols on the buttons. 
<br> -- For full credit, your final solution must work with any *nButtons* greater than 2.
- *Stage 3:* Make sure the buttons are initialized to random symbols (Xs and Os, 50% probability each)
- *Stage 4:* Implement a working Quit button (This involves implementing an event handler for the Quit button)
- *Stage 5:* Implement a working New Game button. When the button it pressed, the game should reset the symbol 
buttons to a new set of random symbols
- *Stage 6:* Set up event handlers for the symbol buttons that correctly toggle the symbols as described above
- *Stage 7:* Check for a win and notify the player in some way through the GUI (not simply by System.out.println)
Changing the window title would suffice
<br> -- If you do that, be sure to change it back when the player clicks *New Game*.

## Notes:
1. *JButton*'s *setText()* and *getText()* methods are your friends, use them
2. You do not need to use inheritance to solve this problem
3. You may, however, use inheritance in this project if you wish: extending JFrame, JButton, and/or JPanel, for example
4. Correct ALL compiler warnings - those warnings are telling you that something is incorrect about your code






