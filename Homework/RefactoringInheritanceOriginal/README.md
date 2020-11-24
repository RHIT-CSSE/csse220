# RefactoringInheritance: Redesign, Refactor, Inherit and Extend!

In this assignment you are given some code that is poorly designed. You are expected to:

1. Design (Part 1) Come up with an improved design that uses inheritance to reduce code duplication.
2. Refactor (Part 2) Implement the new design by refactoring code
3. Extend (Part 3 + 4) Add on additional functionality using inherited functionality from the recently improved classes/design.

Much of this code is relevant to your final project and should be a good preparation 
for both Exam2 and getting your project started. 

Starting UML for the classes we want to focus our attention on:

# Starting Point
![UML Image](http://www.plantuml.com/plantuml/png/nP0nRiCm34LtdaAZUmfdRAO6RO4c8qlzs49foQ0a5q7WkrSEKcJlqeNa-yF70tUvi9KwAObopkxGA8Z2NKaG2-nutoSozg5cagJ9Q84Ujt6YAIrucm5FtlZx9NPkS4zKPyy5dVDXQfGMcFASFq8PEvVA26lfPwfHy61QxnBlF1oKBx3_i90HyhK_DuS1_X6lzFiXM4xnIdtV_wa_v6Umbl7IRVS-dY45_WQlaAtZHYlj47sTz0S0)

[source plantuml](http://www.plantuml.com/plantuml/uml/nP0nRiCm34LtdaAZUmfdRAO6RO4c8qlzs49foQ0a5q7WkrSEKcJlqeNa-yF70tUvi9KwAObopkxGA8Z2NKaG2-nutoSozg5cagJ9Q84Ujt6YAIrucm5FtlZx9NPkS4zKPyy5dVDXQfGMcFASFq8PEvVA26lfPwfHy61QxnBlF1oKBx3_i90HyhK_DuS1_X6lzFiXM4xnIdtV_wa_v6Umbl7IRVS-dY45_WQlaAtZHYlj47sTz0S0)


The above UML shows you some of the classes in the system you are given.  Here's a breakdown of each:

## Classes to study in Part 1
* Particle - This FUNCTIONING class represents a simple object (Black Circle) which bounces off of walls and other particles 
* TagPlayer - This FUNCTIONING class represents a player (Gray Circle) of "the game of " where only one player at a time is "it" (RED).
* Person - This is a class that is supposed to allow us to simulate a viral infection and recovery cycle. (Circles with different colors)

## Other classes needed to run (and modify)
There are some other files provided as well, which allow the system to function.

* SimulationViewer - The class with the main method which creates the JFrame and starts everything including setting up GUI pieces.
* SimulationComponent - This is a specialized JComponent which allows us to see simulations of various things as they move around and bump into each other.
* PandemicStatsComponent - *DO NOT MODIFY* This is a provided class which will connect with the Person class to display statistics.

To complete this assignment you will need to:

Part 1: (no deliverable) Understand and Re-design Particle and TagPlayer

Part 2: (~20 points) Refactor code for Particle and TagPlayer and create a super class

Part 3: (~15 points) Create and complete the ChargedParticle class and modify SimulationViewer and SimulationComponent

Part 4: (~25 points) Complete the Person class and modify SimulationViewer and SimulationComponent

Run the code and ensure you see the functionality in the video below and then go ahead and get started.


# Part 0: Watch this video to get started!
[Video Demonstration of Starting Code](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=0810a711-210d-4733-be1f-aba6002d0401)

Since this video was created there, have been some additional comments provided to help highlight code unique to the TagPlayer and Particle classes.
Also, some variables now have more descriptive variables names to increase clarity.


# Part 1: Redesign (Inheritance)
After running the simulation and understanding what is happening a bit, take a 
look at the code in Particle and TagPlayer. There is an *embarrassing* amount
of code duplication in these files. Is there a way we could use inheritance here?
Make a quick sketch of how you could do this (not required for turning in).

##### Hint #1: What sections of code are IDENTICAL (there are lots of comment to help point this out)? 
###### To view Particle and TagPlayer at the same time, open both files. Then you can grab the editor tab for an open file and drag it around the editor area. When you do this guidelines will appear as you drag it to an adjacent side- these show where you can drop it to get multiple editors beside each other.

##### Hint #2: Plan to make a class called SimulationObject or a name you think is appropriate and make a list of methods/re-usable code to put into it.

##### Hint #3: If needed, you can look at the UML at the bottom of these instructions to see where we are headed eventually.


# Part 2: Redesign (Particle and TagPlayer)
Let's refactor these two classes with our new design so that we won't have so many redundant 
lines of code. Create your new super class and be sure to move as much of the duplicate code from
the two classes into your super class instead. You may or may not want to make your new class abstract, 
you can decide what all is placed in it and whether it should/needs to be abstract or not.
Be VERY careful when looking at the code and make sure to see where there are differences
between the classes. MOST of the code should now be in your super class. 
After refactoring, everything should still work as it started (test it by running it again).
To easily reset your classes in Eclipse (in case you delete something on accident)
you can Right Click->Replace With->HEAD Revision
(Just be sure to make a backup copy if you want to keep your changes!)


### *BE SURE NOT TO SHADOW VARIABLES* - This means that subclasses (Particle, TagPlayer) should NOT duplicate variable names from parent classes (SimulationObject)!


##### Hint #1: The Particle class might be VERY TINY when you are done! Refactor this class first and then test to make sure it works!

##### Hint #2: There is code for TagPlayer that is different from Particle, so it should NOT be put into the super class. It belongs only in TagPlayer.

##### Hint #3: To read and change the variables of a superclass (i.e. color) you can create getter/setter methods (i.e. setColor() ) to access the instance variables.

##### Hint #4: Don't forget to call super.methodName() to re-use an existing method (methodName) from a subclass, including when overriding the method itself!

Watch this video to see a nice trick to generating getters and setters:
[Generating setters and getters in Eclipse](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=91e09e7d-6f73-4298-b801-aba6002b99fb)


# Part 3: Extending the Particle class
Now we want to add a new class which is a specialized version 
of the Particle class. We call this class ChargedParticle and it
is the same as Particle except that in addition:

### It's center/core has a random color. 
  * Sample code to easily create a new random color:
```
    Random r = new Random();
    Color c = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
```
### It has two rings with other separately randomized colors
  * Each ring is centered as normal, but fits in a rectangle width=radius, height=radius x 4 or width=radius x 4, height=radius
### Each time it bounces into another Particle (Particle or ChargedParticle) it randomizes its colors
  * See the video below in the hint sections to see it running as it desired.
 
### To add ChargedParticles to your simulation you will need to provide similar code several places:
  * SimulationViewer.java - look for "TODO Part 3"
  * SimulationComponent.java - look for "TODO Part 3"
 
##### Hint #1: You can add ChargedParticles into an ArrayList of Particles that already exists if (as it should) ChargedParticle extends Particle!
 
##### Hint #2: Don't forget to call super.methodName() to re-use an existing method!

##### Hint #3: My solution for ChargedParticles has less than 50 lines of code. (can be even less!)

##### Hint #4: [Final Functionality Demo](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=c6958003-1803-436a-bc65-aba6002fdeb3)


# Part 4: Pandemic Simulation
Now that you have seen how to use the refactored code and easily built on the Particle class,
let's try to re-use the super class we created earlier (SimulationObject) to build another class.
The class Person has been started for you and when completed will actually allow
you to simulate a viral infection spread in a population. Person will need significant modifications.

## Person
This class represents a Person who can either be healthy (green), infected (orange), or recovered (pink).
In each case it is simply drawn as a solid circle of the given color. It should move around just like
the Particle and TagPlayer moved in the starting code. When a healthy Person is touched by an infected 
Person, the healthy Person becomes infected. Once a Person becomes infected, they will remain infected 
for a certain length of time (TIME_TO_RECOVER) before they become recovered. 
Once recovered, the Person cannot be infected again.

Tracking status: there are a number of ways to track the status of a Person, but make sure
that when asked a Person will always report the correct information about being Healthy, Infected, or Recovered.
Each Person can ONLY be in ONE of those three conditions (healthy/infected/recovered).

Once you have completed the class, you will need to add a button and code just like in step #3 (for the ChargedParticle).
In order for an infection to spread, you should have 1 infected person be added when adding people to the simulation. 

##### Hint #1: There are constants in the file to define the speed, size, color, etc.

##### Hint #2: You will want this class to extend another class which will you allow you to re-use code.

##### Hint #3: [Final Functionality Demo (same as above)](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=c6958003-1803-436a-bc65-aba6002fdeb3)

# Part 5: BONUS Pandemic Simulation
There are a lot of simple things you can do to build on this simulator if you are interested.
You can extra bonus credit on this assignment by adding some new functionality to the system.
The bonus will be a maximum of 5 points and will be based on creativity.
Be sure to explain your extra functionality in a comment in your Moodle submission.


This assignment was inspired by this [article](https://www.washingtonpost.com/graphics/2020/world/corona-simulator/).
You might get some ideas from looking at it.


# Approximation for Final UML
![UML Image](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCAYufIamkKKZEIImkLWZEp2tDIIp9pC_pJyfA1GfNSzdRstFLSa6a0u2wCfDpKj64dJCIYz9JKp1aORfIYuhpyz3qX2Ic1-GaLgOM8LJ3zUkM5kZMs64uXWjg3xewE9yBOXDE_N0xSQhWSaZDIm662m00)

[source plantuml](http://www.plantuml.com/plantuml/uml/SoWkIImgAStDuKfCAYufIamkKKZEIImkLWZEp2tDIIp9pC_pJyfA1GfNSzdRstFLSa6a0u2wCfDpKj64dJCIYz9JKp1aORfIYuhpyz3qX2Ic1-GaLgOM8LJ3zUkM5kZMs64uXWjg3xewE9yBOXDE_N0xSQhWSaZDIm662m00)

You do NOT have to turn in UML, this is just a quick reference to keep you on track if you are unsure.


# The End

That's it!  Make sure you program works like the videos and submit all edited the files via Moodle!


