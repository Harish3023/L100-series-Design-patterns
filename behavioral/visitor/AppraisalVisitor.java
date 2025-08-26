package behavioral.visitor;

// Concrete Visitor class
public class AppraisalVisitor implements EmployeeVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("Appraising Engineer: " + engineer.getName() + " with rating " + engineer.getPerformanceRating());
    }
    @Override
    public void visit(Manager manager) {
        System.out.println("Appraising Manager: " + manager.getName() + " with rating " + manager.getPerformanceRating());
    }
}
