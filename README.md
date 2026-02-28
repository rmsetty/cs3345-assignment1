# CS3345 – Assignment 1  
## Doubly Linked List Implementation (Generics + Iterator)

### Student Information
- Name: Rajiv Mallisetty
- GitHub Username: rmsetty
- Course: CS3345
- Assignment: Assignment 1

---

## Overview

This project implements a generic Doubly Linked List in Java.

The implementation includes the following methods:

- addFirst(T item)
- addLast(T item)
- get(int position)
- print()
- printBackwards()
- remove(T item)
- isEmpty()
- getLength()
- iterator()

The list maintains:
- A head pointer
- A tail pointer
- A size counter (numberOfElements)

All edge cases are handled, including:
- Empty list
- Single element list
- Removing head
- Removing tail
- Removing from the middle
- Invalid index access

---

## Files Included

List.java  
Defines the List<T> interface with all required method signatures.

DoublyLinkedList.java  
Implements the generic doubly linked list and all required functionality.

DoublyLinkedListTest.java  
Contains test cases that validate the correctness of all implemented methods.

---

## How to Compile

From the project directory, run:

javac *.java

---

## How to Run

java DoublyLinkedListTest

---

## Key Concepts Used

- Java Generics (<T>)
- Doubly linked list node structure
- Proper head and tail pointer updates
- Safe removal logic for all edge cases
- Custom iterator using java.util.Iterator
- Encapsulation using an inner Node class

---

## Notes

All methods were implemented according to the assignment requirements.  
The program compiles successfully and runs without errors.
