package creational.prototype;

//Abstract Prototype class
public abstract class Food implements Cloneable {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void serve();

    @Override
    public Food clone() {
        try {
            return (Food) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed");
        }
    }
}