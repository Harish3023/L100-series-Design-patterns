package creational.abstractFactory;

// Concrete Product 
public class AppleDisplay implements Display {
    @Override
    public void displayType() {
        System.out.println("Apple Super Retina XDR Display");
    }
}