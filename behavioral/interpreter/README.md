# Interpreter Design Pattern in Java

This project demonstrates the **Interpreter Design Pattern** with a simple Boolean Expression interpreter.

---

## What is the Interpreter Pattern?

The **Interpreter Design Pattern** is a behavioral pattern that defines a way to evaluate sentences in a language. It is useful when you need to interpret expressions defined by a grammar.

---

## Example Used

We interpret simple Boolean expressions such as:

- `John AND Admin`
- `Guest OR Admin`

### Classes

- **Expression**: Abstract interface with `interpret()` method.
- **TerminalExpression**: Represents basic expressions (`John`, `Admin`, `Guest`).
- **AndExpression**: Combines two expressions with logical AND.
- **OrExpression**: Combines two expressions with logical OR.
- **InterpreterPatternDemo**: Client code demonstrating the usage.

---

## Output

```
John is Admin? true
Guest or Admin? true
```

---

## How to Run

1. Compile all Java files:
   ```bash
   javac behavioral/interpreter/*.java
   ```

2. Run the demo:
   ```bash
   java behavioral.interpreter.InterpreterPatternDemo
   ```
