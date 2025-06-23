package creational.factory;

// Concrete Product
public class PDFDocument implements Document {
    private final String name = "PDF Document";

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
