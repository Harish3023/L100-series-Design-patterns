#  Singleton Design Pattern in Java

This project demonstrates the **Singleton Design Pattern** using a real-world example: a `ConfigurationManager` class that stores application-wide settings in a central location.

##  What is the Singleton Design Pattern?

The **Singleton Design Pattern** is a **creational design pattern** that ensures:
- Only **one instance** of a class exists throughout the application.
- A **global point of access** to that instance is provided.

This is useful when:
- Managing shared resources (e.g., configuration, logging, caching)
- You want to prevent multiple instantiations of a heavy or critical class

## 🗂️ Project Structure

- creational/
- ├── Main.java -- Client code to demonstrate singleton behavior
- └── ConfigurationManager.java -- Singleton class with settings map

##  Description of Classes

| Class                  | Role                                                                |
|------------------------|-------------------------------------------------------------------- |
| ConfigurationManager   | Singleton class managing key-value settings (Map)                   |
| Main                   | Demonstrates that only one instance of ConfigurationManager is used |

## 💡 How It Works

- ConfigurationManager has a **private constructor** so it can’t be instantiated from outside.
- It holds a **private static instance** of itself.
- The getInstance() method:
  - Returns the existing instance if it exists
  - Otherwise, it creates a new one
- All settings are stored in a `HashMap` inside the singleton
- Any changes made through one reference are reflected in all others

##  Sample Output

- Theme: dark
- Language: English
- Font Size: 14px
- Timeout: 30s
- Enable Logs: true
- Is same instance: true

## How to compile and run
- javac creational/singleton/*.java
- java creational/singleton.Main
