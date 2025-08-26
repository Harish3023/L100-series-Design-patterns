package behavioral.visitor;

// Client Demo class
public class VisitorEmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new Engineer("Harish", 9),
            new Manager("Gokul", 6),
            new Engineer("Vivegan", 7)
        };

        EmployeeVisitor appraisalVisitor = new AppraisalVisitor();
        EmployeeVisitor promotionVisitor = new PromotionVisitor();

        System.out.println("=== Appraisal Process ===");
        for (Employee emp : employees) {
            emp.accept(appraisalVisitor);
        }

        System.out.println("\n=== Promotion Process ===");
        for (Employee emp : employees) {
            emp.accept(promotionVisitor);
        }
    }
}
