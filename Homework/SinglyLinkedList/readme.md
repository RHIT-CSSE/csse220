# CSSE 220 Object-Oriented Software Development
# Singly Linked List

This exercise will let you practice implementing a simple singly linked list and the using that completed class to perform a number of algorithms. 

You will do this exercise by yourself, but be quick to ask questions of your instructor, student assistants, and classmates as desired. 

# Rubric

* Each method (6) that you implement in the sll.SinglyLinkedList class is worth 8 points. (6 * 8 = 48)
* Your instructor will implement sll.SinglyLinkedList.add (Integer element) in class with you, so only 3 points will be awarded for this method.
* Each method (7) that you implement in the sll.algorithms.Algorithms class is worth 7 points. (7 * 7 = 49)

Total possible: 48 + 3 + 49 = 100 points.

The methods are already reasonably documented -- the provided Javadoc comments describe the behavior of each method. 
Be sure to ask questions of your instructor if the documentation is not clear. 
You do not need to add additional documentation to the methods of SinglyLinkedList.

# Problem Description

Import the SinglyLinkedList project from the repository. SinglyLinkedList.sll contains several Interfaces 
that support the implementation of a singly linked list. All your implementation should be done in the 
sll.SinglyLinkedList class. After completing the SinglyLinkedList code, you will need to use it to 
complete a number of problems defined in the sll.algorithms.Algorithms class.

It should be noted that this linked list implementation uses two nodes, first and last, that facilitates 
navigation of the list. first represents the first node (or head) of the list and last represents the last 
node of the list (or tail). A list is empty if both first and last equal null. A list has a single element 
if both first and last are equal to that element.

If you have questions, consider posting to Piazza (just be sure not to reveal any solutions there) --- 
instructors and other students can answer your questions there. You can also visit F217 during lab hours 
or stop by your instructor's office to get help.

JUnit tests for all the methods are provided in sll.SinglyLinkedList and sll.algorithms.AlgorithmsTests. 
You might want to run these tests on your code to ensure your solution works as expected. 
However, the unit tests are not designed to be exhaustive - your code has to be correct for all inputs, 
even ones not specified in the unit tests.

Please note, you MUST complete sll.SinglyLinkedList.add (Integer element) before you can test the other methods. 
You should not attempt to implement the methods in Algorithms.java until after completing the 
SinglyLinkedList.java methods.



