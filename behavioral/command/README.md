# Command Design Pattern in Java

This project demonstrates the **Command Design Pattern** using a real-world example: an **Order Processing System**.

---

## What is the Command Design Pattern?

The **Command Design Pattern** is a **behavioral design pattern** that encapsulates a request as an object, thereby allowing you to:

- Parameterize clients with different requests.
- Queue or log requests.
- Support undoable operations.

It decouples the **Invoker** (which triggers an action) from the **Receiver** (which performs the action).

---

## Example: Order Processing System

In this example:

- **Receiver** → `Stock` (knows how to buy and sell)  
- **Command** → `BuyStock`, `SellStock` (wrap requests to buy or sell stock)  
- **Invoker** → `Broker` (collects and executes commands)  
- **Client** → Creates command objects and passes them to the broker  

---

## Project Structure

command-orderprocessing/
├── README.md
└── src/
└── behavioral/
└── command/
├── Order.java
├── Stock.java
├── BuyStock.java
├── SellStock.java
├── Broker.java
└── CommandPatternDemo.java


---

## Class Descriptions

1. **Order.java** → The command interface with the `execute()` method.  
2. **Stock.java** → The receiver class which knows how to perform `buy()` and `sell()`.  
3. **BuyStock.java** → Concrete command to buy stocks.  
4. **SellStock.java** → Concrete command to sell stocks.  
5. **Broker.java** → The invoker which stores and executes orders.  
6. **CommandPatternDemo.java** → The client which sets up objects and runs the demo.  

---

## Code Flow

1. The `Client` creates `BuyStock` and `SellStock` command objects and assigns them to the `Broker`.  
2. The `Broker` (Invoker) stores the commands in a list.  
3. When `placeOrders()` is called, the `Broker` executes all commands.  
4. Each command calls the corresponding method on the `Stock` (Receiver).  

---

## How to Compile and Run

---

##  How to Run

1. Compile the code:
   ```bash
   javac behavioral/command/*.java
   ```

2. Run the demo:
   ```bash
   java behavioral.command.CommandPatternDemo
   ```
---

##  Output

```

Stock [ Name: ABC, Quantity: 10 ] bought
Stock [ Name: ABC, Quantity: 10 ] sold
```

---

## Benefits of Using Command Pattern

1. Decouples the object invoking the operation from the one performing it.

2. Allows queuing and executing requests at different times.

3. Supports undo/redo operations.

4. Makes it easy to add new commands without changing existing code.