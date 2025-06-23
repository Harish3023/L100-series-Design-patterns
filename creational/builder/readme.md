#  Builder Design Pattern in Java

This project demonstrates the **Builder Design Pattern** using a real-world example: building customizable `Pizza` objects using a `PizzaBuilder`.

---

##  What is the Builder Design Pattern?

The **Builder Design Pattern** is a **creational pattern** that allows you to construct complex objects step-by-step. It:
- Separates the construction of an object from its representation.
- Enables the same construction process to create different representations.

This is useful when:
- An object has **many optional parameters**.
- You want to **avoid constructor telescoping** (many overloaded constructors).
- You want to provide a **fluent API** for building objects.

---

## 🗂️ Project Structure

```
creational/
└── builder/
    ├── Pizza.java                # Product class
    ├── PizzaBuilder.java         # Builder interface
    ├── ItalianPizzaBuilder.java  # Concrete builder implementation
    ├── PizzaDirector.java        # Director class to standardize recipes
    └── Main.java                 # Client code to demonstrate builder usage
```

---

## 📦 Description of Classes

| Class                 | Role                                                                                         |
|----------------------|----------------------------------------------------------------------------------------------|
| `Pizza`              | The final **product** class representing a customizable pizza with dough, sauce, and topping |
| `PizzaBuilder`       | The **builder interface** declaring methods for setting parts of the pizza                   |
| `ItalianPizzaBuilder`| A **concrete builder** that implements `PizzaBuilder` and constructs a `Pizza` step-by-step |
| `PizzaDirector`      | The **director class** that defines fixed sequences of steps to build standard pizza types   |
| `Main`               | The **client class** that demonstrates using the builder pattern with and without a director |

---

## 💡 How It Works

- `Pizza` is a simple immutable class with fields for dough, sauce, and topping.
- `PizzaBuilder` provides methods to set each part of the Pizza and a `build()` method to return the final product.
- `ItalianPizzaBuilder` is a concrete implementation that supports **method chaining**.
- `PizzaDirector` provides pre-defined build sequences (Veg Pizza, Non-Veg Pizza).
- `Main` creates pizzas using the builder both directly and via the director.

---

## ✅ Sample Output

```
Veg Pizza: Pizza with Whole Wheat dough, Pesto sauce, topped with Paneer & Capsicum
Non-Veg Pizza: Pizza with Cheese Burst dough, Barbecue sauce, topped with Chicken & Jalapeno
```

---

## ▶️ How to Compile and Run

```bash
javac creational/builder/*.java
java creational.builder.Main
```

---

## 🧩 Benefits Demonstrated

- Clear separation of concerns
- Easy to add new types of pizzas by introducing new builders
- Improves code readability and maintainability
- Avoids constructor overloading
