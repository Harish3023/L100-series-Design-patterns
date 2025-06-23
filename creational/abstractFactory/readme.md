# Abstract Factory Design Pattern in Java – Mobile Example

This project demonstrates the **Abstract Factory Design Pattern** in Java through a mobile manufacturing use case. It shows how you can create families of related objects (like `Processor` and `Display`) without knowing their concrete classes.

---

## What is the Abstract Factory Pattern?

The **Abstract Factory Pattern** is a **creational design pattern** that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

###  It is useful when:
- You need to create **families of objects** (e.g., Apple and Samsung phones).
- You want to ensure products are **compatible** within a family.
- You want to **decouple** object creation from its usage.
- You want to follow **SOLID principles**, especially the Open/Closed Principle and Dependency Inversion.

---

## 📦 Project Structure
```
creational/
└── abstractFactory/
├── AppleDisplay.java # Concrete Product
├── AppleFactory.java # Concrete Factory
├── AppleProcessor.java # Concrete Product
├── Display.java # Abstract Product
├── Mobile.java # Client
├── MobileFactory.java # Abstract Factory
├── MobileFactoryDemo.java # Main Client Class
├── Processor.java # Abstract Product
├── SamsungDisplay.java # Concrete Product
├── SamsungFactory.java # Concrete Factory
└── SamsungProcessor.java # Concrete Product
```

---

## 📜 Description of Classes

| Class/File                  | Role                                                              |
|----------------------------|-------------------------------------------------------------------|
| `Processor`                | Interface defining `process()` behavior for processors             |
| `Display`                  | Interface defining `displayType()` for displays                    |
| `AppleProcessor`           | Concrete class for Apple processor                                 |
| `SamsungProcessor`         | Concrete class for Samsung processor                               |
| `AppleDisplay`             | Concrete class for Apple display                                   |
| `SamsungDisplay`           | Concrete class for Samsung display                                 |
| `MobileFactory`            | Abstract factory defining methods to create `Processor` & `Display`|
| `AppleFactory`             | Creates Apple-specific products                                    |
| `SamsungFactory`           | Creates Samsung-specific products                                  |
| `Mobile`                   | Client class that assembles a phone from factory-created parts     |
| `MobileFactoryDemo`        | Main class to simulate user input and factory usage                |

---

## 💻 Sample Output

```bash

Input: `apple`
Enter mobile brand (apple/samsung):
apple
Creating a new Mobile using factory: AppleFactory
Assembling mobile with components:
Apple A16 Bionic processor
Apple Super Retina XDR Display
Assembly Complete!

```

## ▶️Compile and Run:
```bash
javac creational/abstractFactory/*.java
java creational.abstractFactory.MobileFactoryDemo
