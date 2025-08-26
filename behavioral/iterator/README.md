# Iterator Design Pattern - Library Book Example

This project demonstrates the **Iterator Design Pattern** using a real-world example: iterating over books in a `Library`.

---

## What is the Iterator Design Pattern?

The **Iterator Design Pattern** is a **behavioral pattern** that provides a way to access the elements of a collection sequentially without exposing its underlying representation.

---

## Structure in this Project

- **Iterator<T>**: Defines the interface (`hasNext()`, `next()`).
- **Aggregate<T>**: Defines method `createIterator()` for creating an iterator.
- **Library**: Concrete aggregate that stores books and provides a `LibraryIterator`.
- **LibraryIterator**: Concrete iterator for traversing `Library` books.
- **Book**: A simple data model representing a book.
- **IteratorPatternDemo**: Client code to demonstrate traversal.

---

## How to Run

1. Compile the project:
   ```bash
   javac behavioral/iterator/library/*.java
   ```

2. Run the demo:
   ```bash
   java behavioral.iterator.library.IteratorPatternDemo
   ```

---

## Example Output

```
Library Books:
The Hobbit by J.R.R. Tolkien
1984 by George Orwell
Clean Code by Robert C. Martin
Design Patterns by Harish
```

---

This shows how the **Iterator Design Pattern** allows easy traversal of a collection without exposing its underlying structure.
