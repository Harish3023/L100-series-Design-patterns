package creational.abstractFactory;

// Client class that uses MobileFactory to assemble a mobile device
public class Mobile {
    private Processor processor;
    private Display display;

    public Mobile(MobileFactory factory) {
        System.out.println("Creating a new Mobile using factory: " + factory.getClass().getSimpleName());
        processor = factory.createProcessor();
        display = factory.createDisplay();
    }

    public void assemble() {
        System.out.println(" Assembling mobile with components:");
        processor.process();
        display.displayType();
        System.out.println(" Assembly Complete!\n");
    }
}