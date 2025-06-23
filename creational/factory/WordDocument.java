package creational.factory;
// Concrete Product
public class WordDocument implements Document {
    private final String name = "Word Document";

    @Override
    public void open() {
        System.out.println(" Opening " + name + "...");
    }

    @Override
    public void save() {
        System.out.println(" Saving " + name + "...");
    }

    @Override
    public void close() {
        System.out.println(" Closing " + name + ".");
    }

    @Override
    public String getName() {
        return name;
    }
}
