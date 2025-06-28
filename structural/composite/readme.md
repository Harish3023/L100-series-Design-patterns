# Composite Design Pattern in Java

This project demonstrates the **Composite Design Pattern** using a real-world example: simulating a file system where both files and folders are treated uniformly.

---

## What is the Composite Design Pattern?

The **Composite Design Pattern** is a **structural** design pattern used to treat **individual objects** and **compositions of objects** uniformly. It is ideal for representing **tree-like structures**, such as files and folders, where some objects are leaf nodes and others are containers of other objects.

### This is useful when:

- You need to work with hierarchical tree structures.
- You want to treat leaf and composite nodes with the same interface.
- You want to simplify client code that handles both simple and complex elements.

---

## 🗂️ Project Structure
```
structural/
└── composite/
├── FileSystemComponent.java # Component interface
├── FileLeaf.java # Leaf class representing individual files
├── FolderComposite.java # Composite class representing folders
└── CompositePattern.java # Client code demonstrating composite usage
```
---

## 📦 Description of Classes

| Class                  | Role                                                                          |
|------------------------|-------------------------------------------------------------------------------|
| `FileSystemComponent`  | Interface defining the common behavior (`showDetails`)                        |
| `FileLeaf`             | A **leaf** class that represents a file                                       |
| `FolderComposite`      | A **composite** class that represents a folder (can contain files or folders) |
| `CompositePattern`     | The **client** class demonstrating usage of files and folders                 |

---

## 💡 How It Works

- `FileSystemComponent` defines a common interface for both files and folders.
- `FileLeaf` implements `FileSystemComponent` to represent files.
- `FolderComposite` implements `FileSystemComponent` and stores a list of components (files or other folders).
- `CompositePattern` creates a folder structure and displays it using the same method calls for both files and folders.

---

## ✅ Sample Output
```
Folder: My Documents
Folder: Job Applications
File: Resume.pdf
File: CoverLetter.docx
File: Notes.txt
```

---

## ▶️ How to Compile and Run

```
javac structural/composite/*.java
java structural.composite.CompositePattern
```

## Benefits Demonstrated

- Treats individual objects and compositions uniformly
- Simplifies code through polymorphism
- Supports tree structures with arbitrary depth
- Easy to add new types of components (new leaf or composite types)
