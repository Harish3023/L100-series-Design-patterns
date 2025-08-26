package behavioral.visitor;

// Concrete Visitor class
public class PromotionVisitor implements EmployeeVisitor {
    @Override
    public void visit(Engineer engineer) {
        if (engineer.getPerformanceRating() > 8) {
            System.out.println(engineer.getName() + " is eligible for promotion.");
        } else {
            System.out.println(engineer.getName() + " is not eligible for promotion.");
        }
    }
    @Override
    public void visit(Manager manager) {
        if (manager.getPerformanceRating() > 7) {
            System.out.println(manager.getName() + " is eligible for promotion.");
        } else {
            System.out.println(manager.getName() + " is not eligible for promotion.");
        }
    }
}
