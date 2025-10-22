# HW13: Singly Linked List Implementation and Algorithms

## Overview:
- This exercise provides you with the opportunity to implement and use a singly linked list
- There are two parts:
<br> -- Part 1: *sll* package contains several unimplemented operations. These must be done first, this is where you will implement your singly linked list
<br> -- Part 2: *sslAlgorithms* package contains several unimplemented operations. These must be done second, because they depend on the *sll* package. 
<br>    These algorithms will give you practice at being a client programmer of the singly linked list (which is what you will need in CSSE 230 and beyond)
  
- There is no documentation requirement for this assignment
- This is an individual exercise/assignment

# Rubric

- To earn credit for this assignment, you must pass nearly all JUnit tests

## To do:

1. Open this project (HW13) in IntelliJ from your local copy of the CSSE220 repo
2. Complete the TODOs in *SinglyLinkedList.java* found in the *sll* package
3. Run the included *RunAllTests.java* in the *sll* package to ensure your solution passes all the unit tests
3. Complete the TODOs in *Algorithms.java* found in the *sllAlgorithms* package
3. Run the included *RunAllTests.java* in the *sllAlgorithms* package to ensure your solution passes all the unit tests
4. Upload your completed *SinglyLinkedList.java* and *Algorithms.java* files to this assignment's Dropbox

# Problem Description

- The operations in each package have documentation that describe the behavior of each operation
- This linked list implementation uses two fields called *first* and *last*. This facilitates navigation of the list
- *first* holds the reference to the first node in the linked list
- *last* holds the reference to the last node in the linked list
- If the list is empty, then the following must be true: *first* = <code>null</code> and *last* = <code>null</code>
- If a list contains a single item, then both *first* and *last* hold the reference to the node containing this item
- The first method you must complete is the *add* method found in *SinglyLinkedList.java*




