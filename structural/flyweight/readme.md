# Flyweight Design Pattern in Java

This project demonstrates the **Flyweight Design Pattern** using a real-world example: managing hotel room types efficiently by sharing common room data across instances.

---

## What is the Flyweight Design Pattern?

The **Flyweight Design Pattern** is a **structural pattern** that reduces memory usage by sharing common parts of the state between multiple objects instead of storing them separately.

### ✅ This is useful when:
- You have **a large number of similar objects**.
- You want to **optimize memory consumption**.
- You can separate shared (**intrinsic**) from unique (**extrinsic**) state.

---

## 🗂️ Project Structure
```
structural/
└── flyweight/
├── Room.java # Flyweight interface
├── RoomType.java # Concrete flyweight implementation
├── RoomFactory.java # Flyweight factory that shares room types
└── FlyweightHotel.java # Client code to demonstrate flyweight usage
```

---

## 📦 Description of Classes

| Class                  | Role                                                                |
|------------------------|---------------------------------------------------------------------|
| `Room`                 | The Flyweight interface defining shared behavior                    |
| `RoomType`             | The concrete flyweight class storing **shared (intrinsic)** data    |
| `RoomFactory`          | Manages and reuses shared RoomType instances (Flyweight Factory)    |
| `FlyweightHotel`   | The client class that supplies **unique (extrinsic)** room details  |

---

## 💡 How It Works

- `RoomType` stores **shared state** like room type, bed type, AC availability, and price.
- `RoomFactory` maintains a **cache** of room types to avoid recreating them.
- `Room` interface ensures all room types implement `displayRoomDetails(...)`.
- `FlyweightHotel` demonstrates use of shared room types while passing in unique room numbers and availability dynamically.

---

## ✅ Sample Output
```
Room 101 [Type: Deluxe, Bed: Queen, AC: true, Price: ₹4500.0, Floor: 1, Available: true]
Room 102 [Type: Deluxe, Bed: Queen, AC: true, Price: ₹4500.0, Floor: 1, Available: false]
Room 201 [Type: Suite, Bed: King, AC: true, Price: ₹8000.0, Floor: 2, Available: true]
Room 103 [Type: Deluxe, Bed: Queen, AC: true, Price: ₹4500.0, Floor: 1, Available: true]
Total Room Types Created (shared): 2
```
---

## ▶️ How to Compile and Run

```bash
javac structural/flyweight/*.java
java structural.flyweight.FlyweightHotel
```

## Benefits Demonstrated
- Reduces memory usage by sharing common object state
- Separates intrinsic (shared) from extrinsic (unique) data
- Increases performance in systems with lots of similar objects
- Demonstrates clean application of Flyweight and Factory patterns
