# Visitor Design Pattern in Java

This project demonstrates the **Visitor Design Pattern** using an Employee Performance Review System.

## Project Structure
```
behavioral.visitor
├── Employee.java          # Element Interface
├── Engineer.java          # Concrete Element
├── Manager.java           # Concrete Element
├── EmployeeVisitor.java   # Visitor Interface
├── AppraisalVisitor.java  # Concrete Visitor
├── PromotionVisitor.java  # Concrete Visitor
└── VisitorEmployeeDemo.java # Client Demo
```

## How to Run
1. Compile all Java files:
   ```bash
   javac behavioral/visitor/*.java
   ```

2. Run the demo:
   ```bash
   java behavioral.visitor.VisitorEmployeeDemo
   ```

## Sample Output
```
=== Appraisal Process ===
Appraising Engineer: Harish with rating 9
Appraising Manager: Gokul with rating 6
Appraising Engineer: Vivegan with rating 7

=== Promotion Process ===
Harish is eligible for promotion.
Gokul is not eligible for promotion.
Vivegan is not eligible for promotion.
```
