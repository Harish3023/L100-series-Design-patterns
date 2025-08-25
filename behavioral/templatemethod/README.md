#  Template Method Design Pattern in Java

This project demonstrates the **Template Method Design Pattern** using a real-world example: processing online orders with different payment methods (`CreditCardOrder`, `PayPalOrder`, `UPIOrder`).

---

##  What is the Template Method Design Pattern?

The **Template Method Design Pattern** is a **behavioral pattern** that defines the skeleton of an algorithm in a base class and lets subclasses redefine certain steps without changing the overall algorithm’s structure.

This is useful when:
- You want to keep a fixed algorithm structure but allow flexibility in specific steps.
- You need code reusability by pushing common steps to a superclass.
- You want to apply the **Hollywood Principle**: *"Don't call us, we'll call you."*

---

## 🗂️ Project Structure

```
behavioral/
└── templatemethod/
    ├── OrderProcess.java            # Abstract class (defines template method)
    ├── CreditCardOrder.java         # Concrete class for credit card payments
    ├── PayPalOrder.java             # Concrete class for PayPal payments
    ├── UPIOrder.java                # Concrete class for UPI payments
    └── TemplateMethodOrderDemo.java # Client code to demonstrate usage
```

---

## 📦 Description of Classes

| Class                        | Role                                                                 |
|------------------------------|----------------------------------------------------------------------|
| `OrderProcess`               | The **abstract class** that defines the template method `processOrder` |
| `CreditCardOrder`            | **Concrete class** implementing payment using Credit Card            |
| `PayPalOrder`                | **Concrete class** implementing payment using PayPal                 |
| `UPIOrder`                   | **Concrete class** implementing payment using UPI                    |
| `TemplateMethodOrderDemo`    | **Client class** demonstrating how different orders are processed    |

---

## 💡 How It Works

- The `processOrder()` method is the **template method**, defining the steps: select items → payment → deliver.
- Subclasses (`CreditCardOrder`, `PayPalOrder`, `UPIOrder`) implement the **abstract step `doPayment()`**.
- The structure of order processing stays consistent, but payment method varies.

---

## ✅ Sample Output

```
Processing Credit Card Order:
Items selected and added to cart
Payment done using Credit Card
Order delivered

Processing PayPal Order:
Items selected and added to cart
Payment done using PayPal
Order delivered

Processing UPI Order:
Items selected and added to cart
Payment done using UPI
Order delivered
```

---

## ▶️ How to Compile and Run

```bash
javac behavioral/templatemethod/*.java
java behavioral.templatemethod.TemplateMethodOrderDemo
```

---

## 🧩 Benefits Demonstrated

- Defines a fixed algorithm structure while allowing flexibility in steps
- Promotes code reuse (common steps in superclass)
- Easy to add new payment methods without modifying existing code
