package creational.abstractFactory;

// Abstract Factory Interface
public interface MobileFactory {
    Processor createProcessor();  // Factory Method to create Processor
    Display createDisplay();      // Factory Method to create Display
}