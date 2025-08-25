# Chain of Responsibility - Request Approval System

This project demonstrates the **Chain of Responsibility** behavioral design pattern using a **Request Approval System**.

## Scenario

- **Manager** can approve expenses up to ₹10,000  
- **Director** can approve expenses up to ₹50,000  
- **CEO** approves anything above ₹50,000  

Each approver checks the request. If it cannot approve, it forwards the request to the next approver in the chain.

## How to Run

### Using Maven
```bash
mvn -q -f pom.xml clean compile exec:java -Dexec.mainClass=behavioral.chainofresponsibility.ApprovalDemo
```

### Using javac/java
```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out behavioral.chainofresponsibility.ApprovalDemo
```

## Expected Output

```
Manager approved the request of ₹5000
Director approved the request of ₹20000
CEO approved the request of ₹100000
```
