package creational.abstractFactory;

// Concrete Factory 
public class AppleFactory implements MobileFactory {
    @Override
    public Processor createProcessor() {
        return new AppleProcessor();  // Creates Apple-specific Processor
    }

    @Override
    public Display createDisplay() {
        return new AppleDisplay();    // Creates Apple-specific Display
    }
}