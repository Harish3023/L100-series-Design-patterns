# Memento Design Pattern in Java

This project demonstrates the **Memento Design Pattern** using a real-world example of a **Game Save/Restore system**.

---

## What is the Memento Design Pattern?

The **Memento Design Pattern** is a **behavioral pattern** that allows capturing and storing the internal state of an object so that it can be restored later, without violating encapsulation.

---

## Components

1. **Originator (Game)** - The object whose state needs to be saved and restored.
2. **Memento (GameMemento)** - Stores the internal state of the Originator.
3. **Caretaker (GameHistory)** - Keeps track of saved mementos and restores them when needed.

---

## Example Flow

- The `Game` progresses through levels, losing health.
- The `GameHistory` caretaker saves game states (mementos).
- At any time, the game can be restored to a previous state.

---

## How to Run

1. Compile all Java files:
   ```sh
   javac behavioral/memento/*.java

2. Run the demo:
   ```bash
   java behavioral.memento.GameMementoDemo
   ```

---

##  Output

```
Playing level 1 with health 100
Playing level 2 with health 90
Playing level 3 with health 80
Level: 4, Health: 70
Level: 3, Health: 80
Level: 2, Health: 90
```

---
