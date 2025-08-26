package behavioral.visitor;

// Concrete Element class
public class Engineer implements Employee {
    private String name;
    private int performanceRating;

    public Engineer(String name, int rating) {
        this.name = name;
        this.performanceRating = rating;
    }

    public String getName() { return name; }
    public int getPerformanceRating() { return performanceRating; }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
