package creational.abstractFactory;

// Concrete Product
public class SamsungDisplay implements Display {
    @Override
    public void displayType() {
        System.out.println("Samsung AMOLED Display");
    }
}