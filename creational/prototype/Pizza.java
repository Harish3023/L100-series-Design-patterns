package creational.prototype;

// Concrete Prototype class
public class Pizza extends Food {
    public Pizza() {
        super("Pizza", 250);
    }

    @Override
    public void serve() {
        System.out.println("Serving " + getName() + " - $" + getPrice());
    }
}