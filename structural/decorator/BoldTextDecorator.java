package structural.decorator;

// ConcreteDecorator
public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<b>" + super.render() + "</b>";
    }
}
