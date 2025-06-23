package creational.abstractFactory;

// Concrete Factory 
public class SamsungFactory implements MobileFactory {
    @Override
    public Processor createProcessor() {
        return new SamsungProcessor();  // Creates Samsung-specific Processor
    }

    @Override
    public Display createDisplay() {
        return new SamsungDisplay();    // Creates Samsung-specific Display
    }
}