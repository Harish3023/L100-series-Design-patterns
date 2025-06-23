package creational.prototype;

//Concrete Prototype class
public class Burger extends Food {
    public Burger() {
        super("Burger", 150);
    }

    @Override
    public void serve() {
        System.out.println("Serving " + getName() + " - $" + getPrice());
    }
}