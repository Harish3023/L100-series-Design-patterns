#  Prototype Design Pattern in Java

This project demonstrates the **Prototype Design Pattern** using a real-world example: cloning `Food` items (like `Pizza`, `Burger`, and `Pasta`) using a central `FoodRegistry`.

---

##  What is the Prototype Design Pattern?

The **Prototype Design Pattern** is a **creational pattern** used when object creation is expensive or complex. Instead of creating new instances, you create **copies of existing objects (prototypes)** using a cloning mechanism.

It is useful when:
- Creating a new object is **costly or time-consuming**.
- You want to **decouple object creation from object use**.
- You want to **avoid subclassing for different configurations**.

---

## 🗂️ Project Structure
```
creational/
└── prototype/
├── Food.java # Abstract Prototype class
├── Pizza.java # Concrete prototype (Pizza)
├── Burger.java # Concrete prototype (Burger)
├── Pasta.java # Concrete prototype (Pasta)
├── FoodRegistry.java # Registry that stores and clones food prototypes
└── PrototypeDemo.java # Client class that demonstrates prototype usage
```

---

## 📦 Description of Classes (Updated)

| Class             | Role                                                                 |
|------------------|----------------------------------------------------------------------|
| `Food`           | The **abstract prototype class** that defines cloneable food items   |
| `Pizza`          | A **concrete prototype** representing Pizza                          |
| `Burger`         | A **concrete prototype** representing Burger                         |
| `Pasta`          | A **concrete prototype** representing Pasta                          |
| `FoodRegistry`   | A **registry class** that stores and clones prototype food instances |
| `PrototypeDemo`  | The **client class** that demonstrates how food objects are cloned   |

---

## 💡 How It Works

- `Food` is an abstract class with attributes like name and price, and a `clone()` method.
- `Pizza`, `Burger`, and `Pasta` extend `Food` and define the `serve()` behavior.
- `FoodRegistry` maintains a map of prototypes and clones them upon request.
- `PrototypeDemo` uses the registry to place multiple food orders using clones.

---

## ✅ Sample Output
```
Orders placed:
Serving Pizza - ₹250
Serving Burger - ₹150
Serving Pasta - ₹180
Serving Burger - ₹150
```
---

## ▶️ How to Compile and Run

```bash
javac creational/prototype/*.java
java creational.prototype.PrototypeDemo

