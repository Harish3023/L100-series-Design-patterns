# Mediator Design Pattern in Java

This project demonstrates the **Mediator Design Pattern** using a real-world example: a chat room where multiple users send messages via a **mediator**.

---

##  What is the Mediator Design Pattern?

The **Mediator Design Pattern** is a **behavioral pattern** that defines an object (mediator) that encapsulates how a set of objects interact. This promotes **loose coupling** by preventing direct references between objects and allows their interaction to vary independently.

---

##  Example Explanation

In this project:
- `ChatMediator` is the **Mediator Interface**.
- `ChatMediatorImpl` is the **Concrete Mediator**.
- `User` is the **Abstract Colleague**.
- `UserImpl` is the **Concrete Colleague**.
- `MediatorPatternDemo` is the **Client**.

Users do not talk to each other directly. Instead, they send messages through the mediator, which distributes them.

---

##  How to Run

1. Compile the code:
   ```bash
   javac behavioral/mediator/*.java
   ```

2. Run the demo:
   ```bash
   java behavioral.mediator.MediatorPatternDemo
   ```

---

##  Output

```
Alice sends: Hello everyone!
Bob receives: Hello everyone!
Charlie receives: Hello everyone!

Bob sends: Hi Alice!
Alice receives: Hi Alice!
Charlie receives: Hi Alice!
```

---

##  When to Use Mediator Pattern?

- When multiple objects interact in a **complex many-to-many relationship**.
- When you want to reduce **tight coupling** between interacting classes.
- Examples:  
  - Chat systems  
  - Air traffic control  
  - UI frameworks (communication between components)
