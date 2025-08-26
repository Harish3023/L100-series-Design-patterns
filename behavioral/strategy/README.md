# Strategy Design Pattern in Java

This project demonstrates the **Strategy Design Pattern** using a real-world example: processing payments with different payment methods (`CreditCardPayment`, `PayPalPayment`, `BitcoinPayment`).

---

## What is the Strategy Design Pattern?

The **Strategy Design Pattern** is a **behavioral pattern** that defines a family of algorithms, encapsulates each one, and makes them interchangeable.  

This is useful when:  
- You want to define multiple ways of performing an action (e.g., payment methods).  
- You need to select the algorithm at runtime.  
- You want to follow the **Open/Closed Principle**: classes are open for extension but closed for modification.  

---

## 🗂️ Project Structure

```
behavioral/
└── strategy/
├── PaymentStrategy.java # Strategy interface
├── CreditCardPayment.java # Concrete strategy for credit card payments
├── PayPalPayment.java # Concrete strategy for PayPal payments
├── BitcoinPayment.java # Concrete strategy for Bitcoin payments
├── PaymentProcessor.java # Context class that uses a PaymentStrategy
└── Main.java # Client code to demonstrate usage
```
---

## 📦 Description of Classes

| Class               | Role                                                                 |
|---------------------|----------------------------------------------------------------------|
| `PaymentStrategy`   | **Strategy interface** defining the `pay(double amount)` method      |
| `CreditCardPayment` | **Concrete strategy** implementing payment using Credit Card         |
| `PayPalPayment`     | **Concrete strategy** implementing payment using PayPal              |
| `BitcoinPayment`    | **Concrete strategy** implementing payment using Bitcoin             |
| `PaymentProcessor`  | **Context class** that delegates payment to a selected strategy      |
| `Main`              | **Client class** demonstrating how different strategies are used     |

---

## 💡 How It Works

- `PaymentStrategy` defines a common interface for payment methods.  
- `CreditCardPayment`, `PayPalPayment`, and `BitcoinPayment` implement different payment behaviors.  
- `PaymentProcessor` uses a `PaymentStrategy` to process payments.  
- The client (`Main`) can switch strategies dynamically at runtime.  

---

## ✅ Sample Output

```
Processing payment of 100.0 using Credit Card
Charging credit card for amount 100.0

Processing payment of 59.99 using PayPal
Charging PayPal account for amount 59.99

Processing payment of 0.005 using Bitcoin
Sending bitcoin amount 0.005 BTC
```

---

## ▶️ How to Compile and Run

```bash
javac behavioral/strategy/*.java
java behavioral.strategy.Main
```

---

##  Benefits Demonstrated

- Defines a family of algorithms (payment methods)
- Makes algorithms interchangeable at runtime
- Promotes Open/Closed Principle (easy to add new payment methods)
- Keeps PaymentProcessor decoupled from specific implementations
