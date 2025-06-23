package creational.prototype;

// Concrete Prototype class
public class Pasta extends Food {
    public Pasta() {
        super("Pasta", 180);
    }

    @Override
    public void serve() {
        System.out.println("Serving " + getName() + " - $" + getPrice());
    }
}