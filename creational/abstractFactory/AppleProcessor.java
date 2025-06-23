package creational.abstractFactory;

// Concrete Product
public class AppleProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Apple A16 Bionic processor");
    }
}