# SLLToCSSE230

## Overview:
- This exercise provides you with the opportunity to have a preview of how things are done in CSSE230.
- There are two parts like HWSinglyLinkedList, but they are both in *Node.java*:
<br> -- Part 1: Implementing 7 SLL methods. These must be done first, this is where you will implement your singly linked list
<br> -- Part 2: Taken from the Algorithms part, but still in *Node.java*.
- There are 2 methods already in *Node.java* that are worth looking at before you start:
<br> -- *buildString()* and *insert()*

 
- Because this is just for practice:
<br> -- There are no real requirements for this assignment
<br> -- This doesn't have to be an individual exercise/assignment

# Rubric

- JUnit tests are provided to let you know if you implemented the methods correctly. 
- Your score for this assignment doesn't go anywhere.

# Problem Description

- In CSSE230, most of the class deals with trees, which are like linked lists, but instead of each *Node* having only one *next*, they point to two (*left* and *right*).
- Also, *Node* does most of the work, using recursion. All the *List* does is just set them up.
- As such, *SinglyLinkedList.java* is already finished. 
- CSSE230 also makes use of a *NULL_NODE*, which is a special node at the end of the list.
<br> -- Instead of the last *Node* having it's next be <code>null</code>, it is instead a pointer to a *Node* that is *NULL_NODE*.
<br> -- This allows a *Node* to not have to check if it's *next* is <code>null</code> before it calls a method on it.
<br> -- At the start of most methods, it checks if that *this* is *NULL_NODE*, and does something special for it.
- A change from the original HWSinglyLinkedList is that *List* doesn't keep track of the node at the end.
- The <code>toString()</code> was also changed. It doesn't say *first=* and *last=* anymore.
- The algorithms part was changed. It isn't separate like it was in HWSinglyLinkedList.