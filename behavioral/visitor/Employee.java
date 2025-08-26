package behavioral.visitor;

// Element Interface
public interface Employee {
    void accept(EmployeeVisitor visitor);
}
