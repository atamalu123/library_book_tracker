# Library Book Tracker

## Problem

The program should include at least two core classes: 
  1. A Book class (with fields like title, genre, or ISBN) 
  2. An Author class (with details such as name or nationality). 
  
Implement methods that let users add new books, remove books from the collection, and search for books by attributes such as title or author. The tracker should maintain a collection of books in memory, which could be stored using an ArrayList or similar data structure. The CLI should provide a simple menu where users can enter commands to perform each action. Error handling (e.g., trying to remove a non-existent book) should be considered for a smoother user experience

## Answer

The program has the structure:
  * `Book.java` - used for creating book objects
  * `Author.java` - used for creating author objects
  * `BookTracker.java` - provides functionality and CLI for the program
  * `Main.java` - executes the program