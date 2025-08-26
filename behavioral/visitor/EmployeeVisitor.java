package behavioral.visitor;

// Visitor Interface
public interface EmployeeVisitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
