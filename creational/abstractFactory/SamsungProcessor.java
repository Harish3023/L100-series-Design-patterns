package creational.abstractFactory;

// Concrete Product 
public class SamsungProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Samsung Exynos processor");
    }
}