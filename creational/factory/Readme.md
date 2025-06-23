#  Factory Design Pattern in Java

This project demonstrates the **Factory Design Pattern** in Java using a document creation example. The pattern allows you to create objects without specifying the exact class of object that will be created.

##  What is the Factory Design Pattern?

The **Factory Design Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

It is useful when:
- You have a superclass with multiple sub-classes
- You want to avoid instantiating concrete classes directly
- You want to follow the **Open/Closed Principle** (open for extension, closed for modification)

## Sample Output

- Creating a PDF document...
- Document Type: PDF Document
- Opening PDF Document...
- Saving PDF Document...
- Closing PDF Document...

--------------------------

- Creating a Word document...
- Document Type: Word Document
- Opening Word Document...
- Saving Word Document...
- Closing Word Document...

##  Project Structure

- creational/
- ├── Main.java
- ├── Document.java # Product interface
- ├── PDFDocument.java # Concrete Product
- ├── WordDocument.java # Concrete Product
- ├── DocumentCreator.java # Abstract Creator
- ├── PDFDocumentCreator.java # Concrete Creator
- └── WordDocumentCreator.java # Concrete Creator

##  Description of Classes

| Class/File                  | Role                                                          |
|----------------------------|--------------------------------------------------------------- |
| Document                   | Interface defining actions like open(), save(), close()        |
| PDFDocument, WordDocument  | Concrete classes implementing the Document interface           |
| DocumentCreator            | Abstract class defining the factory method createDocument()    |
| PDFDocumentCreator         | Returns a PDFDocument                                          |
| WordDocumentCreator        | Returns a WordDocument                                         |
| Main                       | Client code demonstrating how the factory is used              |


## 🛠️ How to Compile and Run

- javac creational/factory/*.java
- java creational/factory.Main
